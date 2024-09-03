package com.eurotech.step_definitions;

import com.eurotech.pages.AddEducationPage;
import com.eurotech.pages.DashboardPage;
import com.eurotech.utility.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddEducation_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    AddEducationPage addEducationPage = new AddEducationPage();


    @When("user clicks on the {string} dashboard menu")
    public void user_clicks_on_the_dashboard_menu(String menuName) {
        dashboardPage.dashboardMenu(menuName).click();
    }

    @When("user enters {string} field as {string}")
    public void user_enters_field_as(String fieldName, String fieldValue) {
        if (fieldName.equals("status")) {
            new Select(addEducationPage.inputField(fieldName)).selectByVisibleText(fieldValue);
        } else if (fieldName.equals("year")) {
            addEducationPage.setYear(fieldValue);
        } else {
            addEducationPage.inputField(fieldName).clear();
            addEducationPage.inputField(fieldName).sendKeys(fieldValue);
        }
    }

    @When("user clicks on the submit button")
    public void user_clicks_on_the_submit_button() {
        addEducationPage.submitButton.click();
    }

    @When("verify that user should be able to see {string} under Education Credentials")
    public void verify_that_user_should_be_able_to_see_under_education_credentials(String schoolName) {
        List<String> schools = BrowserUtils.getElementsText(dashboardPage.userSchoolList);
        Assert.assertTrue(schools.contains(schoolName));
    }

    @Then("verify that alert success message is {string}")
    public void verify_that_alert_success_message_is(String message) {
        Assert.assertEquals(message, addEducationPage.alertSuccessMessage.getText());
    }

    
}
