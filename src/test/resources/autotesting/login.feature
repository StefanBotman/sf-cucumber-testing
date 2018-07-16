Feature: Test Login

Scenario: Create Account Page
Given navigate to "https://login.salesforce.com"
Given username "PUR YOUR USERNAME HERE" and password "PUT YOUR PASSWORD HERE"
Then select "/001/o"
Then response should contain "Temp User"