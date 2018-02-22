package com.portal.toolbox.pages;

import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YourDetailsPage extends AbstractPage {


    private static final int DRIVER_WAIT_TIME = 15;

    public WebElement quoteButton() {
        return waitAndFindElement(By.id("car-insurance/getquote"));
    }

   /* Your Car Section*/

    public WebElement carSelectionRadioField() {
        return waitForElementToBeClickableAndReturnElement(By.xpath("//label[@for='van-1']"));

    }

    public WebElement vanSelectionRadioField() {
        return waitAndFindElement(By.xpath("//label[@for='van-2']"));
    }

    public WebElement carRegistrationNumberTextField() {
        return waitForElementVisible(By.id("formField.vehicle.registration"));

    }

    public WebElement findCarButton() {
        return waitForElementPresent(By.xpath("//button[contains(.,'Find') and contains(.,'car')]"));
    }

    public WebElement lookupdetailButton() {
        return waitForElementPresent(By.xpath("//button[contains(.,'Look') and contains(.,'details')]"));
    }

    //car details validation
    public WebElement getCarMake() {
        return waitForElementPresent(By.xpath("//label[contains(.,'Make:')]/following-sibling::p"));
    }

    public WebElement getCarModel() {
        return waitForElementPresent(By.xpath("//label[contains(.,'Model:')]/following-sibling::p"));
    }

    public WebElement getCarType() {
        return waitForElementPresent(By.xpath("//label[contains(.,'Type:')]/following-sibling::p"));
    }

    public WebElement getCarYear() {
        return waitForElementPresent(By.xpath("//label[contains(.,'Year of Manufacture:')]/following-sibling::p"));
    }

    public WebElement dontknowyourReglink() {
        //return waitAndFindElement(By.xpath("//button[@class='innerLinkBold manualLabel']"));

        return waitAndFindElement(By.cssSelector(".innerLinkBold.manualLabel"));
    }

    public WebElement carMake() {
        return waitForElementPresent(By.id("formField.vehicle.manufacturer"));
    }

    public WebElement carModel() {
        return waitForUnstableElement(By.id("formField.vehicle.modelGen"));
    }

    public WebElement fuelPetrol() {
        return waitForElementPresent(By.xpath("//label[@for='formField.vehicle.engineType-1']"));
    }

    public WebElement fuelDiesel() {
        return waitForElementPresent(By.xpath("//label[@for='formField.vehicle.engineType-1']"));
    }

    public WebElement manual() {
        return waitForElementPresent(By.xpath("//label[@for='formField.vehicle.transmission-1']"));
    }

    public WebElement automatic() {
        return waitForElementPresent(By.xpath("//label[@for='formField.vehicle.transmission-1']"));
    }

    public WebElement yearOfManufacture() {
        return waitForElementPresent(By.id("formField.vehicle.year.year"));
    }

    public WebElement selectYourCar() {
        return waitForElementPresent(By.id("formField.vehicle.selected"));
    }


    public WebElement mileageDropdown() {
        return waitForElementPresent(By.id("formField.vehicle.mileage"));
    }

    public WebElement carValueTextbox() {
        return waitAndFindElement(By.id("formField.vehicle.value"));
    }

    public WebElement vehiclePurchaseDatemonthDropdown() {
        return waitForElementPresent(By.id("formField.vehiclePurchaseDate.month"));
    }

    public WebElement vehiclePurchaseDateyearDropdown() {
        return waitForElementPresent(By.id("formField.vehiclePurchaseDate.year"));
    }

    public WebElement vehicleNotYetPurchasedradio() {
        //return waitAndFindElement(By.xpath(".//*[@for=\"formField.vehicleNotYetPurchased\"]"));

        return waitAndFindElement(By.id("formField.vehicleNotYetPurchased"));
    }

    public WebElement coverDateDayDropdown() {
        return waitForElementPresent(By.id("formField.coverStartDate.day"));
    }

    public WebElement coverDateMonthDropdown() {
        return waitForElementPresent(By.id("formField.coverStartDate.month"));
    }

    public WebElement coverDateYearDropdown() {
        return waitForElementPresent(By.id("formField.coverStartDate.year"));
    }

    public WebElement yourCarNextButton() {
        return waitForUnstableElement(By.partialLinkText("Next"));
    }

    //(By.xpath(".//*[@data-update-style='primary']"));


/*  ------------------------------------------
    About you section
   ------------------------------------------*/

    public WebElement titleDropDown() {
        return waitForUnstableElement(By.id("formField.details.title"));
    }

    public WebElement firstnameTextField() {
        return waitAndFindElement(By.id("formField.details.forename"));
    }

    public WebElement lastNameTextField() {
        return waitAndFindElement(By.id("formField.details.surname"));
    }

    public WebElement DOBDateDropDown() {
        return waitForElementPresent(By.id("formField.details.birthDate.day"));
    }

    public WebElement DOBMonthDropDown() {
        return waitForElementPresent(By.id("formField.details.birthDate.month"));
    }

    public WebElement DOBYearDropDown() {
        return waitForElementPresent(By.id("formField.details.birthDate.year"));
    }

    public WebElement maritalStatusDropDown() {
        return waitForElementPresent(By.id("formField.maritalStatus"));
    }

    public WebElement occupationTextfield() {
        return waitForElementPresent(By.id("formField.details.occupation-text"));
    }

    public WebElement occupationSelectTextfield() {
        return waitForElementPresent(By.cssSelector(".entry.id-0"));
    }


    public WebElement licenceTypeDropDown() {
        return waitForElementPresent(By.id("formField.details.licenceType"));
    }

    public WebElement licencePeriodDropDown() {
        return waitForElementPresent(By.id("formField.details.licencePeriod"));
    }

    public WebElement livedUKSincebirthCheckBox() {
        return waitForElementPresent(By.id("formField.details.residentFromBirth"));
    }

    public WebElement livedUKMonthDropDown() {
        return waitForElementPresent(By.id("formField.details.residentFromDate.month"));
    }

    public WebElement livedUKYearDropDown() {
        return waitForElementPresent(By.id("formField.details.residentFromDate.year"));
    }

    /*claims*/
    public WebElement anyAccidentNORadio() {
        return waitForElementPresent(By.xpath("//label[@for='formField.details.anyClaims-2']"));
    }

    public WebElement anyAccidentYesRadio() {
        return waitForElementPresent(By.xpath("//label[@for='formField.details.anyClaims-1']"));
    }

    public WebElement claim1TypeDropdown(int i) {
        // return waitAndFindElement(By.id("formField.accident.code_0"));
        String id = "formField.accident.code_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement monthofclaim1Dropdown(int i) {
        //return waitAndFindElement(By.id("formField.accident.date.month_0"));

        String id = "formField.accident.date.month_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement yearofclaim1Dropdown(int i) {
        //return waitAndFindElement(By.id("formField.accident.date.year_0"));
        String id = "formField.accident.date.year_" + i;
        return waitForElementPresent(By.id(id));


    }

    public WebElement addanotherClaimlink() {
        return waitForUnstableElement(By.xpath("//a[contains(text(),'Add another claim')]"));

    }

    public WebElement claim2TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_1"));
    }

    public WebElement Monthofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_1"));
    }

    public WebElement yearofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_1"));
    }

    public WebElement claim3TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_2"));
    }

    public WebElement Monthofclaim3Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_2"));
    }

    public WebElement yearofclaim3Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_2"));
    }

    public WebElement claim4TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_3"));
    }

    public WebElement Monthofclaim4Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_3"));
    }

    public WebElement yearofclaim4Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_3"));
    }

    public WebElement claim5TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_4"));
    }

    public WebElement Monthofclaim5Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_4"));
    }

    public WebElement yearofclaim5Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_4"));
    }

    public WebElement aboutYouNextButton() {
        //return waitForElementPresent(By.partialLinkText("Next"));

        return waitForUnstableElement(By.cssSelector(".btn.cs-next-update.secondary.next-step"));
    }

    public WebElement aboutYouNextButton1() {
        return waitForElementPresent(By.partialLinkText("Next"));

        //return waitForUnstableElement(By.cssSelector(".btn.cs-next-update.secondary.next-step"));
    }

    /*convictions*/


    public WebElement anyConvictionsNORadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions-2']"));
    }

    public WebElement anyConvictionsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions-1']"));
    }

    public WebElement newConvictionTypeDropdown(int i) {
        //return waitAndFindElement(By.id("formField.conviction.code_0"));

        String id = "select.formField.conviction.code_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement oldConvictionTypeDropdown(int i) {
        //return waitAndFindElement(By.id("formField.conviction.code_0"));

        String id = "formField.conviction.code_" + i;
        return waitForElementPresent(By.id(id));
    }


    public WebElement monthofconviction1Dropdown(int i) {
        // return waitAndFindElement(By.id("formField.conviction.date.month_0"));

        String id = "formField.conviction.date.month_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement yearofconviction1Dropdown(int i) {
        //return waitAndFindElement(By.id("formField.conviction.date.year_0"));

        String id = "formField.conviction.date.year_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement conviction1pointsDropdown(int i) {
        //return waitAndFindElement(By.id("formField.conviction.points_0"));
        String id = "formField.conviction.points_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement banDurationconviction1Dropdown(int i) {
        //return waitAndFindElement(By.id("formField.conviction.banDuration_0"));
        String id = "formField.conviction.banDuration_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement addanotherConvictionlink() {
        //return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another conviction\")]"));
        return waitAndFindElement(By.xpath("//a[contains(text(),'Add another conviction')]"));

    }

    public WebElement conviction2TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_1"));
    }

    public WebElement Monthofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_1"));
    }

    public WebElement yearofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_1"));
    }

    public WebElement conviction2pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_1"));
    }

    public WebElement banDurationconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_1"));
    }

    public WebElement conviction3TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_2"));
    }

    public WebElement Monthofconviction3Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_2"));
    }

    public WebElement yearofconviction3Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_2"));
    }

    public WebElement conviction3pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_2"));
    }

    public WebElement banDurationconviction3Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_2"));
    }

    public WebElement conviction4TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_3"));
    }

    public WebElement Monthofconviction4Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_3"));
    }

    public WebElement yearofconviction4Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_3"));
    }

    public WebElement conviction4pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_3"));
    }

    public WebElement banDurationconviction4Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_3"));
    }

    public WebElement conviction5TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_4"));
    }

    public WebElement Monthofconviction5Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_4"));
    }

    public WebElement yearofconviction5Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_4"));
    }

    public WebElement conviction5pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_4"));
    }

    public WebElement banDurationconviction5Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_4"));
    }

    public WebElement insuranceMonthlyRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.childrenUnder16-2']"));
    }

    public WebElement insuranceAnnuallyRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.childrenUnder16-1']"));
    }


    /*-------------------------
        Addtional driver 1
    -------------------------*/
    public WebElement addtionaldriversYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.additionalDrivers-1']"));
    }

    public WebElement addtionaldriversNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.additionalDrivers-2']"));
    }

    public WebElement addtionalDriver1RelationDorpdown() {
        return waitForUnstableElement(By.id("formField.details.driverRelationId"));
    }
