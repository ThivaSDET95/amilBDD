package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="StepDefinitions",
dryRun = false,
monochrome = true,
tags = "@Smoke",
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class runner {
}
//"html:target/cucumber-reports/result.html","junit:target/cucumber-reports/junitresult.xml"