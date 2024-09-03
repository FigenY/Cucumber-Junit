package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(id = "editprofile-from-github-input")
    public WebElement githubInput;
    @FindBy(linkText = "Go Back")
    public WebElement goBackButton;


}
