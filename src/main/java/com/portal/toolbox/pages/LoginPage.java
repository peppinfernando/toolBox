package com.portal.toolbox.pages;

import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {


    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement emailTextFiled() {
        return waitAndFindElement(By.id("login"));
    }

    public WebElement passwordTextFiled() {
        return waitAndFindElement(By.id("password"));
    }

    public WebElement loginButton() {
        return waitAndFindElement(By.id("submit"));
    }

    public WebElement forgotloginLink() {
        return waitAndFindElement(By.linkText("Forgotten password"));
    }
}
