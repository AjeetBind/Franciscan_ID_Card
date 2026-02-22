package testCases;


import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC001_LoginpageTest extends Baseclass {
	
	@Test
	public void testLoginWithValidCredentials() {

		LoginPage lp=new LoginPage(driver);
		lp.setUserName("sf001");
		lp.setPasswordName("Francis1988");
		lp.clickbtnLogin();
		lp.clickERPApps();
		lp.clickIcard();
	}
}




