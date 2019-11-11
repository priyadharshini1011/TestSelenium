package demoSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testData {
	private static WebDriver driver;
	Properties prop = new Properties();
	ExtentReports reports;
	ExtentTest logger;

@BeforeTest
public void setup() throws IOException {
		// TODO Auto-generated method stub
	
		reports = new ExtentReports("C:\\Users\\auhum\\Desktop\\ExtendReport\\Login.html");
		logger = reports.startTest("SalesForce");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\config.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URl"));
		logger.log(LogStatus.PASS, "got the URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
}
@Test
	public void login() throws IOException {
		
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(prop.getProperty("username"));
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(prop.getProperty("password"));
		//Password.sendKeys("disha@123");
		WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
		Login.click();
		logger.log(LogStatus.PASS, "logged in succeessfully");
		System.out.println("login success");
	}
@AfterTest
	public void close()
	{
	reports.endTest(logger);
	reports.flush(); 
		driver.close();
	}
	

}
