package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopTabsPage extends BasePage {

    public TopTabsPage(WebDriver driver) {
        super(driver);
    }

    // Hello Meghalaya logo on header tab
    @FindBy(xpath = "//img[@title='helloMeghalaya']")
    WebElement logo;

    // TOP tabs click (list of tabs)
    @FindBy(xpath = "//ul[@class='list-none padding-left-0 margin-bottom-0 pull-left w-100']//a")
    List<WebElement> toptabs;

    // Language selection
    @FindBy(css = "img[title='Languages']")
    WebElement languageIcon;

    @FindBy(xpath = "//li[@class='pull-left w-100']//span[@class='checkmark']")
    WebElement selectLanguage;

    @FindBy(xpath = "//button[normalize-space()='SAVE']")
    WebElement saveButton;

    // Trailer function
    @FindBy(xpath = "//img[@title='Trailers']")
    WebElement trailerButton;

    // ----- Methods -----

    public void clickLogo() {
        logo.click();
        System.out.println("Logo is displaying: " + logo.isDisplayed());
    }

    public void clickLanguageIcon() {
        languageIcon.click();
    }

    public void selectLanguage() {
        selectLanguage.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickTrailerButton() throws InterruptedException {
        trailerButton.click();
        System.out.println("Trailers button is displayed: " + trailerButton.isDisplayed());
        
     // Scroll the Trailer page
     		 JavascriptExecutor js= (JavascriptExecutor) driver;
     		 WebElement scrollPanel = driver.findElement(By.xpath("//ul[@class='list-none margin-bottom-0 pull-left comingsoon-menu ng-star-inserted']"));

     	     // Scroll down inside the panel (e.g., 300 pixels)
     	     js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 300;", scrollPanel);

     	     // Optional: wait and scroll more
     	     Thread.sleep(2000);
     	     js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 300;", scrollPanel);
     	     scrollPanel.click();
     	     
     	     Thread.sleep(5000);
     	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }

    // Iterate and click all top tabs
    public void clickAllTopTabs() throws InterruptedException {
        for (int i = 0; i < toptabs.size(); i++) {
            // Re-locate elements before each click to avoid StaleElementReferenceException
            List<WebElement> refreshedTabs = driver.findElements(
                By.xpath("//ul[@class='list-none padding-left-0 margin-bottom-0 pull-left w-100']//a")
            );
            WebElement tab = refreshedTabs.get(i);
            Thread.sleep(2000); // Optional: wait before clicking

            System.out.println("Clicking tab: " + tab.getText());
            tab.click();
        }
    }

    public void scrollPage() throws InterruptedException {
        Thread.sleep(5000);
    }
}
