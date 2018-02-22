package com.portal.toolbox.step_definitions;

import com.portal.toolbox.BaseStepDef;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.portal.toolbox.framework.toolboxUtil;

import java.util.concurrent.TimeUnit;


public class sample extends BaseStepDef {

    private toolboxUtil toolboxUtil = new toolboxUtil();

    @Given("^I launch '(.+)' Business Onboarding & Account Opening application$")
    public void iLaunchNatewestBusinessOnboardingAccountOpeningApplication(String brandName) throws Throwable {
        switch (brandName) {
            case "RBS":
                getDriver().get(System.getProperty("ENV").replace("natwest.com", "rbs.co.uk"));
                break;
            case "Ulster":
                getDriver().manage().deleteAllCookies();
                getDriver().get(System.getProperty("ENV").replace("natwest.com/content/#/onboarding/login", "rbs.co.uk/content/ubn.html#/onboarding/login?applicationType=BB&brand=UBN"));
                break;

            default:
                getDriver().get(System.getProperty("ENV"));
                break;

        }
    }

    @When("^I login with '(.+)' to the application and navigate to homepage$")
    public void iLoginWithCredencialsToTheApplicationAndNavigateToHomepage(String credencials) throws Throwable {
        toolboxUtil.login(credencials);
    }

    @And("^I start New application and enter '(.+)','(.+)','(.+)','(.+)','(.+)'and'(.+)'information$")
    public void iStartNewApplicationAndEnterPersonalDetailsOrganizationDetailBusinessDetailsBusinessFinancialsAndTeamDetalsInformations(String personalDetails, String organizationDetail, String businessDetails, String businessfinancials, String teamDetals, String manageAccounts) throws Throwable {
        toolboxUtil.startNewApplication(personalDetails, organizationDetail, businessDetails, businessfinancials, teamDetals, manageAccounts);
    }

    @Then("^I should get navigate reviewapplication page$")
    public void iShouldGetNavigateManageaccountPage() throws Throwable {
        System.out.println("test completed");
    }
}
