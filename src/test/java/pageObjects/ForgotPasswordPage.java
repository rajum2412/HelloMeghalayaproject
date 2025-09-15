package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {
	
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//button[normalize-space()='Forgot Password?']")
	WebElement forgotpasswordlink;
	
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-14']//input[@id='place-hold-clr']")
	WebElement mobilenumberfield;
	
	@FindBy(xpath="//button[@class='color-light mat-suffix margin-right-16 font-normal oriya-btn-grn_new']")
	WebElement nextbutton;
	
	public void clickForgotPasswordLink() {
		forgotpasswordlink.click();
	}	
	public void enterMobileNumber(String mobilenumber) {
		mobilenumberfield.sendKeys(mobilenumber);
	}
	public void clickNextButton() {
		nextbutton.click();
	}	
	
}
