package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty:target/cucumber-pretty.txt",
        "html:target/cucumber-html-report.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:output/cucumber.json"},
        features = "classpath:features",
        tags = "@PlaceOrder")
public class RunnerTest extends AbstractTestNGCucumberTests {

}
