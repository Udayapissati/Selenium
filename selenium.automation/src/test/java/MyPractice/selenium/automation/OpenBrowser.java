package MyPractice.selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
	
	static WebDriver driver;
	
	  public static void main(String[] args){
		  
		  System.setProperty("webdriver.firefox.marionette", "F:\\Sree_testing\\softwares\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		  driver =  new FirefoxDriver();
		  driver.get("https://www.google.com");
		  
	  }
	
	
	

}
