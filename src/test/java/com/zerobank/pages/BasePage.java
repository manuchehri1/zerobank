package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
<<<<<<< HEAD
     WebDriver driver = Driver.getDriver();
=======
    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 25);
>>>>>>> 5b896766070380d922e81babbabca55ca390f6b9
    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    public void navigateTo(String moduleName){
        String capitalized = String.valueOf(moduleName.charAt(0)).toLowerCase().
                concat(moduleName.substring(1,moduleName.indexOf(" ")).toLowerCase()).
                concat(" ").
                concat(moduleName.substring(moduleName.indexOf(" ")+1,moduleName.indexOf(" ")+2).toUpperCase()).
                concat(moduleName.substring(moduleName.indexOf(" ")+2).toLowerCase());
        String locator = "//a[text()='"+capitalized+"']";
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator)))).click();
    }
}
