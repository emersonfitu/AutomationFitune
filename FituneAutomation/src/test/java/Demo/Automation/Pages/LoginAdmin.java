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

public class LoginAdmin extends BasePage {
	
	WebDriver driver;
	
	
	public LoginAdmin(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="coach_email") WebElement emailcoach;
	@FindBy(id="coach_password") WebElement passcoach;
	@FindBy(name="button")
	public WebElement submitbtn;
	
	@FindBy(xpath="//*[contains(text(), 'Reset password')]")
	public WebElement resetpass;
	
	@FindBy(xpath="//*[contains(text(), 'Get started')]")
	public WebElement createaccountbtn;
	
	@FindBy(xpath="//*[contains(text(), 'Welcome to Fitune admin')]")
	public WebElement welcometxt;
	
		
	
	public void AssertPage() {
		
		Assert.assertEquals(true, welcometxt.isDisplayed());
		Assert.assertEquals(true, emailcoach.isDisplayed());
		Assert.assertEquals(true, passcoach.isDisplayed());
		Assert.assertEquals(true, resetpass.isDisplayed());
		Assert.assertEquals(true, createaccountbtn.isDisplayed());
	
		
	}
	

	
	public void dologin(String email, String pass) {
		emailcoach.sendKeys(email);
		passcoach.sendKeys(pass);
		submitbtn.click();
	
		
	}
	
	public void Checkerror() {
		
		WebElement errortxt = driver.findElement(By.xpath("//*[contains(text(), 'Invalid credentials')]"));
		
		Assert.assertEquals(true, errortxt.isDisplayed());
	
	}
	
	public void ClickCalculate() {
		
		
		
	
		
		//ClickOnButton(factorialbtn);
		
		Wait(2);
	}
	
	
	
	
	
	

}
