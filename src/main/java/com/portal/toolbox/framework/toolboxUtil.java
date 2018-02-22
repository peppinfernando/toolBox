package com.portal.toolbox.framework;

import com.portal.toolbox.Util.RandomGenerator;
import com.portal.toolbox.pages.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class toolboxUtil extends AbstractPage {
    private YourDetailsPage YourDetailsPage = new YourDetailsPage();
    private LoginPage loginPage = new LoginPage();
    private StartNewApplicationPage startNewApplication = new StartNewApplicationPage();
    private GetStartedPage getStartedPage = new GetStartedPage();
    private BusinessContactPage businessContactPage = new BusinessContactPage();
    private YourBusinessPage yourBusinessPage = new YourBusinessPage();
    private YourTeamPage yourTeamPage = new YourTeamPage();
    private ManageAccountPage manageAccountPage = new ManageAccountPage();

//    public void fillYourdetails()
//    {
//        YourDetailsPage.waitForPageLoad();
//        YourDetailsPage.carRegistrationNumberTextField().sendKeys("ABC123");
//        YourDetailsPage.findCarButton().click();
//        new Select( YourDetailsPage.mileageDropdown()).selectByValue("17000");
//        YourDetailsPage.carValueTextbox().sendKeys("5000");
//        new Select(YourDetailsPage.vehiclePurchaseDatemonthDropdown()).selectByValue("03");
//        new Select(YourDetailsPage.vehiclePurchaseDateyearDropdown()).selectByValue("2011");
//        new Select(YourDetailsPage.coverDateDayDropdown()).selectByValue("01");
//        new Select(YourDetailsPage.coverDateMonthDropdown()).selectByValue("03");
//        new Select(YourDetailsPage.coverDateYearDropdown()).selectByValue("2018");
//        YourDetailsPage.aboutYouNextButton().click();
//        System.out.println("URL : "+ getDriver.getCurrentUrl());
//    }

    public void login(String credencial) {
        loginPage.emailTextFiled().sendKeys(credencial.split(",")[0]);
        loginPage.passwordTextFiled().sendKeys(credencial.split(",")[1]);
        loginPage.loginButton().click();
    }

    public void startNewApplication(String personalDetails, String organizationDetail, String businessDetails, String businessfinancials, String teamDetals, String manageAccounts) {
        waitForPageLoad();
        waitForMoreTime();
        startNewApplication.startnewapplicationButton().click();
        startNewApplication.agreementCheckbox().click();
        startNewApplication.letStartButton().click();
        getStarted(personalDetails, organizationDetail);
        businessContact(businessDetails);
        businessfinancials(businessfinancials);
        enterAboutYou(personalDetails, teamDetals);
        manageaccounts(manageAccounts);

    }

    public void getStarted(String personalDetails, String organizationDetail) {

        waitForPageLoad();
        waitForMoreTime();
        waitForMoreTime();
        waitForMoreTime();
        waitForMoreTime();

        new Select(getStartedPage.selectTitle()).selectByVisibleText(personalDetails.split(",")[0]);
        getStartedPage.firstnameTextfield().sendKeys(personalDetails.split(",")[1]);
        getStartedPage.lastnamenameTextfield().sendKeys(personalDetails.split(",")[2]);
        getStartedPage.ukbasedRadioYes().click();
        new Select(getStartedPage.businessTypeSelect()).selectByVisibleText(organizationDetail.split(",")[1]);
        getStartedPage.nextButton().click();

    }

    public void businessContact(String businessDetails) {
        waitForPageLoad();
        waitForMoreTime();
        waitForMoreTime();
        businessContactPage.businessCalledTextbox().sendKeys(businessDetails.split(",")[0]);
//        System.out.println(businessDetails.split(",")[1]);
        if ((businessDetails.split(",")[1]).equals("Yes")) {
            businessContactPage.radioHasothertradingnameYes().click();
        } else if ((businessDetails.split(",")[1]).equals("No")) {
            businessContactPage.radioHasothertradingnameNo().click();
        }
        businessContactPage.buildingNameandNumber().sendKeys(businessDetails.split(",")[2]);
        businessContactPage.postCode().sendKeys(businessDetails.split(",")[3]);
        businessContactPage.findAddressButton().click();
        businessContactPage.radioCorrespondenceaddressSameasTradeYes().click();
        businessContactPage.nextButon().click();
    }

    public void businessfinancials(String businessfinancials) {
        int businessValue = Integer.parseInt(businessfinancials.split(",")[0]);
        setBusinessValue(businessValue);
        new Select(yourBusinessPage.selectStartTradingMonth()).selectByVisibleText(businessfinancials.split(",")[1]);
        new Select(yourBusinessPage.selectStartTradingYear()).selectByVisibleText(businessfinancials.split(",")[2]);
        new Select(yourBusinessPage.selectMonthAtFinancialYearEnds()).selectByVisibleText(businessfinancials.split(",")[3]);
        yourBusinessPage.totalNumberOfEmployees().sendKeys(businessfinancials.split(",")[4]);
        yourBusinessPage.sicDescription().sendKeys(businessfinancials.split(",")[5]);
        waitForPageLoad();
        yourBusinessPage.sicOption().click();
        yourBusinessPage.describeHowYouDoAndOperate().sendKeys(RandomGenerator.randomString(120));
        yourBusinessPage.radioBusinessNotFacingLegalProceedings().click();
        yourBusinessPage.nextButton().click();
        waitForPageLoad();
        waitForMoreTime();
        waitForMoreTime();
        waitForMoreTime();
        waitForMoreTime();
//        Type of payment
        if ((businessfinancials.split(",")[6]).equals("AllTransferNoCash")) {
            waitForPageLoad();
            waitForMoreTime();
            waitForMoreTime();
            yourBusinessPage.checkBoxTransfersFromUKBanks().click();
            yourBusinessPage.checkBoxCheques().click();
            yourBusinessPage.checkBoxCardPayments().click();
            yourBusinessPage.checkBoxDirectDebitAndStandingOrders().click();
        }

//        else if() { }
        yourBusinessPage.radioBusinessIsNotSeasonal().click();
        yourBusinessPage.radioBusinessDoesNotSendOrReceiveInternationalPayments().click();
        new Select(yourBusinessPage.selectCountryBusinessOwnsAssets()).selectByVisibleText(businessfinancials.split(",")[10]);
        yourBusinessPage.radioBusinessIsNotRegisteredToPayTaxOutsideUK().click();
        yourBusinessPage.nextButton().click();

        waitForPageLoad();
        if ((businessfinancials.split(",")[12]).equals("existingbusrelationshipNo")) {
            yourBusinessPage.radioHasNoExistingRelationshipWithNatwest().click();
        }
        if ((businessfinancials.split(",")[13]).equals("SwitchYourBusinessAccountToUsNo")) {
            yourBusinessPage.radioSwitchYourBusinessAccountToUsNo().click();
        }
        if ((businessfinancials.split(",")[14]).equals("MoneyComingInNo")) {
            yourBusinessPage.radioIsMoneyComingInNo().click();
        }
        yourBusinessPage.nextButton().click();
    }


    public void enterAboutYou(String personalDetails, String teamDetals) {
        waitForPageLoad();

        new Select(yourTeamPage.selectDateOfBirth()).selectByVisibleText(teamDetals.split(",")[0]);
        new Select(yourTeamPage.selectMonthOfBirth()).selectByVisibleText(teamDetals.split(",")[1]);
        new Select(yourTeamPage.selectYearOfBirth()).selectByVisibleText(teamDetals.split(",")[2]);
        yourTeamPage.enterEmailId().sendKeys(RandomGenerator.randomEmailAddress(6));
        new Select(yourTeamPage.selectCountryCode()).selectByVisibleText(teamDetals.split(",")[3]);
        yourTeamPage.enterMobileNumber().sendKeys(RandomGenerator.randomInteger(10));
        //Enter Additional Information
        if ((teamDetals.split(",")[4]).equalsIgnoreCase("Male"))
            yourTeamPage.radioGenderMale().click();
        else
            yourTeamPage.radioGenderFeMale().click();
        new Select(yourTeamPage.selectCountryOfBirth()).selectByVisibleText(teamDetals.split(",")[5]);
        yourTeamPage.enterBirthTown().sendKeys((teamDetals.split(",")[6]));

        //for radio button of NATWEST account
        if ((teamDetals.split(",")[7]).equalsIgnoreCase("personalaccountYes"))
            yourTeamPage.radioHoldNatwestAccYes().click();
        else
            yourTeamPage.radioHoldNatwestAccNo().click();
        new Select(yourTeamPage.selectMonthOfStartingWork()).selectByVisibleText(teamDetals.split(",")[8]);
        new Select(yourTeamPage.selectYearOfStartingWork()).selectByVisibleText(teamDetals.split(",")[9]);
        //Are you registered to pay tax outside of the UK?
        if ((teamDetals.split(",")[10]).equalsIgnoreCase("PayTaxOutUKYes"))
            yourTeamPage.radioRegisteredToPayTaxOutUKYes().click();
        else
            yourTeamPage.radioRegisteredToPayTaxOutUKNo().click();
        //nationality
        new Select(yourTeamPage.selectNationality()).selectByVisibleText((teamDetals.split(",")[11]));
        //building number
        yourTeamPage.enterBuildingNumber().sendKeys(teamDetals.split(",")[12]);
        yourTeamPage.enterPostCode().sendKeys(teamDetals.split(",")[13]);
        yourTeamPage.homeAddressSeachButton().click();
        new Select(yourTeamPage.selectMonthMovingIntoAddress()).selectByVisibleText("July");
        new Select(yourTeamPage.selectYearMovingIntoAddress()).selectByVisibleText("2014");
        yourTeamPage.nextButton().click();
    }

    //Manage Account Page


    public void manageaccounts(String manageAccounts) {

        waitForPageLoad();
        waitForMoreTime();
        if (manageAccounts.split(",")[0].equalsIgnoreCase("checkPaperStatementsYes")) {
            manageAccountPage.checkPaperStatements().click();
            new Select(manageAccountPage.selectStatementFrequency()).selectByVisibleText(manageAccounts.split(",")[1]);
            manageAccountPage.selectPreferedStatementDate("6");
            new Select(manageAccountPage.selectAccessibleOptions()).selectByVisibleText("None");

        }
        if (manageAccounts.split(",")[2].equalsIgnoreCase("checkPayingInBookYes")) {
            manageAccountPage.checkPayingInBook().click();
        }
        if (manageAccounts.split(",")[3].equalsIgnoreCase("checkChequeBookYes")) {
            manageAccountPage.checkChequeBook().click();
        }

        if (manageAccounts.split(",")[4].equalsIgnoreCase("radioAdditionalAccYes")) {
            manageAccountPage.radioAdditionalAccYes();
            manageAccountPage.enterAccName().sendKeys(RandomGenerator.randomInteger(7));
        } else {
            manageAccountPage.radioAdditionalAccNo().click();
        }
        manageAccountPage.nextButton().click();

        enterAdditionalProducts(manageAccounts.split(",")[5]);
    }

    public void enterAdditionalProducts(String addtionalProducts) {
        String[] productList = addtionalProducts.split("-");
        System.out.println(productList.length);
        for (int i = 0; i < productList.length; i++) {
            String strProductType = productList[i];
            System.out.println(productList[i]);
            switch (strProductType) {
                case "Overdraft":
                    manageAccountPage.checkOverdraft().click();
                    break;
                case "BusinessCreditCard":
                    manageAccountPage.checkBusinessCreditCard().click();
                    break;
                case "BusinessReserveDepositAccount":
                    manageAccountPage.checkBusinessReverseDepositAccount().click();
                    break;
                case "AcceptPaymentsFromYourCustomers":
                    manageAccountPage.checkAcceptPaymentsFromYourCustomers().click();
                    break;
                case "FreeAgentCloudBasedAccountancySoftware":
                    manageAccountPage.checkFreeAgent().click();
                    break;
            }
        }
        manageAccountPage.nextButton().click();
    }


    public void setBusinessValue(int businessValue) {
        int actualAmount;
        do {
            String text = yourBusinessPage.turnoverTitle().getText();
            String amount[] = text.split("£");
            String turnoverAmount = amount[1].replaceAll(",", "");
            turnoverAmount = turnoverAmount.replaceAll("\\+", "");
            actualAmount = Integer.parseInt(turnoverAmount);
            if (actualAmount < businessValue) {
                yourBusinessPage.incrementControl().click();
            } else if (actualAmount > businessValue) {
                yourBusinessPage.decrementControl().click();
            }
        } while (actualAmount != businessValue);
    }


}

