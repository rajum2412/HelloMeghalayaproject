package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);	
	}
	// mouse hover on my profile and click on logout button
	
	Actions act=new Actions(driver);
	@FindBy(xpath = "//a[@class='after_login ng-star-inserted']")
	WebElement myProfile;
	
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logoutButton;
	
	public void clickMyProfile() {
		act.moveToElement(myProfile).click().build().perform();
	}
	
	public void clickLogoutButton() {
		act.moveToElement(logoutButton).click().build().perform();
	}
	
	// click on logout button	
	
		
	@FindBy(xpath = "//app-header//div[@id='logout_pop']//p[@class='font-mbold font-size4 oriya-color6 text-center'][normalize-space()='Alert!']")
	WebElement textOnPopup;
	
	@FindBy(xpath = "//app-header//button[@value='sign in'][normalize-space()='Yes']")
	WebElement yesButton;
	
	@FindBy(xpath = "//app-header//div[@id='logout_pop']//button[@type='submit'][normalize-space()='No']")
	WebElement noButton;
	
	public void clickLogout() {
		logoutButton.click();
	}
	public void clickYesButton() {
		yesButton.click();
	}
	public void clickNoButton() {
		noButton.click();
	}
	public String getTextOnPopup() {
		return textOnPopup.getText();
	}
	public boolean isYesButtonDisplayed() {
		return yesButton.isDisplayed();
	}
	public boolean isNoButtonDisplayed() {
		return noButton.isDisplayed();
	}

	
}


