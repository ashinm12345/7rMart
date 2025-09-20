package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base  {
	@Test
	public void verifyUserCanLoginWithCorrectUsernameAndPassword() throws IOException {
	
		
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass).clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
		boolean ishomepageloaded=loginpages.isdashboardDisplayed();
		Assert.assertTrue(ishomepageloaded);

		
	}
	@Test
	public void verifyUserCanLoginWithcorrectUsernameAndInvalidPassword() throws IOException
	{
	
		String user=ExcelUtility.getStringData(2,0,"LoginPage");
		String pass=ExcelUtility.getStringData(2,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user);
		loginpages.enterthepassward(pass);
		loginpages.clicksignButton();
		boolean ishomepageloaded=loginpages.isalertDisplayed();
		Assert.assertTrue(ishomepageloaded);
	
	}
	@Test
	public void verifyUserCanLoginWithInvalidUsernameAndcorrectPassword() throws IOException
	{
	
	String user=ExcelUtility.getStringData(3, 0,"LoginPage");
	String pass=ExcelUtility.getStringData(3, 1,"LoginPage");	
	LoginPage loginpages=new LoginPage(driver);
	loginpages.entertheUserName(user);
	loginpages.enterthepassward(pass);
	loginpages.clicksignButton();
	boolean ispopupmessage=loginpages.isalertDisplayed();
	Assert.assertTrue(ispopupmessage);
	
	}
	@Test()
	public void verifyUserCanLoginWithInvalidUsernameAndPassword() throws IOException
	{
	
	String user=ExcelUtility.getStringData(4, 0,"LoginPage");
	String pass=ExcelUtility.getStringData(4, 1,"LoginPage");
	LoginPage loginpages=new LoginPage(driver);
	loginpages.entertheUserName(user);
	loginpages.enterthepassward(pass);
	loginpages.clicksignButton();
	boolean ispopupmessage=loginpages.isalertDisplayed();
	Assert.assertTrue(ispopupmessage);
	
	}

}
	
