package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.homePage;
import pages.loginPage;
import pages.resourcesPage;

public class dsssteps {

	loginPage login=new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	
	
	
}
