package Demo.Automation.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Demo.Automation.Pages.BasePage;

public class ForgotPasswordPage extends BasePage {
	
	WebDriver driver;
	
	
	public ForgotPasswordPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="coach_account_email") WebElement emailcoach;
	@FindBy(name="button") public WebElement submitbtn;
	
	@FindBy(xpath="//*[contains(text(), 'Reset Password')]") WebElement pagetitle;
	//@FindBy(xpath="//a[@href ='/admin/app/online']") WebElement calendar_activities;
	@FindBy(xpath="//*[contains(text(), 'Go to login')]")
	public WebElement gologin;
	
	//You will receive an email with instructions on how to reset your password in a few minutes.
		
	
	public void AssertPage() {
		
		
		Assert.assertEquals(true, emailcoach.isDisplayed());
		Assert.assertEquals(true, pagetitle.isDisplayed());
		
	
		
	}
	
	
	
	public void Doresetpassword(String email) {
		emailcoach.sendKeys(email);
		submitbtn.click();
	
		
	}
	
	public void CheckSucessmsg() {
		
		WebElement msg = driver.findElement(By.xpath("//*[contains(text(), 'You will receive an email with instructions on how to reset your password in a few minutes.')]"));
		
		Assert.assertEquals(true, msg.isDisplayed());
	
	}
	

   public void CheckUnSucessmsg() throws Exception {
	   
	   Assert.assertFalse(driver.getPageSource().contains("You will receive an email with instructions on how to reset your password in a few minutes."));
		
		//WebElement msg = driver.findElement(By.xpath("//*[contains(text(), 'You will receive an email with instructions on how to reset your password in a few minutes.')]"));
		
	 //  Assert.assertEquals(true, driver.findElement(By.xpath("//*[contains(text(), 'You will receive an email with instructions on how to reset your password in a few minutes.')]")));
	
	 //  Assert.assertTrue(verifyElementAbsent("//*[contains(text(), 'You will receive an email with instructions on how to reset your password in a few minutes.')]"));
   }
	
	
	
	
	

}
