package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyDevicePage extends BasePage {

	// Constructor
	public MyDevicePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='mat-expansion-indicator ng-tns-c94-30 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")
	WebElement accounts;
	@FindBy(xpath="//a[normalize-space()='My Devices']")
	WebElement myDevice;
	
	@FindBy(xpath="//div[@class='staticPageDetails padding-top-35']//div")
	WebElement listOfDevices;
	@FindBy(xpath="//div[contains(@class,'staticPageDetails padding-top-35')]//div[1]//img[1]")
	WebElement firstdevicelogoutbutton;
	@FindBy(xpath="//button[normalize-space()='Logout All Devices']")
	WebElement logoutAllDevices;
	
	// Method to click on My List link
	public void clickOnAccount() throws InterruptedException {
		accounts.click();
		Thread.sleep(2000);
	// mouse hover to accounts and then click my device
//		Actions actions = new Actions(driver);
//		actions.moveToElement(accounts).perform();
	}
	public void clickMyDevice() {
		myDevice.click();
	}
	
	public String getListOfDevices() {
		return listOfDevices.getText();
	}
	public void getCountOfDevices() {
		int count = listOfDevices.getText().split("\n").length;
		System.out.println("Number of devices logged in: " + count);
	}
	public void clickDeviceLogoutButton() {
		int count = listOfDevices.getText().split("\n").length;
		if (count > 2) {
		firstdevicelogoutbutton.click();
		}else if(count == 2) {
			logoutAllDevices.click();
		}else {
			System.out.println("Only one device logged in, cannot logout.");
			
		}
	}

}
