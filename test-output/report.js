$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/eclipse-workspace/CucumberPOM/src/main/java/com/cucumberPOM/features/Application.feature");
formatter.feature({
  "line": 1,
  "name": "Application verification check",
  "description": "",
  "id": "application-verification-check",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the landing page of the application",
  "description": "",
  "id": "application-verification-check;verify-the-landing-page-of-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on the application landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify user is landed on the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_on_the_application_landing_page()"
});
formatter.result({
  "duration": 267260200,
  "error_message": "java.lang.NullPointerException\r\n\tat com.cucumberPOM.Stepdefinitions.LoginSteps.user_is_on_the_application_landing_page(LoginSteps.java:36)\r\n\tat ✽.Given user is on the application landing page(D:/eclipse-workspace/CucumberPOM/src/main/java/com/cucumberPOM/features/Application.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.verify_user_is_landed_on_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Then login with credentials to FreeCrm application"
    }
  ],
  "line": 8,
  "name": "application login",
  "description": "",
  "id": "application-verification-check;application-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user is on the application landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "login freecrm with credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify user is on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_the_application_landing_page()"
});
formatter.result({
  "duration": 1030200,
  "error_message": "java.lang.NullPointerException\r\n\tat com.cucumberPOM.Stepdefinitions.LoginSteps.user_is_on_the_application_landing_page(LoginSteps.java:36)\r\n\tat ✽.Given user is on the application landing page(D:/eclipse-workspace/CucumberPOM/src/main/java/com/cucumberPOM/features/Application.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.login_freecrm_with_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.verify_user_is_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Contacts page",
  "description": "",
  "id": "application-verification-check;verify-contacts-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user is on the application landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "login freecrm with credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters the contact details",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "saves all the details",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_on_the_application_landing_page()"
});
formatter.result({
  "duration": 1164600,
  "error_message": "java.lang.NullPointerException\r\n\tat com.cucumberPOM.Stepdefinitions.LoginSteps.user_is_on_the_application_landing_page(LoginSteps.java:36)\r\n\tat ✽.Given user is on the application landing page(D:/eclipse-workspace/CucumberPOM/src/main/java/com/cucumberPOM/features/Application.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.login_freecrm_with_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_enters_the_contact_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.saves_all_the_details()"
});
formatter.result({
  "status": "skipped"
});
});