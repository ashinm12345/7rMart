package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtilities;

public class ManageCategoriePage {
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='active nav-link']")WebElement Moreinfo; 
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add' and @onclick='click_button(1)']")WebElement Newcategorie;
    @FindBy(xpath="//input[@id='category']")WebElement EntertheCategorie;
    @FindBy(xpath="//input[@id='main_img']")WebElement ChooseFile;
    @FindBy(xpath="//button[text()='Save']")WebElement ClickSave;
    
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/edit?edit=2862&page_ad=1' and @role='button']")WebElement clickeditCategories;
    @FindBy(xpath="//input[@id='category']")WebElement enterCategories;
    @FindBy(xpath="//input[@id='main_img']")WebElement clickChoosFile;
    @FindBy(xpath="//button[@type='submit']")WebElement clickUpdate;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
    
    WebDriver driver;
    public ManageCategoriePage(WebDriver driver) 
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
    public void clickmanagCategorie() {
    	Moreinfo.click();
    }
    public void clicknewCategorie() {
    	Newcategorie.click();
    }
    public void enterCategories() {
    	EntertheCategorie.sendKeys("Burger");
    }
    public void clickchooseFile() {
    	FileUploadUtilities fileUploadutilities=new FileUploadUtilities();
    	fileUploadutilities.fileUploadUsingSendkeys(ChooseFile, Constant.TESTIMAGEPATH);
    }
    public void ClickSaveButton() {
    	ClickSave.click();
    }
    
    public void EditManageCategorie()
    {
    	
    	clickeditCategories.click();
    }
    
    public void EntertheCatergories()
    {
    	enterCategories.sendKeys("change");
    }
    
    public void ClickthechoosFile()
    {
    	FileUploadUtilities fileUploadutilities=new FileUploadUtilities();
    	fileUploadutilities.fileUploadUsingSendkeys(clickChoosFile, Constant.TESTIMAGEPATH);
    }
    
    public void Clickupdate()
    {
    	clickUpdate.click();
    }
    
    public Boolean alertDisplay()
    {
    	return alert.isDisplayed();
    }
    
}