// additional driver details change

    public WebElement addtionalDriverTitleDropdown(int i) {
        String id = "formField.details.title_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement addtionalDriver1FirstnameField(int i) {

        String id = "formField.details.forename_" + i;
        return waitForElementPresent(By.id(id));
    }


    public WebElement addtionalDriver1LastnameField(int i) {

        String id = "formField.details.surname_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement addtionalDriver1DoBdayDropdown(int i) {

        String id = "formField.details.birthDate.day_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement addtionalDriver1DoBmonthDropdown(int i) {
        String id = "formField.details.birthDate.month_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement addtionalDriver1DoBYearDropdown(int i) {
        String id = "formField.details.birthDate.year_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement addtionalDriver1LivedUKSicebirthCheckBox(int i) {
        String id = "formField.details.residentFromBirth_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement addtionalDriver1LivedUKMonthDropDown(int i) {
        String id = "formField.details.residentFromDate.month_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement addtionalDriver1residentFromDateyearDown(int i) {
        String id = "formField.details.residentFromDate.year_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement addtionalDriver1OccupationDropdown(int i) {
        String id = "formField.details.occupation-text_" + i;
        return waitForElementPresent(By.id(id));

    }

    public WebElement addtionalDriver1occupationSelectTextfield(int i) {
        String id = ".entry.id-" + i;
        return waitForElementPresent(By.cssSelector(id));

    }

    public WebElement addtionalDriver1LicenceTypeDropdown(int i) {
        String id = "formField.details.licenceType_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement addtionalDriver1LicencePeriodDropdown(int i) {
        String id = "formField.details.licencePeriod_" + i;
        return waitForElementPresent(By.id(id));
    }

    public WebElement addtionalDriver1AnyclaimsYesRadio(int i) {

        String id = "formField.details.anyClaims_" + i + "-0";
        return waitForElementPresent(By.xpath(id));

    }

    public WebElement addtionalDriver1AnyclaimsNoRadio(int i) {
        String cssSelector = "[for='formField.details.anyClaims_" + i + "-1']";
        return waitForElementPresent(By.cssSelector(cssSelector));
        //return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_0-1']"));


    }

    public WebElement addtionalDriver1claim1TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_0_0"));
    }

    public WebElement addtionalDriver1Monthofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_0_0"));
    }

    public WebElement addtionalDriver1yearofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_0_0"));
    }

    public WebElement addtionalDriver1addanthorClaimlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another claim\")]"));
    }

    public WebElement addtionalDriver1claim2TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_1_0"));
    }

    public WebElement addtionalDriver1Monthofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_1_0"));
    }

    public WebElement addtionalDriver1yearofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_1_0"));
    }

    public WebElement addtionalDriver1AnyConvictionsNORadio(int i) {

        String cssSelector = "[for='formField.details.anyConvictions_" + i + "-1']";
        return waitForElementPresent(By.cssSelector(cssSelector));
        // return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_0-1']"));

    }

    public WebElement addtionalDriver1AnyConvictionsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_0-0']"));
    }

    public WebElement addtionalDriver1conviction1TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_0"));
    }

    public WebElement addtionalDriver1Monthofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_0_0"));
    }

    public WebElement addtionalDriver1yearofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_0_0"));
    }

    public WebElement addtionalDriver1conviction1pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_0_0"));
    }

    public WebElement addtionalDriver1banDurationconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_0_0"));
    }

    public WebElement addtionalDriver1addanthorConvictionlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another conviction\")]"));
    }

    public WebElement addtionalDriver1conviction2TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_0_1"));
    }

    public WebElement addtionalDriver1Monthofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_0_1"));
    }

    public WebElement addtionalDriver1yearofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_0_1"));
    }

    public WebElement addtionalDriver1conviction2pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_0_1"));
    }

    public WebElement addtionalDriver1banDurationconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_0_1"));
    }


    /*-------------------------
      Addtional driver 2
  -------------------------*/

    //a[contains(text(),'Add another driver')]


    public WebElement addAddtionalDriverButton() {
        return waitAndFindElement(By.xpath("//a[contains(text(),'Add another driver')]"));
    }

    public WebElement addtionalDriver2TitleDropdown() {
        return waitAndFindElement(By.id("formField.details.title_1"));
    }

    public WebElement addtionalDriver2FirstnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.forename_1"));
    }

    public WebElement addtionalDriver2LastnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.surname_1"));
    }

    public WebElement addtionalDriver2DoBdayDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.day_1"));
    }

    public WebElement addtionalDriver2DoBmonthDorpdown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_1"));
    }

    public WebElement addtionalDriver2DoBYearDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.year_1"));
    }

    public WebElement addtionalDriver2LivedUKSicebirthCheckBox() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.residentFromBirth_1']"));
    }

    public WebElement addtionalDriver2LivedUKMonthDropDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_1"));
    }

    public WebElement addtionalDriver2residentFromDateyearDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.year_1"));
    }

    public WebElement addtionalDriver2OccupationDorpdown() {
        return waitAndFindElement(By.id("formField.details.occupation-text_1"));
    }

    public WebElement addtionalDriver2LicenceTypeDorpdown() {
        return waitAndFindElement(By.id("formField.details.licenceType_1"));
    }

    public WebElement addtionalDriver2LicencePeriodDorpdown() {
        return waitAndFindElement(By.id("formField.details.licencePeriod_1"));
    }

    public WebElement addtionalDriver2AnyclaimsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_1-0']"));
    }

    public WebElement addtionalDriver2AnyclaimsNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_1-1']"));
    }

    public WebElement addtionalDriver2claim1TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_1_0"));
    }

    public WebElement addtionalDriver2Monthofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_1_0"));
    }

    public WebElement addtionalDriver2yearofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_1_0"));
    }

    public WebElement addtionalDriver2addanthorClaimlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another claim\")]"));
    }

    public WebElement addtionalDriver2claim2TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_1_1"));
    }

    public WebElement addtionalDriver2Monthofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_1_1"));
    }

    public WebElement addtionalDriver2yearofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_1_1"));
    }

    public WebElement addtionalDriver2AnyConvictionsNORadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_1-0']"));
    }

    public WebElement addtionalDriver2AnyConvictionsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_1-1']"));
    }

    public WebElement addtionalDriver2conviction1TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_1_0"));
    }

    public WebElement addtionalDriver2Monthofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_1_0"));
    }

    public WebElement addtionalDriver2yearofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_1_0"));
    }

    public WebElement addtionalDriver2conviction1pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_1_0"));
    }

    public WebElement addtionalDriver2banDurationconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_1_0"));
    }

    public WebElement addtionalDriver2addanthorConvictionlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another conviction\")]"));
    }

    public WebElement addtionalDriver2conviction2TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_1_1"));
    }

    public WebElement addtionalDriver2Monthofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_1_1"));
    }

    public WebElement addtionalDriver2yearofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_1_1"));
    }

    public WebElement addtionalDriver2conviction2pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_1_1"));
    }

    public WebElement addtionalDriver2banDurationconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_1_1"));
    }

        /*-------------------------
      Addtional driver 3
  -------------------------*/

    public WebElement addAddtionalDriver3link() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another driver\")]"));
    }

    public WebElement addtionalDriver3TitleDropdown() {
        return waitAndFindElement(By.id("formField.details.title_2"));
    }

    public WebElement addtionalDriver3FirstnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.forename_2"));
    }

    public WebElement addtionalDriver3LastnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.surname_2"));
    }

    public WebElement addtionalDriver3DoBdayDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.day_2"));
    }

    public WebElement addtionalDriver3DoBmonthDorpdown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_2"));
    }

    public WebElement addtionalDriver3DoBYearDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.year_2"));
    }

    public WebElement addtionalDriver3LivedUKSicebirthCheckBox() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.residentFromBirth_2']"));
    }

    public WebElement addtionalDriver3LivedUKMonthDropDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_2"));
    }

    public WebElement addtionalDriver3residentFromDateyearDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.year_2"));
    }

    public WebElement addtionalDriver3OccupationDorpdown() {
        return waitAndFindElement(By.id("formField.details.occupation-text_2"));
    }

    public WebElement addtionalDriver3LicenceTypeDorpdown() {
        return waitAndFindElement(By.id("formField.details.licenceType_2"));
    }

    public WebElement addtionalDriver3LicencePeriodDorpdown() {
        return waitAndFindElement(By.id("formField.details.licencePeriod_2"));
    }

    public WebElement addtionalDriver3AnyclaimsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_2-0']"));
    }

    public WebElement addtionalDriver3AnyclaimsNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_2-1']"));
    }

    public WebElement addtionalDriver3claim1TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_2_0"));
    }

    public WebElement addtionalDriver3Monthofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_2_0"));
    }

    public WebElement addtionalDriver3yearofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_2_0"));
    }

    public WebElement addtionalDriver3addanthorClaimlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another claim\")]"));
    }

    public WebElement addtionalDriver3claim2TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_2_1"));
    }

    public WebElement addtionalDriver3Monthofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_2_1"));
    }

    public WebElement addtionalDriver3yearofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_2_1"));
    }

    public WebElement addtionalDriver3AnyConvictionsNORadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_2-0']"));
    }

    public WebElement addtionalDriver3AnyConvictionsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_2-1']"));
    }

    public WebElement addtionalDriver3conviction1TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_2_0"));
    }

    public WebElement addtionalDriver3Monthofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_2_0"));
    }

    public WebElement addtionalDriver3yearofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_2_0"));
    }

    public WebElement addtionalDriver3conviction1pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_2_0"));
    }

    public WebElement addtionalDriver3banDurationconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_2_0"));
    }

    public WebElement addtionalDriver3addanthorConvictionlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another conviction\")]"));
    }

    public WebElement addtionalDriver3conviction2TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_2_1"));
    }

    public WebElement addtionalDriver3Monthofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_2_1"));
    }

    public WebElement addtionalDriver3yearofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_2_1"));
    }

    public WebElement addtionalDriver3conviction2pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_2_1"));
    }

    public WebElement addtionalDriver3banDurationconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_2_1"));
    }

        /*-------------------------
      Addtional driver 4
  -------------------------*/

    public WebElement addAddtionalDriver4link() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another driver\")]"));
    }


    public WebElement addtionalDriver4TitleDropdown() {
        return waitAndFindElement(By.id("formField.details.title_3"));
    }

    public WebElement addtionalDriver4FirstnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.forename_3"));
    }

    public WebElement addtionalDriver4LastnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.surname_3"));
    }

    public WebElement addtionalDriver4DoBdayDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.day_3"));
    }

    public WebElement addtionalDriver4DoBmonthDorpdown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_3"));
    }

    public WebElement addtionalDriver4DoBYearDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.year_3"));
    }

    public WebElement addtionalDriver4LivedUKSicebirthCheckBox() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.residentFromBirth_3']"));
    }

    public WebElement addtionalDriver4LivedUKMonthDropDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_3"));
    }

    public WebElement addtionalDriver4residentFromDateyearDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.year_3"));
    }

    public WebElement addtionalDriver4OccupationDorpdown() {
        return waitAndFindElement(By.id("formField.details.occupation-text_3"));
    }

    public WebElement addtionalDriver4LicenceTypeDorpdown() {
        return waitAndFindElement(By.id("formField.details.licenceType_3"));
    }

    public WebElement addtionalDriver4LicencePeriodDorpdown() {
        return waitAndFindElement(By.id("formField.details.licencePeriod_3"));
    }

    public WebElement addtionalDriver4AnyclaimsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_3-0']"));
    }

    public WebElement addtionalDriver4AnyclaimsNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_3-1']"));
    }

    public WebElement addtionalDriver4claim1TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_3_0"));
    }

    public WebElement addtionalDriver4Monthofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_3_0"));
    }

    public WebElement addtionalDriver4yearofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_3_0"));
    }

    public WebElement addtionalDriver4addanthorClaimlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another claim\")]"));
    }

    public WebElement addtionalDriver4claim2TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_3_1"));
    }

    public WebElement addtionalDriver4Monthofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_3_1"));
    }

    public WebElement addtionalDriver4yearofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_3_1"));
    }

    public WebElement addtionalDriver4AnyConvictionsNORadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_3-0']"));
    }

    public WebElement addtionalDriver4AnyConvictionsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_3-1']"));
    }

    public WebElement addtionalDriver4conviction1TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_3_0"));
    }

    public WebElement addtionalDriver4Monthofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_3_0"));
    }

    public WebElement addtionalDriver4yearofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_3_0"));
    }

    public WebElement addtionalDriver4conviction1pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_3_0"));
    }

    public WebElement addtionalDriver4banDurationconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_3_0"));
    }

    public WebElement addtionalDriver4addanthorConvictionlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another conviction\")]"));
    }

    public WebElement addtionalDriver4conviction2TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_3_1"));
    }

    public WebElement addtionalDriver4Monthofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_3_1"));
    }

    public WebElement addtionalDriver4yearofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_3_1"));
    }

    public WebElement addtionalDriver4conviction2pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_3_1"));
    }

    public WebElement addtionalDriver4banDurationconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_3_1"));
    }

           /*-------------------------
      Additional driver 5
  -------------------------*/

    public WebElement addAddtionalDriver5link() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another driver\")]"));
    }

    public WebElement addtionalDriver5TitleDropdown() {
        return waitAndFindElement(By.id("formField.details.title_4"));
    }

    public WebElement addtionalDriver5FirstnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.forename_4"));
    }

    public WebElement addtionalDriver5LastnameDorpdown() {
        return waitAndFindElement(By.id("formField.details.surname_4"));
    }

    public WebElement addtionalDriver5DoBdayDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.day_4"));
    }

    public WebElement addtionalDriver5DoBmonthDorpdown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_4"));
    }

    public WebElement addtionalDriver5DoBYearDorpdown() {
        return waitAndFindElement(By.id("formField.details.birthDate.year_4"));
    }

    public WebElement addtionalDriver5LivedUKSicebirthCheckBox() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.residentFromBirth_4']"));
    }

    public WebElement addtionalDriver5LivedUKMonthDropDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.month_4"));
    }

    public WebElement addtionalDriver5residentFromDateyearDown() {
        return waitAndFindElement(By.id("formField.details.residentFromDate.year_4"));
    }

    public WebElement addtionalDriver5OccupationDorpdown() {
        return waitAndFindElement(By.id("formField.details.occupation-text_4"));
    }

    public WebElement addtionalDriver5LicenceTypeDorpdown() {
        return waitAndFindElement(By.id("formField.details.licenceType_4"));
    }

    public WebElement addtionalDriver5LicencePeriodDorpdown() {
        return waitAndFindElement(By.id("formField.details.licencePeriod_4"));
    }

    public WebElement addtionalDriver5AnyclaimsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_4-0']"));
    }

    public WebElement addtionalDriver5AnyclaimsNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyClaims_4-1']"));
    }

    public WebElement addtionalDriver5claim1TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_4_0"));
    }

    public WebElement addtionalDriver5Monthofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_4_0"));
    }

    public WebElement addtionalDriver5yearofclaim1Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_4_0"));
    }

    public WebElement addtionalDriver5addanthorClaimlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another claim\")]"));
    }

    public WebElement addtionalDriver5claim2TypeDropdown() {
        return waitAndFindElement(By.id("formField.accident.code_4_1"));
    }

    public WebElement addtionalDriver5Monthofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.month_4_1"));
    }

    public WebElement addtionalDriver5yearofclaim2Dropdown() {
        return waitAndFindElement(By.id("formField.accident.date.year_4_1"));
    }

    public WebElement addtionalDriver5AnyConvictionsNORadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_4-0']"));
    }

    public WebElement addtionalDriver5AnyConvictionsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.details.anyConvictions_4-1']"));
    }

    public WebElement addtionalDriver5conviction1TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_4_0"));
    }

    public WebElement addtionalDriver5Monthofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_4_0"));
    }

    public WebElement addtionalDriver5yearofconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_4_0"));
    }

    public WebElement addtionalDriver5conviction1pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_4_0"));
    }

    public WebElement addtionalDriver5banDurationconviction1Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_4_0"));
    }

    public WebElement addtionalDriver5addanthorConvictionlink() {
        return waitAndFindElement(By.xpath("//*[contains(text(), \"Add another conviction\")]"));
    }

    public WebElement addtionalDriver5conviction2TypeDropdown() {
        return waitAndFindElement(By.id("formField.conviction.code_4_1"));
    }

    public WebElement addtionalDriver5Monthofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.month_4_1"));
    }

    public WebElement addtionalDriver5yearofconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.date.year_4_1"));
    }

    public WebElement addtionalDriver5conviction2pontsDropdown() {
        return waitAndFindElement(By.id("formField.conviction.points_4_1"));
    }

    public WebElement addtionalDriver5banDurationconviction2Dropdown() {
        return waitAndFindElement(By.id("formField.conviction.banDuration_4_1"));
    }

 /*   ---------------------------
    Your Address
------------------------------*/


    public WebElement postcodeLookupTextfield() {
        return waitAndFindElement(By.id("formField.address.postcode"));
    }



  /*  public WebElement postcodeLookupButton() { 
        return waitAndFindElement(By.xpath("//button[contains(@class, 'post-code-lookup')]"));
    }*/

    public WebElement postCodeClick() {
        return waitAndFindElement(By.xpath("//button[contains(@class, 'post-code-lookup')]"));
    }

    public WebElement addressSelectionOption() {
        return waitForElementPresent(By.xpath("//select[@id='formField.address.packed']/option[3]"));

    }

    public WebElement addressSelection() {
        //return waitForElementPresent(By.xpath("//select[@id=formField.address.packed']"));
        return waitForElementPresent(By.id("formField.address.packed']"));
    }

    public WebElement addHosenumberManualTextfield() {
        return waitAndFindElement(By.id("formField.address.houseNumber"));
    }

    public WebElement addFlatnumberManualTextfield() {
        return waitAndFindElement(By.id("formField.address.flatNumber"));
    }

    public WebElement ownHomeYesRadio() {
        return waitForElementPresent(By.xpath("//label[@for='formField.ownYourHome-1']"));
    }

    public WebElement ownHomeNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.ownYourHome-2']"));
    }

    public WebElement TotalNoofCarataddressDropDown() {
        return waitForElementPresent(By.id("formField.numberOfCarsInHome"));
    }

    public WebElement emailTextfield() {
        return waitAndFindElement(By.id("formField.yourDetails.email"));
    }

    public WebElement telephoneTextfield() {
        return waitAndFindElement(By.id("formField.phone"));
    }

    public WebElement monthHomeInsurencedueDropdown() {
        return waitForElementPresent(By.id("formField.homeInsuranceDue"));
    }

    //public WebElement youraddressClickNextButton() {
    //return waitForElementPresent(By.xpath(".//*[@id='content']/div/div[2]/div[1]/form/div[4]/div/fieldset/div/div[2]/div/a"));
    //}

    public WebElement youraddressClickNextButton() {
        return waitForElementPresent(By.partialLinkText("Next"));
    }


    /* --------------------------------
    Discounts page
    --------------------------------*/
    public WebElement NoClaimDiscountDropdown() {
        return waitForUnstableElement(By.id("formField.noClaimsDiscount"));
    }

    public WebElement telematicsPolicyYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.telematics-1']"));
    }

    public WebElement telematicsPolicyNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.telematics-2']"));
    }

    public WebElement ExsitingPolicyYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.discount.multicar-1']"));
    }

    public WebElement ExsitingPolicyNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.discount.multicar-2']"));
    }

    public WebElement namedDriverYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.discount.namedDriver-1']"));
    }

    public WebElement namedDriverNoRadio() {
        return waitForElementPresent(By.xpath("//label[@for='formField.discount.namedDriver-2']"));
    }

    public WebElement discountsDriverPolcyNumberTextField() {
        return waitForElementPresent(By.id("formField.details.policyNumber"));
    }

    public WebElement discountsDriverPolcyholderLastNameTextField() {
        return waitForElementPresent(By.id("formField.discount.surname"));
    }

    public WebElement discountsDriverPolcyholderInitialTextField() {
        return waitForElementPresent(By.id("formField.discount.forename"));
    }

    public WebElement discountsDriverPolcyholderDOBDateDropDown() {
        return waitForElementPresent(By.id("formField.discount.dateOfBirth.day"));
    }

    public WebElement discountsDriverPolcyholderDOBMonthDropDown() {
        return waitForElementPresent(By.id("formField.discount.dateOfBirth.month"));
    }

    public WebElement discountsDriverPolcyholderDOBYearDropDown() {
        return waitForElementPresent(By.id("formField.discount.dateOfBirth.year"));
    }

    public WebElement discountsDriverPolcyholderPostCode() {
        return waitAndFindElement(By.id("formField.discount.postcode"));
    }

    public WebElement discountsconfirmPolicyholderdetailsCheckbox() {
        return waitAndFindElement(By.xpath("//label[@for='formField.discount.policyholderpermission_checkbox']"));
    }

    public WebElement DoAnotherDLProductYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.haveAnotherDLProduct-1']"));
    }

    public WebElement DoAnotherDLProductNoRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.haveAnotherDLProduct-2']"));
    }

    public WebElement discountClickNextButton() {
        return waitForElementPresent(By.partialLinkText("Next"));
    }



