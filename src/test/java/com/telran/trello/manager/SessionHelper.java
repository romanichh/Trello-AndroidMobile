package com.telran.trello.manager;

import com.telran.trello.model.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SessionHelper extends HelperBase {


    public SessionHelper(AppiumDriver driver) {
        super(driver);
    }

    public void firstLoginButton() {
        tap(By.id("log_in_button"));
    }

    public void fillLogInForm(User user) throws InterruptedException {
        type(By.id("user"), user.getUserName());
        Thread.sleep(6000);
        type(By.id("password"), user.getPassword());
        driver.hideKeyboard();
    }

    public void tapLoginButton() {
        tap(By.id("authenticate"));
//        tap(By.xpath("//*[contains(text(), 'LOGIN')]"));
    }

    public void button1() {
//        tap(By.id("button1"));
        tap(By.xpath("//*[contains(text(), 'LOG IN')]"));
    }

    public void clickOnName() {
        tap(By.xpath("//*[contains(text(), 'romich87')]"));
        tap(By.xpath("//*[contains(text(), 'romich87')]"));
        tap(By.xpath("//*[contains(text(), 'romich87')]"));
    }


}
