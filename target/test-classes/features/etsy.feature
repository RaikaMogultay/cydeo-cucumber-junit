Feature: Etsy Title Verification
  Agile story : As a user, I should see the tittle ETSY.

  Scenario: Etsy Title Verification
    Given User is on homepage
    Then User sees title is as expected.

  Scenario: Etsy Search Functionality Title Verification
    Given User is on homepage
    When  User types Wooden Spoon in the search box
    And   User clicks search button
    Then  User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given User is on homepage
    When  User types "Wooden spoon" in the search box
    And   User clicks search button
    Then  User sees  "Wooden spoon" is in the title


