package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id = "txtUsername")
    private WebElement txtuserName;

    @FindBy(id = "txtPassword")
    private WebElement txtuserpassword;

    @FindBy(id = "btnLogin")
    private WebElement btnLogin;

    @FindBy(xpath = "//img[@src='/assets/Images/ERPApp.svg']")
    private WebElement ERPApps;

    @FindBy(xpath = "//div[@class='LinkSrvc ng-scope']/div[contains(text(),'I Card')]")
    private WebElement Icard;

    public void setUserName(String username) {
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
    
    @FindBy(xpath = "//div[contains(@class,'error') or contains(@class,'validation')]")
    private WebElement errorMessage;

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }

    public void clickIcard() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(Icard));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Icard);
    }
}