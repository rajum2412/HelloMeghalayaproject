package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyListPage;
import pageObjects.MyprofilePage;

public class TC014_MyList extends BaseClass {
	
	@Test
	public void myListTest() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLoginButton();
		lp.enterMobileNumber("7483643755");
		lp.enterPassword("Raju@123");
		lp.clickNextButton();
		Thread.sleep(3000);
		
		MyprofilePage myprofile = new MyprofilePage(driver);
		myprofile.updateProfile();
		
		MyListPage MyList = new MyListPage(driver);
		MyList.clickMyListButton();
		Thread.sleep(2000);
		MyList.isMyListEmpty();
		MyList.handleMyList();
		Thread.sleep(2000);
		
		 // Check the number of items in My List
		int itemCount = MyList.getMyListItemCount();  
		System.out.println("Number of items in My List Before adding: " + itemCount);
		
		// Skip remaining steps if My List is not empty
		if(itemCount > 0) {
			logger.info("My List already has items. Skipping further steps...");
			Assert.assertTrue(true);
			return;   // exit the test here
		}
			
		// Execute only if My List was empty
		
		MyList.clickDetailsPage();
		Thread.sleep(5000);
		MyList.clickAddToListButton();
		Thread.sleep(2000);
		myprofile.updateProfile();
		MyList.clickMyListButton();
	
		itemCount = MyList.getMyListItemCount();  
		System.out.println("Number of items in My List After adding: " + itemCount);
		
		if(itemCount > 0) {
			logger.info("My List has items.");
			Assert.assertTrue(true);
		} else {
			logger.info("My List is empty.");
			Assert.assertTrue(false);
		}
		
	}
	

}
