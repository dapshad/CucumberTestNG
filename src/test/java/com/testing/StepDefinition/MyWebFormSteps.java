package com.testing.StepDefinition;

import com.testing.PageObject.TestWebPagePO;
import com.testing.Cucumber.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MyWebFormSteps {

    WebDriver driver = Hooks.driver;
    @Given("I am on the formy page")
    public void iAmOnTheFormyPage() {
        TestWebPagePO testWebPagePO = new TestWebPagePO(driver);
        testWebPagePO.clickWebForm();

    }

    @When("I enter {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String JobTitle) {
        TestWebPagePO testWebPagePO = new TestWebPagePO(driver);
        testWebPagePO.enterFirstName(FirstName);
        testWebPagePO.enterLastName(LastName);
        testWebPagePO.enterJobTitle(JobTitle);

    }

    @And("I click on submit")
    public void iClickOnSubmit() {
        TestWebPagePO testWebPagePO = new TestWebPagePO(driver);
        testWebPagePO.clickSubmitButton();

    }

    @Then("form completion page should be displayed")
    public void formCompletionPageShouldBeDisplayed() {
        String expectedPageTitle = "Formy";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }
}
