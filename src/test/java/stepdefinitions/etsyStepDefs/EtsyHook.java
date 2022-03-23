package stepdefinitions.etsyStepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class EtsyHook {
    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void beforeScenario(){
        driver.get(ConfigReader.readProperty("etsyUrl"));
        System.out.println("before scenario");
    }

    @After
    public void afterScenario(Scenario scenario){
        Date currentdate = new Date();
        String screenshot = currentdate.toString().replace(" ", "-")
                .replace(":", "-");

        if(scenario.isFailed()){
            File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File("src/test/java/screenshot/" + screenshotFile) );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     DriverHelper.tearDown();
    }
}
