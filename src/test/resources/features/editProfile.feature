Feature: edit profile functionality

  Scenario: edit profile as Student
    Given user is on the login page
    When user enters "batch16@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome batch16" text
    When user clicks on the "Edit Profile" dashboard menu
    And user enters "status" field as "Senior Developer"
    And user enters "year" field as "4"
    And user enters "company" field as "EuroTech Study"
    And user enters "website" field as "www.eurotech.study"
    And user enters "location" field as "Germany"
    And user enters "skills" field as "Java, Selenium, Cucumber"
    And user enters "githubusername" field as "batch16github"
    And user enters "bio" field as "this student wanna be the best SDET"
    And user clicks on the submit button
    Then verify that alert success message is "Profile Updated"
  @wip
  Scenario Outline: edit profile as different user
    Given user is on the login page
    When user enters "<email>" email
    And user enters "<password>" password
    And user clicks on the login button
    Then verify that user should be able to see "<username>" text
    When user clicks on the "<menu>" dashboard menu
    And user enters "status" field as "<status>"
    And user enters "year" field as "<year>"
    And user enters "company" field as "<company>"
    And user enters "website" field as "<website>"
    And user enters "location" field as "<location>"
    And user enters "skills" field as "<skills>"
    And user enters "githubusername" field as "<github>"
    And user enters "bio" field as "<bio>"
    And user clicks on the submit button
    Then verify that alert success message is "<message>"
    Examples:
      | email              | password   | username        | menu         | status           | year | company        | website               | location | skills                        | github        | bio                                 | message         |
      | batch16@gmail.com  | Test12345! | Welcome batch16 | Edit Profile | Senior Developer | 4    | EuroTech Study | www.eurotech.study    | Germany  | Java, Selenium, Cucumber      | batch16github | this student wanna be the best SDET | Profile Updated |
      | eurotech@gmail.com | Test12345! | Welcome Teacher | Edit Profile | Manager          | 7    | EuroTech GMBH  | www.eurotechstudy.com | England  | Java, Selenium, Cucumber, DDT | eurotech      | works as a teacher at EuroTech      | Profile Updated |

