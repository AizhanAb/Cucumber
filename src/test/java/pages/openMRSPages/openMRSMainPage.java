package pages.openMRSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class openMRSMainPage {
    public openMRSMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="")
    private WebElement registerPatientButton;

    public void clickRegisterButton(){
        registerPatientButton.click();
    }
}
