package com.eurotech.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDefs {

    @When("user logins as Teacher")
    public void user_logins_as_teacher() {
        System.out.println("user logged in as Teacher");
    }

    @Then("verify that user should be able see Welcome Teacher")
    public void verify_that_user_should_be_able_see_welcome_teacher() {
        System.out.println("user can see Welcome Teacher");
    }

    @When("user clicks on the Developers menu")
    public void user_clicks_on_the_developers_menu() {
        System.out.println("user clicked on the Developers menu");
    }

    @Then("verify that user should be able see Developers text")
    public void verify_that_user_should_be_able_see_developers_text() {
        System.out.println("user can see Developers text");
    }

    @When("user logins as Student")
    public void user_logins_as_student() {
        System.out.println("user logged in as Student");
    }

    @Then("verify that user should be able see Welcome Student")
    public void verify_that_user_should_be_able_see_welcome_student() {
        System.out.println("user can see Welcome Teacher");
    }

    @When("user clicks on the All Posts menu")
    public void user_clicks_on_the_all_posts_menu() {
        System.out.println("user clicked on the All Posts menu");
    }

    @Then("verify that user should be able see Posts text")
    public void verify_that_user_should_be_able_see_posts_text() {
        System.out.println("user can see Posts Text");
    }

    @Then("verify that user should be able see Dashboard")
    public void verify_that_user_should_be_able_see_dashboard() {
        System.out.println("user can see Dashboard");
    }
}
