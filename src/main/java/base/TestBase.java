package base;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	static WebDriver driver;
	
  // @BeforeClass
	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
//@AfterClass
	public void teardown() {
		driver.close();
	}
	
	
	public int randomGenarator(int boundry) {
		Random ran = new Random();
		int rnd = ran.nextInt(boundry);
		return rnd;
	}
	public void waitforElement(WebDriver driver, int timeInSecond, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSecond);
		wait.until(ExpectedConditions.visibilityOf(locator));


}}