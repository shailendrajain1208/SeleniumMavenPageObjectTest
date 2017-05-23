package automation.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioStepDef {

    @Given("^I am on the Website page$")
    public void I_am_on_the_Website_page() throws Throwable {
        System.out.println("Web site launched..");
    }

    @When("^I click on contact link$")
    public void I_click_on_contact_link() throws Throwable {
        System.out.println("Connact page..");
    }

    @Then("^contact page is displayed$")
    public void contact_page_is_displayed() throws Throwable {
        System.out.println("conatct page is displayed..");
    }

    @When("^I enter first name$")
    public void I_enter_first_name() throws Throwable {
        System.out.println("Firsntname");
    }

    @When("^i enter last name$")
    public void i_enter_last_name() throws Throwable {
        System.out.println("Last name");
    }

    @Then("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
        System.out.println("submit button");
    }
}