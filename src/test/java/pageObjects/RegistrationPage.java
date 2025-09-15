package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement registerButton;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-15']//input[@id='place-hold-clr']")	
	WebElement phoneNumber;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-16']//input[@id='place-hold-clr']")
	WebElement password;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-17']//input[@id='place-hold-clr']")
	WebElement confirmPassword;
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']")
	WebElement termsCheckbox;	
	@FindBy(css="div[id='register_pop'] div[class='flex flex-row flex-items-center margin-top-24 margin-bottom-24'] button:nth-child(1)")
	WebElement submitButton;
	@FindBy(xpath="(//input[@id='reg-otp-input'])[17]")
	WebElement otp1;
	@FindBy(xpath="(//input[@id='reg-otp-input'])[18]")
	WebElement otp2;
	@FindBy(xpath="(//input[@id='reg-otp-input'])[19]")
	WebElement otp3;
	@FindBy(xpath="(//input[@id='reg-otp-input'])[20]")
	WebElement otp4;
	@FindBy(xpath="(//button[@class='color-light mat-suffix margin-right-10 font-normal green-background button-hover buttonWithBackground oriya-btn-grn_new'][normalize-space()='Verify'])[2]")
	WebElement verifyButton;
	
	//Registration Function
	public void register(String phone, String pass, String confirmPass) throws InterruptedException {
		registerButton.click();
		phoneNumber.sendKeys(phone);
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
	} 
	public void acceptTerms() throws InterruptedException {
		termsCheckbox.click();	
		Thread.sleep(2000);
	}
	public void submitRegistration() {
		submitButton.click();
	}
	public void enterOTP(String digit1, String digit2, String digit3, String digit4) throws InterruptedException {
		otp1.sendKeys(digit1);
		otp2.sendKeys(digit2);
		otp3.sendKeys(digit3);
		otp4.sendKeys(digit4);
		Thread.sleep(2000);
		verifyButton.click();
		
	}
	
}



