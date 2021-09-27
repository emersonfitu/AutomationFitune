package Demo.Automation.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo.Automation.Pages.BasePage;

public class CoachLocationsPage extends BasePage {
	
	WebDriver driver;
	
	
	
	public CoachLocationsPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	

	
	
	
	
	
	
	//@FindBy(xpath="//*[contains(text(), 'Activities')]") WebElement activitiestitle;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[3]/div/a") WebElement createlocationsbtn;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[4]/div/div/div/table/thead/tr/th[1]/div") WebElement locationtablecol1;
	@FindBy(xpath="//*[contains(text(), 'Address')]") WebElement locationtablecol2;
	@FindBy(xpath="//*[contains(text(), 'Status')]") WebElement locationtablecol3;	
	@FindBy(xpath="//*[contains(text(), 'Actions')]") WebElement locationtablecol4;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/h2/p") WebElement locationstxt;
	
	
	public void AssertPage() {
		
		//Assert.assertEquals(true, activitiestitle.isDisplayed());
		Assert.assertEquals(true, createlocationsbtn.isDisplayed());
		Assert.assertEquals(true, locationtablecol1.isDisplayed());
		Assert.assertEquals(true, locationtablecol2.isDisplayed());
		Assert.assertEquals(true, locationtablecol3.isDisplayed());
		Assert.assertEquals(true, locationtablecol4.isDisplayed());
		Assert.assertEquals("Manage multiple venues for your business and let attendees know where to show up.", locationstxt.getText());
		
	}
	






	
	

	
	
	
	

}
