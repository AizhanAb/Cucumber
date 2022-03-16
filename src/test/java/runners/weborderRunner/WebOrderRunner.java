package runners.weborderRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// runner class is a way to run your all feature files from here.
//@Runwith(Cucumber.class) annotation from Junit helps you to do that.
//      for every project we will have only one runner class.
//@CucumberOptions allows you to execute some keywords in order to organize your runner file.
//dryRun = true // allows you to pass all the tests.allows you to get
// not implemented code snippets right away.
// dryRun = false //works normally.
//features ="src/test/resources/features/com.webOrder/Order.feature",//feature file copy path content root
//glue="stepdefinitions/weborderSteps/OrderSteps.java"  //step definition path source root
@RunWith(Cucumber.class)
@CucumberOptions(

        features ="src/test/resources/features/com.webOrder",
        glue = "src/test/java/stepdefinitions/weborderSteps",
        dryRun = false,
        tags ="@smokeLoginTest"

)
public class WebOrderRunner {


}
