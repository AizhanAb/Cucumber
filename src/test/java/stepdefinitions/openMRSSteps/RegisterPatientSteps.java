package stepdefinitions.openMRSSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.openMRSPages.OpenMRSLogin;
import utils.DriverHelper;

import java.util.Map;

public class RegisterPatientSteps {
    WebDriver driver= DriverHelper.getDriver();
    OpenMRSLogin openMRSLogin=new OpenMRSLogin(driver);

    @Given("the user logs into openMrs with following credentials")
    public void the_user_logs_into_open_mrs_with_following_credentials(DataTable dataTable) {
     Map<String, String> loginMap=dataTable.asMap();
     openMRSLogin.login(loginMap.get("username"), loginMap.get("password"));

    }
    @When("user register new patient with following info:")
    public void user_register_new_patient_with_following_info(io.cucumber.datatable.DataTable dataTable) {

    }
//You should know that: DataTable will be given as parameter to the method.
    //If you use it as a dataprovider
    //io.cucumber.datatable. part can be deleted
}
