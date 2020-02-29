package com.telran.trello.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class TrelloPage extends HelperBase {

    public TrelloPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isTaskPresent() {
        return isElementPresent(By.xpath("//*[contains(text(), 'Boards')]"));
    }
}
