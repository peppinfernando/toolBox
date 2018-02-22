package com.portal.toolbox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.portal.toolbox.framework.AbstractPage;

public class ReviewApplicationPage extends AbstractPage {
    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement ConfirmAndSubmitButton() {
        return waitAndFindElement(By.id("submit"));
    }

    public WebElement backButton() {
        return waitAndFindElement(By.id("back"));
    }

}
