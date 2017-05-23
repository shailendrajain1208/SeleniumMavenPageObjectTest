package automation.stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Scenario_Outlined {

    @When("^enter username as(.*)$" )
    public void enter_username(String username) throws Throwable {
        System.out.println(username);
    }

    @And("^enter password as (.*)$")
    public void enter_password(String password) throws Throwable {
        System.out.println(password);

    }

//    @Given("^I am trying to access table data$")
    @Given("^I am trying to access table data$")

    public void I_am_trying_to_access_table_data() throws Throwable {
        System.out.println("Hello");    }


    //    @When("^I am on the page$")
    @When("^I am on the page$")

    public void I_am_on_the_page(DataTable arg1) throws Throwable {

    }
}