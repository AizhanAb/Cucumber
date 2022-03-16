package stepdefinitions.productStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.productPages.ProductLoginPage;
import pages.productPages.ProductMainPage;
import pages.productPages.ProductOrderPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class ProductOrderSteps {
    WebDriver driver =  DriverHelper.getDriver();
    ProductLoginPage productLoginPage=new ProductLoginPage(driver);
    ProductMainPage productMainPage = new ProductMainPage(driver);
    ProductOrderPage productOrderPage = new ProductOrderPage(driver);

    @Given("The user navigates to product website home page and click order button")
    public void the_user_navigates_to_product_website_home_page_and_click_order_button() {
       //driver.get(ConfigReader.readProperty("productUrl"));
       productLoginPage.login(ConfigReader.readProperty("PrUsername"), ConfigReader.readProperty("PrPassword"));
       productMainPage.clickOrderButton();
    }

    @When("The user enters the product information {string} and {string}")
    public void the_user_enters_the_product_information_and(String prodName, String quantity) {
      productOrderPage.sendProductInfo(prodName, quantity);
    }

    @When("The user enters the information {string},{string},{string},{string},{string}")
    public void the_user_enters_the_information( String customerName, String street, String city, String state, String zipcode) {
    productOrderPage.sendAdressInformation(customerName,  street, city, state, zipcode);
    }

    @When("The user enters the card information {string},{string},{string}")
    public void the_user_enters_the_card_information(String cardType, String cardNumber, String expireDate) {
   productOrderPage.selectCard(cardType);
   productOrderPage.sendPaymentInfo(cardNumber, expireDate);
    }

    @Then("The user validates success message")
    public void the_user_validates_success_message() {
       productOrderPage.clickprocess();
        Assert.assertEquals(productOrderPage.getSuccessMessage(), ConfigReader.readProperty("successMessage") );
    }

    @Then("The user validates product details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_user_validates_product_details( String customerName,String productName, String quantity, String street, String city,
                                                   String state, String zipCode, String cardType, String cardNumber, String expDate) {
      productMainPage.clickViewAllOrders();
      productOrderPage.getInfo(customerName, productName, quantity, street, city, state, zipCode, cardType, cardNumber, expDate );


    }



}
