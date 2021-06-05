package testMain;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.Reports.LoggerReport;
import Pages.LoginPage;
import qa.base.BaseTest;


public class TalentTrackingTC extends BaseTest{

	 LoggerReport log = new LoggerReport();     
   

    public TalentTrackingTC() {
        super();
        
    }

   

    //Covers TC-1:Login to Sales Force
    @Test(priority = 1)
    @Parameters({"username", "password"})
    public void TalentTrackingLogin(String username, String password) {
      
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLoginPage().contains("Login");
        
        loginPage.login(username, password);
        log.LOGGER.debug("Given Username name is {} and password is  {}",username, password);

      
        
    }

    
}