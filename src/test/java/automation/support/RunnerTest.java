package automation.support;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(
		format = {"pretty","json:src/test/report/cucumber.json"},
//		format = {"pretty","html:src/test/report/html"},

		features = "src/test/resource",
		monochrome = false,
		dryRun = false,
		tags = {"@smoke"}
		,glue = "automation.stepdef"
//		mvn test -Dcucumber.options="--tags @smoke"
//		mvn test -Dcucumber.options="--help"
//		glue = {"/src/test/java/com/cucumber/SeleniumMavenPageObjectTest"}

		)
public class RunnerTest {}


