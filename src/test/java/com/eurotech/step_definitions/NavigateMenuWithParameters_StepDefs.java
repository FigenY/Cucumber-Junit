package com.eurotech.step_definitions;

import com.eurotech.pages.PostsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigateMenuWithParameters_StepDefs {
    PostsPage postsPage = new PostsPage();

    @Then("user clicks on the {string} menu")
    public void user_clicks_on_the_menu(String menuName) {
        postsPage.menuBar(menuName).click();
    }

    @Then("verify that user should be able to see {string} header")
    public void verify_that_user_should_be_able_to_header(String header) {
        Assert.assertEquals(header, postsPage.pageHeader.getText());
    }


}
