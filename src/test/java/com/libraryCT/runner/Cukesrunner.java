package com.libraryCT.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                  "rerun:target/rerun.txt",
                  "json:target/cucumber.json",
                  "me.jvt.cucumber.report.PrettyReports:target/cucumber"},

        features = "src/test/resources/features",
        glue = "com/libraryCT/step_definitions",
        dryRun = false,
        tags = "@ts6_126"

)

public class Cukesrunner {
}
