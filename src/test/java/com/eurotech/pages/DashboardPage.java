package com.eurotech.pages;

import com.eurotech.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {


    @FindBy(id = "dashboard-p1")
    public WebElement welcomeText;
    @FindBy(css = ".btn.btn-light")
    public List<WebElement> addList;
    @FindBy(xpath = "(//tbody)[2]/tr/td[1]")
    public List<WebElement> userSchoolList;

    public WebElement dashboardMenu(String menu) {
        String menuPath = "//*[text()='" + menu + "']";
        return Driver.getDriver().findElement(By.xpath(menuPath));
    }

    public WebElement userTitle(int index) {
        String titlePath = "(//tbody)[1]/tr[" + index + "]/td[2]";
        return Driver.getDriver().findElement(By.xpath(titlePath));
    }

    public WebElement userCompany(int index) {
        String companyPath = "(//tbody)[1]/tr[" + index + "]/td[1]";
        return Driver.getDriver().findElement(By.xpath(companyPath));
    }


}
