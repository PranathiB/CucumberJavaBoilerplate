import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        format = { "pretty",
                "html:reports/cucumber-pretty",
                "json:reports/cucumber.json" },
//        tags = {"@run"},
        features = "src/test/features"  //refer to Feature file
         )
public class CucumberRunnerTest {
}