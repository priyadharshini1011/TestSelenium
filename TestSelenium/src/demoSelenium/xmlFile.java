package demoSelenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xmlFile {
	private static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		File inputfile = new File (System.getProperty("user.dir")+"\\src\\config\\NewFile1.xml");
	
		SAXReader saxreader = new SAXReader();
		Document  doc = saxreader.read(inputfile);
		System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		String name = doc.selectSingleNode("//menu/name").getText(); 
		String pass1 = doc.selectSingleNode("//menu/password").getText(); 
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(name);
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(pass1);
		//Password.sendKeys("disha@123");
		WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
		Login.click();
		System.out.println("login success");
	}

}
