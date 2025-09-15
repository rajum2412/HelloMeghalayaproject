package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;

public class TC004_Logout extends BaseClass {
	@Test
	public void logoutTest() throws InterruptedException {
		try {
			LoginPage login = new LoginPage(driver);
			login.clickLoginButton();
	        login.enterMobileNumber("7483643755");
	        login.enterPassword("Raju@123");
	        login.clickNextButton();
	        Thread.sleep(3000); // Wait for the next page to load
	        
	        LogoutPage logout = new LogoutPage(driver);
	        logout.clickMyProfile();
	        Thread.sleep(2000);
	        logout.clickLogoutButton();
	        Thread.sleep(2000);
	        String popupText = logout.getTextOnPopup();
	        System.out.println("Popup Text: " + popupText);
	        boolean isYesDisplayed = logout.isYesButtonDisplayed();
	        boolean isNoDisplayed = logout.isNoButtonDisplayed();
	        System.out.println("Is Yes Button Displayed: " + isYesDisplayed);
	        System.out.println("Is No Button Displayed: " + isNoDisplayed);
	        
	        // Click on Yes button to confirm logout
	        if (isYesDisplayed) {
	            logout.clickYesButton();
	            Thread.sleep(2000); // Wait for logout to complete
	            System.out.println("Logged out successfully.");
	        } else {
	            System.out.println("Yes button not displayed, cannot proceed with logout.");
	        }
		} catch (Exception e) {
			Assert.fail("Test gets fail: " + e.getMessage());
		}
	}

}
