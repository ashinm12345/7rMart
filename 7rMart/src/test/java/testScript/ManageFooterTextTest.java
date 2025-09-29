package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	
	LogoutPage logoutpage;
	ManageFooterTextPage manageFooterText;
	@Test(priority = 1)
	
	public void verifyUserCanUpdateManageFooterText() throws IOException
	{
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass);
		logoutpage=loginpages.clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
		//ManageFooterTextPage  manageFooterText=new ManageFooterTextPage(driver);
		manageFooterText.ClicktheManageFooterinfo().ClickEditButton().EntertheAdress().entertheEmail().entertheNumber().clickUpdateButton();
		boolean ispopupmessage=manageFooterText.isalertDisply();
		Assert.assertTrue(ispopupmessage);
		
	}

}
