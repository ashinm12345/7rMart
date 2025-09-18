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
	
	
	public AdminUserPage clickAddAdminLink()
	{
		addAdminLink.click();
		return this;
	}
	
	public AdminUserPage clickAddNewAdminButton() 
	{
		addNewAdminButton.click();
		return this;
	}
	
	public AdminUserPage enterNewAdminUsername(String username) 
	{
		addNewAdminTextBox.sendKeys(username);
		return this;
	}
	
	public AdminUserPage enterNewAdminPassword(String password) 
	{
		passwordTextBoxAdmin.sendKeys(password);
		return this;
	}
	
	public AdminUserPage selectUserType() 
	{
		selectDropDown.click();
		//Select select = new Select(selectDropDown);
		//select.selectByVisibleText("Admin");
		PageUtitlity pageutility = new PageUtitlity();
		pageutility.selectByVisibleText(selectDropDown, "Admin");
		//selectByVisibleText(selectDropDown, "Admin");
		return this;
	}
	
	public AdminUserPage clickSaveAdminButton() 
	{
		saveAdminButton.click();
		return this;
	}
	
	public boolean isSuccessAlertDisplayed() 
	{
		return successAlertBox.isDisplayed();
	}
	public AdminUserPage ClickeditIcon() 
	{
		editIcon.click();
		return this;
	}
	public AdminUserPage EnterUpdateName(String username) 
	{
		enterEditUsername.clear();
		enterEditUsername.sendKeys(username);
		return this;
	}
	public AdminUserPage EnterUpdatePass(String password) 
	{
		enterEditPassword.clear();
		enterEditPassword.sendKeys(password);
		return this;
	}
	public AdminUserPage EnterEditSelectDropDown()
	{
		enterSelectDropDown.click();
		PageUtitlity pageutility = new PageUtitlity();
		pageutility.selectByVisibleText(selectDropDown, "Staff");
		return this;
	}
	public AdminUserPage ClickupdateAdminButton()
	{
		ClickupdateButton.click();
		return this;
	}
	public boolean SuccessAlertDisplay()
	{
		return successAlert.isDisplayed();
	}

}
