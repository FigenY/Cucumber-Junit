package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utility.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashboardPageMenu_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Then("verify that user should be able to see following menu")
    public void verify_that_user_should_be_able_to_see_following_menu(List<String> dashboardMenu) {
        Assert.assertEquals(dashboardMenu, BrowserUtils.getElementsText(dashboardPage.addList));
        System.out.println("dashboardMenu = " + dashboardMenu);
        System.out.println("dashboardMenu.get(1) = " + dashboardMenu.get(1));
    }

    @When("user logs in using following credentials")
    public void user_logs_in_using_following_credentials(Map<String, String> userCredentials) {
        loginPage.login(userCredentials.get("email"), userCredentials.get("password"));
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains(userCredentials.get("message")));
        System.out.println("userCredentials = " + userCredentials);
    }


}
