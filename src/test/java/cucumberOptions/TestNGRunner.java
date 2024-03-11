package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		tags="@SmokeTest or @RegressionTest",
		glue="stepDefinitions",
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.jason"}

		)
public class TestNGRunner extends AbstractTestNGCucumberTests {



}
