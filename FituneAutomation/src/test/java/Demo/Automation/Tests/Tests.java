package Demo.Automation.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Demo.Automation.Pages.BasePage;
import Demo.Automation.Pages.CoachActivitiesPage;
import Demo.Automation.Pages.CoachLocationsPage;
import Demo.Automation.Pages.CoachProfileHome;
import Demo.Automation.Pages.CoachProfileHome.actionsopt;
import Demo.Automation.Pages.CoachProfilePage;
import Demo.Automation.Pages.CoachProfilePage.AdminOpt;
import Demo.Automation.Pages.CoachProfilePage.ReportsOpt;
import Demo.Automation.Pages.ForgotPasswordPage;
import Demo.Automation.Pages.LoginAdmin;
import Demo.Automation.Pages.StorefrontEditPage;
import Demo.Automation.Pages.StorefrontHomePage;
import Demo.Automation.Utilities.BrowserFactory;
import Demo.Automation.Utilities.PropertiesFile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;


public class Tests extends BasePage {
	
	
/********************FITUNE ADMIN LOGIN TEST CASES
 * @throws Exception 
 * @throws InterruptedException ***************************************/
	
	
	@Test
	public void Successful_login() {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();		      
	}
	
	
	@Test
	public void Empty_password_login() {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, "");
		loginadmin.Checkerror();	      
	}
	
	
	@Test
	public void Empty_email_login() {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin("", PropertiesFile.adminpass);
		loginadmin.Checkerror();	      
	}
	
	@Test
	public void Empty_credentials_login() {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin("", "");
		loginadmin.Checkerror();	      
	}
	
	@Test
	public void Bad_credentials_login() {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, "not a password");
		loginadmin.Checkerror();	      
	}
	
	@Test
	public void Successful_Resetpassword() {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.resetpass.click();   
		ForgotPasswordPage reset = PageFactory.initElements(driver, ForgotPasswordPage.class);
		reset.Doresetpassword("emerson@fituapp.com");
		Wait(3);
		reset.CheckSucessmsg();
	}
	
	@Test
	public void Unsuccessful_Resetpassword() throws Exception {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.resetpass.click();   
		ForgotPasswordPage reset = PageFactory.initElements(driver, ForgotPasswordPage.class);
		reset.Doresetpassword("");
		Wait(3);
		reset.CheckUnSucessmsg();
	}
	
	
	@Test
	public void Validate_action_dropdown() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		Thread.sleep(3000);
		CoachProfileHome coachhome= PageFactory.initElements(driver, CoachProfileHome.class);
		coachhome.AssertPage();	
		coachhome.actions_btn.click();
		Thread.sleep(3000);
		coachhome.ValidateActions();
		
	
	
	}
	
	@Test
	public void Validate_action_dropdown_view_storefront() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		Thread.sleep(3000);
		CoachProfileHome coachhome= PageFactory.initElements(driver, CoachProfileHome.class);
		coachhome.AssertPage();	
		coachhome.actions_btn.click();
		Thread.sleep(3000);
		coachhome.Actions(actionsopt.VIEWLIVE_STOREFRONT);
		Thread.sleep(6000);
		StorefrontHomePage storehome= PageFactory.initElements(driver, StorefrontHomePage.class);	
		storehome.AssertPage();
	
	}
	
	@Test
	public void Validate_action_dropdown_edit_storefront() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		Thread.sleep(3000);
		CoachProfileHome coachhome= PageFactory.initElements(driver, CoachProfileHome.class);
		coachhome.AssertPage();	
		coachhome.actions_btn.click();
		Thread.sleep(3000);
		coachhome.Actions(actionsopt.EDIT_STOREFRONT);
		Thread.sleep(6000);
		StorefrontEditPage storeedit= PageFactory.initElements(driver, StorefrontEditPage.class);	
		storeedit.AssertPage();
	
	}
	
	
	@Test
	public void Validate_action_dropdown_create_activity() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		Thread.sleep(3000);
		CoachProfileHome coachhome= PageFactory.initElements(driver, CoachProfileHome.class);
		coachhome.AssertPage();	
		coachhome.actions_btn.click();
		Thread.sleep(3000);
		coachhome.Actions(actionsopt.CREATE_NEW_ACTIVITY);
		Thread.sleep(6000);
		CoachActivitiesPage createact= PageFactory.initElements(driver, CoachActivitiesPage.class);	
		createact.AssertPage();
	
	}
	
	@Test
	public void Validate_action_dropdown_create_location() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		Thread.sleep(3000);
		CoachProfileHome coachhome= PageFactory.initElements(driver, CoachProfileHome.class);
		coachhome.AssertPage();	
		coachhome.actions_btn.click();
		Thread.sleep(3000);
		coachhome.Actions(actionsopt.CREATE_NEW_LOCATION);
		Thread.sleep(6000);
		CoachLocationsPage createlocationx= PageFactory.initElements(driver, CoachLocationsPage.class);	
		createlocationx.AssertPage();
	
	}
	
	
	
	/*
	@Test
	public void test_funciton() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		coachprof.Gotoadmin(AdminOpt.ACTIVITIES);
		Thread.sleep(2000);
		coachprof.Gotoadmin(AdminOpt.LOCATIONS);
		Thread.sleep(2000);
		coachprof.Gotoadmin(AdminOpt.PERSONAL);
		Thread.sleep(2000);
		coachprof.Gotoadmin(AdminOpt.PRICING);
		Thread.sleep(2000);
		coachprof.Gotoadmin(AdminOpt.SCHEDULE);
		Thread.sleep(2000);
		coachprof.Gotoadmin(AdminOpt.VOD);
	}
	
	@Test
	public void test_funciton2() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		Thread.sleep(3000);
		coachprof.sidemenu_reports.click();
		coachprof.Gotoreports(ReportsOpt.BOOKINGS);
		Thread.sleep(6000);
		coachprof.Gotoreports(ReportsOpt.MEMEBERSHIPS);
		Thread.sleep(6000);
		coachprof.Gotoreports(ReportsOpt.PAYMENTS);
	
	
	}
	
	@Test
	public void test_funciton3() throws InterruptedException {
		
		LoginAdmin loginadmin= PageFactory.initElements(driver, LoginAdmin.class);		
		Wait(1);
		loginadmin.AssertPage();
		loginadmin.dologin(PropertiesFile.adminuser, PropertiesFile.adminpass);
		CoachProfilePage coachprof= PageFactory.initElements(driver, CoachProfilePage.class);
		coachprof.AssertPage();	
		Thread.sleep(3000);
		CoachProfileHome coachhome= PageFactory.initElements(driver, CoachProfileHome.class);
		coachhome.AssertPage();	
		coachhome.actions_btn.click();
		Thread.sleep(3000);
		coachhome.Actions(actionsopt.VIEWLIVE_STOREFRONT);
		Thread.sleep(6000);
		
	
	
	}*/
	
	


	
	

	
}