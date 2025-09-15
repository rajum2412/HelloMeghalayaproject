package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentDetailsPage extends BasePage {
		public ContentDetailsPage(WebDriver driver) {
		super(driver);
	}
	
		@FindBy(xpath="//div[@id='oho-carousel_1']//div[@class='owl-stage']//div[1]//div[1]//a[1]")
		WebElement detailsPage;
		
		// Volume Button
		@FindBy(xpath="//div[@id='desktop_otv_player']//button[@class='sp-volume-btn']") // mute and unmute button
		WebElement volumeButton;
		
		@FindBy(xpath="//div[@id='desktop_otv_player']//button[@class='sp-volume-btn']")
		WebElement unmuteButton;
		
		// Watch Now Button
		@FindBy(xpath="//a[@class='text-uppercase font-sbold oriya-color color-black watch-now video_play d-none d-xl-block ng-star-inserted']")
		WebElement watchnow;
		
		@FindBy(xpath="//button[@type='submit'][normalize-space()='Cancel']")
		WebElement cancelButton;
		
		// Add to List Button
		@FindBy(xpath="//app-details-redirection[contains(@class,'ng-star-inserted')]//li[1]//a[1]")
		WebElement AddToList;
		
		@FindBy(xpath="//div[@id='closeSwitch-Network-PopUp']//div[@class='modal-content user_flow']")
		WebElement Loginpopup;
		
		@FindBy(xpath="//img[contains(@src,'./assets/images/icon_close.svg')]")
		WebElement closeIcon;
		
		//Share Button
		@FindBy(xpath="//span[@class='m-0']//a[@class='text-capitalize font-sbold oriya-color watch-now d-none d-xl-block']")
		WebElement Share;
		
		@FindBy(xpath="//div[@id='closeSwitch-Network-PopUp']//div[@class='modal-content user_flow']")
		WebElement popup;
		
		// Like Button
		@FindBy(xpath="(//a[@id='watch_later_new'])[2]")
		WebElement Like;
		
		//Trailer Button
		@FindBy(xpath="//li[@class='pull-left relative-content ng-star-inserted']//a[@class='text-capitalize font-sbold oriya-color watch-now d-none d-xl-block']")
		WebElement Trailer;
		
		// Back Button
		@FindBy(xpath="//button[@class='sp-back-btn']")
		WebElement backbutton;
		
		// Recommended text
		@FindBy(xpath="//p[contains(@class,'margin-bottom-2 text-capitalize recommended pull-left carousel-title oriya-color1 font-sbold margin-top-30 ng-star-inserted')]")
		WebElement text;
		
		// SEE ALL button
		@FindBy(xpath="//button[contains(@class,'owl-prev')]")
		WebElement nextbutton;
		
		@FindBy(xpath="//button[contains(@class,'owl-prev')]")
		WebElement previous;
		
		@FindBy(xpath="//a[normalize-space()='See All']")
		WebElement seeall;
		
		//Mothod for content details page	
		public void contentDetails() throws InterruptedException {
			detailsPage.click();
		        if (detailsPage.isDisplayed()) {
		            System.out.println("Content details page is displaying: "+detailsPage.isDisplayed());
		        } else {
		            System.out.println("Video playback failed.");
		        }
		        Thread.sleep(2000);
		}
		
			public void volumeMuteUnmute() throws InterruptedException {
			 System.out.println("Volume button is displaying: " +volumeButton.isDisplayed());
			 if (volumeButton.isDisplayed()) {
				 volumeButton.click();
			     Thread.sleep(2000);
			     unmuteButton.click();
		         System.out.println("Volume button is displaying: "+volumeButton.isDisplayed());
		        } else {
		            System.out.println("Video playback failed.");
		        }
		    
		}
		   
		     // Watch Now Button
		public void watchNow() throws InterruptedException {
			watchnow.isDisplayed();
		     System.out.println("watch now button is displaying: " +watchnow.isDisplayed());
		     watchnow.click();
		     Thread.sleep(3000);
		}
		     
		public void cancelButtons() throws InterruptedException {		     
		     cancelButton.click();
		     Thread.sleep(3000);
		}
		     
		 public void addtolist() {   
		     System.out.println("Add to list button visible :" + AddToList.isDisplayed());
		     AddToList.click();
		     System.out.println("login popup displaying (add to list) :" +Loginpopup.isDisplayed());
		     if (Loginpopup.isDisplayed())
		     {
		     	closeIcon.click();
		     }
		 }
		 
		 //Share Button
		 public void shareLikeTrailer() throws InterruptedException {
		     System.out.println("Share button visible :" +Share.isDisplayed());
		     Share.click();
		     List<WebElement> popup=driver.findElements(By.xpath("//div[@id='closeSwitch-Network-PopUp']//div[@class='modal-content user_flow']"));
		     if (!popup.isEmpty() && popup.get(0).isDisplayed()) {
		         System.out.println("Login popup displaying (share): true");
		         closeIcon.click();
		         System.out.println("Login popup closed.");
		     } else {
		         System.out.println("Login popup not displayed. Continuing execution...");
		     }
		     Thread.sleep(2000);
		 }
		     
		     // Like Button
		 public void likeTrailer() throws InterruptedException {
		     System.out.println("Like button visible :" +Like.isDisplayed());
		     Like.click();
		     closeIcon.click();
		     Thread.sleep(2000);
		 }
		     
		     //Trailer Button
		 public void trailerButton() throws InterruptedException {
		     System.out.println("trailer button visible :" +Trailer.isDisplayed());
		     Trailer.click();
		     Thread.sleep(3000);
		
		     
		     // important step
		     JavascriptExecutor js= (JavascriptExecutor) driver;
		     js.executeScript("arguments[0].click()",backbutton);
		     Thread.sleep(3000);
		 }
		 
		     // Recommended text
		   public void recommendedText() throws InterruptedException {
			   // important step
		     text.isDisplayed();
		     System.out.println("Displaying text is "+ text.getText());
		     Thread.sleep(2000);
		     
		   }
		     // next button
		   public void nextButton() throws InterruptedException {
			 System.out.println("Next button is displaying: " +nextbutton.isDisplayed());
		     nextbutton.click();	
		     Thread.sleep(2000);
		   }
		     // previous button
		    public void previousButton() throws InterruptedException { 
		     System.out.println("Previous button is displaying: " +previous.isDisplayed());
		     previous.click();
		     Thread.sleep(2000);
		     
		    } 
		     // SEE ALL button
		     public void seeAllButton() throws InterruptedException {
		     System.out.println("See all button is displaying: " +seeall.isDisplayed());
		     seeall.click();
		     Thread.sleep(2000);
		      //scrolling the page
		     JavascriptExecutor js= (JavascriptExecutor) driver;
		     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		     System.out.println(js.executeScript("return window.pageYOffset;"));
		     Thread.sleep(2000);
		     js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");	
		     System.out.println(js.executeScript("return window.pageYOffset;"));
		     Thread.sleep(2000);
		     
		     // Navigate back to the previous page
		     driver.navigate().back();
		     Thread.sleep(2000);
		     List<WebElement> allElements=driver.findElements(By.xpath("//img[@class='placeholder_2x3']"));
		     int visibleCount = 0;

	        for (WebElement element : allElements) {
	            if (element.isDisplayed()) {
	                visibleCount++;
	            }
	        }

	        System.out.println("Visible elements count: " + visibleCount);

	        System.out.println("Total no of content in see all page: "+allElements.size());	
	        
	        
		}
		
	
}
