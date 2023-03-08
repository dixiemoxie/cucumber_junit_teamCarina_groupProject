package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber_reports.html",
                  "rerun:target/rerun.txt",
                  "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features ="src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        tags = "@US88",
        dryRun = false,
        publish = true
)

public class CukesRunner {}
