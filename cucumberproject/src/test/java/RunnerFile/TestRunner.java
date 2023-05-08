
package RunnerFile;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "json:target/cucumber.json" },
		features = {"src/test/resources/Features/login.feature",
		"src/test/resources/Features/dssresource.feature",
		"src/test/resources/Features/sssresource.feature",
		"src/test/resources/Features/ppsresource.feature"},
		glue = { "stepDefinitions","src/java/stepDefinitions"},
		monochrome = true,
		//tags= "@edge",
		dryRun = false
)
public class TestRunner {
}


