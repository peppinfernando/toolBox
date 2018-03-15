package com.portal.toolbox.framework;

import com.portal.toolbox.Util.GlobalVariables;
import com.portal.toolbox.Util.RandomGenerator;
import com.portal.toolbox.pages.*;
import jdk.nashorn.internal.objects.Global;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class toolboxUtil extends AbstractPage {
    protected static final Logger LOG = LoggerFactory.getLogger(toolboxUtil.class);

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
//        startNewApplication.startnewapplicationButton().click();
//        startNewApplication.agreementCheckbox().click();
//        startNewApplication.letStartButton().click();
        getStarted(personalDetails, organizationDetail);
        businessContact(businessDetails);
        businessfinancials(businessfinancials);
        enterAboutYou(personalDetails, teamDetals);
        manageaccounts(manageAccounts);

    }
/*
    public void getStarted(String personalDetails, String entity) {

        waitForPageLoad();
        waitForMoreTime(3);


        new Select(getStartedPage.selectTitle()).selectByVisibleText(personalDetails.split(",")[0]);
        getStartedPage.firstnameTextfield().sendKeys(personalDetails.split(",")[1]);
        getStartedPage.lastnamenameTextfield().sendKeys(personalDetails.split(",")[2]);
        getStartedPage.ukbasedRadioYes().click();
        // new Select(getStartedPage.businessTypeSelect()).selectByVisibleText(organizationDetail.split(",")[0]);
        if ((entity.split(",")[0]).equals("Trust")) {
            new Select(getStartedPage.businessTypeSelect()).selectByVisibleText(entity.split(",")[0]);
            new Select(getStartedPage.selectTrustType()).selectByVisibleText(entity.split(",")[1]);
            if(!(getStartedPage.areYouCharityRegisteredRadioYes()==null)){
                if ((entity.split(",")[2]).equals("Yes")) {
                    getStartedPage.areYouCharityRegisteredRadioYes().click();
                    getStartedPage.yourCharityRegisteredNumberField().sendKeys(entity.split(",")[4]);
                    getStartedPage.nextButton().click();
                } else if ((entity.split(",")[3]).equals("No")) {
                    getStartedPage.areYouCharityRegisteredRadioNo().click();
                    getStartedPage.nextButton().click();
                }

            }
            getStartedPage.nextButton().click();

        }
    }*/


