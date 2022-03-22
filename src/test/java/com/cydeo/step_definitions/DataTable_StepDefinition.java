package com.cydeo.step_definitions;

import com.cydeo.pages.DataTablePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class DataTable_StepDefinition {

    DataTablePage dataTablePage = new DataTablePage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below {string} in month dropdown")
    public void user_should_see_below_in_month_dropdown(String string) {

        Select select = new Select(dataTablePage.monthDropdown);
        select.selectByVisibleText(string);

    }
}
