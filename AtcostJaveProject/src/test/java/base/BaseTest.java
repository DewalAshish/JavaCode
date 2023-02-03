package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import actiondriver.Action;


import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Hitendra: BaseClass is used to load the config file and Initialize 
 * WebDriver
 *  
 */
public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();



	//loadConfig method is to load the configuration
	
		public void launchApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		
		
		if(driver==null) {
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
		}
		
		Action action = new Action();
		action.implicitWait(driver, 10);
		action.pageLoadTimeOut(driver, 30);
		
		
		
	}
}
