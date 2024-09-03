package com.eurotech.pages;

import com.eurotech.utility.BrowserUtils;
import com.eurotech.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(className = "nav__menu-item")
    public List<WebElement> menuList;
    @FindBy(css = "h1[class='large text-primary']")
    public WebElement pageHeader;
    @FindBy(css = ".alert.alert-success")
    public WebElement alertSuccessMessage;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement menuBar(String menu) {
        String menuPath = "//a[.='" + menu + "']";
        return Driver.getDriver().findElement(By.xpath(menuPath));
    }

    public WebElement subMenuBar(String subMenu) {
        WebElement myAccount = Driver.getDriver().findElement(By.xpath("//span[.='My Account']"));
        BrowserUtils.hover(myAccount);
        String subMenuPath = "//span[text()='" + subMenu + "']";
        return Driver.getDriver().findElement(By.xpath(subMenuPath));
    }

    public void logout() {
        subMenuBar("Logout").click();
    }

}
