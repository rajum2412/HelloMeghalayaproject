package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PlayerscreenPage extends BasePage{
	
	public PlayerscreenPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@id='oho-carousel_1']//div[@class='owl-stage']//div[1]//div[1]//a[1]")
	WebElement detailsPage;
	
	@FindBy(xpath="//a[@class='text-uppercase font-sbold oriya-color color-black watch-now video_play d-none d-xl-block ng-star-inserted']")
	WebElement watchnow;
	
	@FindBy(xpath="//div[@class='sp-player-bigplay']")
	WebElement playerArea;
		
	@FindBy(xpath="//div[@class='backward']")
	WebElement backward;
	@FindBy(xpath="//div[@class='forward']")
	WebElement forward;
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signIn;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-12']//input[@id='place-hold-clr']")
	WebElement mobileNumber;
	@FindBy(xpath="//div[@class='login_input ng-tns-c47-13']//input[@id='place-hold-clr']")
	WebElement password;
	@FindBy(xpath="//div/div/button[contains(.,'Next')]")
	WebElement next;
	@FindBy(xpath="//button[@class='sp-quality-switch-btn']")
	WebElement settings;
	@FindBy(xpath="//button[normalize-space()='720P']")
	WebElement quality720p;
	@FindBy(xpath="//button[@class='sp-speed-switch-btn']")
	WebElement speed;
	@FindBy(xpath="//button[normalize-space()='2x']")
	WebElement speed2x;
	@FindBy(xpath="//button[@class='sp-volume-btn']")
	WebElement volume;
	@FindBy(xpath="//button[@class='sp-fullscreen-btn']")
	WebElement fullscreen;
	
	
	public void playerscreentest() throws InterruptedException {
		detailsPage.click();
		 if (detailsPage.isDisplayed()) {
	            System.out.println("Content details page is displaying: "+detailsPage.isDisplayed());
	        } else {
	            System.out.println("Video playback failed.");
	        }
	}
	        
	     public void clickWatchNowbutton() throws InterruptedException {
		    System.out.println("watch now button is displaying: " +watchnow.isDisplayed());
		    watchnow.click();
		    Thread.sleep(2000);
		    
		    signIn.click();
		    
		   //Login page 
		    mobileNumber.sendKeys("9353657086");
	        password.sendKeys("Test@123");
	        
	        Thread.sleep(2000);
	        next.click();
	        Thread.sleep(5000);
	     // Check for Watch now button
	        List<WebElement> WatchnowButtons = driver.findElements(By.xpath("//a[@class='text-uppercase font-sbold oriya-color color-black watch-now video_play d-none d-xl-block ng-star-inserted']"));

	        if (!WatchnowButtons.isEmpty()) {
	            // If watch now button found, click it
	        	WatchnowButtons.get(0).click();
	            System.out.println("Clicked watch now button.");
	        } else {
	            // Else, click resume button
	            List<WebElement> resumebuttons = driver.findElements(By.xpath("//a[@class='font-bold oriya-color color-black watch-now video_play d-none d-xl-block ng-star-inserted']"));
	            if (!resumebuttons.isEmpty()) {
	            	resumebuttons.get(0).click();
	                System.out.println("Clicked Resume button.");
	            } else {
	                System.out.println("Neither Watch now nor Resume button found.");
	            }
	        }
	   }
     
	        
	    	// Click Play button
        public void pauseButton() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000); // wait for controls to appear

	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("document.querySelector('video').pause();");
	            System.out.println("Paused video via JS");
	            Thread.sleep(3000);

	        }
	        public void playButton() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);

	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("document.querySelector('video').play();");
	            System.out.println("Played video via JS");

	        }
	        public void backwardButton() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            backward.click();
	            System.out.println("Clicked Backward");
	        }
	        public void forwardButton() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            forward.click();
	            System.out.println("Clicked Forward");
	        }
	        public void seekVideo(int seconds) {
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("document.querySelector('video').currentTime = arguments[0];", seconds);
	            System.out.println("Seeked video to " + seconds + " seconds.");
	        }
	        public void settings() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            settings.click();
	            System.out.println("Clicked Settings");
	        }
	        public void quality720p() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            quality720p.click();
	            System.out.println("Selected 720p Quality");
	        }
	        public void speedButton() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            speed.click();
	            System.out.println("Clicked Speed");
	        }
	        public void speed2x() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            speed2x.click();
	            System.out.println("Selected 2x Speed");
	        }
	        public void volumeButton() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            volume.click();
	            System.out.println("Clicked Volume");
	        }
	        public void fullscreenButton() throws InterruptedException {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(playerArea).perform();
	            Thread.sleep(2000);
	            fullscreen.click();
	            System.out.println("Clicked Fullscreen");
	        }

	}
	        
	        
	  