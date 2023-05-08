package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class loginPage {

	WebDriver driver;

	String instrument1 = "Group Styles Inventory";
	String emailID="madhu.gali@cognativinc.com";
	String Password="Arjun@12345#";
	String language1="English US";
	String url="https://euidc.humansynergistics.com/cp/Home/Index";


	@FindBy(xpath = "//*[@id='EmailInput']") WebElement userName;
	@FindBy(xpath = "//*[@id='PasswordInput']") WebElement passWord;
	@FindBy(xpath = "//*[@id='LanguageInputDDL']") WebElement language;
	@FindBy(xpath = "//*[@id='SignInButton']") WebElement submit;
	@FindBy(xpath = "//a[@id='ForgotPassword']") WebElement forgotpwd;

	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void navigatetourl() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void enterusername() {
		userName.sendKeys(emailID);
	}
	public void enterpassword() {
		passWord.sendKeys(Password);
	}
	public void selectlanguage() {
		Select objSelect = new Select(language);
		objSelect.selectByVisibleText(language1);
	}
	public void logintoCP() {
		enterusername();
		enterpassword();
		selectlanguage();
	}
	public void clicksignBtn( ) throws InterruptedException {
		Thread.sleep(2000);
		submit.click();
	}
	public void isforgotpwd() {
		forgotpwd.isDisplayed();
		driver.close();
		driver.quit();
	}

}


