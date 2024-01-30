package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Project\\testing\\CucumberExtentReportJenkins\\src\\test\\java\\features\\rediffRegister.feature",
		glue = {"steps"},  // packagename where the steps are
		plugin= {"pretty",
				"html:target/cucumberreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		
		
		}
		
		)
public class TestRunner {
}
