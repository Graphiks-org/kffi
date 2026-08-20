import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

/**
 * Parses Wayland protocol XML files and generates Kotlin source files with
 * wl_interface MemorySegments plus request/event opcode and enum constants.
 *
 * Usage: java ProtocolInterfaceGenerator <xml-files...> <interfaces.kt> [<constants.kt>]
 */
public class ProtocolInterfaceGenerator {

    static class Arg {
        String name;
        String type;
        String iface;
        boolean allowNull;
    }

    static class Message {
        String name;
        int since = 1;
        List<Arg> args = new ArrayList<>();
    }

    static class EnumEntry {
        String name;
        String value;
    }

    static class EnumDef {
        String name;
        List<EnumEntry> entries = new ArrayList<>();
    }

    static class WlInterface {
        String name;
        int version;
        List<Message> requests = new ArrayList<>();
        List<Message> events = new ArrayList<>();
        List<EnumDef> enums = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: java ProtocolInterfaceGenerator <xml-files...> <interfaces.kt> [<constants.kt>]");
            System.err.println("  First N arguments = Wayland protocol XML file paths");
            System.err.println("  Last one or two arguments = generated Kotlin output paths");
            System.exit(1);
        }

        int lastXml = -1;
        for (int i = 0; i < args.length; i++) {
            if (args[i].toLowerCase(Locale.ROOT).endsWith(".xml")) lastXml = i;
        }
        int outputCount = args.length - lastXml - 1;
        if (lastXml < 0 || outputCount < 1 || outputCount > 2) {
            System.err.println("Expected one or two Kotlin output paths after the XML inputs");
            System.exit(1);
        }

        String outputPath = args[lastXml + 1];
        String constantsPath = outputCount == 2 ? args[lastXml + 2] : null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Map<String, WlInterface> interfaces = new LinkedHashMap<>();

        for (int i = 0; i <= lastXml; i++) {
            File xmlFile = new File(args[i]);
            if (!xmlFile.exists()) {
                System.err.println("Error: XML file not found: " + args[i]);
                System.exit(1);
            }
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList ifaceNodes = doc.getElementsByTagName("interface");
            for (int j = 0; j < ifaceNodes.getLength(); j++) {
                WlInterface iface = parseInterface((Element) ifaceNodes.item(j));
                interfaces.put(iface.name, iface);
            }
        }

