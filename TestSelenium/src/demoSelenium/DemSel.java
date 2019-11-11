package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemSel {
		public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
		//Setup system setup for chrome
//Driver = new ChromeDriver();
		//initialise chrome Browser
//Driver.get("https://selenium-prd.firebaseapp.com");
		//pass the url of web page
System.setProperty("webdriver.gecko.driver", "C:\\jar\\geckodriver.exe");	
driver = new FirefoxDriver();
driver.get("https://www.google.com");

	}

}
