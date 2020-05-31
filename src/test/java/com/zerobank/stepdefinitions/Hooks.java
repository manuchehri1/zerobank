package com.zerobank.stepdefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {

    //new change

    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) {
        // how to check if scenario failed
        if (scenario.isFailed()){
            TakesScreenshot takesScreenshot =(TakesScreenshot) Driver.getDriver();
            byte[] image =takesScreenshot.getScreenshotAs(OutputType.BYTES);
            // attach screenshot to the report
            scenario.embed(image,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }
}
