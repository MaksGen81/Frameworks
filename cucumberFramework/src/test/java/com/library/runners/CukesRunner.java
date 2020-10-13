package com.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },

        features = "src/test/resources/resources.features",
        glue = "src/test/java/com/library/step_definitions",
        dryRun = false,
        tags = ""
)

public class CukesRunner {
}
