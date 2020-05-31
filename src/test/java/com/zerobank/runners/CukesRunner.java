package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-html-report",
                "json:target/cucumber.json",

                },
        features = "src/test/resources/features",
        glue = "com/zerobank/stepdefinitions",

        dryRun = false,
        strict = true,
        tags = "@negativeLogin"



)

public class CukesRunner {




}
