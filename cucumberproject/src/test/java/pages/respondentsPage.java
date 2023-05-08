package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class respondentsPage {

	WebDriver driver;
	public respondentsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	String emailID="madhu.gali@cognativinc.com";
	String group="Group2";
	String Password = "Arjun@12345#";
	String urlsrsp="https://euidc.humansynergistics.com/rp";

	@FindBy(xpath = "//button[@id='AddRowBtn']") WebElement addBtn;
	@FindBy(xpath = "//*[@id='SaveBtn']") WebElement saveBtn;
	@FindBy(xpath = "//*[@id='DefineGroupsBtn']") WebElement groups ;
	@FindBy(xpath = "//*[@id='EmailBtn']") WebElement emailBtn;
	@FindBy(xpath = "//*[@id='GroupSelect']") WebElement selectGroup ;
	@FindBy(xpath = "//*[@id='EmailInput']") WebElement emailIDs;
	@FindBy(xpath = "//*[@id='MemberGrid_active_cell']") WebElement confirmrespondent;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]") WebElement selectBtn;
	@FindBy(xpath = "//*[@id='AddRespondentBtn']") WebElement addbtnonpopup;
	@FindBy(xpath = "//*[@id='CloseRespondentBtn']") WebElement closebtnonpopup;
	@FindBy(xpath = "//button[@id='EmailBtn']") WebElement emailbtn ;

	@FindBy(xpath = "//*[@id='SurveyURL']/span/a") WebElement rspsurveyurl ;
	@FindBy(xpath = "//*[@id='SurveyID']/span") WebElement surveyID ;

	@FindBy(xpath = "//*[@id='SurveyID']/span") WebElement surveyid ;
	@FindBy(xpath = "//*[@id='PasswordInput']") WebElement respondenturlpwd;
	@FindBy(xpath = "//*[@id='ButtonLI']/button") WebElement submitinrp;
	@FindBy(xpath = "//*[@id='EmailInput']") WebElement emailid;
	@FindBy(xpath = "//*[@id='ButtonLI']/button") WebElement nextbtn;
	@FindBy(xpath = "//span[contains(text(),'Your Surveys')]") WebElement surveys;
	@FindBy(xpath = "//input[@id='SurveyStrInput']") WebElement surveyIDs;

	public String getsurveyid() {
		String surveysid=surveyID.getText();
		System.out.println(surveysid);
		return surveysid;
	}
	
		
	public void confirmemailsent() {
		rspsurveyurl.isDisplayed();
	}
	public void addrespondents() throws InterruptedException {
		Thread.sleep(3000);
		addBtn.click();
		emailIDs.sendKeys(emailID);
		Thread.sleep(3000);
		Select objSelect2 = new Select((selectGroup));
		objSelect2.selectByVisibleText(group);
		addbtnonpopup.click();
		closebtnonpopup.click();
	}

	public void selectcheckbox() {
		selectGroup.isDisplayed();
	}
	public void clickemailbtn() {
		emailbtn.click();
	}
	public void clickselect() {
		selectBtn.click();
	}
	public void checkrespondent() throws InterruptedException {
		Thread.sleep(5000);
		selectBtn.isDisplayed();
	}
	public  void Respondentportallogins() {
		driver.get(urlsrsp);
		System.out.println(urlsrsp);
		driver.manage().window().maximize();
		emailid.sendKeys("madhu.gali@cognativinc.com");
		nextbtn.click();
		respondenturlpwd.sendKeys(Password);
		submitinrp.click();
	}
}