package com.eurotech.pages;

import com.eurotech.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEducationPage extends BasePage {

    @FindBy(css = "[type='submit']")
    public WebElement submitButton;

    public WebElement inputField(String fieldName) {
        String fieldPath = "//*[@name='" + fieldName + "']";
        return Driver.getDriver().findElement(By.xpath(fieldPath));
    }

    public void setYear(String year) {
        int firstYear = Integer.parseInt(inputField("year").getAttribute("value"));
        for (int i = 0; i < firstYear; i++) {
            inputField("year").sendKeys(Keys.ARROW_LEFT);
            //value=0
        }
        int intYear = Integer.parseInt(year);
        for (int i = 0; i < intYear; i++) {
            inputField("year").sendKeys(Keys.ARROW_RIGHT);
        }
    }


}
