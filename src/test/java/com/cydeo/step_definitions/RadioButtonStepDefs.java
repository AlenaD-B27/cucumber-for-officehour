package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.RadioButtonPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RadioButtonStepDefs {

    @Given("user goes to the web-page")
    public void user_goes_to_the_web_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("user clicks the Radio Buttons")
    public void user_clicks_the_radio_buttons() {
        HomePage.click("Radio Buttons");
    }
    @When("user clicks the Hockey")
    public void user_clicks_the_hockey() {
        new RadioButtonPage().radioButtonForHockey.click();

    }
    @Then("user verifies the Hockey is checked")
    public void user_verifies_the_hockey_is_checked() {
        Assert.assertTrue(new RadioButtonPage().radioButtonForHockey.isSelected());

    }




}
