package com.cucumberPOM.Stepdefinitions;

import org.junit.After;
import org.junit.Before;

import com.cucmberPOM.page.Homepage;
import com.cucmberPOM.page.Loginpage;
import com.cucumberPOM.base.BaseTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginSteps extends BaseTest {

	@Before
	public void openbrowser() {
		BaseTest.Initbrowser();
	}

	@After
	public void teardown() {
		driver.close();
	}
	

	Loginpage loginpage ;
	Homepage homepage;
	
	@Given("^user is on the application landing page$")
	public void user_is_on_the_application_landing_page() {
		
		String url = prop.getProperty("URL");
		driver.get(url);
		loginpage = new Loginpage();
		
	}

	@And("^Verify user is landed on the application$")
	public void verify_user_is_landed_on_the_application() throws Throwable {
		
		String Acttitle = loginpage.gettitle();
		String ExpTitle = "Cogmento CRM";
		Assert.assertEquals(ExpTitle, Acttitle);
	}

	@Then("^login freecrm with credentials$")
	public void login_freecrm_with_credentials() throws Throwable {
		homepage = loginpage.Logincheck();
	}

}
