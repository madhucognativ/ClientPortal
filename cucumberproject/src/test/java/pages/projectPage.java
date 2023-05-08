package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class projectPage {
	
	@FindBy(xpath = "//*[@id='PasswordInput']") WebElement respondents;
	
	public void navigatetorespondents(WebDriver driver) {
		respondents.click();
		
	}
}
