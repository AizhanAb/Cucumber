Feature: Etsy search Functionality


  Background: navigate
    Given the user navigates to "https://www.etsy.com/"
@regressionoutline
  Scenario Outline: Validation of etsy search Hat

    When the user searches "<searchValue>"
    Then the user validates the title "<titleValidation>"
    Examples:
    # command +option +l
      | searchValue | titleValidation |
      | Hat         | Hat \| Etsy    |
      | Key         | Key \| Etsy    |
      | Pin         | Pin \| Etsy    |
