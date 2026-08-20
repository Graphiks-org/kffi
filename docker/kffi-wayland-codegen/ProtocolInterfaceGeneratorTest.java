import java.nio.file.Files;
import java.nio.file.Path;

/** Minimal regression test for the XML-to-Kotlin generator. */
public final class ProtocolInterfaceGeneratorTest {
    public static void main(String[] args) throws Exception {
        Path directory = Files.createTempDirectory("kffi-wayland-codegen-test");
        Path protocol = directory.resolve("protocol.xml");
        Path output = directory.resolve("Generated.kt");
        Path constants = directory.resolve("Constants.kt");
        Files.writeString(protocol, """
            <?xml version="1.0" encoding="UTF-8"?>
            <protocol name="test">
              <interface name="test_root" version="1">
                <request name="nullable">
                  <arg name="object" type="object" interface="test_child" allow-null="true"/>
                  <arg name="text" type="string" allow-null="true"/>
                </request>
                <request name="release" since="2"/>
                <event name="ready" since="4">
                  <arg name="mode" type="uint"/>
                </event>
                <event name="done" since="12"/>
                <enum name="mode">
                  <entry name="fast" value="0x2"/>
                </enum>
              </interface>
              <interface name="test_child" version="1"/>
            </protocol>
            """);

        ProtocolInterfaceGenerator.main(new String[]{
            protocol.toString(), output.toString(), constants.toString()
        });

        String generated = Files.readString(output);
        String expected = "msg(\"nullable\", \"?o?s\", test_child_interface, MemorySegment.NULL)";
        if (!generated.contains(expected)) {
            throw new AssertionError("Missing nullable Wayland signature: " + expected);
        }
        assertContains(generated, "msg(\"release\", \"2\")");
        assertContains(generated, "msg(\"ready\", \"4u\", MemorySegment.NULL)");
        assertContains(generated, "msg(\"done\", \"12\")");

        String generatedConstants = Files.readString(constants);
        assertContains(generatedConstants, "const val TEST_ROOT_NULLABLE: Int = 0");
        assertContains(generatedConstants, "const val TEST_ROOT_RELEASE: Int = 1");
        assertContains(generatedConstants, "const val TEST_ROOT_EVENT_READY: Int = 0");
        assertContains(generatedConstants, "const val TEST_ROOT_EVENT_DONE: Int = 1");
        assertContains(generatedConstants, "const val TEST_ROOT_MODE_FAST: Int = 2");
        if (generatedConstants.endsWith("\n\n")) {
            throw new AssertionError("Generated constants should not end with a blank line");
        }
    }

    private static void assertContains(String generated, String expected) {
        if (!generated.contains(expected)) {
            throw new AssertionError("Missing generated protocol constant: " + expected);
        }
    }
}
