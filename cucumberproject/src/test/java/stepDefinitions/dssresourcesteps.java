package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.homePage;
import pages.loginPage;
import pages.dssresourcePage;
import pages.resourcesPage;

public class dssresourcesteps {

	loginPage login=new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	dssresourcePage dssresourcepage=new dssresourcePage(basePage.getdriver());
	resourcesPage resources=new resourcesPage(basePage.getdriver());

	
	@When ("user clicks on DSS facilitator materials")
	public void clickonfacilitatormaterials() throws InterruptedException {
		resources.navigatetodss();
		dssresourcepage.clickondssfacilitatormaterials();
	}
	@And ("user clicks on DSS download items")
	public void clickon_DSSfacilimaterdownload() throws InterruptedException {
		dssresourcepage.dssfacilitatormaterialsdownload();
		resources.newtab();
	}
	@Then ("user is able to download the dss PDFs")
	public void confirmdssdownload() {
		dssresourcepage.dsshome();
	}
	@Given ("user is on facilitator page") 
	public void facilitatortab() throws InterruptedException {
		dssresourcepage.dsshome();
	}

	@When ("user clicks on problem solving model of dss")
	public void clikconproblsolv() throws InterruptedException {
		resources.navigatetomenu();
		resources.navigatetodss();
		resources.navigatetodss();
		dssresourcepage.dssproblemsolvingmodel();
	}
	@Then ("user is able to verify the model of dss")
	public void verifyprobmodel() throws InterruptedException {
		dssresourcepage.probsolvimagedisplay();
	}
	@Given("user is on dss problem solv page")
	public void probsolv() throws InterruptedException {
		Thread.sleep(5000);
		dssresourcepage.probsolvimagedisplay();
	}

	@When ("user clicks on situation and challenge of dss")
	public void clicksituandchall() throws InterruptedException {
		resources.navigatetomenu();
		resources.navigatetodss();
		resources.navigatetodss();
		dssresourcepage.dsssituation_challenge();
	}
	@Then ("user is able to verify the desert situation") 
	public void verifydesertsitu() {
		dssresourcepage.verifysdsssitu();
	}
	@And ("user is able to verify the challenge")
	public void verifydesertchall() {
		dssresourcepage.verifysdsschall();
	}

}
