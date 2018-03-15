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
        return checkForElement(By.id("field-financialYearEnd-month"));
    }

    public WebElement totalNumberOfEmployees() {
        return checkForElement(By.id("field-fullTimeEmployees"));
    }

    public WebElement sicDescription() {
        return checkForElement(By.id("field-sicCode"));
    }

    public WebElement sicOption() {
        return checkForElement(By.xpath("//div[contains(@id,'field-sicCode-option-')]"));
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

    public WebElement enterWhoWillMakePaymentsToYourAccountField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-individualName"));
    }

    public WebElement cashCheckBox(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-hasCashTransfer"));
    }

    public WebElement enterTotalAmountOfCashThatWillBePaidInField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-cashAmount.value"));
    }

    public WebElement transferFromUKBankCheckBox(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-hasUKTransfer"));
    }

    public WebElement enterAmountTransferedUKField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-ukBankAmount.value"));
    }

    public WebElement transferFromNonUKBankCheckBox(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-hasNonUKTransfer"));
    }

    public WebElement enterAmountTransferedNonUkField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.value"));
    }

    public WebElement enterNameOfTheBankNameTheTransferMadeFromField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.bankName"));
    }

    public WebElement selectCountryBankBasedIn(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.branchLocation"));
    }

    public WebElement enterNameOfThePersonMakingTransferField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.accountName"));
    }

    public WebElement radioPersonAssociatedWithYourAccountYes() {
        return waitAndFindElement(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.isNonAccountParty-option-0"));
    }

    public WebElement radioPersonAssociatedWithYourAccountNo() {
        return waitAndFindElement(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.isNonAccountParty-option-1"));
    }

    public WebElement enterReasonforNonUKBankTransferField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.sourceReason"));
    }

    public WebElement enterRelationshipBetweenPersonAndOrganisationField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-nonUKBankAmount.nonAccountPartyRelationship"));
    }

    public WebElement selectFromWhereWillThisCashComeFrom(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-cashAmount.cashSource"));
    }

    public WebElement enterPleaseProvideMoreDetailsField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-cashAmount.explanation"));
    }

    public WebElement selectBankOrBuildingSocietyWillTransferMadeFrom(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-ukBankAmount.bankName"));
    }


    public WebElement enternameAccountOrAccountHolderWillBeSendingMoneyField(){
        return waitForElementPresent(By.id("businessDetails.initialDeposit-0-ukBankAmount.accountName"));
    }



    public WebElement NatwestAccountNumber() {
        return waitAndFindElement(By.id("textField-259"));
    }

    public WebElement NatwestSortCode() {
        return waitAndFindElement(By.id("sortcode-260-part1"));
    }

    public WebElement enterYourMainOrganisationCurrentAccountDetails(){
        return waitForElementPresent(By.xpath("//div[@class='text-field_1u0KUy']/input"));
    }

    public WebElement enterSortCodePart1(){
        return waitForElementPresent(By.xpath("//input[contains(@id,'part1')]"));
    }

    public WebElement enterSortCodePart2(){
        return waitForElementPresent(By.xpath("//input[contains(@id,'part2')]"));
    }

    public WebElement enterSortCodePart3(){
        return waitForElementPresent(By.xpath("//input[contains(@id,'part3')]"));
    }

    public WebElement selectFinancialInstitutionAreYouSwitchingFrom(){
        return waitForElementPresent(By.id("currentFinancialInstitution"));
    }

    public WebElement selectSwitchingBank(){
        return waitForElementPresent(By.id("switchReason"));
    }

    public WebElement enterTotalAmountOfBorrowingYouHaveInCurrentBank(){
        return waitForElementPresent(By.id("current-borrow"));
    }

    public WebElement radioBorrowingAgainstAnySecurityWithYourCurrentBankYes(){
        return waitForElementPresent(By.id("borrow-against-security-option-0"));
    }

    public WebElement radioBorrowingAgainstAnySecurityWithYourCurrentBankNo(){
        return waitForElementPresent(By.id("borrow-against-security-option-1"));
    }

    public WebElement radioYouLikeUsToDoTheSwitchingForYouYes(){
        return waitForElementPresent(By.id("field-do-switching-option-0"));
    }

    public WebElement radioFullSwitchService(){
        return waitForElementPresent(By.xpath("//div[@class='radio_2FojFt']/input"));
    }

    public WebElement radioPartialSwitchService(){
        return waitForElementPresent(By.xpath("//*[contains(@value,'partialstring')]"));
    }

    public WebElement radioYouLikeUsToDoTheSwitchingForYouNo(){
        return waitForElementPresent(By.xpath("field-do-switching-option-0"));
    }
    /*public WebElement beneficiariesOfYourOrganisation(){return
            waitForElementPresent(By.id("field-beneficiaries"));
    }*/
    public WebElement beneficiariesOfYourOrganisation() {
        return checkForElement(By.id("field-beneficiaries"));
    }
    public WebElement detailsOfTheArrearsOrLegalProceedings(){ return waitForElementPresent(By.id("field-legalProceedingsDescription"));}

    public WebElement enterPercentageOfAllTransactionsGoingOutOfYourNewAccountWillBeCashPaymentsField(){
        return waitForElementPresent(By.id("businessDetails.accountPaymentTypes.cashOut.value"));
    }

    public WebElement checkBoxCashPaidIn(){
        return waitForElementPresent(By.id("businessDetails.accountPaymentTypes.cashIn"));
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

    public WebElement whenOrganisationIsBusyOrQuietTimesOfTheYearField(){
        return waitForElementPresent(By.id("businessDetails.fluctuationsExplanation"));
    }

    public WebElement radioBusinessSendsOrReceiveInternationalPayments() {
        return waitAndFindElement(By.id("field-hasNonUKRelationship-option-0"));
    }

    public WebElement radioBusinessDoesNotSendOrReceiveInternationalPayments() {
        return waitAndFindElement(By.id("field-hasNonUKRelationship-option-1"));
    }

    public WebElement checkboxSendPaymentOverseas(){
        return waitForElementPresent(By.id("field-nonUKRelationship-isPaymentsMade"));
    }

    public WebElement selectLocationToSendPaymentsFromOverseas(){
        return waitForElementPresent(By.xpath(" //div[@class='select_3wsCBZ select_selected-none_YZJvax hook-container']//*[@id=\"field-hasNonUKRelationship-paymentsMade-0-location\"]"));
    }

    public WebElement enterPercentageOfTotalPaymentsSendFromthisField(){
        return waitForElementPresent(By.xpath("//div[@label ='Percentage of total payments sent to this location']//div/input"));
    }

    public WebElement selectNatureAndPurposeOfPaymentsSend(){
        return waitForElementPresent(By.xpath("//div[@class='select_3wsCBZ select_selected-none_YZJvax hook-container']//*[@id=\"field-hasNonUKRelationship-paymentsMade-0-purpose\"]"));
    }

    public WebElement enterTheNatureAndPurposeofYourOtherPaymentsMadeForPaymentsSendFromOverseasField(){
        return waitForElementPresent(By.xpath("//div[@class='text-area_10tycZ text-area_state-error_13elyp']/textarea"));
    }

    public WebElement checkboxRecievePaymentFromOverseas(){
        return waitForElementPresent(By.id("field-nonUKRelationship-isPaymentsReceived"));
    }

    public WebElement selectLocationToRecievePaymentsFromOverseas() {
        return waitForElementPresent(By.xpath("(//*[@id='field-hasNonUKRelationship-paymentsMade-0-location'])[2]"));
    }

    public WebElement enterPercentageOfTotalPaymentsRecievedFromthisField(){
        return waitForElementPresent(By.xpath("(//*[@id='field-hasNonUKRelationship-paymentsMade-0-transactionAmount'])[2]"));
    }

    public WebElement selectNatureAndPurposeOfPaymentsRecieved(){
        return waitForElementPresent(By.xpath("(//*[@id='field-hasNonUKRelationship-paymentsMade-0-purpose'])[2]"));
    }

    public WebElement enterTheNatureAndPurposeofYourOtherPaymentsMadeForPaymentsRecieveFromOverseasField(){
        return waitForElementPresent(By.id(""));
    }

    public WebElement enterTotalPaymentsRecievedFromOverseasField(){
        return waitForElementPresent(By.id("field-hasNonUKRelationship-paymentsMade-0-transactionAmount-label"));
    }

    public WebElement checkboxOnwersBasedOutOfUK(){
        return waitForElementPresent(By.id("field-nonUKRelationship-isBeneficialOwners"));
    }

    public WebElement selectLocationForOnwersBasedOutOfUK(){
        return waitForElementPresent(By.id("field-hasNonUKRelationship-beneficialOwner-0-country"));
    }



    public WebElement selectOtherCountryResidentToPayTax(){
        return waitForElementPresent(By.id("registration-for-non-uk-tax-location-0"));
    }

    public WebElement enterYourTaxIdentificationNumber(){
        return waitForElementPresent(By.id("registration-for-non-uk-tax-tin-0"));
    }

    public WebElement cashPaidInturnover() {
        //String xpathFinal="//option[contains(@value,'$')]".replace("$",option);
        return waitAndFindElement(By.id("businessDetails.accountPaymentTypes.cashIn.businessTurnoverValue"));
    }
    public WebElement raidoYesTrustBeneficiaries() {
        return checkForElement(By.id("field-has-trust-beneficiaries-option-0"));
    }
    public WebElement raidoNoTrustBeneficiaries() {
        return waitAndFindElement(By.id("field-has-trust-beneficiaries-option-1"));
    }

    public WebElement textBeneficiaries() {
        return waitAndFindElement(By.id("field-class-beneficiaries-details"));
    }

}




