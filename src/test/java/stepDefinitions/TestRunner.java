package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="Resources/Features",glue={"stepDefinitions"},
monochrome=true,
plugin= {"pretty",
		"html:target/HtmlReport/report.html",
		"json:target/JSONReport/report.json",})
		

				
public class TestRunner extends AbstractTestNGCucumberTests  {

}
