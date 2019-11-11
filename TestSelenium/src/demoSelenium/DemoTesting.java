package demoSelenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoTesting {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:\\www.keynotesupport.com\\internet\\web-contact-form-example-radio-buttons.shtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement radio_button = driver.findElement(By.xpath("//span[contains(text(),'Microsoft Excel')]/input"));
		 boolean bvalue;
		 bvalue = radio_button.isSelected();
		 if(bvalue==false)
		 {
			 radio_button.click();
			 System.out.println("just selected");
		 }
		 else
		 {
			 System.out.println("it is already selected ,slect another");
		 }
		 
		Thread.sleep(3000);	
		driver.quit();
	
	}

}
