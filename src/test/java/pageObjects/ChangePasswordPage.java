package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ChangePasswordPage extends BasePage{

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//i[@class='fa fa-caret-down ng-star-inserted']")
	WebElement profileicon;
	@FindBy(xpath="//a[normalize-space()='Change Password']")
	WebElement changepassword;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-5']//input[@id='place-hold-clr']")
	WebElement currentpassword;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-5']//button[@aria-label='Hide password']")
	WebElement hidecurrentpassword;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-6']//input[@id='place-hold-clr']") 
	WebElement newpassword;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-6']//button[@aria-label='Hide password']")
	WebElement hidenewpassword;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-7']//input[@id='place-hold-clr']")
	WebElement confirmpassword;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-7']//button[@aria-label='Hide password']")
	WebElement hideconfirmpassword;
	@FindBy(xpath="//button[normalize-space()='Change Password']")
	WebElement changepasswordbutton;
	@FindBy(xpath="//div[@id='change_password']//img[@id='set_password']")
	WebElement popupclose;
	@FindBy(xpath="//span[normalize-space()='New Password Successfully Set']")
	WebElement successmessage;
	
	
	// Method to change password
	public void profileIcon() {
		profileicon.click();
	}
	
	public void changePassword() {
		changepassword.click();
	}	
	public void currentPassword(String currentPwd) {
		currentpassword.sendKeys(currentPwd);
	}
	public void hideCurrentPassword() {
		hidecurrentpassword.click();
	}
	public void newPassword(String newPwd) {
		newpassword.sendKeys(newPwd);
	}
	public void hideNewPassword() {
		hidenewpassword.click();
	}
	public void confirmPassword(String confirmPwd) {
		confirmpassword.sendKeys(confirmPwd);
	}
	public void hideConfirmPassword() {
		hideconfirmpassword.click();
	}
	public void changePasswordButton() {
		changepasswordbutton.click();
	}
	public void popupClose() {
		popupclose.click();
	}
	public String successMessage() {
		Assert.assertTrue(successmessage.isDisplayed());
		return successmessage.getText();
	}
	

}
