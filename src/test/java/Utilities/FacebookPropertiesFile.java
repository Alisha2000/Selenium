package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class FacebookPropertiesFile {
    public static String getValue(String key) throws IOException {
        File file=new File("C:\\Users\\Asiyat\\IdeaProjects\\Selenium\\src\\test\\resources\\credentials.properties");
        FileInputStream input=new FileInputStream(file);
        Properties prop=new Properties();

        prop.load(input);


        return prop.getProperty(key);
    }





}
