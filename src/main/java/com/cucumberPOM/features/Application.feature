Feature: Application verification check

Scenario: Verify the landing page of the application
Given user is on the application landing page
And Verify user is landed on the application
#Then login with credentials to FreeCrm application

Scenario:  application login 

Given user is on the application landing page
Then login freecrm with credentials
Then verify user is on the home page

Scenario: Verify Contacts page
Given user is on the application landing page
Then login freecrm with credentials
When user enters the contact details
And saves all the details

