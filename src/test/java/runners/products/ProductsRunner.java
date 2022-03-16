package runners.products;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features/com.Products/",
        glue = "stepdefinitions/productStepDefs",
        dryRun = false,
        tags = "@productOutline"
)
public class ProductsRunner {


}
