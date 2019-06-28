package Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileIntro {
    private  final static Logger LOG= LoggerFactory.getLogger(PropertiesFileIntro.class);
    public static String getValue(String key) throws IOException {
        File file=new File("C:\\Users\\Asiyat\\IdeaProjects\\Selenium\\src\\test\\resources\\credentials.properties");
        FileInputStream inputStream=new FileInputStream(file);
        Properties properties=new Properties();
        properties.load(inputStream);

        return properties.getProperty(key);
    }
    public static void main (String[]args) throws IOException {
        LOG.trace("Logging TRACE level");
        LOG.debug("Logging Debug level");
        LOG.info("Logging Info Level");
        LOG.warn("Logging Warn Level");
        LOG.error("Logging Error Level");
    }

}
