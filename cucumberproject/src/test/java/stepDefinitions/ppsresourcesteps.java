package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.dssresourcePage;
import pages.homePage;
import pages.loginPage;
import pages.resourcesPage;
import pages.ppsresourcePage;

public class ppsresourcesteps {

	loginPage login=new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	dssresourcePage dssresourcepage=new dssresourcePage(basePage.getdriver());
	resourcesPage resources=new resourcesPage(basePage.getdriver());
	ppsresourcePage ppsresourcepage= new ppsresourcePage(basePage.getdriver());

	
	public void resourcesmenu() throws InterruptedException {
		resources.dsstabdisplayed();
	}
	@When ("user clicks on PPS facilitator materials")
	public void click_ppsfacilimater() throws InterruptedException {
		resources.navigatetopps();
		ppsresourcepage.clickonPPSfacilitaormaterials();
	}
	@And ("user clicks on PPS download items")
	public void clickonppsfacilimaterdownload() throws InterruptedException {
		ppsresourcepage.ppsfacilitatormaterials();
		resources.newtab();
	}
	@Then ("user is able to download the pps PDFs")
	public void confirmppsdownload() {
		ppsresourcepage.ppshome();
	}


	@Given ("user is on pps facilitator page") 
	public void facilitatortabpps() throws InterruptedException {
	ppsresourcepage.ppshome();
	}

	@When ("user clicks on problem solving model of pps")
	public void clikconproblsolvpps() throws InterruptedException {
		resources.navigatetomenu();
		resources.navigatetopps();
		resources.navigatetopps();
		ppsresourcepage.ppsproblemsolvingmodel();
	}
	@Then ("user is able to verify the model of pps")
	public void verifyprobmodelpps() throws InterruptedException {
		ppsresourcepage.isppsproblemsolvingmodel();
	}	
	
	
	@Given("user is on pps problem solv page")
	public void probsolv() throws InterruptedException {
		Thread.sleep(5000);
		dssresourcepage.probsolvimagedisplay();
	}
	@When ("user clicks on pps situation and challenge")
	public void clicksituationndchallenge() throws InterruptedException {
		resources.navigatetomenu();
		resources.navigatetopps();
		resources.navigatetopps();
		ppsresourcepage.ppssituation_challenge();
	}
	

	@Then ("user is able to verify the pps situation") 
	public void verifyppssitu() {
		ppsresourcepage.verifyppssitu();
	}
	@And ("user is able to verify the pps challenge")
	public void verifyppschall() {
		ppsresourcepage.verifyppschall();
	}


}
