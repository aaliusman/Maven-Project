Feature: testing login functionality

Scenario: login to amazon


Given user is on homepage
When User navigate to login to page
And User enters username and password
Then Message displayed login succesfully 
