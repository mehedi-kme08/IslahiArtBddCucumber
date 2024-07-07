package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilereader {

	public static String getPropertyValue(String key) throws IOException {
		String temp = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(temp + "\\src\\test\\resources\\Config\\configuration.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}

}
