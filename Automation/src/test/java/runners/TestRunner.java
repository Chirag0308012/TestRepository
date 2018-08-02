package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/chirag/eclipse-workspace/Automation/src/test/resources/functionalTests" , glue = {"stepDefination"}
		)
public class TestRunner {

}
