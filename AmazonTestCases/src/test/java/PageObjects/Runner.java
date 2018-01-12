package PageObjects;

import PageObject.Hooks;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:output"},
        // tags = {"@Sandy1"},
        features = "src/test/resources/Login.feature"
)

public class Runner extends Hooks {
}
