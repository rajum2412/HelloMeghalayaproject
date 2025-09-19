package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyDevicePage;
import pageObjects.MyprofilePage;

public class TC015_MyDevice extends BaseClass {
	
	@Test
	public void myDeviceTest() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLoginButton();
		lp.enterMobileNumber("7483643755");
		lp.enterPassword("Raju@123");
		lp.clickNextButton();
		Thread.sleep(3000);
		
		MyprofilePage myprofile = new MyprofilePage(driver);
		myprofile.updateProfile();
		myprofile.myProfile();	
		
		MyDevicePage mydevice = new MyDevicePage(driver); 
		mydevice.clickOnAccount();
		mydevice.clickMyDevice();
		Thread.sleep(2000);
		
		 // Get and print the list of devices
		int devices = mydevice.getListOfDevices();
		System.out.println("List of devices logged in:\n" + devices);
		
		 // Get and print the count of devices
		mydevice.getCountOfDevices();
		
		 // Attempt to logout from the first device or all devices based on count
		mydevice.clickDeviceLogoutButton();
		Thread.sleep(2000);
				
		 // Get and print the updated list of devices
		int updatedDevices = mydevice.getListOfDevices();
		System.out.println("Updated list of devices logged in after logout of any device:\n" + updatedDevices);
		
		 // Get and print the updated count of devices
		mydevice.getCountOfDevices();
		
	}

}
