package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

public static void fileReader() throws IOException {
	FileReader fr =new FileReader("C:\\Users\\shiva\\eclipse-workspace\\AutomationFramework\\Juspay\\src\\test\\resources\\test.properties");
	Properties p =new Properties();
	p.load(fr);
	System.out.println(p.getProperty("browser"));
	System.out.println(p.getProperty("url"));
}
}
