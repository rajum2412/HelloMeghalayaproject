package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyListPage extends BasePage {

	// Constructor
	public MyListPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[normalize-space()='My List']")
	WebElement myListLink;
	@FindBy(xpath="//div//p[.=\"It's Empty!\"]")
	WebElement emptyListMessage;
	
	@FindBy(xpath="//a[@href='/'][normalize-space()='Browse']")
	WebElement browseLink;
	@FindBy(xpath="//div[@class='container padding-left-24']//div[@class=\"owl-stage-outer\"]//img")
	List<WebElement> myListContainer;
	
	@FindBy(xpath="//div[@id='oho-carousel_1']//div[@class='owl-stage']//div[1]//div[1]//a[1]")
	WebElement detailsPage;
	@FindBy(xpath="//app-details-redirection[@class='ng-star-inserted']//li[3]//a[1]")
	WebElement addToList;
	
	
	// Method to click on My List link
	public void clickMyListButton() {
		myListLink.click();
	}
	public boolean isMyListEmpty() {
		return emptyListMessage.isDisplayed();
	}
	public void handleMyList() {
		if(isMyListEmpty()) {
			System.out.println("My List is empty.");
			browseLink.click();
			
			
		} else {
			System.out.println("My List has items.");
			myListContainer.size();
		}
	}
	public int getMyListItemCount() {
		return myListContainer.size();
	}
	public void clickDetailsPage() {
		detailsPage.click();
	
	}
	public void clickAddToListButton() {
		addToList.click();
	}
}

