Feature: Login Functionality for web order page

  Scenario: Validation of Web order positive scenario
    Given the user navigates to web order website
    When the user provide credentials
    Then user is on the homepage


    Scenario: Validation of Web order negative scenario
      Given the use navigates to the WebOrder website
      When user provides correct username and wrong password
      Then the user validates the "Sign in Failed" error message

  Scenario: Validation of Web order negative scenario 2
    Given the use navigates to the WebOrder website
    When user provides wrong "username" and wrong "password"
    Then the user validates the "Sign in Failed" error message

  Scenario: Validation of Web order negative scenario 3
    Given the use navigates to the WebOrder website
    When user provides wrong emphty credentials
    Then the user validates the "Sign in Failed" error message