package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement submit;

    @FindBy(id = "user_remember_me")
    public WebElement remember_me_checkbox;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorAlert;

    @FindBy(id = "signin_button")
    public WebElement signIn;


    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        submit.click();
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();


    }

}
