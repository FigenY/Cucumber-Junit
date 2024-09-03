@regression @navigation
Feature: Navigation Functionality
  As a user, I should be able to navigate to all pages

  @smoke
  Scenario: Developer Page Test
    When user logins as Teacher
    Then verify that user should be able see Welcome Teacher
    When user clicks on the Developers menu
    Then verify that user should be able see Developers text

  @db
  Scenario: Posts page test
    When  user logins as Student
    Then verify that user should be able see Welcome Student
    When user clicks on the All Posts menu
    Then verify that user should be able see Posts text

  Scenario: Dashboard page test
    When user logins as Teacher
    Then verify that user should be able see Welcome Teacher
    Then verify that user should be able see Dashboard




  #  Scenario: Developer page test
#  Login as Teacher
#  "At first get the text of welcome
#  Then go to Developers menu and get the text of Developers

#  Scenario: Posts page test
#  Login as Student
#  Get the text of welcome
#  Then go to All Posts menu and get the text of Posts

#  Scenario: Dashboard page test
#  Login as Teacher
#  Set the text of welcome
#  Then go to My Account menu and get the text of Dashboard