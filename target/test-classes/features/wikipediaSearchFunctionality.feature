@raika
Feature: Wikipedia search functionality title verification
  Agile story: As a user, when I search Steve Jobs on Wikipedia search box
  I should be able to see Steve Jobs in the wiki title

  Scenario: Wikipedia Search Functionality Title Verification
    When User is on Wikipedia home page
    Then User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then sees Steve Jobs is the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    When User is on Wikipedia home page
    Then User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the main header

    Scenario: Wikipedia Search Functionality Image Header Verification
      When User is on Wikipedia home page
      Then User types Steve Jobs in the wiki search box
      And User clicks wiki search button
      Then User sees Steve Jobs is in the image header
