Feature: Customer login Test

Scenario: Successful customer login into PHP travels
Given Customer opens the browser and launch the application
When  Customer is on homepage
Then 	Customer clicks on Accounts button 
And   Clicks on customer login option
Then  Customer enters username as "user@phptravels.com" and password as "demouser"
And 	Clicks on Login button
Then  The page title should be ""
Then 	Customer closes the browser

