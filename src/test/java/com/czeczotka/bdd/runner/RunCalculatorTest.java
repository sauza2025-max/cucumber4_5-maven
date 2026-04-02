package com.czeczotka.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "classpath:cucumber/calculator.feature" ,
		  glue = "com.czeczotka.bdd.steps",
		monochrome = true,
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
)
public class RunCalculatorTest {
}
