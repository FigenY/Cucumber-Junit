Feature: Navigate to the Menu with Parameters

  Background: login page
    Given user is on the login page

  Scenario: Teacher navigates to the All Posts Menu
    When user enters "eurotech@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Teacher" text
    And user clicks on the "All Posts" menu
    Then verify that user should be able to see "Posts" header

  Scenario: Developer navigates to the Developers Menu
    When user enters "sparrowjack@gmail.com" email
    And user enters "sparrow1" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Jack" text
    And user clicks on the "Developers" menu
    Then verify that user should be able to see "Developers" header


  Scenario Outline: Navigate to Menu DDT
    When user enters "<email>" email
    And user enters "<password>" password
    And user clicks on the login button
    Then verify that user should be able to see "<username>" text
    And user clicks on the "<menuName>" menu
    Then verify that user should be able to see "<header>" header
    Examples:
      | email                 | password   | username        | menuName   | header     |
      | eurotech@gmail.com    | Test12345! | Welcome Teacher | All Posts  | Posts      |
      | sparrowjack@gmail.com | sparrow1   | Welcome Jack    | Developers | Developers |



