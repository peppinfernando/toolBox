package com.portal.toolbox.pages;

import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class YourBusinessPage extends AbstractPage {
    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement annualTournoverDrag() {
        return waitAndFindElement(By.id("//div[@class='slider-control__thumb_38Z4NY']"));
    }

    public WebElement turnoverTitle() {
        return waitAndFindElement(By.id("turnover-title"));
    }

    public WebElement incrementControl() {
        return waitAndFindElement(By.xpath("//button[@class='cta-button_ePghbC slider-control__inc-btn_2vRpIr']"));
    }

    public WebElement decrementControl() {
        return waitAndFindElement(By.xpath("//button[@class='cta-button_ePghbC slider-control__dec-btn_2vRpIr']"));
    }


    public WebElement selectStartTradingMonth() {
        return waitAndFindElement(By.id("field-dateStartedTrading-month"));
    }

    public WebElement selectStartTradingYear() {
        return waitAndFindElement(By.id("field-dateStartedTrading-year"));
    }

    public WebElement selectMonthAtFinancialYearEnds() {
        return waitAndFindElement(By.id("field-financialYearEnd-month"));
    }

    public WebElement totalNumberOfEmployees() {
        return waitAndFindElement(By.id("field-fullTimeEmployees"));
    }

    public WebElement sicDescription() {
        return waitAndFindElement(By.id("field-sicCode"));
    }

    public WebElement sicOption() {
        return waitAndFindElement(By.xpath("//div[contains(@id,'field-sicCode-option-')]"));
    }

    public WebElement describeHowYouDoAndOperate() {
        return waitAndFindElement(By.id("field-tradingDescription"));
    }

    public WebElement businessWebsiteUrl() {
        return waitAndFindElement(By.id("field-businessUrl"));
    }

    public WebElement radioBusinessFacingLegalProceedings() {
        return waitAndFindElement(By.id("field-hasLegalProceedings-option-0"));
    }

    public WebElement radioBusinessNotFacingLegalProceedings() {
        return waitAndFindElement(By.id("field-hasLegalProceedings-option-1"));
    }

    public WebElement nextButton() {
        return waitAndFindElement(By.id("submit"));
    }

    public WebElement backButton() {
        return waitAndFindElement(By.id("back"));
    }

    //2nd Page starts here
    public WebElement checkBoxTransfersFromUKBanks() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.ukElectronicPayments"));
    }

    public WebElement checkBoxCheques() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cheques"));
    }

    public WebElement checkBoxCardPayments() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cardPayments"));
    }

    public WebElement checkBoxDirectDebitAndStandingOrders() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.directDebit"));
    }

    public WebElement checkBoxCashPayout() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cashOut"));
    }

    public WebElement selectPercentageOfCash() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cashIn.businessTurnoverValue"));
    }

    public WebElement incomeStreamForBusiness() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cashIn.cashSourceDescription.value"));
    }

    public WebElement selectDailyPecentageOfCashPayments() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cashIn.cashPaidPercentage.value"));
    }

    public WebElement selectHowOftenYouDepositCashIntoThisAccount() {
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cashIn.cashPaidFrequency.value"));
    }

    public WebElement radioBusinessIsSeasonal() {
        return waitAndFindElement(By.id("businessDetails.hasFluctuations-option-0"));
    }

    public WebElement radioBusinessIsNotSeasonal() {
        return waitAndFindElement(By.id("businessDetails.hasFluctuations-option-1"));
    }

    public WebElement radioBusinessSendsOrReceiveInternationalPayments() {
        return waitAndFindElement(By.id("field-hasNonUKRelationship-option-0"));
    }

    public WebElement radioBusinessDoesNotSendOrReceiveInternationalPayments() {
        return waitAndFindElement(By.id("field-hasNonUKRelationship-option-1"));
    }

    public WebElement selectCountryBusinessOwnsAssets() {
        return waitAndFindElement(By.id("field-AssetListIterated-0-null"));
    }

    public WebElement AddCountryLink() {
        return waitAndFindElement(By.xpath("//span[contains(text(),'Add country')]"));
    }

    public WebElement radioBusinessIsRegisteredToPayTaxOutsideUK() {
        return waitAndFindElement(By.id("field-isRegisteredForNonUKTax-option-0"));
    }

    public WebElement radioBusinessIsNotRegisteredToPayTaxOutsideUK() {
        return waitAndFindElement(By.id("field-isRegisteredForNonUKTax-option-1"));
    }

    //3rd Page: 'Your Business Account' starts here
    public WebElement radioHasExistingRelationshipWithNatwest() {
        return waitAndFindElement(By.id("field-has-existing-relationship-option-0"));
    }

    public WebElement radioHasNoExistingRelationshipWithNatwest() {
        return waitAndFindElement(By.id("field-has-existing-relationship-option-1"));
    }

    public WebElement radioSwitchYourBusinessAccountToUsYes() {
        return waitAndFindElement(By.id("field-isSwitcher-option-0"));
    }

    public WebElement radioSwitchYourBusinessAccountToUsNo() {
        return waitAndFindElement(By.id("field-isSwitcher-option-1"));
    }

    public WebElement radioIsMoneyComingInYes() {
        return waitAndFindElement(By.id("businessDetails.hasInitialDeposit-option-0"));
    }

    public WebElement radioIsMoneyComingInNo() {
        return waitAndFindElement(By.id("businessDetails.hasInitialDeposit-option-1"));
    }

    public WebElement NatwestAccountNumber() {
        return waitAndFindElement(By.id("textField-259"));
    }

    public WebElement NatwestSortCode() {
        return waitAndFindElement(By.id("sortcode-260-part1"));
    }
}
