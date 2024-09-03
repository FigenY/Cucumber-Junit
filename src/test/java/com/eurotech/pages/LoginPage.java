package com.eurotech.pages;

import com.eurotech.utility.ConfigReader;
import com.eurotech.utility.Driver;
import com.eurotech.utility.ExcelUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class LoginPage {
    @FindBy(id = "loginpage-input-email")
    public WebElement inputEmail;
    @FindBy(id = "rcc-confirm-button")
    public WebElement confirmButton;
    @FindBy(css = "#loginpage-form-pw-input")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@id='loginpage-form-btn']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[.='Invalid Credentials!']")
    public WebElement warningMessage;
    @FindAll({ // logical OR
            @FindBy(id = "loginpage-input-email"),
            @FindBy(name = "email")
    })
    public WebElement inputEmailFindAll;
    @FindBys({ // logical AND
            @FindBy(css = "#loginpage-form-pw-input"),
            @FindBy(xpath = "//input[@name='password']")
    })
    public WebElement inputPasswordFindBys;
    @FindBy(css = ".alert.alert-danger")
    public WebElement generalAlertMsg;

    /**
     * POM Design Pattern
     * Page Object Model
     */
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void teacherLogin() {
        Driver.getDriver().get(ConfigReader.get("url"));
        confirmButton.click();
        inputEmail.sendKeys(ConfigReader.get("teacherEmail"));
        inputPassword.sendKeys(ConfigReader.get("teacherPassword"));
        loginButton.click();
    }

    public void login(String username, String password) {
        inputEmail.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    public String getWarningMessage(String message) {

        String actualMessage = null;

        if (message.contains("@")) {
            actualMessage = inputEmail.getAttribute("validationMessage");
        } else if (message.contains("valid")) {
            actualMessage = generalAlertMsg.getText();
        }
        System.out.println("actualMessage = " + actualMessage);
        return actualMessage;
    }

    public List<Map<String, String>> getDataList(String sheetName){
        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/DevEx.xlsx", sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();
        return dataList;
    }


}
