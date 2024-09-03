package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utility.ConfigReader;
import com.eurotech.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.get("url"));
        loginPage.confirmButton.click();
    }

    @When("user enters teacher username")
    public void user_enters_teacher_username() {
        loginPage.inputEmail.sendKeys(ConfigReader.get("teacherEmail"));
    }

    @When("user enters teacher password and clicks login button")
    public void user_enters_teacher_password_and_clicks_login_button() {
        loginPage.inputPassword.sendKeys(ConfigReader.get("teacherPassword"));
        loginPage.loginButton.click();
    }

    @Then("verify that user should be able to login")
    public void verify_that_user_should_be_able_to_login() {
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains("Welcome"));
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        loginPage.inputEmail.sendKeys(ConfigReader.get("studentEmail"));
    }

    @And("user enters student password and clicks login button")
    public void userEntersStudentPasswordAndClicksLoginButton() {
        loginPage.inputPassword.sendKeys(ConfigReader.get("studentPassword"));
        loginPage.loginButton.click();
    }

    @When("user enters developer username")
    public void user_enters_developer_username() {
        loginPage.inputEmail.sendKeys(ConfigReader.get("devEmail"));
    }

    @When("user enters developer password and clicks login button")
    public void user_enters_developer_password_and_clicks_login_button() {
        loginPage.inputPassword.sendKeys(ConfigReader.get("devPassword"));
        loginPage.loginButton.click();
    }

    
}
