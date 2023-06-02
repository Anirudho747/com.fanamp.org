package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//ideally for features we should just mention the folder name and control execution via tags, but we can mention individual file as well
		        features = {"./src/test/resources/features"},
				glue = {"stepDefinition"},
		        plugin= {
				"pretty",
				"summary",
				"html:html/Reports.html",
				"junit:junit/Report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		         },
//		         tags="@NotificationCounterCheck",
		         monochrome = false,
		         dryRun = false,
		         publish = true
		         )
public class TestRunner {

}
