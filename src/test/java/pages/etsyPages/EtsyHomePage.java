package pages.etsyPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {
    public  EtsyHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "search_query")
    WebElement searchBox;


    public  void lookHat(String searchVal){
        searchBox.sendKeys( searchVal, Keys.ENTER);
        }

}
