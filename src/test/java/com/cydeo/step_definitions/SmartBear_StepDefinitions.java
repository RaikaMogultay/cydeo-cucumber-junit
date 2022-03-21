package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDefinitions {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is on the SmartBear Login Page")
    public void user_is_on_the_smart_bear_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?Return");
    }

    @When("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        smartBearPage.userNameField.sendKeys("Tester");
        smartBearPage.passwordField.sendKeys("test");
        smartBearPage.loginButton.click();
        smartBearPage.orderTab.click();

    }
    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select familyAlbum = new Select(smartBearPage.productDropdown);
        familyAlbum.selectByVisibleText("FamilyAlbum");

    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {

        smartBearPage.quantityBox.clear();
        smartBearPage.quantityBox.sendKeys(Keys.DELETE + "4");

    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.customerNameBox.sendKeys(string);

    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.streetBox.sendKeys(string);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.cityBox.sendKeys(string);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPage.stateBox.sendKeys(string);
    }
    @When("User enters {string}")
    public void user_enters(String string) {
        smartBearPage.zipBox.sendKeys(string);
    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        smartBearPage.visaRadioButton.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPage.cardNumber.sendKeys(string);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.cardDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        smartBearPage.viewAllOrderTab.click();
        Assert.assertEquals(string,smartBearPage.nameRow.getText());
    }

}
