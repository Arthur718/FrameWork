package Runer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = true,
        features = "/Users/arthur/arthur718/src/test/Res/Uber",
        glue = {"StepDef"},


        plugin={
        "pretty:target/cucumber-test-report/cucumber-pretty.txt",
        "html:target/cucumber-test-report",
        "json:target/cucumber-test-report/cucumber-report.json",
        "junit:target/cucumber-test-report/test-report.xml"
}





        )




public class BDDruner {
}
