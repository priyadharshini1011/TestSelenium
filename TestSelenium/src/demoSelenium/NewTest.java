package demoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NewTest {
			public static WebDriver driver;

		// TODO Auto-generated method stub	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); //to maximize the window
			driver.get("https://selenium-prd.firebaseapp.com");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Thread.sleep(3000);
			WebElement UserName = driver.findElement(By.id("email_field"));
			UserName.sendKeys("admin123@gmail.com");
			WebElement Password = driver.findElement(By.id("password_field"));
			Password.sendKeys("admin123");
			WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
			LoginButton.click();
			Thread.sleep(3000);
			WebElement Switch = driver.findElement(By.className("dropbtn"));
			Switch.click();
			Thread.sleep(3000);
			//WebElement AlertCLick = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
			//AlertCLick.click();
			//WebElement WindowALert = driver.findElement(By.className("bootbutton"));
			//WindowALert.click();
			///Alert SwitchALert = driver.switchTo().alert();
			//System.out.println(SwitchALert.getText());
			//SwitchALert.accept();            
			/*WebElement Windows = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
			Windows.click();
			//WebElement ClickOpen = driver.findElement(By.className("bootbutton"));
			WebElement  newWindow = driver.findElement(By.xpath("//a[2]//button[1]"));
			//ClickOpen.click();
			newWindow.click();
			Thread.sleep(2000);
			String primarywindow = driver.getWindowHandle();
			for(String handle:driver.getWindowHandles()) {
				System.out.println(handle);
				driver.switchTo().window(handle);
			}
			Thread.sleep(2000);
		
			WebElement googlesearch= driver.findElement(By.name("q"));
			googlesearch.sendKeys("selenium");
			Thread.sleep(2000);
			driver.switchTo().window(primarywindow);
			WebElement Home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			Home.click();
			*/
			
	/*		
		WebElement PromptALert = driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		PromptALert.click();
		
			Alert switchAlert1 = driver.switchTo().alert();
			System.out.println(switchAlert1.getText());
			switchAlert1.sendKeys("Priya");
			switchAlert1.accept();
			Thread.sleep(2000);
			WebElement message = driver.findElement(By.xpath("//p[@id='Selenium']"));
			System.out.println(message.getText());
			*/
			
			//WebElement tab = driver.findElement(By.xpath("//a[contains(text(),'Tabs')]"));
			//tab.click();
		//	WebElement londoClick = driver.findElement(By.xpath("//button[contains(text(),'London')]"));
			//londonClick.clinck();
			
			//WebElement londonText = driver.findElement(By.xpath("//p[contains(text(),'London is the capital city of England.')]"));
			//System.out.println(londonText.getText());
			//WebElement parisClick = driver.findElement(By.xpath("//button[contains(text(),'Paris')]"));
			//parisClick.click();
			//System.out.println("clciked paris");
			//WebElement parisText = driver.findElement(By.xpath("//p[contains(text(),'Paris is the capital of France.')]"));
			///System.out.println(parisText.getText());
			//WebElement Switch = driver.findElement(By.className("dropbtn"));
			//Actions moveOn = new Actions(driver);
			//moveOn.moveToElement(Switch).build().perform();
			//System.out.println("mouse hover");
			//WebElement AlertCLick = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
			//AlertCLick.click();
			Thread.sleep(3000);
			driver.quit();
			
			

	}

}
