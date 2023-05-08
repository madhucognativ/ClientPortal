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
import pages.RSFhomePage;
import pages.surveyPage;
public class RSFhomepagesteps {

	loginPage login =new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	createprojectPage createproject=new createprojectPage(basePage.getdriver());
	sendemailPage sendemail=new sendemailPage(basePage.getdriver());
	respondentsPage respondents=new respondentsPage(basePage.getdriver());
	respondentportalloginPage rsfloginpage=new respondentportalloginPage(basePage.getdriver());
	RSFhomePage rsfhome=new RSFhomePage(basePage.getdriver());
	surveyPage surveypage=new surveyPage(basePage.getdriver());

	@Given ("user is on home page of rsf")
	public void confrimuseronrsfhome(){
		rsfloginpage.confirmrsf();
	}
	@When ("user clicks on surveys and enters survey id")
	public void userentersurveyid() throws InterruptedException {
		rsfhome.clickyoursurveys();
		rsfhome.entersurveyid();
		rsfhome.navigatetosurvey();
		
	}

	@And ("user completes survey") 
	public void completesurvey() {
		surveypage.survey_fill(); //12
		surveypage.clicknxtBtn();
		surveypage.survey_fill(); //24
		surveypage.clicknxtBtn();
		surveypage.survey_fill(); //36
		surveypage.clicknxtBtn();
		surveypage.survey_fill(); //48
		surveypage.clicknxtBtn();
		surveypage.survey_fill(); //60
		surveypage.clicknxtBtn();
		surveypage.survey_fill(); //72
		surveypage.surveyfilloperations();
		surveypage.Survey1();
		surveypage.surveyfilloperations1();
		surveypage.Survey2();
		surveypage.surveyfilloperation3();
	}
	
	@And ("user clicks on submit")
	public void submitsurvey() {
		surveypage.surveyfilloperation3();
	}
	@Then  ("circ maps is displayed")
	public void circmaps() {
		surveypage.assertscircmap();
	}
}
