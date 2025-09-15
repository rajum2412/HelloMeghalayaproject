package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BottomTabsPage;

public class TC006_BottomTabs extends BaseClass {
	
	@Test
	public void bottomTabsClick() throws InterruptedException {
		
		try {
		BottomTabsPage btp = new BottomTabsPage(driver);
		btp.clickAllBottomTabs();
		Thread.sleep(2000);
		
		// Social media icons click
		btp.clickInstagramIcon();
		logger.info("Clicked on Instagram icon");
		Thread.sleep(2000);
		
		btp.clickFacebookIcon();
		logger.info("Clicked on Facebook icon");
		Thread.sleep(2000);
		
		btp.clickPlaystoreIcon();
		logger.info("Clicked on Playstore icon");
		Thread.sleep(2000);
		
		logger.info("Bottom tabs click test completed");
	}catch (Exception e) {
		
		Assert.fail("Test gets fail: " + e.getMessage());
	}
}

}
