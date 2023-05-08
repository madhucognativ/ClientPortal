package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	WebDriver driver;
	String homepagename="Client Portal";

	public homePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//header/div[1]/img[1]") WebElement HSLogo;
	@FindBy(xpath = "//span[@id='ProjectsTabLink']") WebElement ProjectsTab;
	@FindBy(xpath = "//span[@id='FilesTabLink']") WebElement FilesTab;
	@FindBy(xpath = "//span[@id='AccountTabLink']") WebElement MyAccountTab;
	@FindBy(xpath = "//span[@id='ResourcesTabLink']") WebElement ResourcesTab;
	@FindBy(xpath = "//a[contains(text(),'Log Out')]") WebElement Logout;

	@FindBy(xpath = "//span[contains(text(),'Create New')]") WebElement createNew;
	@FindBy(xpath = "//*[@id='projectGrid']/div[2]/table/tbody/tr[1]/td[2]") WebElement projectTitle ;
	

	@FindBy(xpath = "//*[@id='lblMenu']") WebElement menuitem ;
	@FindBy(xpath = "//*[@id='slideout-menu']/ul/li[3]/a") WebElement respondent ;

	public void createnew() throws InterruptedException {
		Thread.sleep(3000);
		createNew.click();
	}
	public void navigatetorespondents(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		projectTitle.click();
	}
	public void useronhomepage() {
		String homepagetitle=driver.getTitle();
		System.out.println(homepagetitle);
		if(homepagetitle.equals(homepagename)) {
			System.out.println("Homepage displayed");
		}	else {
				System.out.println("Homepage not displayed");
			}
		}
	
	public void projecttitleclick() throws InterruptedException {
		Thread.sleep(5000);
		projectTitle.click();
	}

	public void respondents() {
		menuitem.click();
		respondent.click();
	}

	public void logout() {
		Logout.click();
	}
	public void iscreateproject() {
		ProjectsTab.isDisplayed();
	}
}