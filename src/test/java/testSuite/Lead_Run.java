package testSuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features= {"src/test/java/testSuite/Lead.feature"},
	glue= {"testSuite"},
	tags= "@Leads"
		) 
@RunWith(Cucumber.class)
public class Lead_Run extends AbstractTestNGCucumberTests{
}