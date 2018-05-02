package com.drive.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drive.qa.base.TestBase;
import com.drive.qa.pages.AddLivingCostPage;
import com.drive.qa.pages.DashboardPage;
import com.drive.qa.pages.LoginPage;
import com.drive.qa.pages.ViewLivingCostPage;

public class AddLivingCostTest extends TestBase{
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddLivingCostPage addLivingCostPage;
	ViewLivingCostPage viewLivingCostPage;
	
	public AddLivingCostTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException{
		initilization();
		loginPage = new LoginPage();
		addLivingCostPage = new AddLivingCostPage();
		dashboardPage = loginPage.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		dashboardPage = new DashboardPage();
		dashboardPage.clickOnManageBackEndLinka();
		Thread.sleep(500);
		dashboardPage.clickOnManageLivingCostLinka();
		Thread.sleep(500);
		dashboardPage.clickOnLivingCostLinka();
		viewLivingCostPage = new ViewLivingCostPage();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test(priority = 1)
	public void addLivingCostTest(){
		viewLivingCostPage = addLivingCostPage.addLivingCoastData();
	}
	
}
