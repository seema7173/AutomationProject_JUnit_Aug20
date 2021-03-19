package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckedBoxPage;
import util.BrowserFactory;

public class TC_003 {
	

	WebDriver driver;
	
	@Test

	public void LaunchTheBrowser() throws InterruptedException {
		driver = BrowserFactory.init();

		CheckedBoxPage checkbox = PageFactory.initElements(driver, CheckedBoxPage.class);
		
		checkbox.CheckedToggleAllBox();
		checkbox.ClickOnRemoveButton();
		

}
	}
