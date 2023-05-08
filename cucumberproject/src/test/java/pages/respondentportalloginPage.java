package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class respondentportalloginPage
{
	WebDriver driver;
	public respondentportalloginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	String rspurl="https://euidc.humansynergistics.com/rp";
	String Password = "Arjun@12345#";
	String username="madhu.gali@cognativinc.com";
	String rsftit="Respondent Portal";
	
	@FindBy(xpath = "//*[@id='SurveyID']/span") WebElement surveyid ;
	@FindBy(xpath = "//*[@id='EmailInput']") WebElement respondenturlusrname;
	@FindBy(xpath = "//*[@id='PasswordInput']") WebElement respondenturlpwd;
	@FindBy(xpath = "//*[@id='ButtonLI']/button") WebElement rspnextbtn;
	@FindBy(xpath = "//*[@id='ButtonLI']/button") WebElement singnbtn;
	
	
	public  void getrspurl() {
		driver.get(rspurl);
		driver.manage().window().maximize();
	}
	public void enterusrandpwd() throws InterruptedException {
		respondenturlusrname.sendKeys(username);
		rspnextbtn.click();
		Thread.sleep(2000);
		
	}
	public void clicksubmit() {
		respondenturlpwd.sendKeys(Password);
		singnbtn.click();
	}
public void confirmrsf() {
	String rsftitle=driver.getTitle();
	System.out.println(rsftitle);
	if (rsftitle.equals(rsftit)) {
		System.out.println("rsf homepage");}
		else {
			System.out.println("not rsf homepage");
		}
	}
}


