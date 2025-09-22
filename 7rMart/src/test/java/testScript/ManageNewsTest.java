package testScript;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	LogoutPage logoutpage;
	@Test
	public void verifyUserCancreatNewManageNews() throws IOException
	{
	
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user).enterthepassward(pass);
		logoutpage=loginpages.clicksignButton();
		//loginpages.enterthepassward(pass);
		//loginpages.clicksignButton();
	ManageNewsPage  manageNews=new ManageNewsPage(driver);
	String news="Enter the News and information";
	manageNews.selectMoreinfo1();
	manageNews.clicknewbutton();
	manageNews.enterthenews(news);
	manageNews.elicksavebutton();
	boolean isalertDisplay=manageNews.displayalert();
	Assert.assertTrue(isalertDisplay);
	}
	@Test
	public void verifyUserCanEditManagerNews() throws IOException
	{
	
		String user=ExcelUtility.getStringData(1,0,"LoginPage");
		String pass=ExcelUtility.getStringData(1,1,"LoginPage"); 
		LoginPage loginpages=new LoginPage(driver);
		loginpages.entertheUserName(user);
		loginpages.enterthepassward(pass);
		loginpages.clicksignButton();
	ManageNewsPage  manageNews=new ManageNewsPage(driver);
	String news="The updated Infermation is this";
	manageNews.selectMoreinfo1();
	manageNews.selectEditbutton();
	manageNews.enterubdatenews(news);
	manageNews.clickUpdate();
	boolean isalerDisplay= manageNews.alertDisplay();
	Assert.assertTrue(isalerDisplay);
	}
	
	
		
	
	

}
