package com.cucmberPOM.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberPOM.base.BaseTest;

public class Homepage extends BaseTest {


	@FindBy (xpath = "//span[contains(text(),'Contacts')]")
	WebElement contact;

	@FindBy (xpath = "//a//button[@class='ui linkedin button']")
	WebElement NewContact;

	@FindBy (xpath = "//input[@name='first_name']")
	WebElement fname;

	@FindBy (xpath = "//input[@name='last_name']")
	WebElement lname;

	@FindBy (xpath = "//input[@name='department']" )
	WebElement Department;

	@FindBy (xpath = "//button[@class='ui linkedin button']")
	WebElement savebutton;

	
	public void Homepage() {
		PageFactory.initElements(driver,this);
	}

	public void CreateContacts() {
		contact.click();
		NewContact.click();
		fname.sendKeys("firstname");
		lname.sendKeys("lastnamr");
		Department.sendKeys("dep");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void SaveContacts() {
			
		savebutton.click();
	}
}
