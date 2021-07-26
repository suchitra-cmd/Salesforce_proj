package testSuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features= {"src/test/java/testSuite/Lead_ops.feature"},
	glue= {"testSuite"},
	tags= "@Lead_ops"
		) 
@RunWith(Cucumber.class)
public class Lead_opsRun extends AbstractTestNGCucumberTests{
}