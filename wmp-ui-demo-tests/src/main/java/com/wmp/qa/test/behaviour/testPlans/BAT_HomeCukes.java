package com.wmp.qa.test.behaviour.testPlans;


import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features"
        ,glue={"com.totalamber.qa.test.behaviour.stepDefinition"}
        ,monochrome = true
        ,tags = {}
        ,format = {"pretty","html:target/html","json:target/cucumber.json"}
)
//"src/main/resources/features"
public class BAT_HomeCukes {
}
