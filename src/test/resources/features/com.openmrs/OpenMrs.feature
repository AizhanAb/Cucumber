Feature: Open MRS tests
  @openMRS
  Scenario: Register a patient
    Given the user logs into openMrs with following credentials
      | username | admin    |
      | password | Admin123 |
#    When user register new patient with following info:
#    |GivenName|Akmaral|
#    |FamilyName|Aitmatova|