package ec.seguridaddigital.javacourse;

import org.w3c.dom.*;
import org.xml.sax.InputSource;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class XmlHandler {
    public XmlHandler() {
    }

    public String handle(final String xml) {
        try {
            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = factory.newDocumentBuilder();
            final Document doc = builder.parse(new InputSource(new StringReader(xml)));
            doc.normalize();

            final Transformer tf = TransformerFactory.newInstance().newTransformer();
            tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            tf.setOutputProperty(OutputKeys.INDENT, "yes");

            final StringWriter out = new StringWriter();
            tf.transform(new DOMSource(doc), new StreamResult(out));

            return out.toString();
        } catch(Exception e) {
            System.err.println("Oh no: " + e);
            return null;
        }
    }
}
