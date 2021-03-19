package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;





public class CheckedBoxPage extends TestBase{
	
	WebDriver driver;
	 public CheckedBoxPage(WebDriver driver) { 
		 this.driver = driver;
		 
	 }

	

	@FindBy(how = How.XPATH, using = "//body/div[3]/input[3]")
	WebElement Checkedbox;
	@FindBy(how = How.XPATH, using = "//body/div[4]/input[1]")
	WebElement enterdata;
	@FindBy(how = How.XPATH, using = "//body/div[4]/input[2]")
	WebElement clickdata;
	
	//@FindBy(how = How.XPATH, using = "//body/div[@id='todos-content']/form[1]/ul[1]/li[3]/input[1]")
	//WebElement abcCheckbox;
	@FindBy(how = How.XPATH, using = "//body/div[3]/input[1]")
	WebElement remove;

	
	String addData;
	public void CheckedToggleAllBox() throws InterruptedException {
		Checkedbox.click();
		waitforElement(driver, 5, Checkedbox);
		Checkedbox.isDisplayed();
		
		
		 if (Checkedbox.isDisplayed())
		  { System.out.println("Toggled all checked "); } 
		  else {
		  System.out.println("Toggled all not checked ");
		  
		  }
		
		
	}
	public void send_a_value(String value)  {
		int ranGen = randomGenarator(999);
		enterdata.sendKeys(value);
		String addData= value;
		
		/*
		 * addData=value+ranGen; 
		 * enterdata.sendKeys(addData);
		 */
		 
	}
	
	/*
	 * public void Select_ABC_Box() { waitforElement(driver, 5, abcCheckbox);
	 * Checkedbox.click();
	 * 
	 * }
	 */
	 
	public void clickOnAdd() throws InterruptedException  {
		//Thread.sleep(2000);
		clickdata.click();
		waitforElement(driver, 2, Checkedbox);
		
		
	}

	
	////body/div[3]/input[1]
	
	public void verifiedEnteredData() throws InterruptedException {

		String beforepath = "//body/div[@id='todos-content']/form[1]/ul[1]/li[";
		String afterpath = "]";
		
		
		for(int i=1; i<=5; i++) {
			String value = driver.findElement(By.xpath(beforepath + i + afterpath)).getText();
			Thread.sleep(5000);
			
			 // System.out.println(value); 
			  
			
			 // Assert.assertEquals(value,addData );
			  //break;
			 
			
			  if (value.contains(addData)) {
			  
			  
			  System.out.println("****");
			  driver.findElement(By.xpath("//body/div[3]/input[" + i + "]")).click();
			 }
		}
		
		
	}
	

	
	

	public void ClickOnRemoveButton() {
		waitforElement(driver, 3,Checkedbox );
		remove.click();
	}

}
