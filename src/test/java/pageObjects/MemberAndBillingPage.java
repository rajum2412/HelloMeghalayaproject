package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemberAndBillingPage extends BasePage {

	// Constructor
	public MemberAndBillingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//app-user[@class='ng-star-inserted']//li[4]")
	WebElement accounts;
	@FindBy(xpath="//a[normalize-space()='Members & Billing']")
	WebElement memberAndBilling;
	@FindBy(xpath="//div[@class='staticPageDetails']//p")
	List<WebElement> memberAndBillingText;
	@FindBy(xpath="//button[normalize-space()='Edit Details']")
	WebElement editDetailsButton;
	@FindBy(xpath="(//input[@id='place-hold-clr'])[25]")
	WebElement phonenumberField;
	@FindBy(xpath="(//input[@id='place-hold-clr'])[26]")
	WebElement emailField;
	@FindBy(xpath="(//input[@id='place-hold-clr'])[27]")
	WebElement addressField;
	@FindBy(xpath="(//input[@id='place-hold-clr'])[28]")
	WebElement pincodeField;
	@FindBy(xpath="//button[@class='color-light mat-suffix margin-right-10 font-normal green-background 111 login_sub_btn ng-star-inserted']")
	WebElement updateButton;
	
	
	// Method to click on My List link
	public void clickOnAccount() throws InterruptedException {
		accounts.click();
		Thread.sleep(2000);
	}
	public void clickMemberAndBilling() {
		memberAndBilling.click();
		
	}
	public void getMemberAndBillingText() {
		for (WebElement ele : memberAndBillingText ) 
			System.out.println(ele.getText());
	}
	public void clickEditDetailsButton() {
		editDetailsButton.click();
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		phonenumberField.clear();
		phonenumberField.sendKeys(phoneNumber);
	}
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	public void enterAddress(String address) {
		addressField.clear();
		addressField.sendKeys(address);
	}
	public void enterPincode(String pincode) {
		pincodeField.clear();
		pincodeField.sendKeys(pincode);
	}
	public void clickUpdateButton() {
		updateButton.click();
	}
}
