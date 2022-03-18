package com.cydeo.step_definitions;


import com.cydeo.pages.SteveJobsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SteveJobs_StepDefinition {

    SteveJobsPage steveJobsPage = new SteveJobsPage();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @Then("user should see title is the Google")
    public void user_should_see_title_is_the_google() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(), "Google");

    }
    @Then("user types apple in the google search box")
    public void user_types_apple_in_the_google_search_box() {
        steveJobsPage.searchBox.sendKeys("apple");

    }
    @Then("user clicks enter")
    public void user_clicks_enter() {
        steveJobsPage.searchBox.sendKeys(Keys.ENTER);
    }
    @Then("user sees Steve Jobs is in the google title")
    public void user_sees_steve_jobs_is_in_the_google_title() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertFalse(Driver.getDriver().getTitle().contains("Steve Jobs"));

    }




}
