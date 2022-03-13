Feature: Web Order Page Food Order

  Scenario: Validation of Food order for Office
    Given the user is on Web Order homepage
    When the user selects "Office" options
    And the user is on the Group Order page
    And the user sends invitation note "Test"
    And the user send invite list "ab@email.com" and "shaj@gmail.com"
    Then user validates the "2012 EMPIRE BLVD"
    * user validates "View group order" text
    * the user validates total participants is 1
