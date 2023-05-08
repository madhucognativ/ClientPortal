package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dssresourcePage {

	WebDriver driver;
	public dssresourcePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	String desertsituation="The Desert Situation";
	String facilitatormater="Facilitator Materials";
	String probsolving="Problem-Solving Model";

	//DSS Sub menu
	@FindBy(linkText = "Facilitator Materials") WebElement facilitatormaterials;
	@FindBy(linkText = "Problem-Solving Model") WebElement  probsolvingmodel;
	@FindBy(linkText = "Situation & Challenge") WebElement  situationandchallenge;

	//DSS facilitator Downloads
	@FindBy(xpath = "//*[@id='FacilitatorMaterialsTitle']") WebElement dssfacilitatormaterialTitle ;
	@FindBy(xpath = "//*[@id='DesFacMaterialContent']/h3[1]/a") WebElement dssprepGuide ;
	@FindBy(xpath = "//*[@id='DesFacMaterialContent']/h3[2]/a") WebElement dssQsguide;
	@FindBy(xpath = "//*[@id='DesFacMaterialContent']/h3[3]/a") WebElement dsstmguide;
	@FindBy(xpath = "//*[@id='DesFacMaterialContent']/h3[4]/a") WebElement dssfacilitatorscript;
	@FindBy(xpath = "//*[@id='DesFacMaterialContent']/h3[5]/a") WebElement dssobserversguide;
	@FindBy(xpath = "//*[@id='DesFacMaterialContent']/h3[6]/a") WebElement dssebriefguide;
	@FindBy(xpath = "//*[@id='DesFacMaterialContent']/h3[7]/a") WebElement dsstutorialguide;	

	//DSS problem solving model
	@FindBy(xpath = "//h1[@id='SimProblemSolvingTitle']") WebElement dssprobsolvtitle ;
	@FindBy(xpath = "//img[@id='ProblemSolvingImage']") WebElement dssprobsolvimage ;

	// DSS situation and challenge	
	@FindBy(xpath = "//h1[@id='DesSituationTitle']") WebElement desertsitutitle ;
	@FindBy(xpath = "//p[@id='DesSituationContent']") WebElement desertsitucontent;
	@FindBy(xpath = "//p[@id='DesChallengeContent']") WebElement desertchallengecontent;


//Methods for DSS

	public void clickondssfacilitatormaterials() throws InterruptedException {
		Thread.sleep(3000);
		facilitatormaterials.click();
		String dss1=dssfacilitatormaterialTitle.getText();
		if (facilitatormater.equals(dss1)) {
			System.out.println("navigated to DSS facilitator materials Passed");
		}
		else {
			System.out.println("navigated to DSS facilitator materials Failed");
		}
	}

	public void dssfacilitatormaterialsdownload() throws InterruptedException {
		dssprepGuide.click();
		dssQsguide.click();
		dsstmguide.click();
		Thread.sleep(5000);
		dssfacilitatorscript.click();
		dssobserversguide.click();
		dssebriefguide.click();
		dsstutorialguide.click();
		Thread.sleep(5000);
	}

	public void dsshome() {
		dssfacilitatormaterialTitle.isDisplayed();
	}
	public void dssproblemsolvingmodel() throws InterruptedException {
		Thread.sleep(10000);
		probsolvingmodel.click();
		String probsolv=dssprobsolvtitle.getText();
		if (probsolving.equals(probsolv)) {
			System.out.println("DSS Passed");
		}
		else {
			System.out.println("DSS Failed");
		}
		dssprobsolvimage.isDisplayed();
	}
	public void probsolvimagedisplay() throws InterruptedException {
		Thread.sleep(5000);
		dssprobsolvimage.isDisplayed();
	}
	public void dsssituation_challenge() throws InterruptedException {

		Thread.sleep(10000);

		situationandchallenge.click();
		String dssituations=desertsitutitle.getText();
		if (dssituations.equals(desertsituation)) {
			System.out.println("DSS situation Passed");
		}
		else {
			System.out.println("DSS situation Failed");
		}
	}
	public void verifysdsssitu() {
		desertsitucontent.isDisplayed();
	}
	public void verifysdsschall() {
		desertchallengecontent.isDisplayed();
	}

	public void ppssituationchallenge() throws InterruptedException {

		Thread.sleep(10000);

		situationandchallenge.click();
		String dssituations=desertsitutitle.getText();
		if (dssituations.equals(desertsituation)) {
			System.out.println("PPS situation Passed");
		}
		else {
			System.out.println("DSS situation Failed");
		}
	}
	public void verifyppssitu() {
		desertsitucontent.isDisplayed();
	}
	public void verifyppschall() {
		desertchallengecontent.isDisplayed();
	}




}
