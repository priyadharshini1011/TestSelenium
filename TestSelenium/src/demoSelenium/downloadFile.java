package demoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class downloadFile {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException,AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
		
		String download ="C:\\jar";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", download);
		 
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		driver = new ChromeDriver(options);
		driver.get("https://www.salesforce.com");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys("priyadharshini.dp.1011-r7ah@force.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys("disha@123");
		
		
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();

		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		
		WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		WebElement mySetting = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink']"));
		mySetting.click();
		Thread.sleep(5000);
		WebElement personalInfo = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
		personalInfo.click();
		
		WebElement loginHistory = driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		loginHistory.click();
		
		Thread.sleep(5000);
		WebElement historyDownload = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		historyDownload.click();
		File folder = new File(download);
		 
		//List the files on that folder
		File[] listOfFiles = folder.listFiles();
		boolean found = false;
		File f = null;
		     //Look for the file in the files
		     // You should write smart REGEX according to the filename
		     for (File listOfFile : listOfFiles) {
		         if (listOfFile.isFile()) {
		              String fileName = listOfFile.getName();
		               System.out.println("File " + listOfFile.getName());
		               if (fileName.matches(".csv")) {
		                   f = new File(fileName);
		                   found = true;
		                }
		            }
		        }
		System.out.println("matches");
		
		/*WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		WebElement mySetting = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink']"));
		mySetting.click();
		Thread.sleep(5000);
		WebElement emailSetup = driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		emailSetup.click();
		WebElement myEmail = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		myEmail.click();
		
		WebElement emailSignature = driver.findElement(By.xpath("//textarea[@id='signature']"));
		emailSignature.clear();
		emailSignature.sendKeys("hi hello");
	//	Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_CLEAR);
		//r.keyRelease(KeyEvent.VK_CLEAR);
		//r.keyPress(KeyEvent.VK_B);
		//r.keyRelease(KeyEvent.VK_B);
		
		Thread.sleep(7000);
		System.out.println("typed");
		WebElement save = driver.findElement(By.xpath("//input[@class='btn primary']"));
		save.click();
		WebElement msgText = driver.findElement(By.xpath("//div[@class='messageText']"));
		System.out.println(msgText.getText());*/
	/*	WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		WebElement mySetting = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink']"));
		mySetting.click();
		Thread.sleep(5000);
		WebElement calendar = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		calendar.click();
		WebElement remainder = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		remainder.click();
		WebElement testRemainder = driver.findElement(By.xpath("//input[@id='testbtn']"));
		testRemainder.click();
		String primarywindow = driver.getWindowHandle();
		for(String handle:driver.getWindowHandles()) {
			System.out.println(handle);
			driver.switchTo().window(handle);
		}
		driver.switchTo().window(primarywindow);
		Thread.sleep(5000);
		driver.quit();*/
		
	}

}