public void getStarted(String personalDetails, String entity) {

    waitForPageLoad();
    waitForMoreTime();

    new Select(getStartedPage.selectTitle()).selectByVisibleText(personalDetails.split(",")[0]);
    getStartedPage.firstnameTextfield().sendKeys(personalDetails.split(",")[1]);
    getStartedPage.lastnamenameTextfield().sendKeys(personalDetails.split(",")[2]);
    getStartedPage.ukbasedRadioYes().click();
    logCaseDeatils(entity);
    new Select(getStartedPage.businessTypeSelect()).selectByVisibleText(entity.split(",")[0]);
    if ((entity.split(",")[0]).equals("Trust")) {
      //  new Select(getStartedPage.businessTypeSelect()).selectByVisibleText(entity.split(",")[0]);
        new Select(getStartedPage.selectTrustType()).selectByVisibleText(entity.split(",")[1]);
        if (!(getStartedPage.areYouCharityRegisteredRadioYes() == null)) {
            if ((entity.split(",")[2]).equals("Yes")) {
                getStartedPage.areYouCharityRegisteredRadioYes().click();
                getStartedPage.yourCharityRegisteredNumberField().sendKeys(entity.split(",")[4]);
                getStartedPage.nextButton().click();
            } else if ((entity.split(",")[3]).equals("No")) {
                getStartedPage.areYouCharityRegisteredRadioNo().click();
                getStartedPage.nextButton().click();
            }

        }

        if (!(getStartedPage.radioSchemeProvideRetirementBenefitsForEmployeesYes() == null)) {
            if ((entity.split(",")[2]).equals("Yes")) {
                getStartedPage.radioSchemeProvideRetirementBenefitsForEmployeesYes().click();
                if ((entity.split(",")[2]).equals("Yes")) {
                    getStartedPage.radioYourPensionSchemeRegisteredWithHMRCYes().click();
                } else {
                    getStartedPage.radioYourPensionSchemeRegisteredWithHMRCNo().click();
                }
            } else if ((entity.split(",")[3]).equals("No")) {
                getStartedPage.radioSchemeProvideRetirementBenefitsForEmployeesNo().click();
                getStartedPage.nextButton().click();
                if ((entity.split(",")[2]).equals("Yes")) {
                    getStartedPage.radioYourPensionSchemeRegisteredWithHMRCYes().click();
                } else {
                    getStartedPage.radioYourPensionSchemeRegisteredWithHMRCNo().click();
                }
            }
        }
        // getStartedPage.nextButton().click();

    }
    else if (!(getStartedPage.areYouCharityRadioYes() == null)) {
        if ((entity.split(",")[2]).equals("Yes")) {
            getStartedPage.areYouCharityRadioYes().click();
            if ((entity.split(",")[2]).equals("Yes")) {
                getStartedPage.areYouCharityRegisteredRadioYes().click();
                getStartedPage.yourCharityRegisteredNumberField().sendKeys(entity.split(",")[4]);
            } else if ((entity.split(",")[3]).equals("No")) {
                getStartedPage.areYouCharityRegisteredRadioNo().click();
                getStartedPage.nextButton().click();
            }

        } else if ((entity.split(",")[3]).equals("No")) {
            getStartedPage.areYouCharityRadioNo().click();
        }
    }

    getStartedPage.nextButton().click();
}


    public void businessContact(String businessDetails) {
        /*waitForPageLoad();
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
        businessContactPage.nextButon().click();*/


        {
            waitForPageLoad();
            waitForMoreTime();
            waitForMoreTime();
            waitForMoreTime();
            getStartedPage.yourOrganisationCalledField().sendKeys(businessDetails.split(",")[0]);
            if ((businessDetails.split(",")[1]).equals("Yes")) {
                getStartedPage.yourOrganisationHaveAnyOtherTradingNamesOrAliasesYes().click();
                getStartedPage.otherNamesDoesYourOrganisationUseField().sendKeys(businessDetails.split(",")[3]);
            } else  {
                getStartedPage.yourOrganisationHaveAnyOtherTradingNamesOrAliasesNo().click();
            }getStartedPage.tradingBuildingNameandNumber().sendKeys(businessDetails.split(",")[4]);
            getStartedPage.tradingPostcode().sendKeys(businessDetails.split(",")[5]);
            getStartedPage.findAdrressClick().click();
            if ((businessDetails.split(",")[2]).equals("No")) {
                getStartedPage.radioCorrespondenceAddressNo().click();
                getStartedPage.enterBuildingNumberForCorrespondenceAddressField().sendKeys(businessDetails.split(",")[4]);
                getStartedPage.enterPostCodeForCorrespondenceAddressField().sendKeys(businessDetails.split(",")[5]);
                getStartedPage.findCorrespondenceAdrressClick().click();
            } else if ((businessDetails.split(",")[1]).equals("Yes")) {
                getStartedPage.radioCorrespondenceAddressYes().click();
            }
            getStartedPage.nextButton().click();
        }
    }

    public void businessFinancials(String businessfinancials) {
        int businessValue = Integer.parseInt(businessfinancials.split(",")[0]);
        setBusinessValue(businessValue);
        new Select(yourBusinessPage.selectStartTradingMonth()).selectByVisibleText(businessfinancials.split(",")[1]);
        new Select(yourBusinessPage.selectStartTradingYear()).selectByVisibleText(businessfinancials.split(",")[2]);
        /*if(isElementDisplayed(yourBusinessPage.totalNumberOfEmployees())){
            yourBusinessPage.totalNumberOfEmployees().sendKeys(businessfinancials.split(",")[3]);
        }*/
        if(!(yourBusinessPage.selectMonthAtFinancialYearEnds()==null)){
            new Select(yourBusinessPage.selectMonthAtFinancialYearEnds()).selectByVisibleText(businessfinancials.split(",")[1]);
        }

        if(!(yourBusinessPage.sicDescription()==null)){
            yourBusinessPage.sicDescription().sendKeys("Tour");
            waitForPageLoad();
            yourBusinessPage.sicOption().click();
        }

        if(!(yourBusinessPage.totalNumberOfEmployees()==null)){
            yourBusinessPage.totalNumberOfEmployees().sendKeys(businessfinancials.split(",")[3]);
        }

        yourBusinessPage.describeHowYouDoAndOperate().sendKeys(RandomGenerator.randomString(120));
        /*if(businessfinancials.split(",")[4].equalsIgnoreCase("YesClassofBeneficiaries")){
            yourBusinessPage.raidoYesTrustBeneficiaries().click();
            yourBusinessPage.textBeneficiaries().sendKeys("ClassBenfencicary"+RandomGenerator.randomString(6));

        }
        else{
            yourBusinessPage.raidoNoTrustBeneficiaries().click();
        }*/
        if(!(yourBusinessPage.raidoYesTrustBeneficiaries()==null)) {
           if(businessfinancials.split(",")[4].equalsIgnoreCase("YesClassofBeneficiaries")) {
               yourBusinessPage.raidoYesTrustBeneficiaries().click();
               yourBusinessPage.textBeneficiaries().sendKeys("ClassBenfencicary"+ RandomGenerator.randomString(6));

           }
            else{
                     yourBusinessPage.raidoNoTrustBeneficiaries().click(); }
            }

               if(!(yourBusinessPage.beneficiariesOfYourOrganisation()==null)){
                    yourBusinessPage.beneficiariesOfYourOrganisation().sendKeys(businessfinancials.split(",")[5]);
            }


        yourBusinessPage.businessWebsiteUrl().sendKeys(businessfinancials.split(",")[6]);
        if ((businessfinancials.split(",")[7]).equals("Yes")) {
            yourBusinessPage.radioBusinessFacingLegalProceedings().click();
            yourBusinessPage.detailsOfTheArrearsOrLegalProceedings().sendKeys(businessfinancials.split(",")[8]);
        } else {
            yourBusinessPage.radioBusinessNotFacingLegalProceedings().click();
        }
        yourBusinessPage.nextButton().click();
        waitForPageLoad();
        waitForMoreTime();
    }


    public void businessPayments(String businesspayment) {
        waitForPageLoad();
        waitForMoreTime();
        //(businessOrganisationPayments.split(",")[0]).equals("Transfers from UK banks")
        yourBusinessPage.checkBoxTransfersFromUKBanks().click();
        yourBusinessPage.checkBoxCheques().click();
        yourBusinessPage.checkBoxCardPayments().click();
        yourBusinessPage.checkBoxDirectDebitAndStandingOrders().click();
        yourBusinessPage.checkBoxCashPayout().click();
        yourBusinessPage.enterPercentageOfAllTransactionsGoingOutOfYourNewAccountWillBeCashPaymentsField().sendKeys(businesspayment.split(",")[0]);
        yourBusinessPage.checkBoxCashPaidIn().click();
       new Select (yourBusinessPage.cashPaidInturnover()).selectByValue("$string".replace("$",businesspayment.split(",")[1]));
       // new Select (yourBusinessPage.selectPercentageOfCash()).selectByIndex(7);
        yourBusinessPage.incomeStreamForBusiness().sendKeys(RandomGenerator.randomString(120));
        new Select (yourBusinessPage.selectDailyPecentageOfCashPayments()).selectByVisibleText(businesspayment.split(",")[2]);
        new Select (yourBusinessPage.selectHowOftenYouDepositCashIntoThisAccount()).selectByVisibleText(businesspayment.split(",")[3]);

        if ((businesspayment.split(",")[4]).equals("Yes")) {
            yourBusinessPage.radioBusinessIsSeasonal().click();
            yourBusinessPage.whenOrganisationIsBusyOrQuietTimesOfTheYearField().sendKeys(businesspayment.split(",")[6]);
        } else {
            yourBusinessPage.radioBusinessIsNotSeasonal().click();
        }

        if ((businesspayment.split(",")[4]).equals("Yes")) {
            yourBusinessPage.radioBusinessSendsOrReceiveInternationalPayments().click();
            yourBusinessPage.checkboxSendPaymentOverseas().click();
            new Select(yourBusinessPage.selectLocationToSendPaymentsFromOverseas()).selectByVisibleText(businesspayment.split(",")[7]);
            yourBusinessPage.enterPercentageOfTotalPaymentsSendFromthisField().sendKeys(businesspayment.split(",")[8]);
            if((businesspayment.split(",")[9]).equals("Other")){
                new Select(yourBusinessPage.selectNatureAndPurposeOfPaymentsSend()).selectByVisibleText(businesspayment.split(",")[9]);
                yourBusinessPage.enterTheNatureAndPurposeofYourOtherPaymentsMadeForPaymentsSendFromOverseasField().sendKeys("TestTEst");
            }
            else
            {
                new Select(yourBusinessPage.selectNatureAndPurposeOfPaymentsSend()).selectByVisibleText(businesspayment.split(",")[9]);
            }

            yourBusinessPage.checkboxRecievePaymentFromOverseas().click();
            new Select(yourBusinessPage.selectLocationToRecievePaymentsFromOverseas()).selectByVisibleText(businesspayment.split(",")[10]);
            yourBusinessPage.enterPercentageOfTotalPaymentsRecievedFromthisField().sendKeys(businesspayment.split(",")[11]);
            if((businesspayment.split(",")[12]).equals("Other")){
                new Select (yourBusinessPage.selectNatureAndPurposeOfPaymentsRecieved()).selectByVisibleText(businesspayment.split(",")[12]);
                yourBusinessPage.enterTheNatureAndPurposeofYourOtherPaymentsMadeForPaymentsRecieveFromOverseasField().sendKeys("TestTest");
            }
            else {
                new Select (yourBusinessPage.selectNatureAndPurposeOfPaymentsRecieved()).selectByVisibleText(businesspayment.split(",")[12]);
            }

            yourBusinessPage.checkboxOnwersBasedOutOfUK().click();
            new Select(yourBusinessPage.selectLocationForOnwersBasedOutOfUK()).selectByVisibleText(businesspayment.split(",")[13]);
            new Select(yourBusinessPage.selectCountryBusinessOwnsAssets()).selectByVisibleText(businesspayment.split(",")[14]);

        } else {
            yourBusinessPage.radioBusinessDoesNotSendOrReceiveInternationalPayments().click();
            new Select(yourBusinessPage.selectCountryBusinessOwnsAssets()).selectByVisibleText(businesspayment.split(",")[14]);
        }

        if ((businesspayment.split(",")[4]).equals("Yes")) {
            yourBusinessPage.radioBusinessIsRegisteredToPayTaxOutsideUK().click();
            new Select(yourBusinessPage.selectOtherCountryResidentToPayTax()).selectByVisibleText(businesspayment.split(",")[15]);
            //new Select(yourBusinessPage.selectOtherCountryResidentToPayTax()).selectByIndex(6);
            yourBusinessPage.enterYourTaxIdentificationNumber().sendKeys(businesspayment.split(",")[16]);
            //yourBusinessPage.enterYourTaxIdentificationNumber().sendKeys("12345");
            yourBusinessPage.nextButton().click();
        }
        else {
            yourBusinessPage.radioBusinessIsNotRegisteredToPayTaxOutsideUK().click();
            yourBusinessPage.nextButton().click();
        }

    }

    public void businessAccount( String businessaccount) {
        waitForPageLoad();
        waitForMoreTime();
        waitForMoreTime();
        /*     Existing Banking Relationships starts here*/
        if ((businessaccount.split(",")[0]).equals("Yes")) {
            yourBusinessPage.radioHasExistingRelationshipWithNatwest().click();
            yourBusinessPage.enterYourMainOrganisationCurrentAccountDetails().sendKeys(businessaccount.split(",")[2]);
            yourBusinessPage.enterSortCodePart1().sendKeys(businessaccount.split(",")[3]);
            yourBusinessPage.enterSortCodePart2().sendKeys(businessaccount.split(",")[4]);
            yourBusinessPage.enterSortCodePart3().sendKeys(businessaccount.split(",")[5]);
        } else {
            yourBusinessPage.radioHasNoExistingRelationshipWithNatwest().click();
        }

        /* Switch Business Account from other Bank in UK Start here */

        if ((businessaccount.split(",")[0]).equals("Yes")) {
            yourBusinessPage.radioSwitchYourBusinessAccountToUsYes().click();
            new Select(yourBusinessPage.selectFinancialInstitutionAreYouSwitchingFrom()).selectByVisibleText(businessaccount.split(",")[6]);
            new Select(yourBusinessPage.selectSwitchingBank()).selectByVisibleText(businessaccount.split(",")[7]);
            yourBusinessPage.enterTotalAmountOfBorrowingYouHaveInCurrentBank().clear();
            yourBusinessPage.enterTotalAmountOfBorrowingYouHaveInCurrentBank().sendKeys(businessaccount.split(",")[8]);
            waitForMoreTime(1);
            if ((businessaccount.split(",")[1]).equals("No")) {
                yourBusinessPage.radioBorrowingAgainstAnySecurityWithYourCurrentBankNo().click();
                yourBusinessPage.radioYouLikeUsToDoTheSwitchingForYouYes().click();
                if ((businessaccount.split(",")[9]).equals("Full Switch Service")) {
                    yourBusinessPage.radioFullSwitchService().click();
                }
                else {
                    yourBusinessPage.radioPartialSwitchService().click();
                }
            }
            else{
                yourBusinessPage.radioBorrowingAgainstAnySecurityWithYourCurrentBankYes().click();
                yourBusinessPage.radioYouLikeUsToDoTheSwitchingForYouNo().click();
            }
        }
        else
        {
            yourBusinessPage.radioSwitchYourBusinessAccountToUsNo().click();
        }
        if ((businessaccount.split(",")[0]).equals("Yes")) {
            yourBusinessPage.radioIsMoneyComingInYes().click();
            yourBusinessPage.enterWhoWillMakePaymentsToYourAccountField().sendKeys(businessaccount.split(",")[10]);
            yourBusinessPage.cashCheckBox().click();
            yourBusinessPage.enterTotalAmountOfCashThatWillBePaidInField().sendKeys(businessaccount.split(",")[11]);
            yourBusinessPage.transferFromUKBankCheckBox().click();
            yourBusinessPage.enterAmountTransferedUKField().sendKeys(businessaccount.split(",")[12]);
            yourBusinessPage.transferFromNonUKBankCheckBox().click();
            yourBusinessPage.enterAmountTransferedNonUkField().sendKeys(businessaccount.split(",")[13]);
            yourBusinessPage.enterNameOfTheBankNameTheTransferMadeFromField().sendKeys(businessaccount.split(",")[14]);
            new Select(yourBusinessPage.selectCountryBankBasedIn()).selectByVisibleText(businessaccount.split(",")[15]);
            yourBusinessPage.enterNameOfThePersonMakingTransferField().sendKeys(businessaccount.split(",")[16]);
            if((businessaccount.split(",")[0]).equals("Yes")){
                yourBusinessPage.radioPersonAssociatedWithYourAccountYes().click();
                yourBusinessPage.enterReasonforNonUKBankTransferField().sendKeys(RandomGenerator.randomString(120));
                new Select(yourBusinessPage.selectFromWhereWillThisCashComeFrom()).selectByVisibleText(businessaccount.split(",")[17]);
                yourBusinessPage.enterPleaseProvideMoreDetailsField().sendKeys(RandomGenerator.randomString(120));
                new Select(yourBusinessPage.selectBankOrBuildingSocietyWillTransferMadeFrom()).selectByVisibleText(businessaccount.split(",")[18]);
                yourBusinessPage.enternameAccountOrAccountHolderWillBeSendingMoneyField().sendKeys(businessaccount.split(",")[19]);
                yourBusinessPage.nextButton().click();
            }

            else{
                yourBusinessPage.radioPersonAssociatedWithYourAccountNo().click();
                yourBusinessPage.enterRelationshipBetweenPersonAndOrganisationField().sendKeys(RandomGenerator.randomString(120));
                yourBusinessPage.enterReasonforNonUKBankTransferField().sendKeys(RandomGenerator.randomString(120));
                new Select(yourBusinessPage.selectFromWhereWillThisCashComeFrom()).selectByVisibleText(businessaccount.split(",")[17]);
                yourBusinessPage.enterPleaseProvideMoreDetailsField().sendKeys(RandomGenerator.randomString(120));
                new Select(yourBusinessPage.selectBankOrBuildingSocietyWillTransferMadeFrom()).selectByVisibleText(businessaccount.split(",")[18]);
                yourBusinessPage.enternameAccountOrAccountHolderWillBeSendingMoneyField().sendKeys(businessaccount.split(",")[19]);
                yourBusinessPage.nextButton().click();
            }

        } else {
            yourBusinessPage.radioIsMoneyComingInNo().click();
        }
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
            if(!(manageAccountPage.checkChequeBook() == null)) {
                 manageAccountPage.checkChequeBook().click();
                 manageAccountPage.enterNameOnChequeBook().sendKeys(manageAccounts.split(",")[3]);
                 manageAccountPage.enterAdditionalNameChequeBook().sendKeys(manageAccounts.split(",")[3]);;
            }
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
        //manageAccountPage.nextButton().click();
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


// # Newly created

//-----------------------------------------------------------------

    public void agreement() {
        waitForPageLoad();
        waitForMoreTime(3);

        startNewApplication.startnewapplicationButton().click();
        startNewApplication.agreementCheckbox().click();
        startNewApplication.letStartButton().click();

    }

    public void yourbusiness(String businessfinancials, String businesspayment, String businessaccount) {


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

//        Type of payment
        if ((businesspayment.split(",")[0]).equals("AllTransferNoCash")) {
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
        new Select(yourBusinessPage.selectCountryBusinessOwnsAssets()).selectByVisibleText(businesspayment.split(",")[4]);
        yourBusinessPage.radioBusinessIsNotRegisteredToPayTaxOutsideUK().click();
        yourBusinessPage.nextButton().click();

        waitForPageLoad();
        if ((businessaccount.split(",")[0]).equals("existingbusrelationshipNo")) {
            yourBusinessPage.radioHasNoExistingRelationshipWithNatwest().click();
        }
        if ((businessaccount.split(",")[1]).equals("SwitchYourBusinessAccountToUsNo")) {
            yourBusinessPage.radioSwitchYourBusinessAccountToUsNo().click();
        }
        if ((businessaccount.split(",")[2]).equals("MoneyComingInNo")) {
            yourBusinessPage.radioIsMoneyComingInNo().click();
        }
        yourBusinessPage.nextButton().click();
    }



    public void youteam(String teamdetails, String acountpermission) {
        waitForPageLoad();
        enterKPDetails(teamdetails,teamdetails.split(",")[0]);

         if(!(yourTeamPage.radiosharingOrganisatioNo()==null)){
            yourTeamPage.radiosharingOrganisatioNo().click();
        }
        if(!(yourTeamPage.selectKeyPartner()==null)){
            new Select(yourTeamPage.selectKeyPartner()).selectByIndex(1);

        }
        yourTeamPage.nextButton().click();
    }



    public void manageyouraccounts(String accountservices, String addtionalproducts) {
        waitForPageLoad();
        waitForMoreTime();
        String SignatoryLimits=accountservices.split(",")[6];
        String unlimtedAomount=accountservices.split(",")[5];
        if(unlimtedAomount.toString().contains("yes")){
            if(!(manageAccountPage.radioSignatoriesForUnlimitedAmountsNo()==null)){
                manageAccountPage.radioSignatoriesForUnlimitedAmountsNo().click();
            }
        }
        else {

            if (!(manageAccountPage.radioSignatoriesForUnlimitedAmountsNo() == null)) {
                manageAccountPage.radioSignatoriesForUnlimitedAmountsNo().click();
            }
        }
        if(!(manageAccountPage.signatoryOptions()==null)){
            new Select(manageAccountPage.signatoryOptions()).selectByVisibleText(SignatoryLimits);
        }


        if(SignatoryLimits.equalsIgnoreCase("Other")){
            if(!( manageAccountPage.txtotherSigningRules()==null)){
                manageAccountPage.txtotherSigningRules().sendKeys("test");
            }

        }


        if (accountservices.split(",")[7].toLowerCase().contains("no")) {
            if(!( manageAccountPage.radiolimitOnMoneyNo() ==null)) {
                  manageAccountPage.radiolimitOnMoneyNo().click();
                  if(!( manageAccountPage.radioSignatoryGroupsNo() ==null)) {
                    manageAccountPage.radioSignatoryGroupsNo().click();
                      if (!( manageAccountPage.txtotherSigningRules() ==null)){
                          manageAccountPage.txtotherSigningRules().sendKeys("test");
                      }
                }
            }

        }
        else {
            if(accountservices.split(",")[7].toLowerCase().contains("yes")){
                if (!(manageAccountPage.radiolimitOnMoneyYes() == null)) {
                    manageAccountPage.radiolimitOnMoneyYes().click();
                }


                if(!( manageAccountPage.txtSignatoryGroupLimit()==null)){
                    manageAccountPage.txtSignatoryGroupLimit().clear();
                    manageAccountPage.txtSignatoryGroupLimit().sendKeys("400");
                }

                if(accountservices.split(",")[8].contains("Yes")){
                    manageAccountPage.radioSignatoryGroupsYes().click();
                    if(!( manageAccountPage.txtCreateGroupName()==null)){
                        manageAccountPage.txtCreateGroupName().clear();
                        manageAccountPage.txtCreateGroupName().sendKeys("group1");
                        if(!( manageAccountPage.txtotherSigningRules()==null)) {
                            manageAccountPage.txtotherSigningRules().sendKeys("test");
                        }
                    }


                }
                else
                {
                    manageAccountPage.radioSignatoryGroupsNo();
                }

                manageAccountPage.txtotherSigningRules().sendKeys("test");

            }


        }
        if (accountservices.split(",")[7].toLowerCase().contains("no")) {
            if(!( manageAccountPage.radioSignatoriesForUnlimitedAmountsNo() ==null)) {
                manageAccountPage.radioSignatoriesForUnlimitedAmountsNo().click();
                if (!(manageAccountPage.radioSignatoryGroupsNo() == null)) {
                    manageAccountPage.radioSignatoryGroupsNo().click();
                    if (!(manageAccountPage.txtotherSigningRules() == null)) {
                        manageAccountPage.txtotherSigningRules().sendKeys("test");
                    }
                }
            }
        }
        else if(accountservices.split(",")[5].toLowerCase().contains("no")){
            if(!( manageAccountPage.radioSignatoriesForUnlimitedAmountsYes() ==null)) {
                manageAccountPage.radioSignatoriesForUnlimitedAmountsYes().click();
            }
        }

        if(accountservices.split(",")[9].contains("yes")) {
            if (!(manageAccountPage.radiofurtherInformationYes() == null)) {
                manageAccountPage.radiofurtherInformationYes().click();
            }
        }

        else if(!(manageAccountPage.radiofurtherInformationNo() == null)) {
                  manageAccountPage.radiofurtherInformationNo().click();
        }

        manageAccountPage.nextButton().click();

        waitForPageLoad();
        waitForMoreTime();
        if (accountservices.split(",")[0].equalsIgnoreCase("checkPaperStatementsYes")) {
            manageAccountPage.checkPaperStatements().click();
            new Select(manageAccountPage.selectStatementFrequency()).selectByVisibleText(accountservices.split(",")[1]);
            manageAccountPage.selectPreferedStatementDate("6");
            new Select(manageAccountPage.selectAccessibleOptions()).selectByVisibleText("None");

        }
        if (accountservices.split(",")[2].equalsIgnoreCase("checkPayingInBookYes")) {
            manageAccountPage.checkPayingInBook().click();
        }
        /*if (accountservices.split(",")[3].equalsIgnoreCase("checkChequeBookYes")) {
            manageAccountPage.checkChequeBook().click();
        }*/

        if (accountservices.split(",")[3].equalsIgnoreCase("checkChequeBookYes")) {
            if(!(manageAccountPage.checkChequeBook() == null)) {
                manageAccountPage.checkChequeBook().click();
                if(!(manageAccountPage.enterNameOnChequeBook() == null)) {
                    manageAccountPage.enterNameOnChequeBook().sendKeys(accountservices.split(",")[3]);
                    manageAccountPage.enterAdditionalNameChequeBook().sendKeys(accountservices.split(",")[3]);
                }
            }
        }

        if (accountservices.split(",")[4].equalsIgnoreCase("radioAdditionalAccYes")) {
            manageAccountPage.radioAdditionalAccYes();
            manageAccountPage.enterAccName().sendKeys(RandomGenerator.randomInteger(7));
        } else {
            manageAccountPage.radioAdditionalAccNo().click();
        }

        manageAccountPage.nextButton().click();
       // enterAdditionalProducts(addtionalproducts);

        waitForPageLoad();
        waitForMoreTime();
        if(!( manageAccountPage.checkboxApplyForBusinessReserveDepositAccount() ==null)) {
            manageAccountPage.checkboxApplyForBusinessReserveDepositAccount().click();
            }

        manageAccountPage.nextButton().click();
        enterAdditionalProducts(addtionalproducts);
    }

    public void enterKPDetails(String teamdetails,String numOfKPS){
         int numofkps=Integer.parseInt(numOfKPS);

         if(teamdetails.split(",")[1].contains(";")){
            String[] KPdetails=teamdetails.split(",")[1].split(";");
            if(numofkps==KPdetails.length){
                for(int j=0;j<=KPdetails.length-1;j++) {
                    new Select(yourTeamPage.selectTitle()).selectByVisibleText(teamdetails.split(",")[2]);
                    GlobalVariables.firstname = RandomGenerator.randomString(5);
                    yourTeamPage.firstnameTextfield().sendKeys(GlobalVariables.firstname);
                    GlobalVariables.lastname = RandomGenerator.randomString(5);
                    yourTeamPage.lastnamenameTextfield().sendKeys(GlobalVariables.lastname);
                    new Select(yourTeamPage.selectDateOfBirth()).selectByVisibleText(teamdetails.split(",")[3]);
                    new Select(yourTeamPage.selectMonthOfBirth()).selectByVisibleText(teamdetails.split(",")[4]);
                    new Select(yourTeamPage.selectYearOfBirth()).selectByVisibleText(teamdetails.split(",")[5]);

                    String[] orgPositions = KPdetails[j].split("_");
                    for (int i = 1; i <= orgPositions.length - 1; i++) {
                        selectPositions(orgPositions[i]);

                    }
                    yourTeamPage.nextButton().click();
                    personalDeatils(teamdetails, orgPositions);

                    if (j < KPdetails.length - 1) {
                        yourTeamPage.buttonAddKeyIndivdual().click();
                    }

                }
            }
            else{
                LOG.error("number of KPS and Arguments passed are not same");
             }


        }
        else{

             new Select(yourTeamPage.selectTitle()).selectByVisibleText(teamdetails.split(",")[2]);
             GlobalVariables.firstname= RandomGenerator.randomString(5);
             yourTeamPage.firstnameTextfield().sendKeys(GlobalVariables.firstname);
             GlobalVariables.lastname=RandomGenerator.randomString(5);
             yourTeamPage.lastnamenameTextfield().sendKeys(GlobalVariables.lastname);
             new Select(yourTeamPage.selectDateOfBirth()).selectByVisibleText(teamdetails.split(",")[3]);
             new Select(yourTeamPage.selectMonthOfBirth()).selectByVisibleText(teamdetails.split(",")[4]);
             new Select(yourTeamPage.selectYearOfBirth()).selectByVisibleText(teamdetails.split(",")[5]);

             String[] orgPositions=teamdetails.split(",")[1].split("_");
             for(int i=1;i<=orgPositions.length-1;i++){
                 selectPositions(orgPositions[i]);

             }
             yourTeamPage.nextButton().click();
             personalDeatils(teamdetails,orgPositions);
         }


    }

    public void selectPositions(String position){


        switch( position.toLowerCase().trim() ){

            case "sign":
                if(!(yourTeamPage.checkBoxSignatory()==null)){
                    yourTeamPage.checkBoxSignatory().click();
                }

                break;
            case "controller":
                if(!(yourTeamPage.checkBoxSignificantController()==null)){
                    yourTeamPage.checkBoxSignificantController().click();
                }

                break;

            case "trustee":
                if(!(yourTeamPage.checkBoxTrustee()==null)){
                    yourTeamPage.checkBoxTrustee().click();
                }

                break;
            case "setalive":
                if(!(yourTeamPage.checkBoxSettlorAlive()==null)){
                    yourTeamPage.checkBoxSettlorAlive().click();
                }

                break;

            case "setdeceased":
                if(!(yourTeamPage.checkBoxSettlorDeceased()==null)){
                    yourTeamPage.checkBoxSettlorDeceased().click();
                }

                break;

            case "executor":
                if(!(yourTeamPage.checkBoxExecutor()==null)){
                    yourTeamPage.checkBoxExecutor().click();
                }

                break;
            case "protector":
                if(!(yourTeamPage.checkBoxProtector()==null)){
                    yourTeamPage.checkBoxProtector().click();
                }

                break;
            case "director":
                if(!(yourTeamPage.checkBoxDirector()==null)){
                    yourTeamPage.checkBoxDirector().click();
                }

                break;
            case "senior":
                if(!(yourTeamPage.checkBoxSeniorPerson()==null)){
                    yourTeamPage.checkBoxSeniorPerson().click();
                }

                break;
            case "settlor":
                if(!(yourTeamPage.checkBoxSettlor()==null)){
                    yourTeamPage.checkBoxSettlor().click();
                }

                break;
            default:

                LOG.warn("Position is not available,Implement in selectPositions");


        }
    }

    public void personalDeatils(String teamdetails,String[] orgPositions) {
        yourTeamPage.enterEmailId().sendKeys(RandomGenerator.randomEmailAddress(6));
        if (orgPositions[0].equalsIgnoreCase("UK")) {
            new Select(yourTeamPage.selectCountryCode()).selectByVisibleText(teamdetails.split(",")[6]);
            yourTeamPage.enterMobileNumber().sendKeys(RandomGenerator.randomInteger(10));
            new Select(yourTeamPage.selectCountryOfBirth()).selectByVisibleText(teamdetails.split(",")[8]);
            yourTeamPage.enterBirthTown().sendKeys((teamdetails.split(",")[9]));


        } else {
            new Select(yourTeamPage.selectCountryCode()).selectByVisibleText("+65");
            yourTeamPage.enterMobileNumber().sendKeys(RandomGenerator.randomInteger(10));
            new Select(yourTeamPage.selectCountryOfBirth()).selectByVisibleText("Singapore");
            yourTeamPage.enterBirthTown().sendKeys("Hougang");

        }

       if ((teamdetails.split(",")[7]).equalsIgnoreCase("Male"))
            yourTeamPage.radioGenderMale().click();
        else
            yourTeamPage.radioGenderFeMale().click();


        if ((teamdetails.split(",")[10]).equalsIgnoreCase("personalaccountYes"))
            yourTeamPage.radioHoldNatwestAccYes().click();
        else
            yourTeamPage.radioHoldNatwestAccNo().click();
        new Select(yourTeamPage.selectMonthOfStartingWork()).selectByVisibleText(teamdetails.split(",")[11]);
        new Select(yourTeamPage.selectYearOfStartingWork()).selectByVisibleText(teamdetails.split(",")[12]);
        //Are you registered to pay tax outside of the UK?
        if ((teamdetails.split(",")[13]).equalsIgnoreCase("PayTaxOutUKYes"))
            yourTeamPage.radioRegisteredToPayTaxOutUKYes().click();
        else
            yourTeamPage.radioRegisteredToPayTaxOutUKNo().click();
        //nationality
        if (orgPositions[0].equalsIgnoreCase("UK")) {
            new Select(yourTeamPage.selectNationality()).selectByVisibleText((teamdetails.split(",")[14]));

        } else {
            new Select(yourTeamPage.selectNationality()).selectByVisibleText("Singapore");
        }

        //building number
        yourTeamPage.enterBuildingNumber().sendKeys(teamdetails.split(",")[15]);
        yourTeamPage.enterPostCode().sendKeys(teamdetails.split(",")[16]);
        yourTeamPage.homeAddressSeachButton().click();
        new Select(yourTeamPage.selectMonthMovingIntoAddress()).selectByVisibleText("July");
        new Select(yourTeamPage.selectYearMovingIntoAddress()).selectByVisibleText("2014");
        yourTeamPage.nextButton().click();

    }

    /*public void entreAddress(String adressDetails){


    //random,predefinedaddress
        if((adressDetails.toLowerCase().equalsIgnoreCase("findaddress"))){
            getStartedPage.tradingBuildingNameandNumber().sendKeys("77C");
            getStartedPage.tradingPostcode().sendKeys(adressDetails.split(",")[5]);
            getStartedPage.findAdrressClick().click();
        }
        else {
            getStartedPage.clickToEnterAddressManually().click();
            getStartedPage.enterRegAdrressLine1().sendKeys();
            getStartedPage.enterRegAdrressLine2().sendKeys();
            getStartedPage.enterRegAdrressLine3().sendKeys();
            getStartedPage.enterRegAdrressLine4().sendKeys();
            getStartedPage.enterRegPostCode().sendKeys();
        }
        if ((businessDetails.split(",")[2]).equals("No")) {
            getStartedPage.radioCorrespondenceAddressNo().click();
            if((businessDetails.split(",")[4]).equalsIgnoreCase("77")) {
                getStartedPage.enterBuildingNumberForCorrespondenceAddressField().sendKeys(businessDetails.split(",")[4]);
                getStartedPage.enterPostCodeForCorrespondenceAddressField().sendKeys(businessDetails.split(",")[5]);
                getStartedPage.findCorrespondenceAdrressClick().click();
            }
            else{
                getStartedPage.clickToEnterCorresAddressManually().click();
                getStartedPage.enterCorresAdrressLine1().sendKeys(businessDetails.split(",")[6]);
                getStartedPage.enterCorresAdrressLine2().sendKeys(businessDetails.split(",")[7]);
                getStartedPage.enterCorresAdrressLine3().sendKeys(businessDetails.split(",")[8]);
                getStartedPage.enterCorresAdrressLine4().sendKeys(businessDetails.split(",")[9]);
                new Select (getStartedPage.selectCorresCountry()).selectByVisibleText(businessDetails.split(",")[10]);
                getStartedPage.enterPostCode().sendKeys(businessDetails.split(",")[5]);
            }
        }

    }*/
}

