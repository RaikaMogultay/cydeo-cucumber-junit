package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("Users enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
    }
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters student username");

    }
    @And("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password");

    }
    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("user enters admin username");
    }
    @And("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("user enters admin password");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
    }
}
