package com.telran.trello.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {

    AppiumDriver driver;

    SessionHelper session;
    TrelloPage page;

    public void init() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "qa22");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.trello");
        capabilities.setCapability("appActivity", ".home.HomeActivity");
        capabilities.setCapability("app",
                "C:/Users/romic/Downloads/Trello_new.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        session = new SessionHelper(driver);
        page = new TrelloPage(driver);
    }

    public SessionHelper getSession() {
        return session;
    }

    public TrelloPage getPage() {
        return page;
    }

    public void stop() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
