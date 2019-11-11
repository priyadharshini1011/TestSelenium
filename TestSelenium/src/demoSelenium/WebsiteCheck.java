package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebsiteCheck {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize the window
		driver.get("https://selenium-prd.firebaseapp.com");
		Thread.sleep(3000);
		WebElement UserName = driver.findElement(By.id("email_field"));
		UserName.sendKeys("admin123@gmail.com");
		WebElement Password = driver.findElement(By.id("password_field"));
		Password.sendKeys("admin123");
		WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		LoginButton.click();
		Thread.sleep(3000);
		WebElement Home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Home.click();
		Thread.sleep(3000);
		WebElement Name = driver.findElement(By.name("name"));
		Name.sendKeys("Priya");
		WebElement FatherName = driver.findElement(By.name("lastname"));
		FatherName.sendKeys("Radhakrihsnan");
		WebElement PostalAddress = driver.findElement(By.id("postaladdress"));
		PostalAddress.sendKeys("17070 garden ");
		WebElement Personal = driver.findElement(By.id("personaladdress"));
		Personal.sendKeys("india");
		WebElement Sex_Female = driver.findElement(By.xpath("//span[2]//input[1]"));
		Sex_Female.click();
		WebElement CityName = driver.findElement(By.name("city"));
		Select dropdown = new Select(CityName);
		//dropdown.selectByVisibleText("NEW DELHI");
		//dropdown.selectByValue("mumbai");
		dropdown.selectByIndex(2);
		WebElement Course = driver.findElement(By.name("course"));
		Select dropdown1 = new Select(Course);
		dropdown1.selectByVisibleText("B.TECH");
		WebElement District = driver.findElement(By.name("district"));
		Select  dropdown2 = new Select(District);
		dropdown2.selectByValue("goa");
		WebElement State = driver.findElement(By.name("state"));
		Select  dropdown3 = new Select(State);
		dropdown3.selectByValue("bca");
		WebElement Pincode = driver.findElement(By.id("pincode"));
		Pincode.sendKeys("92127");
		WebElement EmailId = driver.findElement(By.id("emailid"));
		EmailId.sendKeys("priya@gmail.com");
		WebElement Submit = driver.findElement(By.xpath("//button[@class='bootbutton']"));
		Submit.click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
