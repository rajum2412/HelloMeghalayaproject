package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyprofilePage extends BasePage{

	public MyprofilePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//i[@class='fa fa-caret-down ng-star-inserted']")
	WebElement profileicon;
	@FindBy(xpath="//a[normalize-space()='My Profile']")
	WebElement myprofile;
	@FindBy(xpath="//span[@class='font-size3']")	
	WebElement profile;
	@FindBy(xpath="//div[@class='staticPageDetails']")
	WebElement profiledetails;
	@FindBy(xpath="//button[normalize-space()='Edit Profile']")
	WebElement editprofile;
	@FindBy(xpath="//input[@type=\"file\"]")
	WebElement uploadimage;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-icon-button mat-button-base cdk-focused cdk-program-focused']")
	WebElement datepickerButton;
	@FindBy(xpath="//button[@aria-label='Choose month and year'])[2]")
	WebElement calendar;
	@FindBy(xpath="//button[@aria-label='Choose month and year']")
	WebElement monthyear;
	@FindBy(xpath="//div[@class='mat-calendar-content']//tbody//tr//td")
	WebElement cal;
	
	@FindBy(xpath="//div[@class='ng-tns-c47-39 login_input']")
	WebElement firstname;
	
	// Method to update profile
	public void updateProfile() throws InterruptedException {
		profileicon.click();
	}
	public void myProfile() {
		myprofile.click();
	}
	public String profileName() {
		return profile.getText();
	}
	public String profileDetails() {
		return profiledetails.getText();
	}
	public void editProfile() {
		editprofile.click();
	}
	public void uploadImage(String imagePath) {
		uploadimage.sendKeys(imagePath);
	}
	public void openDatePicker() {
		datepickerButton.click();
	}
	public void openCalendar() {
		calendar.click();
	}
	public void chooseMonthYear() {
		monthyear.click();
	}
	public void selectDate(String date) {
		cal.click();
	}
	
	

}
	
	
	
	