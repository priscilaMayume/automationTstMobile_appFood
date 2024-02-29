package com.test.steps;

import com.test.screen.LoginScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    LoginScreen login = new LoginScreen();

    @Given("^I have valid login credentials \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_have_valid_login_credentials(String email, String psw) {
        login.loginSuccessfully(email, psw);
    }

    @When("^I click on the confirm login button$")
    public void i_click_on_the_confirm_login_button() {
        login.confirmEmailButtonw();

    }

    @Then("^I confirm stores on the home screen$")
    public void i_confirm_stores_on_the_home_screen() {
        System.out.println("ok - check test");

    }

}
