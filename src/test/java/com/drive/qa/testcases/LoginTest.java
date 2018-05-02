package com.drive.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drive.qa.base.TestBase;
import com.drive.qa.pages.DashboardPage;
import com.drive.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	DashboardPage dashboardPage;

	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initilization();
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test(priority = 1)
	public void loginPageTittleTest(){
		String tittle = loginPage.verifyLoginPageTittle();
		Assert.assertEquals(tittle, "Log In | Drive On Finance", "Tittle is not correct");
	}                             
	
	@Test(priority = 2)
	public void loginLogoTest(){
		boolean flag =  loginPage.verifyDriveOnLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginPageURLTest(){
		String url =  driver.getCurrentUrl();
		Assert.assertEquals(url, "http://dev.drive-on.com.au/login/", "URLis not correct");
	}
	
	@Test(priority = 4)
	public void loginTest() throws InterruptedException{
		dashboardPage = loginPage.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
}
