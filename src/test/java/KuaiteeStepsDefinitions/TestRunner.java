package KuaiteeStepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"},glue ={"KuaiteeStepsDefinitions"},

monochrome = true,
plugin= {"pretty", "html:target/HtmlReport1/Report.html",
		"json:target/JsonReport/Report.json",
		"junit:target/JunitReport/Report.xml"}
		)
public class TestRunner {

}
 