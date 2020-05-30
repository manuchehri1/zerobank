package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/zerobank/stepdefinitions",
        features = "src/test/resources",
        dryRun = false,
        strict = true,
        tags = "@negativeLogin"


)

public class CukesRunner {




}
