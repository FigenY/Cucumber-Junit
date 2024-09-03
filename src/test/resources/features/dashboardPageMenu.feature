@posts
Feature: Dashboard Page Menu

  Background: login page
    Given user is on the login page

  Scenario: user can see dashboard menu
    When user enters "sparrowjack@gmail.com" email
    And user enters "sparrow1" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Jack" text
    And verify that user should be able to see following menu
      | Edit Profile   |
      | Add Experience |
      | Add Education  |

  Scenario: login with as a specific user
    When user logs in using following credentials
      | email    | batch16@gmail.com |
      | password | Test12345!        |
      | message  | batch16           |
    And verify that user should be able to see following menu
      | Edit Profile   |
      | Add Experience |
      | Add Education  |