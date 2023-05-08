package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.homePage;
import pages.loginPage;
import pages.sssresourcePage;
import pages.resourcesPage;

public class sssresourcesteps {

	loginPage login=new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	sssresourcePage sssresourcepage=new sssresourcePage(basePage.getdriver());
	resourcesPage resources=new resourcesPage(basePage.getdriver());

	
	
	@When ("user clicks on SSS facilitator materials")
	public void clickonfacilitatormaterials() throws InterruptedException {
		resources.navigatetoss();
		sssresourcepage.clickondssfacilitaormaterials();
	}
	@And ("user clicks on SSS download items")
	public void clickon_DSSfacilimaterdownload() throws InterruptedException {
		sssresourcepage.ssfacilitatormaterialsdownload();
		resources.newtab();
	}
	@Then ("user is able to download the ss PDFs")
	public void confirmdssdownload() {
		sssresourcepage.sshome();
	}
	@Given ("user is on ss facilitator page") 
	public void facilitatortab() throws InterruptedException {
		sssresourcepage.sshome();
	}

	@When ("user clicks on ss problem solving model")
	public void clikconproblsolv() throws InterruptedException {
		resources.navigatetomenu();
		resources.navigatetoss();
		resources.navigatetoss();
		sssresourcepage.dssproblemsolvingmodel();
	}
	@Then ("user is able to verify the ss model")
	public void verifyprobmodel() throws InterruptedException {
		sssresourcepage.probsolvimagedisplay();
	}
	@Given("user is on ss problem solving page")
	public void probsolv() throws InterruptedException {
		Thread.sleep(5000);
		sssresourcepage.probsolvimagedisplay();
	}

	@When ("user clicks on ss situation and challenge")
	public void clicksituandchall() throws InterruptedException {
		resources.navigatetomenu();
		resources.navigatetoss();
		resources.navigatetoss();
		sssresourcepage.sssituation_challenge();
	}
	@Then ("user is able to verify the SSS situation") 
	public void verifydesertsitu() {
		sssresourcepage.verifysssitu();
	}
	@And ("user is able to verify the SSS challenge")
	public void verifydesertchall() {
		sssresourcepage.verifysschall();
	}

}






