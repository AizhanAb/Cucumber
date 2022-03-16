package stepdefinitions.etsyStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.etsyPages.EtsyHomePage;
import utils.ConfigReader;
import utils.DriverHelper;

public class EtsySearchStep {
    WebDriver driver= DriverHelper.getDriver();
    EtsyHomePage etsyHomePage = new EtsyHomePage(driver);
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
        driver.navigate().to(url);
    }

    @When("the user searches {string}")
    public void the_user_searches(String val) {
        etsyHomePage.lookHat(val);
    }
    @Then("the user validates the title {string}")
    public void the_user_validates_the_title(String val) {
        Assert.assertEquals(driver.getTitle(), val);

    }

}
