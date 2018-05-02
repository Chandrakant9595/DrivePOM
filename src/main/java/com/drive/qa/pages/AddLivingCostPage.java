package com.drive.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drive.qa.base.TestBase;
import com.drive.qa.testcases.AddLivingCostTest;

public class AddLivingCostPage extends TestBase{

	DashboardPage dashboardPage;
	
	@FindBy(id = "leaving_type_name")
	WebElement livingTypeName;
	
	@FindBy(id = "leaving_cost")
	WebElement livingCost;

	@FindBy(xpath = ".//*[@id='submit_btn']")
	WebElement clickOnAddButton;
	
	//initilized the webelement / or
	public AddLivingCostPage(){
		PageFactory.initElements(driver, this);
	}
	
	//action
	public ViewLivingCostPage addLivingCoastData(){
		livingTypeName.sendKeys("aaaa");
		livingCost.clear();
		livingCost.sendKeys("100");
		clickOnAddButton.click();
		return new ViewLivingCostPage();
	}
}
