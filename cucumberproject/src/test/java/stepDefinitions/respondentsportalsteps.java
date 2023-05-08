package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.createprojectPage;
import pages.homePage;
import pages.loginPage;
import pages.respondentsPage;
import pages.sendemailPage;
import pages.respondentportalloginPage;

public class respondentsportalsteps {
	
	loginPage login =new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	createprojectPage createproject=new createprojectPage(basePage.getdriver());
	sendemailPage sendemail=new sendemailPage(basePage.getdriver());
	respondentsPage respondents=new respondentsPage(basePage.getdriver());
	respondentportalloginPage rsfloginpage=new respondentportalloginPage(basePage.getdriver());
	
	
	
	@Given ("user is on respondent portal")
	public void confirmrespondentportal() {
		rsfloginpage.getrspurl();
	}
	@When ("user enters username and password")
	public void userentersurveyid() throws InterruptedException {
		rsfloginpage.enterusrandpwd();
	}
     
    @And ("user clicks on signin") 
	public void clickloginbtn() {
    	rsfloginpage.clicksubmit();
	}
    @Then  ("user is navigated to respondents portal")
    public void confirmRSFhomepage() {
		rsfloginpage.confirmrsf();
	}
}
