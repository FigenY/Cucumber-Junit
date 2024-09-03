package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utility.ExcelUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginWithDDT_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    //ExcelUtil excelUtil = new ExcelUtil("src/test/resources/DevEx.xlsx", "Test Data");
    //List<Map<String, String>> dataList = excelUtil.getDataList();
    @When("user enters {string} sheet name and {int}")
    public void user_enters_sheet_name_and(String sheetName, int rowNum) {
        //ExcelUtil excelUtil = new ExcelUtil("src/test/resources/DevEx.xlsx", sheetName);
        //List<Map<String, String>> dataList = excelUtil.getDataList();
        //loginPage.login(dataList.get(rowNum).get("Username"), dataList.get(rowNum).get("Password"));
        loginPage.login(loginPage.getDataList(sheetName).get(rowNum).get("Username"), loginPage.getDataList(sheetName).get(rowNum).get("Password"));
    }
    @Then("verify that welcome message contains {string} {int} in excel")
    public void verify_that_welcome_message_contains_in_excel(String sheetName, int rowNum) {
        //Assert.assertTrue(dashboardPage.welcomeText.getText().contains(dataList.get(rowNum).get("Name")));
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains(loginPage.getDataList(sheetName).get(rowNum).get("Name")));
    }

}
