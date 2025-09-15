package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BottomTabsPage extends BasePage {
	public BottomTabsPage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath="//ul[@class='font-size3 oriya-color1 list-none padding-left-0 margin-bottom-30 pull-left w-100']//a")
	List<WebElement> bottomtabs;
	
	@FindBy(xpath="//img[@src='./assets/helloMeghalaya/instagram.svg']")
	WebElement instagramIcon;
	
	@FindBy(xpath="//img[@src='./assets/helloMeghalaya/facebook.svg']")
	WebElement facebookIcon;
	
	@FindBy(xpath="//img[@src='./assets/helloMeghalaya/icon_playStore.svg']")
	WebElement playstoreIcon;
	
	//Methods
	
	public void clickAllBottomTabs() throws InterruptedException {
		for (int i=0; i<bottomtabs.size(); i++) {
            List<WebElement> tab = driver.findElements(By.xpath("//ul[@class='font-size3 oriya-color1 list-none padding-left-0 margin-bottom-30 pull-left w-100']//a"));
           WebElement fottertab = tab.get(i);
           Thread.sleep(2000);
            
            System.out.println("Clicking tab: " + fottertab.getText());
            fottertab.click();
            Thread.sleep(2000);
		}
		 
	 }
		
	public void clickInstagramIcon() {
		instagramIcon.click();
	}
	
	public void clickFacebookIcon() {
		facebookIcon.click();
	}
	
	public void clickPlaystoreIcon() {
		playstoreIcon.click();
	}
	
	
	
}
