package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC001_LoginpageTest extends Baseclass {

    LoginPage lp;

    @BeforeClass
    public void loginOnce() {

        lp = new LoginPage(driver);

        lp.setUserName("sf001");
        lp.setPasswordName("Francis@1988");
        lp.clickbtnLogin();
         System.out.println(driver.getCurrentUrl());
        // Optional: validate login success
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),
                "Login failed -Invalid username or password!");
    }

    @Test
    public void verifyClickOnERPApps() {
        lp.clickERPApps();
        Assert.assertTrue(true);  // Replace with real validation
    }

    @Test
    public void verifyClickOnIcard() {
        lp.clickERPApps();
        lp.clickIcard();
        Assert.assertTrue(true);  // Replace with real validation
    }
}