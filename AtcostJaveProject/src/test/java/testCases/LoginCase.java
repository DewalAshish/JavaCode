package testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pageobjects.HomePage;
import pageobjects.indexpage;
import pageobjects.LoginPage;

public class LoginCase extends BaseTest{
	indexpage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	@BeforeMethod
	public void loingTesT() throws IOException {
		launchApp();
		
	}
	



	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	@Test
	public void locationpop() throws Throwable {
		indexpage = new indexpage();
		loginpage=indexpage.clickonlocation();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actTitle=homepage.getTitle();
		String expected="My Account";
		Assert.assertEquals(actTitle, expected,"Tile is not correct");
		System.out.println(actTitle);
		System.out.println("Assert passed");
		
		Thread.sleep(4000);
	}
	
	
	
	
	

}

