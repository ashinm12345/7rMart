package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageContactTest extends Base {
	
	LogoutPage logoutpage;
	ManageContactPage manageContact;
	@Test(priority = 1)
	public void verifyUserCanLoginManageContact() throws IOException {
	
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass);
		logoutpage=loginpages.clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
		FakerUtility fakerUtility = new FakerUtility();
		String phoneNumber = "9995554444";
		String address = fakerUtility.generateAddress();
		String time =  "10";
		int chargeLimit = 300;
		String email="six";
		
		//ManageContactPage  manageContact =new ManageContactPage(driver);
		manageContact.clickManageContactinfo().ClickEditButton().Enterthenumber(phoneNumber).EntertheAddress(address).EntertheTime(time);
		manageContact.EntertheChargelimit(chargeLimit);
	    manageContact.ClickUpdateButton();
		
		
 
		
	}

}
