package application.main.stepDef;

import application.main.stepDefImpl.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStepDef {

	Sample impl= new Sample();
	@Given("^user navigates to the given page$")
	public void userNavigation() throws Throwable {
		impl.userNavigate();
	}
	
	@When("^he enters his \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enteringDetails(String username, String password) throws Throwable {
		impl.enteringDetails(username, password);
	}
	
	@Then("^he click on submit button and login to application$")
	public void enteringApplication() throws Throwable {
		impl.enteringApplication();
	}
}
