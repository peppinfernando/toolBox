package com.portal.toolbox.pages;

import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BusinessContactPage extends AbstractPage {
    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement businessCalledTextbox() {
        return waitAndFindElement(By.id("business-name"));
    }

    public WebElement radioHasothertradingnameYes() {
        return waitAndFindElement(By.id("has-other-trading-name-option-0"));
    }

    public WebElement radioHasothertradingnameNo() {
        return waitAndFindElement(By.id("has-other-trading-name-option-1"));
    }

    public WebElement buildingNameandNumber() {
        return waitAndFindElement(By.id("registered-address-finder-address"));
    }

    public WebElement postCode() {
        return waitAndFindElement(By.id("registered-address-finder-postcode"));
    }

    public WebElement findAddressButton() {
        return waitAndFindElement(By.id("registered-address-search"));
    }


    public WebElement mannualAddressline1() {
        return waitAndFindElement(By.id("registered-address-line1"));
    }

    public WebElement mannualAddressline2() {
        return waitAndFindElement(By.id("registered-address-line2"));
    }

    public WebElement mannualAddressline3() {
        return waitAndFindElement(By.id("registered-address-line3"));
    }

    public WebElement mannualAddressline4() {
        return waitAndFindElement(By.id("registered-address-line4"));
    }


    public WebElement radioCorrespondenceaddressSameasTradeYes() {
        return waitAndFindElement(By.id("has-same-correspondence-address-option-0"));
    }

    public WebElement radioCorrespondenceaddressSameasTradeNo() {
        return waitAndFindElement(By.id("has-same-correspondence-address-option-1"));
    }

    public WebElement nextButon() {
        return waitAndFindElement(By.id("submit"));
    }

    public WebElement backButon() {
        return waitAndFindElement(By.id("back"));
    }


}
