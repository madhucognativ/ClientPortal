package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	static WebDriver driver;
	
	public basePage(WebDriver driver) {
		basePage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 public static WebDriver getdriver(){
		    if (driver == null){
		    	System.setProperty("webdriver.chrome.driver","C:/Users/MadhuGali/Desktop/Drivers/chromedriver.exe");
		      driver = new ChromeDriver();
		      return driver;
		    }else{
		      return driver;
		    }
		  }

	public void openbrowser() {
		
	}
	public void sysdir() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("user directory:"+projectPath);
	}
}
