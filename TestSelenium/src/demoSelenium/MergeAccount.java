package demoSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class MergeAccount extends CssSelector{
@Test(priority=5,enabled=false)
public  void  mergeTwoAccount() {
	logger = reports.startTest("mergeTwoAccount");
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
	
	WebElement clickMerge = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
	clickMerge.click();
	WebElement textType = driver.findElement(By.xpath("//input[@id='srch']"));
	textType.sendKeys("apple");
	WebElement findAcc = driver.findElement(By.xpath("//div[@class='pbWizardBody']//input[@name='srchbutton' ]"));
	findAcc.click();
	WebElement nextClick = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']"));
	nextClick.click();
	WebElement mergeClick = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
	mergeClick.click();
	Alert SwitchALert = driver.switchTo().alert();
	System.out.println(SwitchALert.getText());
	SwitchALert.accept();
	
}
}
