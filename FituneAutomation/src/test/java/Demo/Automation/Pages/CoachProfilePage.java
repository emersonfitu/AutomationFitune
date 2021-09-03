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

public class CoachProfilePage extends BasePage {
	
	WebDriver driver;
	
	
	
	public CoachProfilePage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	/*@FindBy(id="coach_email") WebElement emailcoach;
	@FindBy(id="coach_password") WebElement passcoach;
	@FindBy(name="button")
	public WebElement submitbtn;*/
	
	
	
	@FindBy(xpath="//a[@href ='https://dev2-partner.fituapp.com/admin']") WebElement home_button;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul[1]/li[1]") WebElement start;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul[1]/li[2]") WebElement dashboard;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul[1]/li[3]") WebElement clients;
	@FindBy(xpath="//*[@id=\"sidebar\"]/ul[1]/li[4]") WebElement sales;
	
	
	@FindBy(xpath="//*[contains(text(), 'ACTIVE PRODUCTS')]") WebElement sidemenu_activeprods;
	@FindBy(xpath="//a[@href ='/admin/app/online']") WebElement calendar_activities;
	@FindBy(xpath="//*[contains(text(), 'MANAGE')]") WebElement sidemenu_manage;
	//@FindBy(id="a-panel-1") WebElement sidemenu_manage;
	@FindBy(xpath="//*[contains(text(), 'REPORTS')]")
	public WebElement sidemenu_reports;
	//@FindBy(id="a-panel-2") WebElement sidemenu_reports;
	@FindBy(xpath="//a[@href ='/admin/app/partner']") WebElement edit_profile;
	@FindBy(xpath="//a[@href ='https://feedback.fitune.io']") WebElement request_feature;
	@FindBy(xpath="//a[@href ='/admin/app/online/refer']") WebElement refer;
	@FindBy(xpath="//a[@href ='/admin/app/settings']") WebElement settings;
	@FindBy(xpath="//a[@href ='https://support.fitune.io/hc/es']") WebElement help_center;
	@FindBy(className="storefront-web mobile-text-md") WebElement storefront_link;
	
	
	@FindBy(xpath="//*[contains(text(), 'Welcome')]")
	public WebElement Welcometxt;
	
	@FindBy(xpath="//*[contains(text(), 'Your Storefront')]")
	public WebElement yourstorefronttxt;
	
		
	
	public void AssertPage() {
		
		Assert.assertEquals(true, yourstorefronttxt.isDisplayed());
		Assert.assertEquals(true, Welcometxt.isDisplayed());
		Assert.assertEquals(true, sidemenu_activeprods.isDisplayed());
		Assert.assertEquals(true, sidemenu_manage.isDisplayed());
		Assert.assertEquals(true, sidemenu_reports.isDisplayed());
	
		
	}
	

public void Gotoadmin(AdminOpt opt) {
		
	sidemenu_manage.click();
	
	switch(opt) {
	  case LOCATIONS:
		  driver.findElement(By.xpath("//a[@href ='/admin/app/locations']")).click();
	    break;
	  case ACTIVITIES:
		  driver.findElement(By.xpath("//a[@href ='/admin/app/online/activities']")).click();
	    break;
	  case SCHEDULE:
		  driver.findElement(By.xpath("//a[@href ='/admin/app/online/schedule']")).click();
		    break;
	  case PRICING:
		  driver.findElement(By.xpath("//a[@href ='/admin/app/pricing-options']")).click();
		    break;
	  case VOD:
		  driver.findElement(By.xpath("//a[@href ='/admin/app/vod']")).click();
		    break;
	  case PERSONAL:
		  driver.findElement(By.xpath("//a[@href ='/admin/app/online/instructors']")).click();
	}
	
	
		
	}



public void Gotoreports(ReportsOpt opt) {
	WebDriverWait wait = new WebDriverWait(driver,10);
	  //sidemenu_reports.click();
	
	switch(opt) {
	  case BOOKINGS:
		
		 driver.findElement(By.xpath("//a[@href ='/admin/app/bookings']")).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Latest bookings')]"))); 
	    break;
	  case MEMEBERSHIPS:
		 // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='/admin/app/user_partner_memberships']")));

		  driver.findElement(By.xpath("//a[@href ='/admin/app/user_partner_memberships']")).click();
		//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Memberships & Packs')]"))); 
	    break;
	  case PAYMENTS:
		//  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='https://dev2-partner.fituapp.com/admin/app/billing_payments']"))); 
		 
		  driver.findElement(By.xpath("//a[@href ='https://dev2-partner.fituapp.com/admin/app/billing_payments']")).click();
		//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Payment gateway')]"))); 
		   
	}
	
	
		
	}

	
	
public enum AdminOpt {
    LOCATIONS,
    ACTIVITIES,
    SCHEDULE,
    PRICING,
    VOD,
    PERSONAL
}
	

public enum ReportsOpt {
    BOOKINGS,
    MEMEBERSHIPS,
    PAYMENTS
   
}
	
	
	
	

}
