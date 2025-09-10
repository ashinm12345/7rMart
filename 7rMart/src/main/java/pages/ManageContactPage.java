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
	
	
	 WebDriver driver;
	    public ManageContactPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	    
	    public void clickManageContactinfo()
	    {
	    	Contactinfo.click();
	    }
	    
	    public void ClickEditButton()
	    {
	    	Clickeditbutton.click();	
	    }
	    
	    public void Enterthenumber(String phoneNumber)
	    {
	    	enterNo.clear();
	    	enterNo.sendKeys(phoneNumber);
	    	
	    }
	    
	    public void EntertheAddress(String address)
	    {
	    	enterAddress.clear();
	    	enterAddress.sendKeys(address);
	    }
	    
	    public void EntertheTime(String time)
	    {
	    	enterTime.clear();
	    	enterTime.sendKeys(time);
	    }
	    
	    public void EntertheChargelimit(int Limit)
	    {
	    	enterChargelimit.clear();
	    	enterChargelimit.sendKeys(String.valueOf(Limit));
	    }
	    
	    public void ClickUpdateButton()
	    {
	    	clickUpdate.click();
	    }




}
