package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//h2[text()='Cash Accounts']") // //h2[1]
    public WebElement cashAccounts;

    @FindBy(xpath = "//h2[text()='Investment Accounts']") // //h2[1]
    public WebElement investmentAccounts;

    @FindBy(xpath = "//h2[text()='Credit Accounts']") // //h2[1]
    public WebElement creditAccount;

        @FindBy(xpath = "//th[text()='Credit Card']/preceding-sibling::*[1][text()='Account']")
        public WebElement account;

        @FindBy(xpath = "//th[text()='Credit Card']")
        public WebElement creditCard;

        @FindBy(xpath = "//th[text()='Credit Card']/following-sibling::*[1][text()='Balance']")
        public WebElement balance;



    @FindBy(xpath = "//h2[text()='Loan Accounts']") // //h2[1]
    public WebElement loadAccounts;



}
