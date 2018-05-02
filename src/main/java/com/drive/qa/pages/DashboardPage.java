package com.drive.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drive.qa.base.TestBase;

public class DashboardPage extends TestBase{
	
	//Define Page factory - OR
	//Define Page factory - OR
	@FindBy(xpath = ".//*[@id='side-menu']/li[7]/a")
	WebElement clickOnManageBackEndLink;
		
	@FindBy(xpath = ".//*[@id='side-menu']/li[7]/ul/li[4]/a")
	WebElement clickOnManageLivingCostLink;
		
	@FindBy(xpath = ".//*[@id='side-menu']/li[7]/ul/li[4]/ul/li[2]/a")
	WebElement clickOnLivingCostLink;
	
	//initilized the webelement / or
	public DashboardPage(){
		PageFactory.initElements(driver, this);
	}

	//action
	public void clickOnManageBackEndLinka() {
		clickOnManageBackEndLink.click();
	}
	
	public void clickOnManageLivingCostLinka() {
		clickOnManageLivingCostLink.click();
	}

	public void clickOnLivingCostLinka() {
		clickOnLivingCostLink.click();
	}
}
