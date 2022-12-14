package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json" ,
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt"
        },
        glue = "com/cydeo/step_definitions",
        features = "src/test/resources/features",
        tags = "@us_03",
        dryRun = true






)




public class CukesRunner {

}
