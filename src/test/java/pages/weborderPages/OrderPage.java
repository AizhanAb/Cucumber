package pages.weborderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {
    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="ConfirmAddressID")
   private WebElement deliveryOptions;
    @FindBy(id="getAddressNextButton")
    private WebElement NextButton;
    @FindBy(xpath="//label[@class='custom-control-label']")
    private WebElement checkBox;

    @FindBy(className="topBannerHeader")
    private WebElement topBannerHeader;




    public void getDeliveryOption(String option ){
        BrowserUtils.selectBy(deliveryOptions, option, "text");
    }
    public void clickGroupOrder(){
        checkBox.click();
    }
    public void clickNextButton(){
        NextButton.click();
    }
}
