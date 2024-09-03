Feature: Login with Parameters

  As a user, I should be able to login as different users

  Scenario: Login as Teacher with Parameters
    Given user is on the login page
    When user enters "eurotech@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Teacher" text


  Scenario: Login as Student with Parameters
    Given user is on the login page
    When user enters "batch16@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome batch16" text

  Scenario: Login as Developer with Parameters
    Given user is on the login page
    When user enters "sparrowjack@gmail.com" email
    And user enters "sparrow1" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Jack" text

  # DDF, DDT ermöglicht uns für gleiche Test mit unterschiedlichen Datas auszuführen.

  Scenario Outline: Login with DDT
    Given user is on the login page
    When user enters "<email>" email
    And user enters "<password>" password
    And user clicks on the login button
    Then verify that user should be able to see "<username>" text
    Examples:
      | email                 | password   | username        |
      | eurotech@gmail.com    | Test12345! | Welcome Teacher |
      | batch16@gmail.com     | Test12345! | Welcome batch16 |
      | sparrowjack@gmail.com | sparrow1   | Welcome Jack    |
      | odesali@gmail.com     | odesalim05 | Welcome odesa   |
      | zkka4484@gmail.com    | Zk.257135  | Welcome zk      |
      | furkandur@gmail.com   | Test1234   | Welcome Furkan  |

