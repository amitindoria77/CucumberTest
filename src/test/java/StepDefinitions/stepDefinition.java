package StepDefinitions;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;

//import cucumber.api.PendingException;

//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

	    @Given("^user is on login page$")
	    public void user_is_on_login_page() throws Throwable {
	        System.out.println("Login Page");
	    }

	    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println("Login With Username and Password"+strArg1+" : "+strArg2);

	    }

	    @Then("^user navigated to home page \"([^\"]*)\"$")
	    public void user_navigated_to_home_page_something(String strArg1) throws Throwable {
	    	System.out.println("HomePage is Displayed"+strArg1);

	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("Cards are displayed");
	    }
}
