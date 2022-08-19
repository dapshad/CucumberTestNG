package com.testing.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
        glue = {"com.testing.com.testing.StepDefinition.StepDefinition",
                "com.testing.cucumber",},
        plugin = {"pretty","html:target/site/cucumber.html"},
        tags = "@WebForm"
)

public class TestRunner {
}
