package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
		public SearchPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath = "//a[@id='searchId']//img[@title='Search']")
		WebElement search;
		
		@FindBy(css = "#trending_search")
		WebElement Trendingsearch;
		
		@FindBy(xpath = "//input[@id='search']")
		WebElement searchfield;
		
		@FindBy(xpath = "//img[@lazyload='./assets/helloMeghalaya/icon_close_alert.svg']")
		WebElement Cancelbtn;
		
		public void clickSearch() {
			search.click();
		}
		public void clickSearchfield() {	
			searchfield.isDisplayed();
			searchfield.click();
			
		}
		public void clickCancelbtn() {
			Cancelbtn.click();
		}
		public boolean isSearchDisplayed() {
			return search.isDisplayed();
		}
		public boolean isTrendingsearchDisplayed() {	
			return Trendingsearch.isDisplayed();
			
		}
		public String getTrendingsearchText() {
			return Trendingsearch.getText();
		}
		public boolean isSearchfieldEnabled() {
			return searchfield.isEnabled();
			
		}
		public boolean isCancelbtnDisplayed() {
			return Cancelbtn.isDisplayed();
			
		}	
		public void enterSearchText(String text) {
			searchfield.sendKeys(text);
		}
		public int getTrendingSearchCount() {
			List<WebElement> TSRcount=driver.findElements(By.xpath("//div[@id='trending_results']//img"));
			return TSRcount.size();
		}
		public int getSearchResultCount() {
			List<WebElement> searchcount=driver.findElements(By.xpath("//div[@id='trending_results']//img"));
			return searchcount.size();
		}
		public void scrollDown() {
			JavascriptExecutor js= (JavascriptExecutor) driver;
	 	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 	    			System.out.println(js.executeScript("return window.pageYOffset;"));
			}	
	 	    		public void scrollUp() {
	 	    			JavascriptExecutor js= (JavascriptExecutor) driver;
	 	    			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	 	    			System.out.println(js.executeScript("return window.pageYOffset;"));
	 	    		}
	 	    		
		
		
	
}
