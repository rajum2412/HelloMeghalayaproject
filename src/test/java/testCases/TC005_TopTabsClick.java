package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TopTabsPage;

public class TC005_TopTabsClick extends BaseClass {
	
	@Test
	public void topTabsClick() throws InterruptedException {
		try {	
		TopTabsPage ttp = new TopTabsPage(driver);
		ttp.clickLogo();
		Thread.sleep(2000);
		
	   		// TOP tabs click
		ttp.clickAllTopTabs();
			Thread.sleep(2000);
		
		
		// Language selection
		ttp.clickLanguageIcon();
				
		ttp.selectLanguage();
		logger.info("Selected a language");
		Thread.sleep(2000);
		
		ttp.clickSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		// Trailer function
		ttp.clickTrailerButton();
		logger.info("Clicked on trailer button");
		Thread.sleep(2000);
		
		logger.info("Top tabs click test completed");
	}catch (Exception e) {
		Assert.fail("Test gets fail: " + e.getMessage());
	}
	}
	

}
