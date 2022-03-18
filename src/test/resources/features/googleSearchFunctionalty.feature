@unit
Feature: Google Search Functionality Title Verification
  Agile story: As a user, when I types google search box apple click and
  I should be see Steve Jobs in the google title

Scenario: user is on Google search page
  When user is on the Google search page
  Then user should see title is the Google
  Then user types apple in the google search box
  And user clicks enter
  Then user sees Steve Jobs is in the google title




