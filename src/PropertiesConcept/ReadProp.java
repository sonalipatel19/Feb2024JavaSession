package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public final static String CONFIG_FILE_PATH = "./src/PropertiesConcept/config.properties";
	public static Properties prop;

	public static void main(String[] args) {
		
		
		try {
			FileInputStream	f = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(f);
			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String name = prop.getProperty("naveen");
		System.out.println(name);

		prop.setProperty("browser", "firefox");
		browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		prop.setProperty("version", "99.0");
		String version = prop.getProperty("version");
		System.out.println(version);
		
		System.out.println(prop.size());
		
		
	}

}
