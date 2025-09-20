package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoriePage;
import utilities.ExcelUtility;

public class ManageCategorieTest extends Base {
	@Test
	public void verifyUserCancreatNewListCategories() throws IOException {
	
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass).clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
	ManageCategoriePage manageCategorie =new ManageCategoriePage(driver);
	manageCategorie.clickmanagCategorie();
	manageCategorie.clicknewCategorie();
	manageCategorie.enterCategories();
	manageCategorie.clickchooseFile();
	manageCategorie.ClickSaveButton();

	}
	
	@Test
	public void verifyUserCancreatEditCategories() throws IOException {
	
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user);
		loginpages.enterthepassward(pass);
		loginpages.clicksignButton();
		ManageCategoriePage manageCategorie =new ManageCategoriePage(driver);
		manageCategorie.clickmanagCategorie();
		manageCategorie.EditManageCategorie();
		manageCategorie.EntertheCatergories();
		manageCategorie.ClickthechoosFile();
		manageCategorie.Clickupdate();
		Boolean ispopupmessage=manageCategorie.alertDisplay();
		Assert.assertTrue(ispopupmessage);
	}
}
