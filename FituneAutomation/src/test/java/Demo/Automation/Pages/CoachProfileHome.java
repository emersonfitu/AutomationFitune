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

public class CoachProfileHome extends BasePage {
	
	WebDriver driver;
	
	
	
	public CoachProfileHome(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	//@FindBy(className="anchor btn-blue']")public WebElement actions_btn;
	@FindBy(xpath="//*[contains(text(), 'Actions')]") public WebElement actions_btn;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul[1]/li[1]") WebElement start;
	@FindBy(className="storefront-web mobile-text-md") WebElement storefront_link;
	
	
	@FindBy(xpath="//*[contains(text(), 'Welcome')]")
	public WebElement Welcometxt;
	
	@FindBy(xpath="//*[contains(text(), 'Your Storefront')]")
	public WebElement yourstorefronttxt;
	
		
	
	public void AssertPage() {
		
		Assert.assertEquals(true, yourstorefronttxt.isDisplayed());
		Assert.assertEquals(true, Welcometxt.isDisplayed());
	
	
		
	}
	


	
		
	



public void Actions(actionsopt opt) {
	WebDriverWait wait = new WebDriverWait(driver,10);
	 // sidemenu_reports.click();
	
	switch(opt) {
	  case VIEWLIVE_STOREFRONT:
		
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/div/div/div/div[1]/div")).click();
	
	    break;
	  case EDIT_STOREFRONT:
		 

		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/div/div/div/div[2]/div")).click();
		
	    break;
	  case CREATE_NEW_ACTIVITY:
		
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/div/div/div/div[3]/div")).click();
		   break;
	  case CREATE_NEW_LOCATION:
			
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/div/div/div/div[4]/div")).click();
		   break;
	  case CREATE_NEW_PRICING:
			
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/div/div/div/div[5]/div")).click();
		  break;
		  
	  case CREATE_NEW_SCHEDULE:
			
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/div/div/div/div[6]/div")).click();
		  break;  
		  
	  case UPLOAD_VOD:
			
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div[1]/div[1]/div/div/div/div[7]/div")).click();
		  break;  
	}
	
	
		
	}

	
	
public enum actionsopt {
    VIEWLIVE_STOREFRONT,
    EDIT_STOREFRONT,
    CREATE_NEW_ACTIVITY,
    CREATE_NEW_LOCATION,
    CREATE_NEW_PRICING,
    CREATE_NEW_SCHEDULE,
    UPLOAD_VOD
}
	


	
	
	
	

}
