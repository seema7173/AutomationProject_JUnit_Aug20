package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import page.CheckedBoxPage;
import util.BrowserFactory;

public class TC001  {

	WebDriver driver;

	
	@Test

	public void LaunchTheBrowser() throws InterruptedException {
		driver = BrowserFactory.init();

		CheckedBoxPage checkbox = PageFactory.initElements(driver, CheckedBoxPage.class);

		checkbox.CheckedToggleAllBox();
		
		
		/*
		 * String data = checkedbox.getText();
		 * 
		 * 
		 * 
		 * if (Checkedbox.isDisplayed()) { System.out.println("All datas are Toggled");
		 * } else { System.out.println("datas are not Toggled");
		 * 
		 * }
		 */
		 
		
		
		
		
		//BrowserFactory.teardown();
		//driver.close();
		
		
		//CheckedBox checkbox = PageFactory.initElements(driver, CheckedBox.class);
		//driver = BrowserFactory.init();
		/*
		 * checkbox.send_a_value("xyz12"); 
		 * checkbox.clickOnAdd();
		 * checkbox.verifiedEnteredData();
		 */
		
        //checkbox.Select_ABC_Box();
        
		//checkbox.ClickOnRemoveButton();
		//BrowserFactory.teardown();
		
		////body/div[@id='todos-content']/form[1]/ul[1]/li[7]
		////body/div[@id='todos-content']/form[1]/ul[1]/li[6]

	}
}