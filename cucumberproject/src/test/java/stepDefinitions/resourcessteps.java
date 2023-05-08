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

public class resourcessteps {


	loginPage login=new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	dssresourcePage dssresourcepage=new dssresourcePage(basePage.getdriver());
	resourcesPage resources=new resourcesPage(basePage.getdriver());

	
	@Given ("user is on client portal homepage")
	public void useronhomepage() {
		home.useronhomepage();
	}
	@When ("user clicks on Resources")
	public void clickonresources() {
		resources.resourcetab();
	}
	@And ("user clicks on menu")
	public void clickonmenu() {
		resources.navigatetomenu();
	}
	@Then ("user can navigate to dss menu items")
	public void verifymenuitems() throws InterruptedException {
		resources.dsstabdisplayed();
	}
	@Then ("user can navigate to pps menu items")
	public void verifymenuitemspps() throws InterruptedException {
		resources.ppstabdisplayed();
	}
	@Then ("user can navigate to sss menu items")
	public void verifymenuitemsss() throws InterruptedException {
		resources.sstabdisplayed();
	}
	@Given ("user is on dss resources menu items") 
	public void dssresourcemenus() throws InterruptedException {
		resources.dsstabdisplayed();
	}
	@Given ("user is on pps resources  menu items")
	public void resourcesmenupps() throws InterruptedException {
		resources.ppstabdisplayed();
	}
	@Given ("user is on sss resources menu items") 
	public void ssresourcemenus() throws InterruptedException {
		resources.sstabdisplayed();
	}
	
	
}
