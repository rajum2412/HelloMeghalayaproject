package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContentDetailsPage;

public class TC008_ContentDetailsPage extends BaseClass {
	
	@Test	
	public void contentDetailsTest() throws InterruptedException {
		
		try {
		logger.info("URL is opened");
		// Implement content details page test here
		ContentDetailsPage cdp=new ContentDetailsPage(driver);
		cdp.contentDetails();
		logger.info("Content details page test is passed");
	//	cdp.volumeMuteUnmute();
	//	logger.info("Volume mute and unmute test is passed");
		cdp.watchNow();
		logger.info("Watch now button test is passed");
		cdp.cancelButtons();
		logger.info("Cancel button test is passed");
		cdp.addtolist();
		logger.info("Add to list button test is passed");
		cdp.shareLikeTrailer();
		logger.info("Share and like button test is passed");
		cdp.likeTrailer();
		logger.info("Like and trailer button test is passed");
	//	cdp.trailerButton();
	//	logger.info("Trailer button test is passed");
		cdp.recommendedText();
		logger.info("Recommended text test is passed");
		cdp.nextButton();
		logger.info("Next button test is passed");
		cdp.previousButton();
		logger.info("Previous button test is passed");
		cdp.seeAllButton();
		logger.info("See all button test is passed");
		
		}catch(Exception e) {
			Assert.fail("Content details page test is failed");
		}
		
	}
	

}
