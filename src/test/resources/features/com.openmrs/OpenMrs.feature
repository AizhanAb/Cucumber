Feature: Open MRS tests

  @openMRS
  Scenario: Register a patient
    Given the user logs into openMrs with following credentials
      | username | admin    |
      | password | Admin123 |
    When user register new patient with following info:
      | GivenName    | Akmaral         |
      | FamilyName   | Aitmatova       |
      | Gender       | female          |
      | Day          | 14              |
      | Month        | September       |
      | Year         | 1991            |
      | Address      | 2200 Eats Devon |
      | phoneNumber  | 21212121        |
      | relationType | Doctor          |
      | RelativeName | Potel           |