package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC002_Emaillogin extends BaseClass {
	
	
	@Test 
	public void emailLoginTst() {
		try {
		logger.info("Starting email login test");
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
		login.clickEmailLoginButton();
		login.enterEmail("hm12@yopmail.com");
		login.enterEmailPassword("Raju@123");
		login.clickEmailNextButton();	
		String toastMessage = login.getToastMessage();
		System.out.println("Toast Message: " + toastMessage);
		Assert.assertEquals(toastMessage, "Signed In Successfully!", "Toast message does not match expected value.");
		} catch (Exception e) {
			Assert.fail("Test gets fail: " + e.getMessage());
		
		}
		
	}
}
