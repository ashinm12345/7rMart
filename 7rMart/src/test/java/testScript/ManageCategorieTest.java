package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageCategoriePage;
import utilities.ExcelUtility;

public class ManageCategorieTest extends Base {
	
	LogoutPage logoutpage;
	ManageCategoriePage manageCategorie;
	
	@Test(priority = 1)
	public void verifyUserCancreatNewListCategories() throws IOException {
	
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass);
		logoutpage=loginpages.clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
	//ManageCategoriePage manageCategorie =new ManageCategoriePage(driver);
	manageCategorie.clickmanagCategorie();
	manageCategorie.clicknewCategorie();
	manageCategorie.enterCategories();
	manageCategorie.clickchooseFile();
	manageCategorie.ClickSaveButton();

	}
	
	@Test(priority = 2)
	public void verifyUserCancreatEditCategories() throws IOException {
	
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass);
		logoutpage=loginpages.clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
		//ManageCategoriePage manageCategorie =new ManageCategoriePage(driver);
		manageCategorie.clickmanagCategorie();
		manageCategorie.EditManageCategorie();
		manageCategorie.EntertheCatergories();
		manageCategorie.ClickthechoosFile();
		manageCategorie.Clickupdate();
		Boolean ispopupmessage=manageCategorie.alertDisplay();
		Assert.assertTrue(ispopupmessage);
	}
}
