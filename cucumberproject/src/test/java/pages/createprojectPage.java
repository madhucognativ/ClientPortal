package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createprojectPage {

	WebDriver driver;
	String instrument1 = "Group Styles Inventory";
	String homepagename="Client Portal";
	String Proj_name="Madhu_automation_Proj2";
	String Proj_desc="Madhu_automation_Desc1";
	String groups="2";
	String language1 = "English US";

	@FindBy(xpath = "//*[@id='MaxRespondentsInput']") WebElement maxrespondents ;
	@FindBy(xpath = "//button[@id='UpdateProjectButton']") WebElement savebtn;
	@FindBy(xpath = "//*[@id='confirmModalBtn']") WebElement confrimsavebtn;
	@FindBy(xpath = "//*[@id='ProjectsTabLink']") WebElement projects;
	public createprojectPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterformdata() throws InterruptedException {
		Select instruSelect = new Select(driver.findElement(By.xpath("//*[@id='InstrumentInput']")));
		instruSelect.selectByVisibleText(instrument1);

		driver.findElement(By.xpath("//*[@id='ProjectNameInput']")).sendKeys(Proj_name);
		driver.findElement(By.xpath("//*[@id='DescriptionInput']")).sendKeys(Proj_desc);

		Select objSelect1 = new Select(driver.findElement(By.xpath("//*[@id='LanguageSelect']")));
		objSelect1.selectByVisibleText(language1);

		driver.findElement(By.xpath("//*[@id='GroupCntInput']")).sendKeys(groups);
		driver.findElement(By.xpath("//*[@id='MeetingDateFieldset']/div/span/span/span/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/a[1]")).click();

	}
	public void clickoncreate() {
		driver.findElement(By.xpath("//*[@id='CreateProjectButton']")).click();
	}
	public void enteraddlnfields() {
		maxrespondents.sendKeys("2");
	}
	public void clicksavebtn() {
		savebtn.click();
		confrimsavebtn.click();
	}

	public void confrimproject() {
		projects.click();
	}
}

