package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.RegistrationPage;

public class TC010_RegistrationPage extends BaseClass{
	
	@Test
	public void registrationTest() throws InterruptedException, IOException {
		
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
		
		RegistrationPage registration = new RegistrationPage(driver);
		logger.info("URL is opened");
		registration.register("9876543210", "Test@1234", "Test@1234");
		logger.info("Clicked on Register button and entered phone number, password and confirm password");
		registration.acceptTerms();
		registration.submitRegistration();
		registration.enterOTP("1", "2", "3", "4");
		logger.info("Entered OTP and clicked on Verify button");
		Thread.sleep(5000);
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://hellomeghalaya.in/home";
		
		if(actualURL.equals(expectedURL)) {
			captureScreen("registrationTest");
			logger.info("Registration Test Passed");
			System.out.println("Registration Test Passed");
			//Assert.assertTrue(true);
		}
		else {
			captureScreen("registrationTest");
			logger.info("Registration Test Failed");
			System.out.println("Registration Test Failed");
			//Assert.assertTrue(false);
		}
	}

}
