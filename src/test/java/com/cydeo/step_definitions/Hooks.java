package com.cydeo.step_definitions;

import com.cydeo.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setUp() {

        System.out.println("Hooks @Before is running");
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());

            // The line below has the same functionality as the above line
            scenario.attach(((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
        }

        System.out.println("--> @After: Running after each scenario");
        Driver.tearDown();
    }

}
