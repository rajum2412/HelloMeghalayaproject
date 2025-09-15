package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;

public class TC007_SearchPage extends BaseClass {
	
	@Test
	
	public void searchTest() throws InterruptedException {
		try {
		logger.info("URL is opened");
		SearchPage sp=new SearchPage(driver);
		sp.clickSearch();
		Thread.sleep(2000);
		if(sp.isSearchDisplayed()) {
			logger.info("Search icon is displayed");
		}
		else {
			logger.error("Search icon is not displayed");
			captureScreen(driver,"searchTest");
			Assert.assertTrue(false);
		}
		if(sp.isTrendingsearchDisplayed()) {
			logger.info("Trending search text is displayed");
		}
		else {
			logger.error("Trending search text is not displayed");
			captureScreen(driver,"searchTest");
			Assert.assertTrue(false);
		}
		String TStext=sp.getTrendingsearchText();
		if(TStext.equals("Trending Search")) {
			logger.info("Trending search text is matched");
		}
		else {
			logger.error("Trending search text is not matched");
			captureScreen(driver,"searchTest");
			Assert.assertTrue(false);
		}
		
		if(sp.isSearchfieldEnabled()) {
			logger.info("Search field is enabled");
		}
		else {
			logger.error("Search field is not enabled");
			captureScreen(driver,"searchTest");
			Assert.assertTrue(false);
		}
		
		if(sp.isCancelbtnDisplayed()) {
			logger.info("Cancel button is displayed");
		}
		else {
			logger.error("Cancel button is not displayed");
			captureScreen(driver,"searchTest");
			Assert.assertTrue(false);
		}
		
		sp.enterSearchText("husiar");
		
		System.out.println(sp.getSearchResultCount());
	

	}catch (Exception e) {
		Assert.fail("Test gets fail: " + e.getMessage());
		}
	}
	private void captureScreen(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
	
}
