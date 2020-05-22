package com.cucumberPOM.Stepdefinitions;

import com.cucmberPOM.page.Homepage;
import com.cucumberPOM.base.BaseTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePageSteps extends BaseTest {

	Homepage homepage =new Homepage();


	@Then("^verify user is on the home page$")
	public void verify_user_is_on_the_home_page() {
		String Acttitle = driver.getTitle();
		String  Exptitle= "Cogmento CRM";
		Assert.assertEquals(Exptitle, Acttitle);

	}
	

@When("^user enters the contact details$")
public void user_enters_the_contact_details() {
	
	homepage.CreateContacts();
}

@When("^saves all the details$")
public void saves_all_the_details(){
	homepage.SaveContacts();
}


}
