package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//ideally for features we should just mention the folder name and control execution via tags, but we can mention individual file as well
		        features = {"src/test/resources/features/Login.feature"},
				glue = {"stepDefinition"},
		        plugin= {
				"pretty",
				"html:html/Reports.html",
				"json:json/Report.json",
				"junit:junit/Report.xml",
		         },
			//	 tags="@WrongCreds",
		         monochrome = false,
		         dryRun = false,
		         publish = true
		         )
public class TestRunner {

}
