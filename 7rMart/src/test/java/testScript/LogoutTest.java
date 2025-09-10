package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test(priority = 1)
	public void logoutFromLoginPageTest() throws IOException {
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user);
		loginpages.enterthepassward(pass);
		loginpages.clicksignButton();

		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickProfileIcon();
		logoutpage.clickLogoutButton();
		Assert.assertTrue(logoutpage.isLoginPageDisplayed(), Constant.LOGINPAGENOTLOADEDMESSAGE);
	}

}