Feature: Login feature
  As a user, I want to login because otherwise how do I use this app?

  Scenario: Basic login
    Given user is on the landing page
    When user enters credentials
    And user clicks login button
    Then user supposed to see welcome message