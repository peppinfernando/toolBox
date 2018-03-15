package com.portal.toolbox;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.Reporter;
import org.junit.runner.RunWith;
import org.junit.AfterClass;

import java.io.File;
//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
//import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;


//@RunWith(Cucumber.class)
//@CucumberOptions(strict = false, features = "features", format = { "pretty",
//        "json:target/cucumber.json" }, tags = { "~@ignore" })
//
//@RunWith(ExtendedCucumber.class)
//
//@ExtendedCucumberOptions(jsonReport = "target/cucumber_reports/regression_results/cucumber.json",
////        retryCount = 3,
//        detailedReport = true,
//        detailedAggregatedReport = true,
//        overviewReport = true,
//        coverageReport = true,
//        jsonUsageReport = "target/cucumber_reports/regression_results/cucumber-usage.json",
//        usageReport = true,
//        toPDF = true,
//        excludeCoverageTags = {"@flaky" },
//        includeCoverageTags = {"@passed" },
//        outputFolder = "target")
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber",
                "junit:target/junit_cucumber.xml",
                "json:target/cucumber_reports/regression_results/cucumber.json"},
        format = {"html:target/site/cucumber-pretty"},
      // features = "src/test/resources/features/sample.feature",
        features = "src/test/resources/features/AllFeatures.feature",
        tags = {"@CreditCardForClubsSocieties"},
        monochrome = true,

        snippets = SnippetType.CAMELCASE)

//        plugin = {"pretty", "html:target/cucumber", "junit:target/junit_cucumber.xml", "json:target/cucumber.json"},
//        format = {"html:target/site/cucumber-pretty"},
//        features = "src/test/resources/features",
//        tags = {"~@wip", "~@manual"},
//        monochrome = true,
//        snippets = SnippetType.CAMELCASE)
public class RunCukesSequence {

//    @AfterClass
//    public static void teardown() {
//        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", "Mac OSX");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
//    }
}
