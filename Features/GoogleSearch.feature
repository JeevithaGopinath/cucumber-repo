@hooks
Feature: feature to test the Google search
  @search1
  Scenario: Google search Scenario
    Given User is on the Google.com page
    When user is entering the search term "selenium"
    And user is pressing the enter key
    Then user is able to see the results of the search terms
    @search2
    Scenario: Google search Scenario1
    Given User is on the Google page
    When user is entering the search text "Java"
    And user enters  the search button
    Then user can see the results of the search term
    
    
