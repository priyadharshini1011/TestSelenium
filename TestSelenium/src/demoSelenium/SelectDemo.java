package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	//WebElement selectmenu = driver.findElement(By.id("searchDropdownBox"));
		//Select baby = new Select(selectmenu);
		//baby.selectByVisibleText("Baby");
		WebElement mousehover =driver.findElement(By.xpath("//span[@class='nav-line-2 nav-short-width']']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).build().perform();
		
		Thread.sleep(2000);
	}

}
