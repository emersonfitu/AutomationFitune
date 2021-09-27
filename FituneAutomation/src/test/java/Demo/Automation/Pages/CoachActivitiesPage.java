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

public class CoachActivitiesPage extends BasePage {
	
	WebDriver driver;
	
	
	
	public CoachActivitiesPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	

	
	
	
	
	
	
	//@FindBy(xpath="//*[contains(text(), 'Activities')]") WebElement activitiestitle;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[3]/div[2]/div/div/button") WebElement createactivitybtn;
	@FindBy(xpath="//*[contains(text(), 'Activity name')]") WebElement activitynametablecol1;
	@FindBy(xpath="//*[contains(text(), 'Activity type')]") WebElement activitytypetablecol2;
	@FindBy(xpath="//*[contains(text(), 'Venue type')]") WebElement activityvenuetablecol3;	
	@FindBy(xpath="//*[contains(text(), 'Status')]") WebElement activitystatustablecol4;
	
	public void AssertPage() {
		
		//Assert.assertEquals(true, activitiestitle.isDisplayed());
		Assert.assertEquals(true, createactivitybtn.isDisplayed());
		Assert.assertEquals(true, activitynametablecol1.isDisplayed());
		Assert.assertEquals(true, activitytypetablecol2.isDisplayed());
		Assert.assertEquals(true, activityvenuetablecol3.isDisplayed());
		Assert.assertEquals(true, activitystatustablecol4.isDisplayed());
		
	}
	






	
	

	
	
	
	

}
