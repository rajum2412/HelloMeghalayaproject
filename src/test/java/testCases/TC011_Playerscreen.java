package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.PlayerscreenPage;

public class TC011_Playerscreen extends BaseClass {
	
	@Test
	public void playerscreentest() throws InterruptedException {
		try {
			
			PlayerscreenPage pp=new PlayerscreenPage(driver);
			pp.playerscreentest();
			Thread.sleep(2000);
			pp.clickWatchNowbutton();
			Thread.sleep(2000);
			pp.pauseButton();
			Thread.sleep(2000);
			pp.forwardButton();
			Thread.sleep(2000);
			pp.backwardButton();
			Thread.sleep(2000);
			pp.playButton();
			Thread.sleep(3000);
			pp.seekVideo(600);
			Thread.sleep(2000);
			pp.settings();
			Thread.sleep(2000);
			pp.quality720p();
			Thread.sleep(3000);
			pp.speedButton();	
			Thread.sleep(2000);
			pp.speed2x();
			Thread.sleep(3000);
			pp.volumeButton();
			Thread.sleep(2000);
			pp.fullscreenButton();
			Thread.sleep(2000);
			
			
			// Test steps to be implemented
		} catch (Exception e) {
			Assert.fail("Test gets fail: " + e.getMessage());
			System.out.println("Test gets fail: " + e.getMessage());
		}
	}

}
