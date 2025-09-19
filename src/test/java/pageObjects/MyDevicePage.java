package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyDevicePage extends BasePage {

	// Constructor
	public MyDevicePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//app-user[@class='ng-star-inserted']//li[4]")
	WebElement accounts;
	@FindBy(xpath="//a[normalize-space()='My Devices']")
	WebElement myDevice;
	@FindBy(xpath="//div[@class='staticPageDetails padding-top-35']//div")
	List<WebElement> listOfDevices;
	@FindBy(xpath="//div[contains(@class,'staticPageDetails padding-top-35')]//div[1]//img[1]")
	WebElement firstdevicelogoutbutton;
	@FindBy(xpath="//button[normalize-space()='Logout All Devices']")
	WebElement logoutAllDevices;
	
	// Method to click on My List link
	public void clickOnAccount() throws InterruptedException {
		accounts.click();
		Thread.sleep(2000);
	}
	public void clickMyDevice() {
		myDevice.click();
		
	}
	
	public int getListOfDevices() {
		return listOfDevices.size();
	}
	public void getCountOfDevices() {
		int count = listOfDevices.size();
		System.out.println("Number of devices logged in: " + count);
		for (WebElement ele : listOfDevices ) 
            System.out.println(ele.getText());
	}
	public void clickDeviceLogoutButton() {
		int count = listOfDevices.size();
		if (count > 2) {
		firstdevicelogoutbutton.click();
		}else if(count == 2) {
			logoutAllDevices.click();
		}else {
			System.out.println("Only one device logged in, cannot logout.");
			
		}
	}

}
