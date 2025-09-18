package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")WebElement Contactinfo;
	@FindBy(xpath="//a[ @role='button']")WebElement Clickeditbutton;
	@FindBy(xpath="//input[@id=\'phone\']")WebElement enterNo;
	@FindBy(xpath="//input[@id='email']")WebElement enterEmail;
	@FindBy(xpath="//textarea[@id='content' and @name='address']")WebElement enterAddress;
	@FindBy(xpath="//textarea[@ id='content'and @name='del_time']")WebElement enterTime;
	@FindBy(xpath="//input[@ id='del_limit']")WebElement enterChargelimit;
	@FindBy(xpath="//button[@ type=\"submit\"]")WebElement clickUpdate;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successAlertBox;
	
	
	 WebDriver driver;
	    public ManageContactPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	    
	    public ManageContactPage clickManageContactinfo()
	    {
	    	Contactinfo.click();
	    	return this;
	    }
	    
	    public ManageContactPage ClickEditButton()
	    {
	    	Clickeditbutton.click();
	    	return this;
	    }
	    
	    public ManageContactPage Enterthenumber(String phoneNumber)
	    {
	    	enterNo.clear();
	    	enterNo.sendKeys(phoneNumber);
	    	return this;
	    	
	    }
	    
	    public ManageContactPage EntertheAddress(String address)
	    {
	    	enterAddress.clear();
	    	enterAddress.sendKeys(address);
	    	return this;
	    }
	    
	    public void EntertheTime(String time)
	    {
	    	enterTime.clear();
	    	enterTime.sendKeys(time);
	    }
	    
	    public ManageContactPage EntertheChargelimit(int Limit)
	    {
	    	enterChargelimit.clear();
	    	enterChargelimit.sendKeys(String.valueOf(Limit));
	    	return this;
	    }
	    
	    public ManageContactPage ClickUpdateButton()
	    {
	    	clickUpdate.click();
	    	return this;
	    }
	   




}
