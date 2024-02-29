package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/reports/cucumberTestes.json", "html:reportes/cucumber-reports.html"},
        features = {"src/test/resources/features"},
        tags = {"@test"},
        glue = {"com.test.steps"})
public class RunTest {
    @AfterClass
    public static void quitApp() {
        Hooks.quitDriver();
    }
}
