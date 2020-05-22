package com.cucmberPOM.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberPOM.base.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Loginpage extends BaseTest {

	@FindBy (xpath = "//input[@type = 'text']")
	WebElement username;

	@FindBy (xpath = "//input[@type = 'password']")
	WebElement password;

	@FindBy (xpath = "//div[starts-with(text(),'Login')]")
	WebElement button;

	public  Loginpage() {
		PageFactory.initElements(driver,this);
	}

	public String gettitle() {
		return driver.getTitle();
	}

	public Homepage Logincheck() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		button.click();
		return new Homepage();
	}


}
