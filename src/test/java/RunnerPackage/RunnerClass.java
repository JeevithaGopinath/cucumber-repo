package RunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/GoogleSearch.feature",glue={"StepDefintionPackage","hooks"},
monochrome=true,

plugin= {"pretty","json:target/JsonReports.json","html:target/htmlreports"},tags="@hooks",publish=false)

public class RunnerClass {

}
