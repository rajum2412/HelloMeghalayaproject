package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyprofilePage;

public class TC009_Myprofilepage extends BaseClass {
	@Test
	public void myprofilepagetest() throws InterruptedException {
		try {
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
		login.enterMobileNumber("7483643755");
		login.enterPassword("Raju@123");
		login.clickNextButton();
		Thread.sleep(3000); // Wait for the next page to load
		
		MyprofilePage mp=new MyprofilePage(driver);
		mp.updateProfile();
		Thread.sleep(2000);
		
		mp.myProfile();
		Thread.sleep(2000);
		
		mp.profileName();
		Thread.sleep(2000);
		
		mp.profileDetails();
		
		mp.editProfile();
		mp.uploadImage("C:\\Users\\Saranyu\\Downloads\\IMG_2408.jpg");
		Thread.sleep(2000);
		mp.openDatePicker();
		mp.openCalendar();
		Thread.sleep(2000);
		mp.chooseMonthYear();
		Thread.sleep(2000);
		
		} catch (Exception e) {
			
			 Assert.fail("Test gets fail: " + e.getMessage());
			System.out.println("Test gets fail: " + e.getMessage());
			}
		}
}
	

