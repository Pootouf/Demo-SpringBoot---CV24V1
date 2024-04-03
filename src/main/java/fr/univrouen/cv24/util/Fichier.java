package fr.univrouen.cv24.util;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class Fichier {

    public static String loadFileXML() {
        Resource resource = new DefaultResourceLoader().getResource("smallCV.xml");
        try {
            return resource.getContentAsString(Charset.defaultCharset());
        } catch (IOException e) {
            return e.getMessage();
        }
    }

}
