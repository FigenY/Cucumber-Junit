@regression
Feature: Login Functionality
  As a user, I should be able to login, so that I can see my dashboard

  @smoke @db
  Scenario: Login as a teacher
    Given user is on the login page
    When user enters teacher username
    And user enters teacher password and clicks login button
    Then verify that user should be able to login
    #And verify that user should be able to see his name
  @smoke @login
  Scenario: Login as a student
    Given user is on the login page
    When user enters student username
    And user enters student password and clicks login button
    Then verify that user should be able to login

  Scenario: Login as a developer
    Given user is on the login page
    When user enters developer username
    And user enters developer password and clicks login button
    Then verify that user should be able to login


#  -Write scenarios in navigationMenu.feature
#  -Create step definitions
#  -No need to use any JAVA code.
#  -Just implement the step definitions by adding print statement.
#  -Create new class NavigationMenu_StepDefs

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


