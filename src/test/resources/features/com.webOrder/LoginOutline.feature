Feature: Login Functionality for web order page

  Background:
    Given the use navigates to the WebOrder website

  @smokeLoginTest
  Scenario: Validation of Web order positive scenario
   # Given the user navigates to web order website
    When the user provide credentials
    Then user is on the homepage

  Scenario Outline: Validation of Web order negative Scenarios
 # Given the use navigates to the WebOrder website
    When user provides wrong "<username>" and wrong "<password>"
    Then the user validates the "<Sign in Failed>" error message
    Examples:
      | username              | password              | Sign in Failed |
      | gueDdd@microworks.com | Guest1!               | Sign in Failed |
      | Guest1!               | guest1@microworks.com | Sign in Failed |
      | microworks            | ]]ppd672              | Sign in Failed |
      | username              | ssddsdsdsfc           | Sign in Failed |
      | cqcc##5s5d            | blajdhs               | Sign in Failed |
      | userxzvname           | passwvcxvord          | Sign in Failed |
      | fsjudfh               | ajdhs                 | Sign in Failed |
      | dshfkh                | pzdfsword             | Sign in Failed |
      | xcvsg                 | xvvvsx                | Sign in Failed |



