package com.eurotech.step_definitions;

import com.eurotech.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NegativeLoginTest_StepDefs {

    LoginPage loginPage = new LoginPage();


    @Then("verify that user should be able to see warning message as {string}")
    public void verify_that_user_should_be_able_to_see_warning_message_as(String expectedMessage) {
//        String validationMessage = loginPage.inputEmail.getAttribute("validationMessage");
//        System.out.println("validationMessage = " + validationMessage);
        Assert.assertEquals(expectedMessage, loginPage.getWarningMessage(expectedMessage));
    }


}
