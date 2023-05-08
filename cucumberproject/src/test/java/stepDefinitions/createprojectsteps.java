package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basePage;
import pages.homePage;
import pages.loginPage;
import pages.createprojectPage;

public class createprojectsteps {

	loginPage login =new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());
	createprojectPage createproject=new createprojectPage(basePage.getdriver());
	
	
	@Given ("user on Home Page")
	public void useronhomepage() {
		home.useronhomepage();
	}

	@When ("user clicks on create Project")
	public void user_clicks_createproject() throws InterruptedException {
		home.createnew();
	}
	@And ("user enters the the form data")
	public void enterformdata() throws InterruptedException {
		createproject.enterformdata();
	}
	@And ("user clicks on create button")
	public void clickoncreatebtn() {
		createproject.clickoncreate();

	}
	@And ("user enters additional fileds on the project details page")	
	public void userentersadditionalfields() {
		createproject.enteraddlnfields();
	}

	@And ("user clicks on Save")
	public void userclickonsavebtn() {
		createproject.clicksavebtn();
	}
	@Then ("GSI Project created")
	public void confrimprojectcreated(){
		createproject.confrimproject();
	}


}
