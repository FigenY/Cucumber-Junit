package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostsPage extends BasePage {

    @FindBy(id = "post-form-title")
    public WebElement titleInput;

    @FindBy(id = "post-form-textarea")
    public WebElement textareaInput;

    @FindBy(css = "#post-form-btn")
    public WebElement submitButton;

    @FindBy(xpath = "//div[.='Post Created']")
    public WebElement postCreatedMessage;


}
