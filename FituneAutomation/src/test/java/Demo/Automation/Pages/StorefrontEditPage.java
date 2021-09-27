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

public class StorefrontEditPage extends BasePage {
	
	WebDriver driver;
	
	
	public StorefrontEditPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	

		
	@FindBy(xpath="//*[contains(text(), 'Customize storefront')]")
	public WebElement customstorefronttitle;
	
		
	//@FindBy(xpath="//*[contains(text(), 'View storefront live')]")
	//public WebElement viewstorefrontlink;
	
	@FindBy(xpath="//*[contains(text(), 'Common settings')]")
	public WebElement commonsettingsbtn;
	
	@FindBy(xpath="//*[contains(text(), 'Customize')]")
	public WebElement customizebtn;
	
	@FindBy(xpath="//*[contains(text(), 'Pick your favourite theme')]")
	public WebElement Pickthemetitle;
	
	
	
	
		
	
	public void AssertPage() {
		
		Assert.assertEquals(true, customstorefronttitle.isDisplayed());
		//Assert.assertEquals(true, viewstorefrontlink.isDisplayed());
		Assert.assertEquals(true, commonsettingsbtn.isDisplayed());
		Assert.assertEquals(true, customizebtn.isDisplayed());
		Assert.assertEquals(true, Pickthemetitle.isDisplayed());
		
		
	}
	

	
	
	
	
	
	
	
	

}
