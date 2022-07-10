Feature: feature to test login functionality

Scenario Outline:Check login is successful with login cradentials

Given User is initialize the chrome driver
And  user open the url "https://www.stealmylogin.com/demo.html"
When User enters <username> and <password>
And click on login button
Then user is navigate to home page
And user close the browser

Examples:
|username				|password					|
|rupesh22				|rupesh123					|
|kunal22				|kunal789					|