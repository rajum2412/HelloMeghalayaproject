package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@id='user_login']")
	WebElement loginButton;

	@FindBy(xpath = "//div[@class='login_input ng-tns-c47-12']//input[@id='place-hold-clr']")
	WebElement mobileInput;

	@FindBy(xpath = "//div[@class='login_input ng-tns-c47-13']//input[@id='place-hold-clr']")
	WebElement passwordInput;

	@FindBy(xpath = "//div/div/button[contains(.,'Next')]")
	WebElement nextButton;
	
	@FindBy(xpath = "//div[@class='cdk-overlay-container']")
	WebElement toastMessage;

	public void clickLoginButton() {
		loginButton.click();
	}

	public void enterMobileNumber(String mobileNumber) {
		mobileInput.sendKeys(mobileNumber);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickNextButton() {
		nextButton.click();
	}
	public String getToastMessage() {
		return toastMessage.getText();
	}
	
	// For Email Login
	@FindBy(xpath = "//div//a[.='Email Id']")
	WebElement emailLoginButton;
	
	@FindBy(xpath = "//div[@class='login_input ng-tns-c47-26']//input[@id='place-hold-clr']")
	WebElement emailInput;
	
	@FindBy(xpath = "//div[@class='login_input ng-tns-c47-27']//input[@id='place-hold-clr']")
	WebElement emailPasswordInput;
	
	@FindBy(xpath = "//div/div/button[contains(.,'Next')]")
	WebElement emailNextButton;
	
	public void clickEmailLoginButton() {
		emailLoginButton.click();
	}
	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}
	public void enterEmailPassword(String emailPassword) {
		emailPasswordInput.sendKeys(emailPassword);
	}
	public void clickEmailNextButton() {
		emailNextButton.click();
	}
	

}
