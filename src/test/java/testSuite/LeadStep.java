package testSuite;

import Pages.LeadPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadStep {
	LoginPage lp=new LoginPage();
	LeadPage lep=new LeadPage();
	@Given("^user is on salesforce dashboard page$")
    public void user_is_on_salesforce_dashboard_page() throws Throwable {
     
	    
	    
    }

    @When("^click lead object and click New$")
    public void click_lead_object_and_click_new() throws Throwable {
    	lep.clickLead();
        lep.clickNewLead();
    }

    @Then("^user is on new lead form page$")
    public void user_is_on_new_lead_form_page() throws Throwable {
       
    }
	    

	    @When("^Fill (.+) and (.+) and (.+)$")
	    public void Fill_and_and(String salutation, String lastname, String company) throws Throwable {
	        lep.fillLeadDetails(salutation, lastname, company);
	    }

	    @Then("^new lead should be created$")
	    public void new_lead_should_be_created() throws Throwable {
	    		lep.clickSave();       
	    }
	    
	    @Given("^user is on lead page$")
	    public void user_is_on_lead_page() throws Throwable {
	        lep.clickLead();
	    }

	    @When("^click on delete in particular(.+) page$")
	    public void click_on_delete_in_particular_page(String name) throws Throwable {
	        lep.clickDelete(name);
	    }

	    @Then("^Lead should be deleted$")
	    public void lead_should_be_deleted() throws Throwable {
	        
	    }
	    
	    @Given("^user is on editpage$")
	    public void user_is_on_editpage() throws Throwable {
	    	lep.clickLead();
	    }

	    @When("^give (.+) and (.+) and (.+) in editpage$")
	    public void give_and_and_in_editpage(String title, String email, String company) throws Throwable {
	       lep.editlead(title, email, company);
	    }

	    @Then("^Lead should Edited$")
	    public void lead_should_edited() throws Throwable {
	        
	    }

		    
	    @Given("^user is on respective website enquiry form$")
	    public void user_is_on_respective_website_enquiry_form() throws Throwable {
	        
	    }

	    @When("^enter the enquiry details$")
	    public void enter_the_enquiry_details() throws Throwable {
	        lep.webToLead();
	    }

	    @Then("^user details are updated in salesforce$")
	    public void user_details_are_updated_in_salesforce() throws Throwable {
	        
	    }

   
    }


