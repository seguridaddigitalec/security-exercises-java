package ec.seguridaddigital.javacourse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class XmlHandlerTest {
    private final static String BILLION_LAUGHS_XML = "<?xml version=\"1.0\"?>" +
        "<!DOCTYPE lolz [" +
        "<!ENTITY lol \"lol\">" +
        "<!ENTITY lol2 \"&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;&lol;\">" +
        "<!ENTITY lol3 \"&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;&lol2;\">" +
        "<!ENTITY lol4 \"&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;&lol3;\">" +
        "<!ENTITY lol5 \"&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;&lol4;\">" +
        "<!ENTITY lol6 \"&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;&lol5;\">" +
        "<!ENTITY lol7 \"&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;&lol6;\">" +
        "<!ENTITY lol8 \"&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;&lol7;\">" +
        "<!ENTITY lol9 \"&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;&lol8;\">" +
        "]>" +
        "<lolz>&lol9;</lolz>";

    private final static String EXT_ENTITY_XML = "<?xml version=\"1.0\"?>" +
        "<!DOCTYPE name [" +
        "  <!ELEMENT name ANY>" +
        "  <!ENTITY xxe SYSTEM \"file:///etc/passwd\"> ]>" +
        "<profiles>" +
        "  <profile>" +
        "    <name>&xxe;</name> "+
        "    <address>test</address>"+
        "  </profile>"+
        "</profiles>";

    @Test
    void handle_canSurviveBillionLaughs() {
        final XmlHandler handler = new XmlHandler();

        final String result = handler.handle(BILLION_LAUGHS_XML);
        assertEquals(true, result.contains("<name></name>"));
    }

    @Test
    void handle_doesNotResolveExternalEntity() {
        final XmlHandler handler = new XmlHandler();

        final String result = handler.handle(EXT_ENTITY_XML);
        assertEquals(true, result.contains("<name></name>"));
    }
}
