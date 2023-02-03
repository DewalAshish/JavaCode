package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import base.BaseTest;

public class HomePage extends BaseTest{
	
	@FindBy(xpath ="//a[@class='list-group-item dark_hover'][normalize-space()='My Account']")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Edit Account']")
	WebElement EditAccount;
	
	@FindBy(xpath="//a[normalize-space()='Password']")
	WebElement Password;
	
	@FindBy(xpath="//a[normalize-space()='Address Book']")
	WebElement AddressBook;
	
	@FindBy(xpath="//a[@class='list-group-item dark_hover'][normalize-space()='Atcost Wallet Transactions']")
	WebElement AtcostWT;
	
	@FindBy(xpath="//a[@class='list-group-item dark_hover'][normalize-space()='Promo Transactions']")
	WebElement PromoT;
	
	@FindBy(xpath="//a[normalize-space()='Customer Queries']")
	WebElement CustomerQ;
	
	@FindBy(xpath="//a[@class='list-group-item dark_hover'][normalize-space()='Wish List']")
	WebElement WishList;
	
	@FindBy(xpath="//a[@class='list-group-item dark_hover'][normalize-space()='Order History']")
	WebElement OrderHistory;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validatMyAccount() {
		
		Action action = new Action();
		action.isDisplayed(driver, MyAccount);
		action.isDisplayed(driver, EditAccount);
		action.isDisplayed(driver, Password);
		action.isDisplayed(driver, AddressBook);
		action.isDisplayed(driver, AtcostWT);
		action.isDisplayed(driver, PromoT);
		action.isDisplayed(driver, CustomerQ);
		action.isDisplayed(driver, WishList);
		action.isDisplayed(driver, OrderHistory);
	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
		
	}

}
