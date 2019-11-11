package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class AccountTab11 extends CssSelector {
@Test(priority=7,enabled=false)
		// TODO Auto-generated method stub
		public void userAccount() throws InterruptedException {
	logger = reports.startTest("userAccount");
	WebElement login = driver.findElement(By.xpath(prop.getProperty("Login")));
	login.click();
	logger.log(LogStatus.PASS, "Pressed Login");
	
	WebElement input = driver.findElement(By.xpath(prop.getProperty("userid")));
	input.sendKeys(prop.getProperty("username"));
	logger.log(LogStatus.PASS, "entered username");
	
	WebElement Password = driver.findElement(By.xpath(prop.getProperty("passwordid")));
	Password.clear();
	Password.sendKeys(prop.getProperty("password"));
	logger.log(LogStatus.PASS, "entered password");
	
	WebElement rememberMe = driver.findElement(By.xpath(prop.getProperty("rememberid")));
	rememberMe.click();
	logger.log(LogStatus.PASS, "remember me");
	
	WebElement loginSub = driver.findElement(By.xpath(prop.getProperty("Loginpath")));
	loginSub.click();
	logger.log(LogStatus.PASS, "Logged in");
	
	WebElement closePopUpWindow = driver.findElement(By.xpath(prop.getProperty("closepopup")));
	closePopUpWindow.click();
	logger.log(LogStatus.PASS, "Closed the popup");
	WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		WebElement new1 = driver.findElement(By.xpath("//input[@name='new']"));
		new1.click();
		Thread.sleep(5000);
		System.out.println("clicked");
		WebElement accountName = driver.findElement(By.xpath("//form[@id='editPage']/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]"));
		accountName.sendKeys("Arun2");
		WebElement saveAccount = driver.findElement(By.xpath("//input[@class='btn']"));
		saveAccount.click();
		WebElement actualAccount = driver.findElement(By.xpath("//*[@id=\"contactHeaderRow\"]/div[2]/h2"));
		String actualUsername = actualAccount.getText();
		System.out.println(actualUsername);
		String expectedUsername = "Arun2";
		Assert.assertEquals(actualUsername, expectedUsername);
		logger.log(LogStatus.PASS, "UserNAme Found");
	}

}
