package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("when user is on the login page")
    public void when_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.signIn.click();
    }

    @When("user logins as an authorized user")
    public void user_logins_as_an_authorized_user() {
        loginPage.login();
    }

    @Then("verify title is {string}")
    public void verify_title_is(String string) {

    }
}
