Feature: Add Education Functionality

  Scenario: add education as a Student
    Given user is on the login page
    When user enters "batch16@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Dashboard" header
    When user clicks on the "Add Education" dashboard menu
    And user enters "school" field as "Eurotech Study"
    And user enters "degree" field as "Expert SDET"
    And user enters "fieldofstudy" field as "Automation Engineer"
    And user enters "from" field as "11092022"
    And user enters "to" field as "10102023"
    And user enters "description" field as "Java, Selenium and Cucumber"
    And user clicks on the submit button
    Then verify that user should be able to see "Eurotech Study" under Education Credentials







#login as student
#clicks on Add Education
#fill out all fields
#clicks on submit button
#verify that education info is added under Education Credentials
