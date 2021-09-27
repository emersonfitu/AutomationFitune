package Demo.Automation.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.*;
import org.json.JSONObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Demo.Automation.Utilities.BrowserFactory;
import Demo.Automation.Utilities.PropertiesFile;

import org.testng.Reporter;
import org.testng.reporters.XMLReporter;
import org.testng.ITestResult;

//import org.exp.annotations.Xray;


public class BasePage {

	public WebDriver driver;
	public static String quoteid,transferid,ilpPacket,condition;
	
	//public static String browser = String(PropertiesFile.browserx);
	
	
	@BeforeMethod
	public void setup() {
		PropertiesFile.Readproperties();
		String browser = PropertiesFile.browserx;
		driver=BrowserFactory.StartApp(driver, browser);
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		BrowserFactory.quitbrowser(driver);
	}
	
	public void RefreshPage() {
		driver.navigate().refresh();
	}
	
	
	public void ClickOnButton(WebElement ele) {
		ele.click();
	}
	
	public void SendText(WebElement ele, String txt) {
		ele.sendKeys(txt);
	}
	
	public void ClearTxtBox(WebElement ele) {
		ele.clear();
	}
	
	
	
	
	public void Wait(int x) {
		x = x * 1000;
		try {
			Thread.sleep(x);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String gettext(WebDriver dri, String x) {
		 String thiswebelement= dri.findElement(By.xpath(x)).getText();
		 return thiswebelement;
			
	}
	
	
	
	
	
	

	
}