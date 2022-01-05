package ZadanieDwaSelenide;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/Cucumber/Features/zadanie-dwa.feature"},
        plugin = {"pretty", "html:out"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
