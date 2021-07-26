package testSuite;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep  {
	LoginPage login=new LoginPage();
	@Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
       login.openUrl();
    }

    @When("^enter valid email and pwd and click login$")
    public void enter_valid_email_and_pwd_and_click_login() throws Throwable {
    	 login.validlogin();
    }

    @Then("^user should be able to login$")
    public void user_should_be_able_to_login() throws Throwable {
       
    }

	}



