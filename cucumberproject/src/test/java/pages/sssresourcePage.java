package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sssresourcePage {

	String sssituation="The Subarctic Situation";
	WebDriver driver;
	public sssresourcePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//SSS submenu

	@FindBy(linkText = "Facilitator Materials") WebElement ssfacilitatormaterials;
	@FindBy(linkText = "Problem-Solving Model") WebElement  ssprobsolvingmodel;
	@FindBy(linkText = "Situation & Challenge") WebElement  sssituationandchallenge;
	
	


	@FindBy(xpath = "//*[@id='FacilitatorMaterialsTitle']") WebElement sstitle;

	//SSS facilitator materials

	@FindBy(xpath = "//*[@id='SubFacMaterialContent']/h3[1]/a") WebElement ssprepGuide;
	@FindBy(xpath = "//*[@id='SubFacMaterialContent']/h3[2]/a") WebElement ssQsguide;
	@FindBy(xpath = "//*[@id='SubFacMaterialContent']/h3[3]/a") WebElement sstmguide;
	@FindBy(xpath = "//*[@id='SubFacMaterialContent']/h3[4]/a") WebElement ssfacilitatorscript;
	@FindBy(xpath = "//*[@id='SubFacMaterialContent']/h3[5]/a") WebElement ssobserversguide;
	@FindBy(xpath = "//*[@id='SubFacMaterialContent']/h3[6]/a") WebElement ssdebriefguide;
	@FindBy(xpath = "//*[@id='SubFacMaterialContent']/h3[7]/a") WebElement sstutorialvideo;

	//SSS problem solv guide

	@FindBy(xpath = "//*[@id='SubMenu']/ul/div[5]/div/li[2]/a") WebElement ssprobsol;
	@FindBy(xpath = "//*[@id='SimProblemSolvingTitle']") WebElement ssprobsolvtitle;
	@FindBy(xpath = "//*[@id='ProblemSolvingImage']") WebElement ssprobsolvimg;


	//SSS situation and challenge

	@FindBy(xpath = "//*[@id='SubMenu']/ul/div[5]/div/li[3]/a") WebElement sssituandchallenge ;
	@FindBy(xpath = "//*[@id='SubSituationTitle']") WebElement sssitutitle ;
	@FindBy(xpath = "//img[@id='subarcticMap']") WebElement ssmap ;




	String facilitatormater="Facilitator Materials";
	String probsolving="Problem-Solving Model";



	public void clickondssfacilitaormaterials() throws InterruptedException {
		Thread.sleep(3000);
		ssfacilitatormaterials.click();
		String dss1=sstitle.getText();
		if (facilitatormater.equals(dss1)) {
			System.out.println("PPS Passed");
		}
		else {
			System.out.println("PPS Failed");
		}
	}

	public void ssfacilitatormaterialsdownload() throws InterruptedException {

		ssprepGuide.click();
		ssQsguide.click();
		sstmguide.click();
		Thread.sleep(5000);
		ssfacilitatorscript.click();
		ssobserversguide.click();
		ssdebriefguide.click();
		sstutorialvideo.click();
		Thread.sleep(5000);

	}

	public void sshome() {
		sstitle.isDisplayed();
	}
	public void dssproblemsolvingmodel() throws InterruptedException {
		Thread.sleep(10000);
		ssprobsol.click();
		String probsolv=ssprobsolvtitle.getText();
		if (probsolving.equals(probsolv)) {
			System.out.println("DSS Passed");
		}
		else {
			System.out.println("DSS Failed");
		}
		ssprobsolvimg.isDisplayed();
	}
	public void probsolvimagedisplay() throws InterruptedException {
		Thread.sleep(5000);
		ssprobsolvimg.isDisplayed();
	}





	public void sssituation_challenge() throws InterruptedException {

		Thread.sleep(10000);

		sssituandchallenge.click();
		String ssituations=sssitutitle.getText();
		if (ssituations.equals(sssituation)) {
			System.out.println("SS situation Passed");
		}
		else {
			System.out.println("SS situation Failed");
		}
	}
	public void verifysdsssitu() {
		sssitutitle.isDisplayed();
	}
	public void verifysdsschall() {
		ssmap.isDisplayed();
	}

	
	public void verifysssitu() {
		sssitutitle.isDisplayed();
	}
	public void verifysschall() {
		ssmap.isDisplayed();
	}

	


}
