package com.portal.toolbox.pages;

import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetStartedPage extends AbstractPage {


    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement selectTitle() {
        return waitForElementPresent(By.name("title"));
    }

    public WebElement firstnameTextfield() {
        return waitForElementPresent(By.id("first-name"));
    }

    public WebElement middlenameTextfield() {
        return waitForElementPresent(By.id("middle-name"));
    }

    public WebElement lastnamenameTextfield() {
        return waitForElementPresent(By.name("lname"));
    }

    public WebElement ukbasedRadioYes() {
        return waitForElementPresent(By.id("is-uk-based-option-0"));
    }

    public WebElement ukbasedRadioNo() {
        return waitForElementPresent(By.id("is-uk-based-option-1"));
    }

    public WebElement businessTypeSelect() {
        return waitForElementPresent(By.id("business-type"));
    }

    public WebElement nextButton() {
        return waitAndFindElement(By.id("submit"));
    }

}
