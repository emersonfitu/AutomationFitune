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

public class StorefrontHomePage extends BasePage {
	
	WebDriver driver;
	
	
	public StorefrontHomePage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	

		
	//@FindBy(xpath="//*[contains(text(), 'Mis reservaciones')]")
	//public WebElement Myreservations;
	
	//@FindBy(xpath="//*[@id=\"app\"]/section/main/div[1]/header/div/div[3]/div/div/div/button")
	//public WebElement profilelogo;
	
	@FindBy(xpath="//*[contains(text(), 'Inicio')]")
	public WebElement inicio;
	
	@FindBy(xpath="//*[contains(text(), 'Horario')]")
	public WebElement Horario;
	
	@FindBy(xpath="//*[contains(text(), '1 on 1')]")
	public WebElement One_on_One;
	
	@FindBy(xpath="//*[contains(text(), 'On demand')]")
	public WebElement Ondemand;
	
	@FindBy(xpath="//*[contains(text(), 'Precios')]")
	public WebElement Precios;
	
	
		
	
	public void AssertPage() {
		
		//Assert.assertEquals(true, Myreservations.isDisplayed());
		//Assert.assertEquals(true, profilelogo.isDisplayed());
		Assert.assertEquals(true, inicio.isDisplayed());
		Assert.assertEquals(true, Horario.isDisplayed());
		Assert.assertEquals(true, One_on_One.isDisplayed());
		Assert.assertEquals(true, Ondemand.isDisplayed());
		Assert.assertEquals(true, Precios.isDisplayed());
		
	}
	

	
	
	
	
	
	
	
	

}
