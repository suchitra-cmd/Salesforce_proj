package testSuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features= {"src/test/java/testSuite/Login.feature"},
	glue= {"testSuite"},
	tags= "@login" 
	) 
@RunWith(Cucumber.class)
public class Login_Run extends AbstractTestNGCucumberTests{
}

		
		


