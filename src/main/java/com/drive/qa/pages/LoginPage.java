package com.drive.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drive.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Define Page factory - OR
	@FindBy(id = "user_login")
	WebElement  userName;

	@FindBy(id = "user_pass")
	WebElement  password;
	
	@FindBy(xpath = ".//*[@id='wp-submit']")
	WebElement loginButton;
	
	@FindBy(xpath = "html/body/header/div/div[1]/nav/div/div[1]/a/span/img[1]")
	WebElement logo;
	
	//initilized the webelement / or
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//action
	public String verifyLoginPageTittle(){
		return driver.getTitle();
	}
	
	public boolean verifyDriveOnLogo(){
		return logo.isDisplayed();
	}
	
	public String validateDriveOnURL(){
		return driver.getCurrentUrl();
	}
	
	public DashboardPage verifyLogin(String un, String pwd) throws InterruptedException{
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new DashboardPage();
	}
}
