package com.eurotech.pages;

import com.eurotech.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevelopersPage extends BasePage {

    @FindBy(id = "dualfilter-skills-btn")
    public WebElement skillButton;
    @FindBy(id = "singlefilter-input")
    public WebElement filterInput;
    @FindBy(id = "filter-selection-form-btn")
    public WebElement filterButton;

    //    @FindBy(xpath = "(//ul[@id='profile-item-detail-skills'])[1]")
//    public WebElement ersteSkill;
    public WebElement skill(int index) {
        String skillPath = "(//ul[@id='profile-item-detail-skills'])[" + index + "]";
        return Driver.getDriver().findElement(By.xpath(skillPath));
    }

    public WebElement name(int index) {
        String namePath = "(//h2[@id='profile-item-detail-name'])[" + index + "]";
        return Driver.getDriver().findElement(By.xpath(namePath));
    }


}
