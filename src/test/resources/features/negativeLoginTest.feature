Feature: Negative Login Test

  Background:
    Given user is on the login page


  Scenario Template: Login with DDT
    When user enters "<email>" email
    And user enters "<password>" password
    And user clicks on the login button
    Then verify that user should be able to see warning message as "<expectedMessage>"
    Examples:
      | email             | password   | expectedMessage                                                           |
      | eurotech          | Test12345! | Please include an '@' in the email address. 'eurotech' is missing an '@'. |
      | eurotech@         | Test12345! | Please enter a part following '@'. 'eurotech@' is incomplete.             |
      | eurotech@gmail    | Test12345! | Please include a valid email!                                             |
      | eurotec@gmail.com | Test12345! | Invalid Credentials!                                                      |





#ClassTask--> Create a Negative Login Test Feature file with Scenario Outline which includes 4 different data as;
#eurotech
#eurotech@
#eurotech@gmail
#eurotec@gmail.com
#Do not forget to take the messages which show the result as negative
#Create Step Def class and if needed create Locators and methods in related page class