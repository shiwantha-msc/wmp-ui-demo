package com.wmp.qa.test.behaviour.stepDefinition;

import com.wmp.qa.uicore.driver.DriverConnection;
import com.wmp.qa.utils.exception.FrameworkException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Hooks.java - Suite initializer and terminator class
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT Last modified
 * @since
 */
public class Hooks {

    final static Logger log = Logger.getLogger(Hooks.class);
    public static RemoteWebDriver driver;

    @BeforeClass
    public void suiteInitiate(){
    }

    @Before
    public void testInitiate() throws FrameworkException {
        driver = DriverConnection.getDeriverInstance();
        log.info("[NOTE]: Initiate Driver Connection...");
    }

    @After
    public void testTerminate(Scenario scenario) throws FrameworkException {
        if (scenario.isFailed()){
            try {
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }catch (WebDriverException ex) {
                log.error("[NOTE]: Error Occurred ! "+ex.getMessage());
            }
        }
        DriverConnection.closeDriver();
        log.info("[NOTE]: Terminate Driver Connection...");
    }

    @AfterClass
    public void suiteTerminate(){
    }
}
