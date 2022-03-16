Feature: Validation of product

  @productproject
  Scenario: Validation of new product is created

    Given The user navigates to product website home page and click order button
    When The user enters the product information "MyMoney" and "4"
    And The user enters the information "Techtorial","2200 devon street","chicago","IL","60631"
    And The user enters the card information "Visa","12345678","02/20"
    Then The user validates success message
    And The user validates product details "Techtorial","MyMoney","4","2200 devon street","chicago","IL","60631","Visa","12345678","02/20"

  @productOutline
  Scenario Outline: Validation of new product is created
    Given The user navigates to product website home page and click order button
    When The user enters the product information "<productName>" and "<quantity>"
    And The user enters the information "<customerName>","<street>","<city>","<state>","<zipcode>"
    And The user enters the card information "<cardType>","<cardNumber>","<expireDate>"
    Then The user validates success message
    And The user validates product details "<customerName>","<productName>","<quantity>","<street>","<city>","<state>","<zipcode>","<cardType>","<cardNumber>","<expireDate>"
    Examples:
      | customerName | productName | quantity | street            | city    | state | zipcode | cardType | cardNumber | expireDate |
      | Techtorial   | MyMoney     | 4        | 2200 devon street | chicago | IL    | 60631   | Visa     | 12345678   | 02/20      |
      | student      | FamilyAlbum | 3        | 2200 good street | chicago | IL    | 60631   | MasterCard     | 4344344   | 02/20      |
      | Aijan        | ScreenSaver | 6        | 2200 cool street | chicago | IL    | 60631   | American Express     | 4354446   | 02/20      |