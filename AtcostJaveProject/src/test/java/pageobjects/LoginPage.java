package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import actiondriver.Action;
import base.BaseTest;

public class LoginPage extends BaseTest{
	
	@FindBy(id="input-email")
	WebElement username;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement singInBtn;
	
	@FindBy(xpath ="//a[normalize-space()='Register Account']")
	WebElement RegisterBut;
	
	
	public LoginPage(){
		
	PageFactory.initElements(driver, this);
		
	}
	
	public HomePage login (String uname, String pswd) throws Throwable  {
		
		
		Action action = new Action();
		action.type(username, uname);
		Thread.sleep(2000);
		action.type(password, pswd);
		action.click(driver, singInBtn);
		Thread.sleep(2000);
		return new HomePage();
	}
	
	public RegisterPage RegisterAccount() {
		Action action = new Action();
		action.click(driver, RegisterBut);
		return new RegisterPage();
	}
	
	

}
