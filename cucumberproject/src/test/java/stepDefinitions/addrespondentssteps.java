package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.homePage;
import pages.loginPage;
import pages.respondentsPage;

public class addrespondentssteps {


	loginPage login =new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	respondentsPage respondents=new respondentsPage(basePage.getdriver());
	
	@Given ("user is on home page")
	public void useronhomepage() {
		home.useronhomepage();
	}
    @When ("user click on project title")
    public void clickonproject() throws InterruptedException {
    	home.projecttitleclick();
    }
    @And ("clicks on respondents")
    public void clickonrespondents() {
    	home.respondents();
    }
    @And ("user clicks on add respondents")
    public void clickaddrespondents() throws InterruptedException {
    	respondents.addrespondents();
    }
    @Then ("confirm respondents added")
    public void confirmrespondentadded() {
    	respondents.selectcheckbox();
    }
}
