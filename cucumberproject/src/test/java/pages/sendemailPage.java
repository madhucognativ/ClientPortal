package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class sendemailPage {
	WebDriver driver;
	public sendemailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='SendEmailDiv']/button[1]") WebElement sendemialconfirm;
	@FindBy(xpath = "//div[@id='EmailCreatePopupDiv']") WebElement emailpopup;
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[5]/button[1]") WebElement sendemailbtn;
	@FindBy(xpath = "//*[@id='sendEmailButton']") WebElement sendbtnemailpopup;

	
	public void sendemail() {
		emailpopup.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		sendbtnemailpopup.click();
		
	}
	public void confirmemailsent(){
		sendemialconfirm.click();
	}
}
