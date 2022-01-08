package ZadanieDwaSelenide;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/Cucumber/Features/zadanie-dwa.feature"},
        plugin = {"pretty", "html:out", "html:target/cucumber-html-report", "json:target/cucumber.json",
                "pretty: target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
