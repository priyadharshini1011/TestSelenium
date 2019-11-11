package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class CreateNewView extends CssSelector {
@Test(priority=3,enabled = false)
public void newView() throws InterruptedException
{
	logger = reports.startTest("CreateNewView");
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
	WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
	account.click();

	WebElement createNew = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	createNew.click();
	

	WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
	ViewName.sendKeys("s");

	WebElement UniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
	
	UniqueName.click();
	WebElement saveView = driver.findElement(By.xpath("//input[@name='save']"));
	saveView.click();

	
}


}


