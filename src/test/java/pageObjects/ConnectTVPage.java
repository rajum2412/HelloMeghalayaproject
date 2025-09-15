package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConnectTVPage extends BasePage {

	public ConnectTVPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}
		
		@FindBy(xpath = "//a[normalize-space()='Connect TV']")
		WebElement connectTV;
		@FindBy(xpath = "//app-activate-tv[@class='ng-star-inserted']//input")
		WebElement enterCode;
		@FindBy(xpath = "//button[normalize-space()='Submit']")
		WebElement submitBtn;
		@FindBy(xpath = "//span[normalize-space()='Invalid Token']")
		WebElement toastMessage;
		
		//Methods
		
	
		public void clickConnectTV() {
			connectTV.click();
		}	
		public void enterCode(String code) {
			enterCode.sendKeys(code);
		}
		public void clickSubmitBtn() {
			submitBtn.click();
		}
		public String getToastMessage() {
			return toastMessage.getText();
		}
		
	}


