package ru.altstu;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sergey on 30/03/2017.
 */
public class MyStepdefs {
    @Given("^I have my software calculator$")
    public void iHaveMySoftwareCalculator() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I have entered (\\d+) as first operand$")
    public void iHaveEnteredAsFirstOperand(int number) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I have entered (\\d+) as second operand$")
    public void iHaveEnteredAsSecondOperand(int number) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I press 'Add'$")
    public void iPressAdd() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int expected) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
