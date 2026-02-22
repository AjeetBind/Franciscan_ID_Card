package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class Baseclass {
	WebDriver driver;
	@BeforeClass
	public void setup() {

	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless"); // run without UI
	    options.addArguments("--no-sandbox");
	    options.addArguments("--disable-dev-shm-usage");
	    options.addArguments("--start-maximized");

	    driver = new ChromeDriver(options);

	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://appuat.franciscanecare.net/Login/Identifier?SchCode=DEMOIN");
	}


	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();   // closes all browser windows and ends session
		}}




	public String randomString() {
	    String genratestring=RandomStringUtils.randomAlphabetic(5);
	    
	    return genratestring;
	}
	
	public String randomNumber() {
	    String genrateNumber=RandomStringUtils.randomNumeric(10);
	    return genrateNumber;
	}
	
	public String radomeAlphaNumberic() {
		String generatestring=RandomStringUtils.randomAlphabetic(3);
		String generatenumber=RandomStringUtils.randomNumeric(3);
		return generatestring+generatenumber;
	}


}
