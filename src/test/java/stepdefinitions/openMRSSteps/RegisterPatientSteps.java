package stepdefinitions.openMRSSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.Map;

public class RegisterPatientSteps {
    @Given("the user logs into openMrs with following credentials")
    public void the_user_logs_into_open_mrs_with_following_credentials(DataTable dataTable) {
     Map<String, String> loginMap=dataTable.asMap();
    String username= loginMap.get("username");
        String password= loginMap.get("password");
        System.out.println(username);
        System.out.println(password);

    }
//You should know that: DataTable will be given as parameter to the method.
    //If you use it as a dataprovider
    //io.cucumber.datatable. part can be deleted
}
