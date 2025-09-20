package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	@Test
	
	public void verifyUserCanUpdateManageFooterText() throws IOException
	{
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass).clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
		ManageFooterTextPage  manageFooterText=new ManageFooterTextPage(driver);
		manageFooterText.ClicktheManageFooterinfo();
		manageFooterText.ClickEditButton();
		manageFooterText.EntertheAdress();
		manageFooterText.entertheEmail();
		manageFooterText.entertheNumber();
		manageFooterText.clickUpdateButton();
		boolean ispopupmessage=manageFooterText.isalertDisply();
		Assert.assertTrue(ispopupmessage);
		
	}

}
