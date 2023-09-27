Feature:To test the login functionality
Scenario:Login with valid credential
Given user is navigate to the orangeHRM
When  user is entering the credentials "Admin" and "admin123"
And user is clicking the login button
Then user is on the home page of OrangeHRM