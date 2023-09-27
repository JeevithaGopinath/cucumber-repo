
Feature:login functionality
Background:
Given user is navigate to the orangeHRM application
@dataTablewithoutHeader
Scenario: Login the OrangeHRM application
When  user is entering the  below credential
     | Admin  | admin123 |
And user is clicking the login
Then user is on the home page of OrangeHRM application

@dataTablewithHeaders
Scenario: Login the OrangeHRM application using DataTable
#Given user is navigate to the orangeHRM application
When  user is entering the  below credentials
     | UserName | password |
     | Admin    | admin123 |
And user is clicking the login
Then user is on the home page of OrangeHRM application
@dataDrivenusingScenarioOutline
Scenario Outline: Login the OrangeHRM application using Scenario outline
#Given user is navigate to the orangeHRM application
When  user is entering the  "<UserName>" and "<PassWord>"
And user is clicking the login
Then user is on the home page of OrangeHRM application
Examples:
| UserName | PassWord |
| Admin    | admin123 |
| Admin    | admin123 |