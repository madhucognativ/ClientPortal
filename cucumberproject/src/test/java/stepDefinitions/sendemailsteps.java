package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.homePage;
import pages.loginPage;
import pages.createprojectPage;
import pages.sendemailPage;
import pages.respondentsPage;
public class sendemailsteps {
	
	loginPage login =new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	createprojectPage createproject=new createprojectPage(basePage.getdriver());
	sendemailPage sendemail=new sendemailPage(basePage.getdriver());
	respondentsPage respondents=new respondentsPage(basePage.getdriver());
	
	
	
	@Given ("Respondent added to project")
	public void respondentadded() throws InterruptedException {
		respondents.checkrespondent();
	}
    @When ("user selects respondents")
    public void userselctsrespondent() {
    	respondents.clickselect();
    }
    @And ("user clicks on email button")
    public void clicksonemailbtn() {
    	respondents.clickemailbtn();
    	sendemail.sendemail();
    }
    @And ("user clicks on Confirm send email")
    public void confirmemail() {
    	sendemail.confirmemailsent();
    }
	
    @Then ("email has been sent successfully")
    public void emailsuccess() {
    	respondents.confirmemailsent();
    
    }
	


}
