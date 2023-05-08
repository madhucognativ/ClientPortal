package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ppsresourcePage {
	String facilitatormater="Facilitator Materials";
	String probsolving="Problem-Solving Model";
	String subsituation="The Subarctic Situation";
	String ppssituation="The Situation";
	
	WebDriver driver;
	public ppsresourcePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Facilitator Materials") WebElement facilitatormaterials;
	@FindBy(linkText = "Problem-Solving Model") WebElement  probsolvingmodel;
	@FindBy(linkText = "Situation & Challenge") WebElement  situationandchallenge;

	@FindBy(xpath = "//*[@id='FacilitatorMaterialsTitle']") WebElement ppsfacilitatortitle ;
	@FindBy(xpath = "//*[@id='ppFacMaterialContent']/h3[1]/a") WebElement ppsprepGuide ;
	@FindBy(xpath = "//*[@id='ppFacMaterialContent']/h3[2]/a") WebElement ppsQsguide;
	@FindBy(xpath = "//*[@id='ppFacMaterialContent']/h3[3]/a") WebElement ppstmguide;
	@FindBy(xpath = "//*[@id='ppFacMaterialContent']/h3[4]/a") WebElement ppsfacilitatorscript;
	@FindBy(xpath = "//*[@id='ppFacMaterialContent']/h3[5]/a") WebElement ppsobserversguide;
	@FindBy(xpath = "//*[@id='ppFacMaterialContent']/h3[6]/a") WebElement ppsebriefguide;
	@FindBy(xpath = "//*[@id='ppFacMaterialContent']/h3[7]/a") WebElement ppstutorialguide;	


	// PPS situation and challenge	
	@FindBy(xpath = "//h1[@id='ppSituationTitle']") WebElement ppssitutitle ;
	@FindBy(xpath = "//p[@id='ppSituationContent']") WebElement ppssitucontent;
	@FindBy(xpath = "//p[@id='ppChallengeContent']") WebElement ppschallengecontent;

	//PPS problem solving model
	@FindBy(xpath = "//h1[@id='SimProblemSolvingTitle']") WebElement ppsprobsolvtitle ;
	@FindBy(xpath = "//img[@id='ProblemSolvingImage']") WebElement ppsprobsolvimage ;

	public void clickonPPSfacilitaormaterials() throws InterruptedException {
		Thread.sleep(3000);
		facilitatormaterials.click();
		String pps1=ppsfacilitatortitle.getText();
		if (facilitatormater.equals(pps1)) {
			System.out.println("PPS Passed");
		}
		else {
			System.out.println("PPS Failed");
		}
	}

	

	public void ppsfacilitatormaterials() {
		ppsprepGuide.click();
		ppsQsguide.click();
		ppstmguide.click();
		ppsfacilitatorscript.click();
		ppsobserversguide.click();
		ppsebriefguide.click();
		ppstutorialguide.click();
	}


	public void ppshome() {
		ppsfacilitatortitle.isDisplayed();
	}
	public void ppsproblemsolvingmodel() throws InterruptedException {
		Thread.sleep(5000);
		probsolvingmodel.click();
		String probsolv=ppsprobsolvtitle.getText();
		if (probsolving.equals(probsolv)) {
			System.out.println("PPS Passed");
		}
		else {
			System.out.println("PPS Failed");
		}
		ppsprobsolvimage.isDisplayed();
	}
	public void isppsproblemsolvingmodel() throws InterruptedException {
		Thread.sleep(5000);
		ppsprobsolvimage.isDisplayed();
	}
	
	
	public void ppssituation_challenge() throws InterruptedException {
		Thread.sleep(2000);
		situationandchallenge.click();
		String ppssituations=ppssitutitle.getText();
		if (ppssituations.equals(ppssituation)) {
			System.out.println("PPS situation Passed");
		}
		else {
			System.out.println("PPS situation Failed");
		}
		ppssitucontent.isDisplayed();
		ppschallengecontent.isDisplayed();
	}
	public void verifyppssitu() {
		ppssitucontent.isDisplayed();
	}
	public void verifyppschall() {
		ppschallengecontent.isDisplayed();

}
}