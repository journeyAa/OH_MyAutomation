package com.myapp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on the landing page");
    }




    @When("user enters credentials")
    public void user_enters_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters credentials ");

    }



    @When("user clicks login button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user clicks login button ");
    }




    @Then("user supposed to see welcome message")
    public void user_supposed_to_see_welcome_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sees the welcome page");

    }

}
