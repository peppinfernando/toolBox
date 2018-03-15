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

    public WebElement selectTrustType(){
        return waitForElementPresent(By.id("trust-type"));
    }
    public WebElement areYouCharityRegisteredRadioYes(){return checkForElement(By.id("is-charity-registered-option-0")); }

    public WebElement areYouCharityRegisteredRadioNo(){return waitForElementPresent(By.id("is-charity-registered-option-1")); }

    public WebElement yourCharityRegisteredNumberField(){return waitForElementPresent(By.id("charity-reg-number")); }

    public WebElement yourCompanyRegisteredNumberField(){return waitForElementPresent(By.id("registrationNumber")); }

    public WebElement typeOfTrustYourSelect() {
        return waitForElementPresent(By.id("trust-type"));
    }

    public WebElement schemeProvideRetirementBenefitsForEmployeesYes(){ return waitForElementPresent(By.id("pension-scheme-option-0"));}

    public WebElement schemeProvideRetirementBenefitsForEmployeesNo(){ return waitForElementPresent(By.id("pension-scheme-option-1"));}

    public WebElement yourPensionSchemeRegisteredWithHMRCYes(){ return waitForElementPresent(By.id("is-pension-scheme-reg-option-0"));}

    public WebElement yourPensionSchemeRegisteredWithHMRCNo(){ return waitForElementPresent(By.id("is-pension-scheme-reg-option-1"));}

    public WebElement yourOrganisationCalledField(){ return waitForElementPresent(By.id("business-name"));}

    public WebElement yourOrganisationHaveAnyOtherTradingNamesOrAliasesYes(){ return waitForElementPresent(By.id("has-other-trading-name-option-0"));}

    public WebElement yourOrganisationHaveAnyOtherTradingNamesOrAliasesNo(){ return waitForElementPresent(By.id("has-other-trading-name-option-1"));}

    public WebElement otherNamesDoesYourOrganisationUseField(){return waitForElementPresent(By.id("other-trading-name"));}

    public WebElement tradingBuildingNameandNumber(){return waitForElementPresent(By.id("registered-address-finder-address"));}

    public WebElement tradingPostcode(){return waitForElementPresent(By.id("registered-address-finder-postcode"));}

    public WebElement findAdrressClick(){return waitForElementPresent(By.id("registered-address-search"));}

    public WebElement radioCorrespondenceAddressYes(){return waitForElementPresent(By.id("has-same-correspondence-address-option-0"));}

    public WebElement radioCorrespondenceAddressNo(){return waitForElementPresent(By.id("has-same-correspondence-address-option-1"));}

    public WebElement enterBuildingNumberForCorrespondenceAddressField(){
        return waitForElementPresent(By.id("correspondence-address-finder-address"));
    }

    public WebElement enterPostCodeForCorrespondenceAddressField(){
        return waitForElementPresent(By.id("correspondence-address-finder-postcode"));
    }

    public WebElement findCorrespondenceAdrressClick(){
        return waitForElementPresent(By.id("correspondence-address-search"));
    }



    public WebElement radioSchemeProvideRetirementBenefitsForEmployeesYes(){
        return checkForElement(By.id("pension-scheme-option-0"));
    }

    public WebElement radioSchemeProvideRetirementBenefitsForEmployeesNo(){
        return waitForElementPresent(By.id("pension-scheme-option-1"));
    }

    public WebElement radioYourPensionSchemeRegisteredWithHMRCYes(){
        return waitForElementPresent(By.id("is-pension-scheme-reg-option-0"));
    }

    public WebElement radioYourPensionSchemeRegisteredWithHMRCNo(){
        return waitForElementPresent(By.id("is-pension-scheme-reg-option-1"));
    }

    public WebElement detailsOfTheArrearsOrLegalProceedingsField(){return waitForElementPresent(By.id("field-legalProceedingsDescription"));}

    public WebElement areYouCharityRadioYes(){return checkForElement(By.id("are-you-a-charity-option-0")); }

    public WebElement areYouCharityRadioNo(){return waitForElementPresent(By.id("are-you-a-charity-option-1")); }





}
