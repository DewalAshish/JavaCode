package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFlie {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("D:\\JAVA\\Automation\\AtcostJaveProject\\src\\test\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		
		p.load(fr);
		
		
	}

}
