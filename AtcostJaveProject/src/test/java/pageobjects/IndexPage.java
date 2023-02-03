package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import base.BaseTest;

public class IndexPage  extends BaseTest{

	@FindBy(xpath= "//button[@id='login_button']")
	WebElement singnBtn;
	
	
	@FindBy(xpath = "//button[@id='submit_area']")
	WebElement continuebut;
	
	@FindBy(xpath = "//button[@id='close_area_modal']")
	WebElement Closeicon;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement SearchProduct;
	
	@FindBy(xpath="//i[@class='icon-search button-search hover_icon']")
	WebElement clickSearch;
	
	public IndexPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public LoginPage clickonlocation() {
		
		Action action = new Action();
		action.click(driver, singnBtn);
		
		
		return new LoginPage();
	}
	
	public LoginPage clickcontinuebut() {
		Action action = new Action();
		action.click(driver, continuebut);
		return new LoginPage();
	}
	
	public LoginPage clickCloseicone() {
		Action action = new Action();
		action.click(driver, Closeicon);
		return new LoginPage();
	}
	
	public String getAtcostTitle() {
		String AtcostTitle=driver.getTitle();
		return AtcostTitle;
	}
	
	public SearchResultPage searchProduct(String ProductName) throws Throwable {
		Action action = new Action();
		action.type(SearchProduct, ProductName);
		action.click(driver, clickSearch);
		Thread.sleep(3000);
		
		return new SearchResultPage();
	}
	
}