        generateKotlin(interfaces, outputPath);
        if (constantsPath != null) generateConstants(interfaces, constantsPath);
    }

    static WlInterface parseInterface(Element elem) {
        String name = elem.getAttribute("name");
        int version = Integer.parseInt(elem.getAttribute("version"));

        WlInterface iface = new WlInterface();
        iface.name = name;
        iface.version = version;

        NodeList children = elem.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) continue;
            String tag = ((Element) child).getTagName();
            if ("request".equals(tag)) {
                iface.requests.add(parseMessage((Element) child));
            } else if ("event".equals(tag)) {
                iface.events.add(parseMessage((Element) child));
            } else if ("enum".equals(tag)) {
                iface.enums.add(parseEnum((Element) child));
            }
        }
        return iface;
    }

    static EnumDef parseEnum(Element elem) {
        EnumDef enumDef = new EnumDef();
        enumDef.name = elem.getAttribute("name");

        NodeList children = elem.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) continue;
            Element entry = (Element) child;
            if (!"entry".equals(entry.getTagName())) continue;

            EnumEntry enumEntry = new EnumEntry();
            enumEntry.name = entry.getAttribute("name");
            enumEntry.value = entry.getAttribute("value");
            enumDef.entries.add(enumEntry);
        }
        return enumDef;
    }

    static Message parseMessage(Element elem) {
        Message msg = new Message();
        msg.name = elem.getAttribute("name");
        String since = elem.getAttribute("since");
        if (!since.isEmpty()) msg.since = Integer.parseInt(since);

        NodeList children = elem.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) continue;
            Element e = (Element) child;
            if (!"arg".equals(e.getTagName())) continue;

            Arg arg = new Arg();
            arg.name = e.getAttribute("name");
            arg.type = e.getAttribute("type");
            String iface = e.getAttribute("interface");
            arg.iface = iface.isEmpty() ? null : iface;
            arg.allowNull = "true".equalsIgnoreCase(e.getAttribute("allow-null"));
            msg.args.add(arg);
        }
        return msg;
    }

    static String typeToEncoding(String type) {
        switch (type) {
            case "int":    return "i";
            case "uint":   return "u";
            case "string": return "s";
            case "object": return "o";
            case "new_id": return "n";
            case "array":  return "a";
            case "fd":     return "h";
            case "fixed":  return "f";
            default:
                System.err.println("Warning: unknown arg type '" + type + "', using '?'");
                return "?";
        }
    }

    static String buildSignature(int since, List<Arg> args) {
        StringBuilder sig = new StringBuilder();
        if (since > 1) sig.append(since);
        for (Arg arg : args) {
            String encoding = typeToEncoding(arg.type);
            if (arg.allowNull && ("string".equals(arg.type) || "object".equals(arg.type))) {
                encoding = "?" + encoding;
            }
            sig.append(encoding);
        }
        return sig.toString();
    }

    static boolean isExternalInterface(String name) {
        return name.startsWith("wl_");
    }

    static String ifaceValName(String ifaceName) {
        return ifaceName + "_interface";
    }

    static String safeBuildName(String ifaceName) {
        return "build_" + ifaceName.replace('.', '_');
    }

    static String constantPart(String value) {
        String part = value.replaceAll("[^A-Za-z0-9]+", "_").toUpperCase(Locale.ROOT);
        if (part.isEmpty()) part = "VALUE";
        if (Character.isDigit(part.charAt(0))) part = "_" + part;
        return part;
    }

    static String protocolPrefix(String interfaceName) {
        String prefix = interfaceName;
        if (prefix.startsWith("zxdg_")) {
            prefix = "xdg_" + prefix.substring("zxdg_".length());
        } else if (prefix.startsWith("zwlr_")) {
            prefix = prefix.substring("zwlr_".length());
        } else if (prefix.startsWith("zwp_")) {
            prefix = prefix.substring("zwp_".length());
        }
        return constantPart(prefix.replaceFirst("_v[0-9]+$", ""));
    }

    static long parseInteger(String value) {
        String normalized = value.trim().toLowerCase(Locale.ROOT);
        boolean negative = normalized.startsWith("-");
        if (negative) normalized = normalized.substring(1);
        long parsed = normalized.startsWith("0x")
            ? Long.parseLong(normalized.substring(2), 16)
            : Long.parseLong(normalized);
        return negative ? -parsed : parsed;
    }

    static String intLiteral(String value) {
        long parsed = parseInteger(value);
        if (parsed > 0x7fffffffL && parsed <= 0xffffffffL) parsed -= 0x100000000L;
        return Long.toString(parsed);
    }

    static void appendConstant(StringBuilder sb, String name, String value) {
        sb.append("const val ").append(name).append(": Int = ").append(value).append("\n");
    }

    static void generateConstants(Map<String, WlInterface> interfaces, String outputPath) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("package org.graphiks.kffi.wayland\n\n");
        sb.append("// Generated from Wayland protocol XML; do not edit manually.\n\n");

        boolean firstConstantBlock = true;
        for (WlInterface iface : interfaces.values()) {
            String prefix = protocolPrefix(iface.name);
            StringBuilder block = new StringBuilder();
            for (int i = 0; i < iface.requests.size(); i++) {
                appendConstant(block, prefix + "_" + constantPart(iface.requests.get(i).name), Integer.toString(i));
            }
            for (int i = 0; i < iface.events.size(); i++) {
                appendConstant(block, prefix + "_EVENT_" + constantPart(iface.events.get(i).name), Integer.toString(i));
            }
            for (EnumDef enumDef : iface.enums) {
                String enumPrefix = prefix + "_" + constantPart(enumDef.name);
                for (EnumEntry entry : enumDef.entries) {
                    appendConstant(block, enumPrefix + "_" + constantPart(entry.name), intLiteral(entry.value));
                }
            }
            if (block.isEmpty()) continue;
            if (!firstConstantBlock) sb.append("\n");
            sb.append(block);
            firstConstantBlock = false;
        }

        Path outPath = Paths.get(outputPath);
        Files.createDirectories(outPath.getParent());
        Files.writeString(outPath, sb.toString());
        System.out.println("Generated: " + outputPath);
    }

    static void generateKotlin(Map<String, WlInterface> interfaces, String outputPath) throws IOException {
        Set<String> defined = interfaces.keySet();
        Set<String> externalRefs = new TreeSet<>();

        for (WlInterface iface : interfaces.values()) {
            for (Message msg : iface.requests) {
                for (Arg arg : msg.args) {
                    if (arg.iface != null && !defined.contains(arg.iface) && isExternalInterface(arg.iface)) {
                        externalRefs.add(arg.iface);
                    }
                }
            }
            for (Message msg : iface.events) {
                for (Arg arg : msg.args) {
                    if (arg.iface != null && !defined.contains(arg.iface) && isExternalInterface(arg.iface)) {
                        externalRefs.add(arg.iface);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("package org.graphiks.kffi.wayland.generated\n\n");
        sb.append("import java.lang.foreign.*\n");
        sb.append("import java.lang.foreign.ValueLayout.*\n");
        sb.append("import java.lang.foreign.MemoryLayout.PathElement.*\n");
        sb.append("import org.graphiks.kffi.wayland.libWaylandClient\n\n");

        sb.append("// Arena.global() — wl_interface structs live for the process lifetime;\n");
        sb.append("// libwayland holds pointers to them. A scoped/auto arena would risk\n");
        sb.append("// use-after-free when the GC reclaims the arena.\n");
        sb.append("private val ARENA = Arena.global()\n\n");

        for (WlInterface iface : interfaces.values()) {
            sb.append("val ").append(ifaceValName(iface.name))
              .append(": MemorySegment by lazy { ").append(safeBuildName(iface.name)).append("() }\n");
        }
        sb.append("\n");

        if (!externalRefs.isEmpty()) {
            for (String ext : externalRefs) {
                sb.append("private val ").append(ifaceValName(ext))
                  .append(": MemorySegment by lazy {\n");
                sb.append("    val lib = libWaylandClient ?: error(\"libwayland-client.so.0 not available\")\n");
                sb.append("    lib.find(\"").append(ext).append("_interface\").orElseThrow()\n");
                sb.append("}\n");
            }
            sb.append("\n");
        }

        sb.append("private val MSG_LAYOUT = MemoryLayout.structLayout(\n");
        sb.append("    ADDRESS.withName(\"name\"), ADDRESS.withName(\"signature\"), ADDRESS.withName(\"types\"))\n");
        sb.append("    .withByteAlignment(8)\n");
        sb.append("private val IFACE_LAYOUT = MemoryLayout.structLayout(\n");
        sb.append("    ADDRESS.withName(\"name\"),\n");
        sb.append("    JAVA_INT.withName(\"version\"),\n");
        sb.append("    JAVA_INT.withName(\"method_count\"),\n");
        sb.append("    ADDRESS.withName(\"methods\").withByteAlignment(8),\n");
        sb.append("    JAVA_INT.withName(\"event_count\"),\n");
        sb.append("    MemoryLayout.paddingLayout(4),\n");
        sb.append("    ADDRESS.withName(\"events\").withByteAlignment(8))\n");
        sb.append("    .withByteAlignment(8)\n\n");

        for (WlInterface iface : interfaces.values()) {
            sb.append("private fun ").append(safeBuildName(iface.name))
              .append("(): MemorySegment = iface(\"").append(iface.name)
              .append("\", ").append(iface.version).append(", arrayOf(\n");

            for (int i = 0; i < iface.requests.size(); i++) {
                Message msg = iface.requests.get(i);
                sb.append("    msg(\"").append(msg.name).append("\", \"")
                  .append(buildSignature(msg.since, msg.args)).append("\"");
                sb.append(buildTypesVarargs(msg.args, iface.name));
                sb.append(")");
                if (i < iface.requests.size() - 1) sb.append(",");
                sb.append("\n");
            }

            sb.append("), arrayOf(\n");

            for (int i = 0; i < iface.events.size(); i++) {
                Message msg = iface.events.get(i);
                sb.append("    msg(\"").append(msg.name).append("\", \"")
                  .append(buildSignature(msg.since, msg.args)).append("\"");
                sb.append(buildTypesVarargs(msg.args, iface.name));
                sb.append(")");
                if (i < iface.events.size() - 1) sb.append(",");
                sb.append("\n");
            }

            sb.append("))\n\n");
        }

        sb.append("private fun msg(name: String, signature: String, vararg types: MemorySegment): MemorySegment {\n");
        sb.append("    val seg = ARENA.allocate(MSG_LAYOUT)\n");
        sb.append("    seg.set(ADDRESS, 0L, ARENA.allocateFrom(name))\n");
        sb.append("    seg.set(ADDRESS, 8L, ARENA.allocateFrom(signature))\n");
        sb.append("    if (types.isEmpty()) {\n");
        sb.append("        seg.set(ADDRESS, 16L, MemorySegment.NULL)\n");
        sb.append("    } else {\n");
        sb.append("        val arr = ARENA.allocate(ADDRESS, (types.size + 1).toLong())\n");
        sb.append("        for (i in types.indices) arr.set(ADDRESS, (i * 8).toLong(), types[i])\n");
        sb.append("        arr.set(ADDRESS, (types.size * 8).toLong(), MemorySegment.NULL)\n");
        sb.append("        seg.set(ADDRESS, 16L, arr)\n");
        sb.append("    }\n");
        sb.append("    return seg\n");
        sb.append("}\n\n");

        sb.append("private fun iface(\n");
        sb.append("    name: String, version: Int,\n");
        sb.append("    methods: Array<MemorySegment>,\n");
        sb.append("    events: Array<MemorySegment>\n");
        sb.append("): MemorySegment {\n");
        sb.append("    val seg = ARENA.allocate(IFACE_LAYOUT)\n");
        sb.append("    seg.set(ADDRESS, 0L, ARENA.allocateFrom(name))\n");
        sb.append("    seg.set(JAVA_INT, 8L, version)\n");
        sb.append("    seg.set(JAVA_INT, 12L, methods.size)\n");
        sb.append("    if (methods.isNotEmpty()) {\n");
        sb.append("        val arr = ARENA.allocate(MSG_LAYOUT, methods.size.toLong())\n");
        sb.append("        for (i in methods.indices) arr.asSlice(i * 24L).copyFrom(methods[i])\n");
        sb.append("        seg.set(ADDRESS, 16L, arr)\n");
        sb.append("    } else {\n");
        sb.append("        seg.set(ADDRESS, 16L, MemorySegment.NULL)\n");
        sb.append("    }\n");
        sb.append("    seg.set(JAVA_INT, 24L, events.size)\n");
        sb.append("    if (events.isNotEmpty()) {\n");
        sb.append("        val arr = ARENA.allocate(MSG_LAYOUT, events.size.toLong())\n");
        sb.append("        for (i in events.indices) arr.asSlice(i * 24L).copyFrom(events[i])\n");
        sb.append("        seg.set(ADDRESS, 32L, arr)\n");
        sb.append("    } else {\n");
        sb.append("        seg.set(ADDRESS, 32L, MemorySegment.NULL)\n");
        sb.append("    }\n");
        sb.append("    return seg\n");
        sb.append("}\n");

        Path outPath = Paths.get(outputPath);
        Files.createDirectories(outPath.getParent());
        Files.writeString(outPath, sb.toString());

        System.out.println("Generated: " + outputPath);
    }

    static String buildTypesVarargs(List<Arg> args, String currentIfaceName) {
        if (args.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (Arg arg : args) {
            if (arg.iface != null && !arg.iface.equals(currentIfaceName)) {
                sb.append(", ").append(ifaceValName(arg.iface));
            } else {
                sb.append(", MemorySegment.NULL");
            }
        }
        return sb.toString();
    }
}
