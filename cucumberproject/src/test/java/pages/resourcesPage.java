package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resourcesPage {

	WebDriver driver;
	public resourcesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	String downloadPath="C:\\Users\\MadhuGali\\Downloads\\resourcesdownloads";
	String fileName="Quick-Start Guide (4)";

	String desertsituation="The Desert Situation";
	String facilitatormater="Facilitator Materials";
	String probsolving="Problem-Solving Model";
	String subsituation="The Subarctic Situation";
	String ppssituation="The Situation";
	String sssituation="The Subarctic Situation";


	//Resources Tab
	String resourcess="Resources";
	@FindBy(xpath = "//span[@id='ResourcesTabLink']") WebElement resourcestab;
	@FindBy(xpath = "//*[@id='ResourceLandingTitle']") WebElement resourcestitle ;
	@FindBy(xpath = "//*[@id='lblMenu']") WebElement menulabel;

	// Menu items under resources 
	@FindBy(partialLinkText = "Desert Survival Situ") WebElement dssTab;
	@FindBy(partialLinkText = "Group Styles Invento") WebElement gsiTab;
	@FindBy(partialLinkText = "Life Styles Invento") WebElement lsiTab;
	@FindBy(partialLinkText = "Project Planning Sit") WebElement ppsTab;
	@FindBy(partialLinkText = "Subarctic Survival S") WebElement sssTab;

	//Sub Menu
	@FindBy(linkText = "Facilitator Materials") WebElement facilitatormaterials;
	@FindBy(linkText = "Problem-Solving Model") WebElement  probsolvingmodel;
	@FindBy(linkText = "Situation & Challenge") WebElement  situationandchallenge;

	//navigate to resoiurces tab
	public void resourcetab() {
		resourcestab.click();
		String res=resourcestitle.getText();
		if (resourcess.equals(res)) {
			System.out.println("Navigated to resources tab Passed");
		}
		else {
			System.out.println("Navigated to resources Failed");
		}
	}
	//Navigate to menu
	public void navigatetomenu() {
		menulabel.click();
	}

	//Verify tabs displayed on menu 
	public void dsstabdisplayed() throws InterruptedException {
		Thread.sleep(2000);
		dssTab.isDisplayed();
	}
	public void sstabdisplayed() throws InterruptedException {
		Thread.sleep(2000);
		sssTab.isDisplayed();
	}
	public void ppstabdisplayed() throws InterruptedException {
		Thread.sleep(2000);
		ppsTab.isDisplayed();
	}

	//Methods for navigating to tabs
	public void navigatetodss() throws InterruptedException {
		Thread.sleep(2000);
		dssTab.click();
	}
	public void navigatetoss() throws InterruptedException {
		Thread.sleep(2000);
		sssTab.click();
	}
	public void navigatetopps() throws InterruptedException {
		Thread.sleep(2000);
		ppsTab.click();
	}
































	//GSI Facilitator Materials
	@FindBy(xpath = "//*[@id='SubMenu']/ul/div[2]/div/li/a") WebElement facilitatormaterialsgsi;
	@FindBy(xpath = "//*[@id='GSIQuickStartGuide']/h3/a") WebElement gsiquickstrtguide;
	@FindBy(xpath = "//*[@id='FacilitatorMaterialsTitle']") WebElement gsititle;	
	@FindBy(xpath = "//*[@id='GSIPartGuideURL']") WebElement gsiguideurl;	

	public void gsi() {
		gsiTab.click();
		facilitatormaterialsgsi.click();
		String gsi1=gsititle.getText();
		if (facilitatormater.equals(gsi1)) {
			System.out.println("GSI Passed");
		}
		else {
			System.out.println("GSI Failed");
		}
		gsiquickstrtguide.click();
		gsiguideurl.click();
		newtab();

	}
	public void newtab() {
		Set wnd = driver.getWindowHandles();
		// window handles iterate
		System.out.println(""+wnd);
		Iterator i   = wnd.iterator();
		String popwnd = (String) i.next();
		String prntw = (String) i.next();
		// switching pop up tab
		driver.switchTo().window(prntw);
		System.out.println("Page title of popup: "+ driver.getTitle());
		// closes all windows
		driver.close();
		driver.switchTo().window(popwnd);
	}

	//LSI
	String lsi1="LSI 1 Self-Development Guide";
	String lsi2="LSI 2 Self-Development Guide";

	@FindBy(xpath = "//*[@id='SubMenu']/ul/div[3]/div/li/a") WebElement selfdevguide;
	@FindBy(xpath = "//h3[contains(text(),'LSI 1 Self-Development Guide')]") WebElement lsi1devguide ;
	@FindBy(xpath = "//h3[contains(text(),'LSI 2 Self-Development Guide')]") WebElement lsi2devguide;
	@FindBy(xpath = "//*[@id='LSI1URL']") WebElement lsi1url;
	@FindBy(xpath = "//*[@id='LSI1URL']") WebElement lsi2url;

	public void lsi1() {
		lsiTab.click();
		selfdevguide.click();
		String lsiP1=lsi1devguide.getText();
		if (lsiP1.equals(lsi1)) {
			System.out.println("LSI1 Passed");
		}
		else {

			System.out.println("LSI1 Failed");
		}
		lsi1url.click();
		newtab();
	}
	public void lsi2() {
		lsiTab.click();
		selfdevguide.click();
		String lsiP2=lsi2devguide.getText();
		if (lsiP2.equals(lsi2)) {
			System.out.println("LSI2 Passed");
		}
		else {
			System.out.println("LSI2 Failed");
		}
		lsi2url.click();
		newtab();
	}		












}















