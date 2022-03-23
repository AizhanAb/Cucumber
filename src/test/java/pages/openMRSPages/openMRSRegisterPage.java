package pages.openMRSPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class openMRSRegisterPage {
    public openMRSRegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="givenName")
    private WebElement givenName;
    @FindBy(name="familyName")
    private WebElement familyName;
    @FindBy(id="gender-field")
    private WebElement gender;
    @FindBy(id="next-button")
    private WebElement nextButton;
    @FindBy(name="birthdateDay")
    private WebElement birthday;
    @FindBy(id="birthdateMonth-field")
    private WebElement birthMonth;
    @FindBy(xpath="//input[@name'birthdateYear']")
    private WebElement birthYear;
    @FindBy(id="address1")
    private WebElement address;
    @FindBy(name="phoneNumber")
    private WebElement phoneNumber;
    @FindBy(id="relation_type")
    private WebElement relationType;
    @FindBy(xpath="//input[@placeholder='Person Name']")
    private WebElement relativeName;
    @FindBy(id="submit")
    private WebElement confirmButton;

    public void sendName(String name, String familyName){
        givenName.sendKeys(name);
       this.familyName.sendKeys(familyName);
       nextButton.click();
    }

    public void sendGender(String gender){
        BrowserUtils.selectBy(this.gender, gender, "text");
    }

    public void sendBirthday(String day, String month, String year){
        birthday.clear();
        birthday.sendKeys(day);
        birthYear.clear();
        birthYear.sendKeys(year);
        birthMonth.clear();
        BrowserUtils.selectBy(birthMonth, month, "text");
        nextButton.click();
    }

    public  void sendAddress(String address){
        this.address.sendKeys(address);
        nextButton.click();
    }
    public  void sendPhoneNumber(String phone){
        this.phoneNumber.sendKeys(phone);
        nextButton.click();
    }
    public  void sendRelation(String relation, String relationName){
        BrowserUtils.selectBy(relationType, relation, "text");
        //this.relationType.sendKeys(relation);
        this.relativeName.sendKeys(relationName);
        nextButton.click();
    }
}
