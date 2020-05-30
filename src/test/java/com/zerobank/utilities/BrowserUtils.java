package com.zerobank.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> getWebElementText(List<WebElement> webElement){

        List<String> list = new ArrayList<>();
        for (WebElement element : webElement) {
            list.add(element.getText().trim());
        }

        return list;
    }
}
