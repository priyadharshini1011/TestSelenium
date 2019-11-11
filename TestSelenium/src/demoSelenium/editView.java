package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class editView extends CssSelector {
	@Test(priority=4,enabled =false)
	public static void edView() throws InterruptedException {
		WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select optionView = new Select(view);
		optionView.selectByVisibleText("All Accounts");
		Thread.sleep(5000);
		WebElement editOption = driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));
		editOption.click();
		System.out.println("edit clicked");
		WebElement editviewname = driver.findElement(By.xpath("//input[@id='fname']"));
		editviewname.clear();
		editviewname.sendKeys("All Account");
		System.out.println("changed");
		WebElement editOperator = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select editOption1 = new Select(editOperator);
		editOption1.selectByVisibleText("Account Name");
		System.out.println("selected acc name ");
		WebElement operatorEdit = driver.findElement(By.xpath("//select[@id='fop1']"));
		Select operatorEdit1 = new Select(operatorEdit);
		operatorEdit1.selectByVisibleText("contains");
		System.out.println("selected cotains");
		WebElement value = driver.findElement(By.xpath("//input[@id='fval1']"));
		value.sendKeys("a");
		System.out.println("given value a");
		WebElement AvailableField = driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
		Select AvailableField1 = new Select(AvailableField);
		AvailableField1.selectByVisibleText("Last Activity");
		System.out.println("selected last activity");
		WebElement addField = driver.findElement(By.xpath("//*[@class='rightArrowIcon']"));
		addField.click();
		System.out.println("add clicked");
		WebElement saveEdited = driver.findElement(By.xpath("//input[@class='btn primary']"));
		saveEdited.click();
		System.out.println("saved");
	}

}
