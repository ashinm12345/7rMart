package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement ManageFooterinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1' and @class='btn btn-sm btn btn-primary btncss']")WebElement ClickEdit;
	@FindBy(xpath="//textarea[@id='content']")WebElement enterAdress;
	@FindBy(xpath="//input[@id='email']")WebElement enterEmail;
	@FindBy(xpath="//input[@id='phone']")WebElement enterNo;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")WebElement clickUpdate;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement display;
	
	
	 WebDriver driver;
	    public ManageFooterTextPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	    
	    public void ClicktheManageFooterinfo()
	    {
	    	ManageFooterinfo.click();
	    }
	    
	    public void ClickEditButton()
	    {
	    	ClickEdit.click();
	    }
	    
	    public void EntertheAdress()
	    {
	    	enterAdress.clear();
	    	enterAdress.sendKeys("abcdwet strret");
	    }
	    
	    public void entertheEmail()
	    {
	    	enterEmail.clear();
	    	enterEmail.sendKeys("xyzap@yahoo.com");
	    }
	    
	    public void entertheNumber()
	    {
	    	enterNo.clear();
	    	enterNo.sendKeys("2147483647");
	    }
	    
	    public void clickUpdateButton()
	    {
	    	clickUpdate.click();
	    }
	    
	    public boolean isalertDisply()
	    {
	    	return display.isDisplayed();
	    }

}
