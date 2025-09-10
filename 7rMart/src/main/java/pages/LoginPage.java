package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@placeholder='Username' and @name='username']")WebElement user;
	@FindBy(xpath="//input[@placeholder='Password' and @name='password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")WebElement Signbutton;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashbard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement display;

public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void entertheUserName(String userName) {
		user.sendKeys(userName);
	}
	public void enterthepassward(String password2) {
		password.sendKeys(password2);
	}
	public void clicksignButton() {
		Signbutton.click();
	}
	public boolean isdashboardDisplayed() {
		return dashbard.isDisplayed();
		
		
	}
	public boolean isalertDisplayed() {
		return display.isDisplayed();
		
	}
	

}
