package pages.productPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class ProductOrderPage {
    public ProductOrderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productElement;
    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantity;
    @FindBy(id="ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerName;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement street;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement city;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement state;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zip;
    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
    private WebElement visaButton;
    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_1")
    private WebElement MasterCardButton;
    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_2")
    private WebElement AmericanVisaButton;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement CardNumber;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement ExpiredDate;
    @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;
    @FindBy(xpath="//input[@value='Reset']")
    private WebElement resetButton;
    @FindBy(tagName = "strong")
    private WebElement message;

    @FindBy(xpath="//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td")
    private List<WebElement> table;

    public void getInfo(String customerName,String productName, String quantity,  String street, String city,
                        String state, String zipCode, String cardType, String cardNumber, String expDate){
        Assert.assertEquals(table.get(1).getText().trim(), customerName);
        Assert.assertEquals(table.get(2).getText().trim(), productName);
        Assert.assertEquals(table.get(3).getText().trim(), quantity);
        Assert.assertEquals(table.get(5).getText().trim(), street);
        Assert.assertEquals(table.get(6).getText().trim(), city);
        Assert.assertEquals(table.get(7).getText().trim(), state);
        Assert.assertEquals(table.get(8).getText().trim(), zipCode);
        Assert.assertEquals(table.get(9).getText().trim(), cardType);
        Assert.assertEquals(table.get(10).getText().trim(), cardNumber);
        Assert.assertEquals(table.get(11).getText().trim(), expDate);
    }

    public void sendProductInfo(String productName, String quantity){
        BrowserUtils.selectBy(this.productElement, productName, "value");
        this.quantity.clear();
        this.quantity.sendKeys(quantity);

    }

    public void sendAdressInformation(String customerName, String street, String city, String state, String zipCode){
        this.customerName.sendKeys(customerName);
        this.street.sendKeys(street);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zip.sendKeys(zipCode);
    }
public void sendPaymentInfo(String cardNumber, String ExpireDate){
        this.CardNumber.sendKeys(cardNumber);
        this.ExpiredDate.sendKeys(ExpireDate);
}

public  void selectCard(String cardType){
        switch(cardType){
            case "Visa":
                visaButton.click();
                break;
            case "MasterCard":
                MasterCardButton.click();
                break;
            case "American Express":
                AmericanVisaButton.click();
        }
}
public void clickprocess(){
        processButton.click();
}

public  String getSuccessMessage(){
        return message.getText();
}
}
