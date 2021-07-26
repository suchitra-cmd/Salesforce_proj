package testSuite;

import Pages.LeadOpsPage;
import Pages.LeadPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead_opsStep {
	LeadPage lep=new LeadPage();
	LeadOpsPage ops=new LeadOpsPage();

	@Given("^user is on Leadpage$")
    public void user_is_on_leadpage() throws Throwable {
		lep.clickLead();
    }

    @When("^click on next stages$")
    public void click_on_next_stages() throws Throwable {
    	ops.convert();
        
    }

    @Then("^Lead is converted into contacts$")
    public void lead_is_converted_into_contacts() throws Throwable {
    }
    
    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
       
    }

    @When("^click on import and add csv file$")
    public void click_on_import_and_add_csv_file() throws Throwable {
    		ops.toImport();
    }

    @Then("^csv file should be imported$")
    public void csv_file_should_be_imported() throws Throwable {
        
    }
    

    @Given("^check the values in object Manager and dropdown$")
    public void check_the_values_in_object_manager_and_dropdown() throws Throwable {
    	lep.clickLead();
        lep.clickNewLead();
        Thread.sleep(5000);
    }

    @When("^compare both the values$")
    public void compare_both_the_values() throws Throwable {
        ops.validateIndustry();
    }

    @Then("^the values should be same$")
    public void the_values_should_be_same() throws Throwable {
        
    }

    
   

}
