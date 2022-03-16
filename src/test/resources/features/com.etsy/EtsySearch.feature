Feature: Etsy search Functionality


  Background: navigate
    Given the user navigates to "https://www.etsy.com/"
 @hat @tc1 @smoke @regression
  Scenario: VAlidation of etsy search Hat

    When the user searches "Hat"
    Then the user validates the title "Hats | Etsy"

  @key @tc2 @smoke @regression
  Scenario: VAlidation of etsy search Key
   # Given the user navigates to "https://www.etsy.com/"
    When the user searches "Key"
    Then the user validates the title "Key | Etsy"

  @pin @tc3 @smoke @regression
  Scenario: VAlidation of etsy search Pin
   # Given the user navigates to "https://www.etsy.com/"
    When the user searches "Pin"
    Then the user validates the title "Pin | Etsy"