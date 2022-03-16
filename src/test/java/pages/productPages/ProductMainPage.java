package pages.productPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMainPage {
    public ProductMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Order']")
    private WebElement orderButton;
    @FindBy(xpath ="//a[.='View all orders']")
    private WebElement viewAllOrdersButton;

    public void clickViewAllOrders(){
        viewAllOrdersButton.click();
    }

    public void clickOrderButton(){
        orderButton.click();
    }

}



