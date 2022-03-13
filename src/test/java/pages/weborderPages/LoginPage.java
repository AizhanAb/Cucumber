package pages.weborderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="Email")
    private WebElement username;
    @FindBy(id="Password")
    private WebElement password;
    @FindBy(xpath="//button[.='Sign In']")
    private WebElement signIn;
    @FindBy(xpath="//div[@class='mt-2 alert alert-danger']")
    private WebElement errorMessage;

public boolean validateErrorMessage(String errorMessage1){
    return this.errorMessage.getText().trim().equals(errorMessage1);
}

    public void login(String usname, String pass){
        username.clear();
        username.sendKeys(usname);
        password.clear();
        password.sendKeys(pass);
        this.signIn.submit();

    }
}
