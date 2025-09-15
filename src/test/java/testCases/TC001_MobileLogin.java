package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.LoginPage;




public class TC001_MobileLogin extends BaseClass {
	@Test 
		public void loginTest() throws InterruptedException {
		try {
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
        login.enterMobileNumber("7483643755");
        login.enterPassword("Raju@123");
        login.clickNextButton();
        Thread.sleep(3000); // Wait for the next page to load
        String toastMessage = login.getToastMessage();
        System.out.println("Toast Message: " + toastMessage);
        Assert.assertEquals(toastMessage, "Signed In Successfully!", "Toast message does not match expected value.");
	} catch (Exception e) {
		
		Assert.fail("Test gets fail: " + e.getMessage());
		}
	}	
}
