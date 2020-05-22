package com.cucumberPOM.Testrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\cucumberPOM\\features\\Application.feature", //the path of the feature files
		glue={"com\\cucumberPOM\\Stepdefinitions"} ,//the path of the step definition files
		format= {"pretty","html:test-output", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true
		//strict = false
		//tags = {"@Smoke"}
		)


public class ApplicationTestRunner {

}


//OR Condition : {"@SmokeTest, @End2End"} - Execute Scenario which have any of mentioned Tag
// AND Condition: {"@SmokeTest", "@End2End"} - Execute Scenario if and if Scenario have all mentioned tags