/*----------------------------------
AssumptionAndPrivacy
----------------------------------*/

    public WebElement confirmAssumptionsCheckbox() {
        return waitForElementPresent(By.id("formField.ConfirmAssumptions_checkbox"));
    }

    public WebElement InsuranceCancelledinLastFiveYearsYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.insuranceCanceled-1']"));
    }

    public WebElement InsuranceCancelledinLastFiveYearsNoRadio() {
        return waitForElementPresent(By.xpath("//input[@id='formField.insuranceCanceled-2']"));
    }

    public WebElement keepUInformedCheckbox() {
        return waitForElementPresent(By.id("formField.noOffersByPost_checkbox"));
    }

    public WebElement SMSNOYesRadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.sendOffersByEmail-1']"));
    }

    public WebElement SMSNORadio() {
        return waitAndFindElement(By.xpath("//label[@for='formField.sendOffersByEmail-2']"));
    }

    public WebElement captchaRefresButton() {
        return waitAndFindElement(By.xpath("//button[@class='button secondary']"));


    }

    public WebElement YDSubmitButton() {
//   return waitAndFindElement(By.xpath("//*[@class='button submit primary']"));
        //return waitForElementPresent(By.xpath("//button[contains(@class, 'button submit primary')]"));
        return waitForElementToBeClickableAndReturnElement(By.cssSelector("[class^='button submit primary']"));

        //return waitForUnstableElement(By.cssSelector("[style='display: inline-block;']"));


    }

    public WebElement multicarYDSubmitButton() {
//   return waitAndFindElement(By.xpath("//*[@class='button submit primary']"));
        //return waitForElementPresent(By.xpath("//button[contains(@class, 'button submit primary')]"));
        //return waitForElementToBeClickableAndReturnElement(By.cssSelector("[class^='button submit primary']"));
        return waitForUnstableElement(By.cssSelector("[style='display: inline-block;']"));

    }


    //-------------------- Churchill Change Elements---------------------------//

    public WebElement ch_findCarButton() {
        return waitAndFindElement(By.xpath("//button[@class='button secondary left-arrow']"));
    }

    public WebElement ch_lookupdetailsButton() {
        return waitAndFindElement(By.xpath("//class[@for='button secondary post-code-lookup']"));
    }

    public WebElement ch_HomePolicyYesRadioButton() {
        return waitAndFindElement(By.xpath("//label[@for='formField.homePolicy-1']"));
    }

    public WebElement ch_HomePolicyNoRadioButton() {
        return waitAndFindElement(By.xpath("//label[@for='formField.homePolicy-2']"));
    }

    public WebElement chLikeFacebookRadioButtonYes() {
        return waitAndFindElement(By.xpath("//label[@for='formField.facebook-1']"));
    }

    public WebElement chLikeFacebookRadioButtonNo() {
        return waitAndFindElement(By.xpath("//label[@for='formField.facebook-2']"));
    }

    public WebElement chAddRescueButtonNo() {
        return waitForElementToBeClickableAndReturnElement(By.xpath("//button[contains(text(),'Don')]"));
    }

    //Additional questions page elements

    public WebElement yourTrackingDevice() {
        return waitForElementPresent(By.id("formField.vehicle.trackingDevice"));

    }

    //referral
    public WebElement referralErrorText() {
        return waitForElementToBeClickableAndReturnElement(By.xpath("//h1[contains(text(),'We')]"));

    }

    public WebElement youngerDriverErrorText() {
        return waitForUnstableElement(By.xpath("//p[contains(text(),'You and any additional drivers need to be between 17')]"));

    }

//prudentail

    public WebElement pruGetQuote() {
        return waitForUnstableElement(By.xpath("//a[@class='btn primary']"));

    }
//sidebar

    public WebElement retrieveNow() {
        return waitForUnstableElement(By.xpath("//a[contains(text(),'Retrieve now')]"));

    }

}
