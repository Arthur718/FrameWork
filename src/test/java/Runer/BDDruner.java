package Runer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = true,
        features = "/Users/arthur/arthur718/src/test/Res/CucomOne",
        glue = {"StepDef"}
)



public class BDDruner {
}
