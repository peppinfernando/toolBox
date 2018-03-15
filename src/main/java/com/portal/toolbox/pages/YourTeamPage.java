package com.portal.toolbox.pages;


import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YourTeamPage extends AbstractPage {
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

    public WebElement selectDateOfBirth() {
        return waitAndFindElement(By.id("date-of-birth-day"));
    }

    public WebElement selectMonthOfBirth() {
        return waitAndFindElement(By.id("date-of-birth-month"));
    }

    public WebElement selectYearOfBirth() {
        return waitAndFindElement(By.id("date-of-birth-year"));
    }

    public WebElement enterEmailId() {
        return waitAndFindElement(By.id("email"));
    }

    public WebElement selectNationality() {
        return waitAndFindElement(By.id("nationality"));
    }

    public WebElement selectCountryCode() {
        return waitAndFindElement(By.id("country-calling-code"));
    }

    public WebElement enterMobileNumber() {
        return waitAndFindElement(By.id("phone"));
    }

    public WebElement radioGenderMale() {
        return waitAndFindElement(By.id("sex-option-0"));
    }

    public WebElement radioGenderFeMale() {
        return waitAndFindElement(By.id("sex-option-1"));
    }

    public WebElement selectCountryOfBirth() {
        return waitAndFindElement(By.id("country-of-birth"));
    }

    public WebElement enterBirthTown() {
        return waitAndFindElement(By.id("town-of-birth"));
    }

    public WebElement radioHoldNatwestAccYes() {
        return waitAndFindElement(By.id("has-personal-bank-account-option-0"));
    }

    public WebElement radioHoldNatwestAccNo() {
        return waitAndFindElement(By.id("has-personal-bank-account-option-1"));
    }

    public WebElement enterNatwestAccNumber() {
        return waitAndFindElement(By.id("bank-account-number"));
    }

    public WebElement selectMonthOfStartingWork() {
        return waitAndFindElement(By.id("time-in-business-month"));
    }

    public WebElement selectYearOfStartingWork() {
        return waitAndFindElement(By.id("time-in-business-year"));
    }

    public WebElement radioRegisteredToPayTaxOutUKYes() {
        return waitAndFindElement(By.id("taxes-outside-option-0"));
    }

    public WebElement radioRegisteredToPayTaxOutUKNo() {
        return waitAndFindElement(By.id("taxes-outside-option-1"));
    }

    public WebElement enterBuildingNumber() {
        return waitAndFindElement(By.id("home-address-finder-address"));
    }

    public WebElement enterPostCode() {
        return waitAndFindElement(By.id("home-address-finder-postcode"));
    }

    public WebElement homeAddressSeachButton() {
        return waitAndFindElement(By.id("home-address-search"));
    }


    public WebElement selectMonthMovingIntoAddress() {
        return waitAndFindElement(By.id("date-of-entry-month"));
    }

    public WebElement selectYearMovingIntoAddress() {
        return waitAndFindElement(By.id("date-of-entry-year"));
    }

    public WebElement nextButton() {
        return waitAndFindElement(By.id("submit"));
    }

    public WebElement backButton() {
        return waitAndFindElement(By.id("back"));
    }

    public WebElement checkBoxSignatory() {
        return checkForElement(By.xpath("//div[text()='Signatory']/../preceding-sibling::input"));
    }
    public WebElement checkBoxDirector() {
        return checkForElement(By.xpath("//div[text()='Director']/../preceding-sibling::input"));
    }
    public WebElement checkBoxSeniorPerson() {
        return checkForElement(By.xpath("//div[text()='Senior Person']/../preceding-sibling::input"));
    }
    public WebElement checkBoxSettlor() {
        return checkForElement(By.xpath("//div[text()='Settlor']/../preceding-sibling::input"));
    }

    public WebElement checkBoxSignificantController() {
        return checkForElement(By.xpath("//div[contains(text(),'Controller')]/../preceding-sibling::input"));
    }
    public WebElement checkBoxTrustee() {
        return checkForElement(By.xpath("//div[contains(text(),'Trustee')]/../preceding-sibling::input"));
    }
    public WebElement checkBoxSettlorAlive() {
        return checkForElement(By.xpath("//div[contains(text(),'Alive')]/../preceding-sibling::input"));
    }
    public WebElement checkBoxSettlorDeceased() {
        return checkForElement(By.xpath("//div[contains(text(),'Deceased')]/../preceding-sibling::input"));
    }
    public WebElement checkBoxExecutor() {
        return checkForElement(By.xpath("//div[contains(text(),'Executor')]/../preceding-sibling::input"));
    }
    public WebElement KPNameDeatils() {
        return checkForElement(By.xpath("//span[contains(@class,'small-kp__display-name')]"));
    }
    public WebElement checkBoxProtector() {
        return checkForElement(By.xpath("//div[contains(text(),'Protector')]/../preceding-sibling::input"));
    }

    public WebElement buttonAddKeyIndivdual() {
        return checkForElement(By.xpath("//*[contains(text(),'Add')]"));
    }

    public WebElement radiosharingOrganisatioNo() {return checkForElement(By.id("has-rbo-option-1"));}

    public WebElement radiosharingOrganisatioYes() {return checkForElement(By.id("has-rbo-option-0"));}

    public WebElement editButtonForAharingOrganisationYes() {return checkForElement(By.xpath("(//button[text()='Edit'])[3]"));}

    public WebElement selectKeyPartner() {
        return checkForElement(By.id("business-email"));
    }



}
