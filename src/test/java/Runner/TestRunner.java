package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features ="C:\\Users\\HP\\IdeaProjects\\SimpleBDDFramwork\\src\\test\\resources\\Features\\Registration.feature",

        glue = {"StepDefinitions"},
        dryRun = false
)
public class TestRunner {


}
