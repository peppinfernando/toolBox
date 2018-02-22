package com.portal.toolbox.pages;

import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartNewApplicationPage extends AbstractPage {


    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement startnewapplicationButton() {
        return waitAndFindElement(By.xpath("//button[@class='cta-button_ePghbC smd-full_25pML3 smd-block_1edpIO']"));

    }


    public WebElement agreementCheckbox() {
        return waitAndFindElement(By.id("agreement"));
    }

    public WebElement letStartButton() {
        return waitAndFindElement(By.id("submit"));
    }
}
