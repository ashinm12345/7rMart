package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage
{
	@FindBy(xpath="//a[@class='small-box-footer'and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement Moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement cilckthenew;
	@FindBy(xpath="//textarea[@id='news']")WebElement entertheNews;
	@FindBy(xpath="//button[text()='Save']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	
	@FindBy(xpath="//a[contains(@href,'/admin/news/edit')][1]")WebElement edit;
	@FindBy(xpath="//textarea[@id='news']")WebElement entertheubdateNews;
	@FindBy(xpath="//button[@name='update']")WebElement update;
	

public WebDriver driver;
	
	public  ManageNewsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public ManageNewsPage selectMoreinfo1() {
		Moreinfo.click();
		return this;
	}
	public ManageNewsPage clicknewbutton() {
		cilckthenew.click();
		return this;
	}
	public ManageNewsPage enterthenews(String news) {
		
		entertheNews.sendKeys(news);
		return this;
	}
	public ManageNewsPage elicksavebutton() {
		save.click();
		return this;
	}
	public boolean displayalert() {
		return alert.isDisplayed();
	}
	
	  
		public ManageNewsPage selectEditbutton() {
			edit.click();
			return this;
		}
		public ManageNewsPage enterubdatenews(String news) {
			entertheNews.clear();
			entertheNews.sendKeys(news);
			return this;
		}
		public void clickUpdate() {
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.elementToBeClickable(update));
			//Actions actions=new Actions(driver);
			//actions.click(update).perform();
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click();", update);
			update.click();
		}
		public boolean alertDisplay() {
			 return alert.isDisplayed();
		}
	
}
