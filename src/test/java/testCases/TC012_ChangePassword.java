package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChangePasswordPage;
import pageObjects.LoginPage;

public class TC012_ChangePassword extends BaseClass {
	
	@Test
	public void changepasswordtest() throws InterruptedException {
		try {
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
		login.enterMobileNumber("7483643755");
		login.enterPassword("Raju@1234");
		login.clickNextButton();
		Thread.sleep(3000); // Wait for the next page to load
		
		ChangePasswordPage cp=new ChangePasswordPage(driver);
		cp.profileIcon();
		Thread.sleep(2000);
		
		cp.changePassword();
		Thread.sleep(2000);
		
		cp.currentPassword("Raju@1234");
		cp.hideCurrentPassword();
		Thread.sleep(2000);
		
		cp.newPassword("Raju@123");
		cp.hideNewPassword();
		Thread.sleep(2000);
		
		cp.confirmPassword("Raju@123");
		cp.hideConfirmPassword();
		Thread.sleep(2000);
		
		cp.changePasswordButton();
		Thread.sleep(2000);
				
		String expectedMessage = "New Password Successfully Set";
		String actualMessage = cp.successMessage();
		Assert.assertTrue(actualMessage.contains(expectedMessage), "Success message not displayed as expected.");
		
		// Revert to original password for test consistency
		cp.profileIcon();
		Thread.sleep(2000);
		
		cp.changePassword();
		Thread.sleep(2000);
		
		cp.currentPassword("Raju@123");
		Thread.sleep(2000);
		
		cp.newPassword("Raju@1234");
		Thread.sleep(2000);
		
		cp.confirmPassword("Raju@1234");
		Thread.sleep(2000);
		
		cp.changePasswordButton();
		Thread.sleep(2000);
		
		cp.popupClose();
		Thread.sleep(2000);
		
		} catch (Exception e) {
			
			 Assert.fail("Test gets fail: " + e.getMessage());
			System.out.println("Test gets fail: " + e.getMessage());
			}
		}

}
