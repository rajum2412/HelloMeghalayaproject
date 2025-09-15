package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
public static WebDriver driver;
public Logger logger;
	
	@BeforeClass
	public void setup() 
	{
	  logger=LogManager.getLogger(this.getClass());
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.hellomeghalaya.in/");
	  driver.manage().window().maximize();
	  driver.findElement(org.openqa.selenium.By.linkText("Ok")).click();
	}
	@AfterClass
	 // Wait for the page to load before quitting
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
	 // Utility methods for generating random strings 
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		return generatedString;
	}
	public String randomNumber() {
		String generatednumber = RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}	
	public String randomAlphaNumeric() {
		String generateAlphanumeric = RandomStringUtils.randomAlphanumeric(10);
		return generateAlphanumeric;
	}
	public static String captureScreen(String testName) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") + "\\screenshots\\" + testName + "_" + timeStamp + ".png";
        FileHandler.copy(src, new File(dest));
        return dest;
    }
}
