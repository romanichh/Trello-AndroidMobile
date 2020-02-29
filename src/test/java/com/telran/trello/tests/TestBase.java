package com.telran.trello.tests;

import com.telran.trello.manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {


    public static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws MalformedURLException {
        app.init();

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        app.stop();

    }

}
