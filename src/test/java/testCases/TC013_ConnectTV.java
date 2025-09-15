package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ConnectTVPage;
import pageObjects.LoginPage;
import pageObjects.MyprofilePage;

public class TC013_ConnectTV extends BaseClass{
	
	@Test
	public void connectTVTest() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
		login.enterMobileNumber("7483643755");
		login.enterPassword("Raju@123");
		login.clickNextButton();
		Thread.sleep(3000); // Wait for the next page to load
		String toastMessage = login.getToastMessage();
		System.out.println("Toast Message: " + toastMessage);
		Assert.assertEquals(toastMessage, "Signed In Successfully!", "Toast message does not match expected value.");
		
		
		ConnectTVPage connectTV = new ConnectTVPage(driver);
		MyprofilePage mp = new MyprofilePage(driver);
		mp.updateProfile();
		Thread.sleep(2000);
		
		connectTV.clickConnectTV();
		Thread.sleep(2000);
		
		connectTV.enterCode("KLBT56");
		Thread.sleep(2000);
		
		connectTV.clickSubmitBtn();
		Thread.sleep(2000);
		
		String toastMsg = connectTV.getToastMessage();
		Assert.assertEquals(toastMsg, "Invalid Token");
		
	}
	
	
}
