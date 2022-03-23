package pages.openMRSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSLogin {
    public OpenMRSLogin(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="username")
   private WebElement userName;

    @FindBy(id="password")
   private WebElement password;
    @FindBy(id="Inpatient Ward")
    private WebElement inpatientWardButton;
    @FindBy(id="loginButton")
    private WebElement loginButton;

    public void login(String name, String password){
        this.userName.sendKeys(name);
        this.password.sendKeys(password);
        inpatientWardButton.click();
        loginButton.click();

    }

}
