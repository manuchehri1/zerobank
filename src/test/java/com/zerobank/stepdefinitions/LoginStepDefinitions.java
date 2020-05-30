package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("when user is on the login page")
    public void when_user_is_on_the_login_page() {
<<<<<<< HEAD
=======


>>>>>>> 5b896766070380d922e81babbabca55ca390f6b9
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.signIn.click();
    }

    @When("user logins as an authorized user")
    public void user_logins_as_an_authorized_user() {

        loginPage.login();
    }


    @Then("verify title is {string}")
    public void verify_title_is(String expected) {
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("Does not match",expected,actual);
    }

    // Negative Login Scenarios

    @When("user logins with {string} and {string}")
    public void user_logins_with_and(String username, String password)  {
        loginPage.login(username,password);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(loginPage.errorAlert));

    }

    @Then("user should see the {string} error message")
    public void user_should_see_the_error_message(String errorMessage)  {


       String actual = loginPage.errorAlert.getText();

       Assert.assertEquals(errorMessage,actual);
    }





}
