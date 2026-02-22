package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "txtUsername")
	private WebElement txtuserName;
	@FindBy(id = "txtPassword")
	private WebElement txtuserpassword;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	@FindBy(xpath = "//img[@src='/assets/Images/ERPApp.svg']")
	private WebElement ERPApps;
	@FindBy(xpath = "//div[@class='LinkSrvc ng-scope']/div[contains(text(),'I Card')]")
	private WebElement Icard;


	public void setUserName(String username){
		txtuserName.sendKeys(username);
	}
	public void setPasswordName(String userpassword) {

		txtuserpassword.sendKeys(userpassword);
	}

	public void clickbtnLogin() {
		btnLogin.click();
	}
	public void clickERPApps() {
		ERPApps.click();
	}
	public void clickIcard() {
		Icard.click();
	}
}
