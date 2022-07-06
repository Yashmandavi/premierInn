package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;
import org.openqa.selenium.interactions.Actions;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() throws IllegalAccessException {
       driverManager.runOnLocalBrowser();
//        driverManager.runInHeadlessBrowser();
        driverManager.goToUrl();
        driverManager.maxBrowser();
        driverManager.applyImplicitWait();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }

}
