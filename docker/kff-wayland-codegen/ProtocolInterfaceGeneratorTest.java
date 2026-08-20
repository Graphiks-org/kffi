import java.nio.file.Files;
import java.nio.file.Path;

/** Minimal regression test for the XML-to-Kotlin generator. */
public final class ProtocolInterfaceGeneratorTest {
    public static void main(String[] args) throws Exception {
        Path directory = Files.createTempDirectory("kff-wayland-codegen-test");
        Path protocol = directory.resolve("protocol.xml");
        Path output = directory.resolve("Generated.kt");
        Files.writeString(protocol, """
            <?xml version="1.0" encoding="UTF-8"?>
            <protocol name="test">
              <interface name="test_root" version="1">
                <request name="nullable">
                  <arg name="object" type="object" interface="test_child" allow-null="true"/>
                  <arg name="text" type="string" allow-null="true"/>
                </request>
              </interface>
              <interface name="test_child" version="1"/>
            </protocol>
            """);

        ProtocolInterfaceGenerator.main(new String[]{protocol.toString(), output.toString()});

        String generated = Files.readString(output);
        String expected = "msg(\"nullable\", \"?o?s\", test_child_interface, MemorySegment.NULL)";
        if (!generated.contains(expected)) {
            throw new AssertionError("Missing nullable Wayland signature: " + expected);
        }
    }
}
