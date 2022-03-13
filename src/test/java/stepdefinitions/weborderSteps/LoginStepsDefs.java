package stepdefinitions.weborderSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderPages.LoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginStepsDefs {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginpage=new LoginPage(driver);

    @Given("the user navigates to web order website")
    public void the_user_navigates_to_web_order_website() {
       driver.navigate().to(ConfigReader.readProperty("weborderurl"));
    }

    @When("the user provide credentials")
    public void the_user_provide_credentials() {
loginpage.login(ConfigReader.readProperty("weborderUsername"), ConfigReader.readProperty( "weborderpasssword"));
    }
    @Then("user is on the homepage")
    public void user_is_on_the_homepage() {
        Assert.assertEquals(driver.getTitle(), "ORDER DETAILS - Weborder");

    }
///negative one
    @Given("the use navigates to the WebOrder website")
    public void the_use_navigates_to_the_web_order_website() {
        driver.navigate().to(ConfigReader.readProperty("weborderurl"));
    }
    @When("user provides correct username and wrong password")
    public void user_provides_correct_username_and_wrong_password() {
        loginpage.login(ConfigReader.readProperty("weborderUsername"), "wrongpassword");
    }
    @Then("the user validates the {string} error message")
    public void the_user_validates_the_error_message(String string) {
Assert.assertTrue(loginpage.validateErrorMessage(string));
    }

    @When("user provides wrong username and wrong password")
    public void user_provides_wrong_username_and_wrong_password() {
loginpage.login("shkdh", "dfu");
    }

    @When("user provides wrong {string} and wrong {string}")
    public void user_provides_wrong_and_wrong(String userName, String password) {
        loginpage.login(userName, password);
    }
    @When("user provides wrong emphty credentials")
    public void user_provides_wrong_emphty_credentials() {
       loginpage.login("", "");
    }
}
