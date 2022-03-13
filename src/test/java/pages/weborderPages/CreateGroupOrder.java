package pages.weborderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGroupOrder {
    public CreateGroupOrder(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="InviteNote")
    private WebElement inviteNote;
    @FindBy(id="InviteList")
    private WebElement inviteList;
    @FindBy(id="createGroupOrder")
    private WebElement buttonCreate;
    @FindBy(id="addressPreview")
    private WebElement addressPreview;



    public void clickButton(){
        buttonCreate.click();
    }
  public  void inviteNoteMessage(String note){
        inviteNote.sendKeys(note);
    }
    public  void inviteListMessage(String email1, String email2){
        inviteList.sendKeys(email1 + "," + email2);
    }

}
