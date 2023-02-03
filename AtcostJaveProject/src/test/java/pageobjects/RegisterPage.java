package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import base.BaseTest;

public class RegisterPage extends BaseTest{
	
	@FindBy(xpath="//h1[normalize-space()='Register Account']")
	WebElement findTitle;
	
	@FindBy(id="input-firstname")
	WebElement firsName;
	
	@FindBy(id="input-lastname")
	WebElement lastName;
	
	@FindBy(id="input-email")
	WebElement newemail;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-zone")
	WebElement State;
	
	@FindBy(id="input-city_id")
	WebElement Cityid;
	
	@FindBy(xpath ="//input[@id='input-address-2']")
	WebElement inputaddress;
	
	@FindBy(id="input-address-1")
	WebElement Housno;
	
	@FindBy(id="input-postcode")
	WebElement postcode;
	
	@FindBy(id="input-password")
	WebElement Regpassword;
	
	@FindBy(id="input-confirm")
	WebElement confirmPass;
	
	@FindBy(id="input-referral-code")
	WebElement refecode;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement conti;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void vilidateAcountCreatePage(String fName, 
			String lName, 
			String email, 
			String number, 
			String stateName, 
			String cityName,
			String location, 
			String Hno, 
			String zip, 
			String newpassowrd, 
			String Cpassword,
			String ref,
			String config) {
		Action action = new Action();
		action.isDisplayed(driver, findTitle);
		action.type(firsName, fName);
		action.type(lastName, lName);
		action.type(newemail, email);
		action.type(telephone, number);
		action.selectByValue(State, stateName);
		action.selectByValue(Cityid, cityName);
		action.selectByValue(inputaddress, location);
		action.type(Housno, Hno);
		action.type(postcode, zip);
		action.type(Regpassword, newpassowrd);
		action.type(confirmPass, Cpassword);
		action.type(refecode, ref);
		
	}
	public HomePage validateRegistration() {
		conti.click();
		return new HomePage();
	}
	
}
