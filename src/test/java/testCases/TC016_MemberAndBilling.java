package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MemberAndBillingPage;
import pageObjects.MyprofilePage;

public class TC016_MemberAndBilling extends BaseClass {
	
	@Test
	public void memberAndBillingTest() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLoginButton();
		lp.enterMobileNumber("7483643755");
		lp.enterPassword("Raju@123");
		lp.clickNextButton();
		Thread.sleep(3000);
		
		MyprofilePage myprofile = new MyprofilePage(driver);
		myprofile.updateProfile();
		myprofile.myProfile();	
		Thread.sleep(2000);
		
		 // Navigate to Member and Billing page
		
		MemberAndBillingPage memberbilling = new MemberAndBillingPage(driver); 
		memberbilling.clickOnAccount();
		memberbilling.clickMemberAndBilling();
		Thread.sleep(2000);
		
		 // Get and print the Member and Billing text
		memberbilling.getMemberAndBillingText();
		
		 // Click Edit Details and update information
		memberbilling.clickEditDetailsButton();
		memberbilling.enterPhoneNumber("9876543210");
		memberbilling.enterEmail("raju12@gmail.com");
		memberbilling.enterAddress("Hyderabad");
		memberbilling.enterPincode("500081");
		memberbilling.clickUpdateButton();
		Thread.sleep(2000);
		
	}
}
