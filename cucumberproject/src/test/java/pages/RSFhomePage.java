package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSFhomePage {
	WebDriver driver;
	public RSFhomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
String surveyid="MADH1648";

@FindBy(xpath = "//*[@id='Tab1']/span") WebElement yoursurveys;
@FindBy(xpath = "//*[@id='SurveyStrInput']") WebElement surveyID;
@FindBy(xpath = "//*[@id='SurveyStrGoBtn']") WebElement goBtn;

@FindBy(xpath = "//*[@id='btnNext']") WebElement nxtBtn;
@FindBy(xpath = "//*[@id='btnNext']") WebElement confinxtBtn;
@FindBy(xpath = "//*[@id='UC0_btnNext']") WebElement UC0nxtBtn;
@FindBy(xpath = "//*[@id='UC1_btnIntroNext']") WebElement UC1nxtBtn;

public void clickyoursurveys() throws InterruptedException {
	Thread.sleep(5000);
	yoursurveys.click();
}
public void entersurveyid() {
	surveyID.sendKeys(surveyid);
	goBtn.click();
}
	public void navigatetosurvey() throws InterruptedException {
		Thread.sleep(3000);
		nxtBtn.click();
		Thread.sleep(5000);
		confinxtBtn.click();
		Thread.sleep(5000);
		UC0nxtBtn.click();
		Thread.sleep(5000);
		UC1nxtBtn.click();

		Thread.sleep(6000);
		}
	
}

