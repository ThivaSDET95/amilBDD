package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="StepDefinitions",
dryRun = false,
monochrome = true,
tags = " @smoke and @test",
plugin = {"pretty","html:target/cucumber-reports/result.html","junit:target/cucumber-reports/junitresult.xml"})
public class runner {
}
