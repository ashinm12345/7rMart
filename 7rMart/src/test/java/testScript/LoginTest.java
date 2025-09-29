package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;


public class LoginTest extends Base  {
	LoginTest loginpages;
	LogoutPage logoutpage;
	@Test(priority = 1, groups = { "regression" })
	public void verifyUserCanLoginWithCorrectUsernameAndPassword() throws IOException {
	
		
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass);
		logoutpage =loginpages.clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
		boolean ishomepageloaded=loginpages.isdashboardDisplayed();
		Assert.assertTrue(ishomepageloaded);

		
	}
	@Test(priority = 2, groups = { "regression" })
	public void verifyUserCanLoginWithcorrectUsernameAndInvalidPassword() throws IOException
	{
	
		String user=ExcelUtility.getStringData(2,0,"LoginPage");
		String pass=ExcelUtility.getStringData(2,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass);
		logoutpage =loginpages.clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
		boolean ishomepageloaded=loginpages.isalertDisplayed();
		Assert.assertTrue(ishomepageloaded);
	
	}
	@Test(priority = 3, groups = { "regression" })
	public void verifyUserCanLoginWithInvalidUsernameAndcorrectPassword() throws IOException
	{
	
	String user=ExcelUtility.getStringData(3, 0,"LoginPage");
	String pass=ExcelUtility.getStringData(3, 1,"LoginPage");	
	LoginPage loginpages=new LoginPage(driver);
	loginpages.entertheUserName(user).enterthepassward(pass);
	logoutpage =loginpages.clicksignButton();
	//loginpages.enterthepassward(pass);
	//loginpages.clicksignButton();
	boolean ispopupmessage=loginpages.isalertDisplayed();
	Assert.assertTrue(ispopupmessage);
	
	}
	@Test(priority = 4, groups = { "regression" }, dataProvider = "LoginProvider")
	public void verifyUserCanLoginWithInvalidUsernameAndPassword() throws IOException
	{
	
	String user=ExcelUtility.getStringData(4, 0,"LoginPage");
	String pass=ExcelUtility.getStringData(4, 1,"LoginPage");
	LoginPage loginpages=new LoginPage(driver);
	loginpages.entertheUserName(user).enterthepassward(pass);
	logoutpage =loginpages.clicksignButton();
	//loginpages.enterthepassward(pass);
	//loginpages.clicksignButton();
	boolean ispopupmessage=loginpages.isalertDisplayed();
	Assert.assertTrue(ispopupmessage);
	
	}

}
	
