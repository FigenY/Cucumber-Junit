Feature: Login Functionality with Excel sheet


  Scenario Outline: login with excel
    Given user is on the login page
    When user enters "<sheetName>" sheet name and <rowNumber>
    And user clicks on the login button
    Then verify that welcome message contains "<sheetName>" <rowNumber> in excel
    Examples:
      | sheetName | rowNumber |
      | Test Data | 0         |
      | Test Data | 1         |
      | Test Data | 2         |