package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import pages.homePage;
import pages.basePage;

public class loginsteps {

	loginPage login =new loginPage(basePage.getdriver());
	homePage home= new homePage(basePage.getdriver());
	basePage base=new basePage(basePage.getdriver());

//////////////////////////////////////////////////////////////////////////////
	@Given ("user is on Loginpage")
	public  void user_loginpage() {
		login.navigatetourl();
	}	
	@When ("user enters username and password and language")
	public void user_enterusernamed_password() throws InterruptedException {
		login.logintoCP();
	}
	@And ("clicks on login button")
	public void click_submitbtn() throws InterruptedException {
		login.clicksignBtn();
	}
	@Then ("user is navigated to home page")
	public void navigated_homepage() {
		home.useronhomepage();
	}
////////////////////////////////////////////////////////////////////////////
	 @Given ("user is on Homepage")
	 public void useronHomepage() {
		 home.iscreateproject();
	 }
	 @When ("user clicked logout button")
	 public void click_logoutbtn() {
		 home.logout();
	 }
	 @Then ("user successfully logged out of CP")
	 public void verify_loginpage() {
		 login.isforgotpwd();
		 }

}
