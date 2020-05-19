package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^user is registered in the database$")
    public void user_is_registered_in_the_database() throws Throwable {
        throw new PendingException();
    }

    @When("^user informs his personal information$")
    public void user_informs_his_personal_information() throws Throwable {
        throw new PendingException();
    }

    @Then("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        throw new PendingException();
    }

    @And("^is displayed if the user wants to continue registering in the database$")
    public void is_displayed_if_the_user_wants_to_continue_registering_in_the_database() throws Throwable {
        throw new PendingException();
    }

    @And("^selecting option N the system presents the following options: N - New registration, L - List entries, X - Exit$")
    public void selecting_option_n_the_system_presents_the_following_options_n_new_registration_l_list_entries_x_exit() throws Throwable {
        throw new PendingException();
    }

    @And("^selecting option L the system displays all the records that were saved in the database.$")
    public void selecting_option_l_the_system_displays_all_the_records_that_were_saved_in_the_database() throws Throwable {
        throw new PendingException();
    }

}