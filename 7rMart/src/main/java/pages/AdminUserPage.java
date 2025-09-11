package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtitlity;

public class AdminUserPage {
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement addAdminLink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement addNewAdminButton;
	@FindBy(xpath="//input[@name='username']")WebElement addNewAdminTextBox;
	@FindBy(xpath="//input[@name='password']")WebElement passwordTextBoxAdmin;
	@FindBy(xpath="//select[@name='user_type']")WebElement selectDropDown;
	@FindBy(xpath="//button[@name='Create']")WebElement saveAdminButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successAlertBox;
	
	@FindBy(xpath="(//a[contains(@href, 'admin/user/edit')])[1]")WebElement editIcon;
	@FindBy(xpath="//input[@id='username']")WebElement enterEditUsername;
	@FindBy(xpath="//input[@id='password']")WebElement enterEditPassword;
	@FindBy(xpath="//select[@id='user_type']")WebElement enterSelectDropDown;
	@FindBy(xpath="//button[@name='Update']")WebElement ClickupdateButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successAlert;
	
	WebDriver driver;
	public AdminUserPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickAddAdminLink()
	{
		addAdminLink.click();
	}
	
	public void clickAddNewAdminButton() 
	{
		addNewAdminButton.click();
	}
	
	public void enterNewAdminUsername(String username) 
	{
		addNewAdminTextBox.sendKeys(username);
	}
	
	public void enterNewAdminPassword(String password) 
	{
		passwordTextBoxAdmin.sendKeys(password);
	}
	
	public void selectUserType() 
	{
		selectDropDown.click();
		//Select select = new Select(selectDropDown);
		//select.selectByVisibleText("Admin");
		PageUtitlity pageutility = new PageUtitlity();
		pageutility.selectByVisibleText(selectDropDown, "Admin");
		//selectByVisibleText(selectDropDown, "Admin");
	}
	
	public void clickSaveAdminButton() 
	{
		saveAdminButton.click();
	}
	
	public boolean isSuccessAlertDisplayed() 
	{
		return successAlertBox.isDisplayed();
	}
	public void ClickeditIcon() 
	{
		editIcon.click();
	}
	public void EnterUpdateName(String username) 
	{
		enterEditUsername.clear();
		enterEditUsername.sendKeys(username);
	}
	public void EnterUpdatePass(String password) 
	{
		enterEditPassword.clear();
		enterEditPassword.sendKeys(password);
	}
	public void EnterEditSelectDropDown()
	{
		enterSelectDropDown.click();
		PageUtitlity pageutility = new PageUtitlity();
		pageutility.selectByVisibleText(selectDropDown, "Staff");
	}
	public void ClickupdateAdminButton()
	{
		ClickupdateButton.click();
	}
	public boolean SuccessAlertDisplay()
	{
		return successAlert.isDisplayed();
	}

}
