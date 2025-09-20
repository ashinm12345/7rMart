package testScript;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	AdminUserPage adminuserspage;
	LogoutPage logoutpage;
	@Test(priority = 1)
	public void testAddAdmin() throws IOException {
		String loginUserName = ExcelUtility.getStringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		String loginPassword = ExcelUtility.getStringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.entertheUserName(loginUserName).enterthepassward(loginPassword).clicksignButton();
		//loginPage.enterthepassward(loginPassword);
		//loginPage.clicksignButton();
		
		AdminUserPage adminuserspage = new AdminUserPage(driver);
		adminuserspage.clickAddAdminLink();
		adminuserspage.clickAddNewAdminButton();
		
		loginUserName = ExcelUtility.getStringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		loginPassword = ExcelUtility.getStringData(1,1, "LoginPage");
		FakerUtility fakerutility = new FakerUtility();
		String loginUserNameAdmin = fakerutility.creatARandomFirstName(); 
		String loginPasswordAdmin = fakerutility.creatARandomFirstName();// Generating random username using FakerUtility
		adminuserspage.enterNewAdminUsername(loginUserNameAdmin);
		adminuserspage.enterNewAdminPassword(loginPasswordAdmin);
		adminuserspage.selectUserType();
		adminuserspage.clickSaveAdminButton();
		Assert.assertTrue(adminuserspage.isSuccessAlertDisplayed());
		
	}
	/*@Test(priority = 2)
	public void UpdateAdmin() throws IOException {
		String loginUserName = ExcelUtility.getStringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		String loginPassword = ExcelUtility.getStringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.entertheUserName(loginUserName);
		loginPage.enterthepassward(loginPassword);
		loginPage.clicksignButton();
		
		loginUserName = ExcelUtility.getStringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		loginPassword = ExcelUtility.getStringData(1,1, "LoginPage");
		FakerUtility fakerutility = new FakerUtility();
		String loginUserNameAdmin = fakerutility.creatARandomFirstName(); 
		String loginPasswordAdmin = fakerutility.creatARandomFirstName();
		
		AdminUserPage adminuserspage = new AdminUserPage(driver);
		adminuserspage.ClickeditIcon();
		adminuserspage.EnterUpdateName(loginUserName);
		adminuserspage.EnterUpdatePass(loginPassword);
		adminuserspage.EnterEditSelectDropDown();
		adminuserspage.ClickupdateAdminButton();
		adminuserspage.SuccessAlertDisplay();
		Assert.assertTrue(adminuserspage.SuccessAlertDisplay());
	}*/


}
