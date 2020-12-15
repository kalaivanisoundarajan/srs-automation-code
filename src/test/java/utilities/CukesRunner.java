package utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "rerun:Rerun/rerun.txt"},
		features = {"classpath:features"}, glue = {"stedefs"},
		tags = {"@Add_to_Cart"}, dryRun = false
)
public class CukesRunner {

}
