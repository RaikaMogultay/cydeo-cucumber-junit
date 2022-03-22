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


    @And("User enters <Quantity> to quantity")
    public void userEntersQuantityToQuantity(String Quantity) {
        smartBearPage.quantityBox.sendKeys(Keys.BACK_SPACE +Quantity);
    }

    @And("User enters <Name> to costumer name")
    public void userEntersNameToCostumerName(String Name) {
        smartBearPage.customerNameBox.sendKeys(Name);
    }

    @And("User enters <Street> to street")
    public void userEntersStreetToStreet(String Street) {
        smartBearPage.streetBox.sendKeys(Street);
    }

    @And("User enters <City> to city")
    public void userEntersCityToCity(String City) {
        smartBearPage.cityBox.sendKeys(City);
    }

    @And("User enters <State> to state")
    public void userEntersStateToState(String State) {
        smartBearPage.stateBox.sendKeys(State);
    }

    @And("User selects  {string} as a credit type")
    public void userSelectsAsACreditType(String string) {
        smartBearPage.visaRadioButton.click();
       /* for (WebElement each : smartBear.creditCardType) {
          if (each.getAttribute("value").equals(CrType)) {
              each.click();
         */  }

    @And("User enters <CreditCardNum> to card number")
    public void userEntersCreditCardNumToCardNumber(String CreditCardNum) {
        smartBearPage.cardNumber.sendKeys(CreditCardNum);

    }

    @And("User enters <Date> to expiration date")
    public void userEntersDateToExpirationDate(String Date) {
        smartBearPage.cardDate.sendKeys(Date);

    }
    @Then("User verifies <Names> are in the list")
    public void userVerifiesAreInTheList(String Names) {
        smartBearPage.processButton.click();
        smartBearPage.viewAllOrderTab.click();
        String actual = smartBearPage.nameRow.getText();
        Assert.assertEquals("Order Verification", Names, actual);
    }

    @And("User enters {string} to zip")
    public void userEntersToZip(String arg0) {
        smartBearPage.zipBox.sendKeys(arg0);
    }


    @Given("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String arg0) {
        Select select = new Select(smartBearPage.productDropdown);
        select.selectByVisibleText(arg0);
    }

}
