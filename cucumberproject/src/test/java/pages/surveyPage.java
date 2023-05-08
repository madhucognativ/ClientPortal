package pages;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class surveyPage {
	WebDriver driver;
	public surveyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl04_tbData']") WebElement txt1;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl06_tbData']") WebElement txt2;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl08_tbData']") WebElement txt3;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl10_tbData']") WebElement txt4;

	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl12_tbData']") WebElement txt5;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl14_tbData']") WebElement txt6;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl16_tbData']") WebElement txt7;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl18_tbData']") WebElement txt8;

	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl20_tbData']") WebElement txt9;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl22_tbData']") WebElement txt10;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl24_tbData']") WebElement txt11;
	@FindBy(xpath = "//*[@id='UC1_rgData_ctl00_ctl26_tbData']") WebElement txt12;


	@FindBy(xpath = "//*[@id='UC2_rgData_ctl00_ctl04_tbData']") WebElement txt13;
	@FindBy(xpath = "//*[@id='UC2_rgData_ctl00_ctl06_tbData']") WebElement txt14;
	@FindBy(xpath = "//*[@id='UC2_rgData_ctl00_ctl08_tbData']") WebElement txt15;
	@FindBy(xpath = "//*[@id='UC2_rgData_ctl00_ctl10_tbData']") WebElement txt16;

	@FindBy(xpath = "//*[@id='UC2_rgData_ctl00_ctl12_tbData']") WebElement txt17;
	@FindBy(xpath = "//*[@id='UC2_rgData_ctl00_ctl14_tbData']") WebElement txt18;
	@FindBy(xpath = "//*[@id='UC2_rgData_ctl00_ctl16_tbData']") WebElement txt19;


	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl04_tbData']") WebElement txt20;
	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl06_tbData']") WebElement txt21;
	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl08_tbData']") WebElement txt22;
	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl10_tbData']") WebElement txt23;

	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl12_tbData']") WebElement txt24;
	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl14_tbData']") WebElement txt25;
	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl16_tbData']") WebElement txt26;
	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl18_tbData']") WebElement txt27;

	@FindBy(xpath = "//*[@id='UC3_rgData_ctl00_ctl20_tbData']") WebElement txt28;
	
	@FindBy(xpath = "//*[@id='UC1_btnNext']") WebElement uc1btnnxt;
	@FindBy(xpath = "//*[@id='UC2_btnIntroNext']") WebElement uc2btnintro;
	@FindBy(xpath = "//*[@id='UC2_btnNext']") WebElement uc2btnnxt;
	@FindBy(xpath = "//*[@id='UC3_btnIntroNext']") WebElement uc3btnintro;

	@FindBy(xpath = "//*[@id='UC3_btnNext']") WebElement uc3btnnxt;
	@FindBy(xpath = "//*[@id='UC4_btnSubmit']") WebElement uc4btnsubmit;
	@FindBy(xpath = "//*[@id='ReportButtons']/div/button[1]") WebElement reportviewbtn;
	@FindBy(xpath = "//*[@id='ReportButtons']/div/button[2]") WebElement reportdownloadbtn;
	@FindBy(xpath = "//*[@id='category']/h5") WebElement circ;




	public void survey_fill() {

		txt1.sendKeys("4");
		txt2.sendKeys("4");
		txt3.sendKeys("4");
		txt4.sendKeys("4");

		txt5.sendKeys("4");
		txt6.sendKeys("4");
		txt7.sendKeys("4");
		txt8.sendKeys("4");

		txt9.sendKeys("4");
		txt10.sendKeys("4");
		txt11.sendKeys("4");
		txt12.sendKeys("4");

	} 
public void clicknxtBtn() {
	uc1btnnxt.click();
}
	

	public void surveyfilloperations() {
			uc2btnintro.click();
	}

	public void Survey1(){
		txt13.sendKeys("4");
		txt14.sendKeys("4");
		txt15.sendKeys("4");
		txt16.sendKeys("4");
		txt17.sendKeys("4");
		txt18.sendKeys("4");
		txt19.sendKeys("4");
	}

	public void surveyfilloperations1() {
		uc1btnnxt.click();
		uc2btnintro.click();
		uc2btnnxt.click();
		uc3btnintro.click();
	}
	public void Survey2() {

		txt20.sendKeys("4");
		txt21.sendKeys("3");
		txt22.sendKeys("4");
		txt23.sendKeys("4");
		txt24.sendKeys("4");
		txt25.sendKeys("4");
		txt26.sendKeys("4");
		txt27.sendKeys("2");
		txt28.sendKeys("4");
	}



	public void surveyfilloperation3() {
		uc3btnnxt.click();
		uc4btnsubmit.click();
		reportviewbtn.click();
		reportdownloadbtn.click();
	}

	public void assertscircmap() {
		String circmap = "Interactive Circumplex";
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(1));


		String circmaps = circ.getText();

		if (circmap.equals(circmaps)) {
			System.out.println("circ maps page loaded");

		}

	}

}
