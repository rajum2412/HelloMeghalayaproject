package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ForgotPasswordPage;
import pageObjects.LoginPage;

public class TC003_ForgotPasswordMobile extends BaseClass {
	
	@Test
	public void forgotPasswordTest() throws InterruptedException {
		try {
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
		logger.info("Clicked on Login button");
		
		ForgotPasswordPage forgot = new ForgotPasswordPage(driver);
		forgot.clickForgotPasswordLink();
		logger.info("Clicked on Forgot Password link");
		forgot.enterMobileNumber("7483643755");
		logger.info("Entered mobile number");
		forgot.clickNextButton();
		logger.info("Clicked on Next button");
		
		}catch (Exception e) {
		
		Assert.fail("Test gets fail: " + e.getMessage());
		}
	}
		
		

}
