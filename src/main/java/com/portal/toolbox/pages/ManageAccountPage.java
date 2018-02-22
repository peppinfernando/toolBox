package com.portal.toolbox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.portal.toolbox.framework.AbstractPage;

public class ManageAccountPage extends AbstractPage {
    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement checkPaperStatements() {
        return waitAndFindElement(By.id("paper-statement"));
    }

    public WebElement selectStatementFrequency() {
        return waitAndFindElement(By.id("statement-frequency"));
    }

    public WebElement selectPreferedStatementDate(String date) {
        //click on the calendar icon first
        getDriver.findElement(By.xpath("//div[@class='day-selector_kcP8Jn']")).click();
        return waitAndFindElement(By.xpath("//button[@id='statement-date-day-" + date + "']"));
        //return waitAndFindElement(By.xpath("//div[@value='Book']"));
    }

    public WebElement selectAccessibleOptions() {

        return waitAndFindElement(By.id("statement-accessible-opt"));
    }

    public WebElement checkPayingInBook() {
        return waitAndFindElement(By.id("paying-in-book"));
    }

    public WebElement radioAdditionalAccYes() {
        return waitAndFindElement(By.id("add-additional-acc-option-0"));
    }

    public WebElement radioAdditionalAccNo() {
        return waitAndFindElement(By.id("add-additional-acc-option-1"));
    }

    public WebElement enterAccName() {
        return waitAndFindElement(By.id("account-name-0"));
    }

    public WebElement checkPayingInBookForAdditionalAcc() {
        return waitAndFindElement(By.id("requires-paying-in-book-0"));
    }

    public WebElement checkChequeBook() {
        return waitAndFindElement(By.id("cheque-book"));
    }

    public WebElement nextButton() {
        return waitAndFindElement(By.id("submit"));
    }

    public WebElement backButton() {
        return waitAndFindElement(By.id("back"));
    }

    public WebElement checkOverdraft() {
        return waitAndFindElement(By.id("overdraft"));
    }

    public WebElement checkBusinessCreditCard() {
        return waitAndFindElement(By.id("credit-card"));
    }

    public WebElement checkBusinessReverseDepositAccount() {
        return waitAndFindElement(By.id("debit-account"));
    }

    public WebElement checkAcceptPaymentsFromYourCustomers() {
        return waitAndFindElement(By.id("worldpay"));
    }

    public WebElement checkFreeAgent() {
        return waitAndFindElement(By.id("free-agent"));
    }

}
