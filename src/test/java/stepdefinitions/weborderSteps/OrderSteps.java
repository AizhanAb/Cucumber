package stepdefinitions.weborderSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderPages.CreateGroupOrder;
import pages.weborderPages.LoginPage;
import pages.weborderPages.OrderPage;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class OrderSteps {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginpage=new LoginPage(driver);
    OrderPage orderpage= new OrderPage(driver);
    CreateGroupOrder createGroupOrder = new CreateGroupOrder(driver);
    @Given("the user is on Web Order homepage")
    public void the_user_is_on_web_order_homepage() {
       driver.navigate().to(ConfigReader.readProperty("weborderurl"));
       loginpage.login(ConfigReader.readProperty("weborderUsername"),ConfigReader.readProperty("weborderpasssword") );
    }
    @When("the user selects {string} options")
    public void the_user_selects_options(String deliveryOption) {
        orderpage.getDeliveryOption(deliveryOption);
        orderpage.clickGroupOrder();
        orderpage.clickNextButton();
    }
    @When("the user is on the Group Order page")
    public void the_user_is_on_the_group_order_page() {
        Assert.assertEquals(driver.getTitle(), "Create Group Order - Weborder");
    }
    @When("the user sends invitation note {string}")
    public void the_user_sends_invitation_note(String string) {
        createGroupOrder.inviteNoteMessage(string);
    }
    @When("the user send invite list {string} and {string}")
    public void the_user_send_invite_list_and(String email1, String email2) {
       createGroupOrder.inviteListMessage(email1, email2);
    }
    @Then("user validates the {string}")
    public void user_validates_the(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user validates {string} text")
    public void user_validates_text(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user validates total participants is {int}")
    public void the_user_validates_total_participants_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
