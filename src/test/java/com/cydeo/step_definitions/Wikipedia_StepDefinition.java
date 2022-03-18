package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wikipedia_StepDefinition {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();

    @When("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @Then("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikipediaSearchPage.searchBox.sendKeys("Steve Jobs");

    }
    @Then("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.clickButton.click();

    }
    @Then("sees Steve Jobs is the wiki title")
    public void sees_steve_jobs_is_the_wiki_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Steve Jobs";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {
        wikipediaSearchPage.header.getText();
        Assert.assertEquals("Steve Jobs", wikipediaSearchPage.header.getText());
    }

    @Then("User sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        Assert.assertTrue(wikipediaSearchPage.imageHeader.isDisplayed());

    }
}
