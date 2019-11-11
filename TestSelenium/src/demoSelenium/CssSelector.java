package demoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class CssSelector {
	public static WebDriver driver;
	Properties prop = new Properties();
	ExtentReports reports;
	ExtentTest logger;
	
/*	public static void main(String[] args) throws InterruptedException {
		setupDriver();
		login();
		//loginerror();
		//loginPass();
		//ForgotPassword();
		//rememberMe();
		//forgotPassword4();
		//photoFile6();
		//userNameDrop5();
		//mySetting7();
		//developerConsole8();
		logout9();
		accountTab();
	
		
		closing();
	}
*/
		@Test(priority=3,enabled=false)
		private  void logout9() throws InterruptedException {
			// TODO Auto-generated method stub
			logger = reports.startTest("LogOut");
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
			
			WebElement userMenu = driver.findElement(By.xpath(prop.getProperty("userNameMenu")));
			userMenu.click();
			logger.log(LogStatus.PASS, "Clciked UserNAme");
			WebElement Logout = driver.findElement(By.xpath(prop.getProperty("userMenuLogout")));
			Logout.click();
			
			logger.log(LogStatus.PASS, "Logged out");
			Thread.sleep(5000);
		}
		@Test(priority=4,enabled=false)
		private  void developerConsole8() throws InterruptedException {
			// TODO Auto-generated method stub
			logger = reports.startTest("DeveloperConsole8");
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
			
			WebElement loginSub = driver.findElement(By.xpath(prop.getProperty("Loginpath")));
			loginSub.click();
			logger.log(LogStatus.PASS, "Logged in");
			WebElement closePopUpWindow = driver.findElement(By.xpath(prop.getProperty("closepopup")));
			closePopUpWindow.click();
			logger.log(LogStatus.PASS, "Closed the popup");
	
			WebElement userMenu = driver.findElement(By.xpath(prop.getProperty("userNameMenu")));
			userMenu.click();
			logger.log(LogStatus.PASS, "Clciked UserNAme");
			WebElement developConsole = driver.findElement(By.xpath(prop.getProperty("developConsoler")));
			developConsole.click();
			logger.log(LogStatus.PASS, "Clciked DeveloperComsole");
			Thread.sleep(2000);
			String primarywindow = driver.getWindowHandle();
			for(String handle:driver.getWindowHandles()) {
				System.out.println(handle);
				driver.switchTo().window(handle);
			}
			Thread.sleep(2000);
			driver.switchTo().window(primarywindow);
			logger.log(LogStatus.PASS, "Switched to primary window");
		
		}
		@Test(priority=5,enabled=false)
		private  void mySetting7() throws InterruptedException, AWTException {
			// TODO Auto-generated method stub
			logger = reports.startTest("MySetting7");
			
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
	
			WebElement userMenu = driver.findElement(By.xpath(prop.getProperty("userNameMenu")));
			userMenu.click();
			logger.log(LogStatus.PASS, "UserMEnu Clicked");
			WebElement mySetting = driver.findElement(By.xpath(prop.getProperty("mysetting")));
			mySetting.click();
			logger.log(LogStatus.PASS, "Mysetting Clicked");
			Thread.sleep(5000);
			WebElement emailSetup = driver.findElement(By.xpath(prop.getProperty("emailSetUp")));
			emailSetup.click();
			logger.log(LogStatus.PASS, "email setup Clicked");
			WebElement myEmail = driver.findElement(By.xpath(prop.getProperty("myEmail")));
			myEmail.click();
			logger.log(LogStatus.PASS, "email Clicked");
			WebElement emailSignature = driver.findElement(By.xpath(prop.getProperty("emailSignature")));
			emailSignature.sendKeys(prop.getProperty("textToEnter"));
			
			Thread.sleep(7000);
			logger.log(LogStatus.PASS, "text Enetered ");
			
			WebElement save = driver.findElement(By.xpath(prop.getProperty("saveEmail")));
			save.click();
			logger.log(LogStatus.PASS, "save  Clciked ");
			WebElement msgText = driver.findElement(By.xpath(prop.getProperty("msgTextEmail")));
			System.out.println(msgText.getText());
			logger.log(LogStatus.PASS, "text received");
			//Alert SwitchALert = driver.switchTo().alert();
			//System.out.println(SwitchALert.getText());
			Thread.sleep(5000);
			WebElement reminder = driver.findElement(By.xpath(prop.getProperty("reminder1")));
			reminder.click();
			WebElement actReminder = driver.findElement(By.xpath(prop.getProperty("actRem")));
			actReminder.click();
			WebElement openactReminder = driver.findElement(By.xpath(prop.getProperty("openRem")));
			openactReminder.click();
			String primarywindow = driver.getWindowHandle();
			for(String handle:driver.getWindowHandles()) {
				System.out.println(handle);
				driver.switchTo().window(handle);
			}
			Thread.sleep(2000);
			driver.switchTo().window(primarywindow);
			logger.log(LogStatus.PASS, "Switched to primary window");
		
		}
		@Test(priority=1,enabled=false)
		private void login() {
			// TODO Auto-generated method stub
			logger = reports.startTest("Login1");
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
			
			WebElement loginSub = driver.findElement(By.xpath(prop.getProperty("Loginpath")));
			loginSub.click();
			logger.log(LogStatus.PASS, "Logged in");
			WebElement closePopUpWindow = driver.findElement(By.xpath(prop.getProperty("closepopup")));
			closePopUpWindow.click();
			logger.log(LogStatus.PASS, "Closed the popup");
		}
		@Test(priority=2,enabled=false)
	private  void photoFile6() throws InterruptedException {
			logger = reports.startTest("photofile");
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
			
			
			
			WebElement loginSub = driver.findElement(By.xpath(prop.getProperty("Loginpath")));
			loginSub.click();
			logger.log(LogStatus.PASS, "Logged in");
			
			WebElement closePopUpWindow = driver.findElement(By.xpath(prop.getProperty("closepopup")));
			closePopUpWindow.click();
			logger.log(LogStatus.PASS, "Closed the popup");
	
			WebElement userMenu = driver.findElement(By.xpath(prop.getProperty("userNameMenu")));
			userMenu.click();
			logger.log(LogStatus.PASS, "Clciked UserNAme");
			
			WebElement profile = driver.findElement(By.xpath(prop.getProperty("profilepath")));
			profile.click();
			logger.log(LogStatus.PASS, "Clciked profileNAme");
			WebElement editProfile = driver.findElement(By.xpath(prop.getProperty("editprofile")));
			editProfile.click();
			logger.log(LogStatus.PASS, "Clciked EditProfile");
			Thread.sleep(10000);
			logger.log(LogStatus.PASS, "10 sec wait");
			//System.out.println("after 10 sec wait");
			//List <WebElement> numberOf = driver.findElements(By.tagName(prop.getProperty("iframe"));
			//System.out.println(numberOf.size());
			driver.switchTo().frame("contactInfoContentId");
			logger.log(LogStatus.PASS, "inside frame");
			//driver.findElement(By.id("aboutTab")).click();
			//System.out.println("inside frame");
		//	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']]"));
			//driver.switchTo().frame(iframe);
			//System.out.println("inside frame");
			//WebElement aboutClick = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		//	WebElement aboutClick = driver.findElement(By.xpath("//li[@id='aboutTab']"));
			//WebElement options = aboutClick.findElement(By.tagName("a"));
			Thread.sleep(5000);
			
			WebElement aboutClick = driver.findElement(By.xpath(prop.getProperty("abtClick")));
			aboutClick.click();
			logger.log(LogStatus.PASS, "inside frame");
			WebElement lastName = driver.findElement(By.xpath(prop.getProperty("lastnameid")));
			lastName.clear();
			lastName.sendKeys("A");
			WebElement saveAll = driver.findElement(By.xpath(prop.getProperty("saveallid")));
			saveAll.click();
			logger.log(LogStatus.PASS, "edited lastname");
			
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			logger.log(LogStatus.PASS, "switched to default");
		
			WebElement post = driver.findElement(By.xpath(prop.getProperty("postid")));
			post.click();
			logger.log(LogStatus.PASS, "clicked post");
			Thread.sleep(5000);
			WebElement iframe1 = driver.findElement(By.xpath(prop.getProperty("iframe1id")));
			driver.switchTo().frame(iframe1);
			logger.log(LogStatus.PASS, "switched to iframe");
			WebElement writePost = driver.findElement(By.xpath(prop.getProperty("writePostPath")));
			writePost.sendKeys(prop.getProperty("posttext"));
			driver.switchTo().defaultContent();
			logger.log(LogStatus.PASS, "text entered and switched");
			WebElement share = driver.findElement(By.xpath(prop.getProperty("sharepath")));
			share.click();
			logger.log(LogStatus.PASS, "posted");
			
			Thread.sleep(5000);
			WebElement file = driver.findElement(By.xpath(prop.getProperty("filepath")));
			file.click();
			logger.log(LogStatus.PASS, "file option clicked");
			WebElement uploadFile = driver.findElement(By.xpath(prop.getProperty("uploadfilepath")));
			uploadFile.click();
			logger.log(LogStatus.PASS, "upload file");
			WebElement chooseFile = driver.findElement(By.xpath(prop.getProperty("chooseFilePath")));
			chooseFile.sendKeys(prop.getProperty("fileToDown"));
			WebElement share1 = driver.findElement(By.xpath(prop.getProperty("fileShare")));
			share1.click();
			logger.log(LogStatus.PASS, "file choosed and posted");
		
			Thread.sleep(5000);
			Thread.sleep(5000);
			//WebElement imageUpload = driver.findElement(By.xpath(prop.getProperty("imagePath")));
			//imageUpload.click();
			//logger.log(LogStatus.PASS, "click image upload");
			
			//Thread.sleep(5000);
			WebElement addPhoto = driver.findElement(By.xpath(prop.getProperty("addPhotoPath")));
			Actions actions = new Actions(driver);
			actions.moveToElement(addPhoto).click().perform();
			logger.log(LogStatus.PASS, "click image upload done");
			driver.switchTo().frame("uploadPhotoContentId");
			WebElement choosePhoto = driver.findElement(By.xpath(prop.getProperty("choosePhotoPath")));
			choosePhoto.sendKeys(prop.getProperty("pathOfimage"));
			WebElement save = driver.findElement(By.xpath(prop.getProperty("saveImage")));
			save.click();
			logger.log(LogStatus.PASS, "image selected");
			//Thread.sleep(15000);
			//driver.switchTo().defaultContent();
			//driver.switchTo().frame("uploadPhotoContentId");
			WebElement saveCrop = driver.findElement(By.xpath(prop.getProperty("lastSaveForImage")));
			saveCrop.click();
			driver.switchTo().defaultContent();	
			logger.log(LogStatus.PASS, "image posted");
			
			
	
		}
		@Test(priority=10,enabled=false)
		private void opportunities() {
			logger = reports.startTest("opportunities");
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
			WebElement loginSub = driver.findElement(By.xpath(prop.getProperty("Loginpath")));
			loginSub.click();
			logger.log(LogStatus.PASS, "Logged in");
			
			WebElement closePopUpWindow = driver.findElement(By.xpath(prop.getProperty("closepopup")));
			closePopUpWindow.click();
			logger.log(LogStatus.PASS, "Closed the popup");
			
			
			WebElement opportunitiesClick = driver.findElement(By.xpath(prop.getProperty("oppclick")));
			opportunitiesClick.click();
			logger.log(LogStatus.PASS, "Pressed opportunities");
			WebElement viewOpp = driver.findElement(By.xpath(prop.getProperty("viewPath")));
			Select dropdown = new Select(viewOpp);
			
			List<WebElement> options = dropdown.getOptions();
			//List<WebElement> option = dropdown.getOptions();
			List<String> expectedOptions = new ArrayList<>();
			expectedOptions.add("All Opportunities");
			expectedOptions.add("Closing Next Month");
			expectedOptions.add("Closing This Month");
			expectedOptions.add("Kanban");
			expectedOptions.add("My Opportunities");
			expectedOptions.add("New This Week");
			expectedOptions.add("Recently Viewed Opportunities");
			expectedOptions.add("Won");
			for(WebElement a : options) {
				//System.out.println(a.getAttribute("value"));
				System.out.println(a.getText());
				if(!expectedOptions.contains(a.getText())) {
					System.out.println("Failed");
				}else {
					System.out.println("Pass");
				}
			}
			
		}
		@Test(priority=17,enabled=false)	
		private  void pipelin() throws InterruptedException {
			// TODO Auto-generated method stub
		logger = reports.startTest("pipeline");
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
		
		WebElement opportunitiesClick = driver.findElement(By.xpath(prop.getProperty("oppclick")));
		opportunitiesClick.click();
		logger.log(LogStatus.PASS, "Pressed opportunities");	
		WebElement pipelineClick = driver.findElement(By.xpath(prop.getProperty("pipelineOpp")));
		pipelineClick.click();
		logger.log(LogStatus.PASS, "pipeline clicked");	
	/*	//String row ="//*[@id=\"fchArea\"]/table/tbody/tr";
		List<WebElement> rowdata = driver.findElements(By.xpath("//*[@id='fchArea']/table/tbody/tr"));
		int row = rowdata.size();
		System.out.println(row);
	//	String col = "//tr[@id='headerRow_0']/th";
		//"//*[@id=\"fchArea\"]/table/tbody/tr[1]/th"
		List<WebElement>  coldata = driver.findElements(By.xpath("//tr[@id='headerRow_0']/th"));
		int col = coldata.size();
		System.out.println(col);
		//  th and td inspect to find this x path
		/*for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				String tagname;
				String a ="th";
				String b= "td";
				if (i==1) {
					tagname = a;
					
				}
				else 
					{
					tagname = b;
					}
			try {	
			String data = driver.findElement(By.xpath("//*[@id='fchArea']/table/tbody/tr["+i+"]/"+tagname+"["+j+"]")).getText();
			System.out.print(data+"|");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			}
			System.out.println();
		}
		//*[@id="fchArea"]/table/tbody/tr[4]/td[2]
		//*[@id="fchArea"]/table/tbody/tr[5]/td[2]*/
		List<WebElement> rows = driver.findElements(By.xpath(prop.getProperty("table")));
			
				for (WebElement row : rows) {
		List<WebElement> columns = row.findElements(By.tagName("th")); // find header in the row
					if (columns.isEmpty()) {
						columns = row.findElements(By.tagName("td"));
					}
					for (WebElement column : columns) {
						System.out.print(column.getText()); 
						System.out.print("|");
					}
					System.out.println();
				} 
					
		}
		@Test(priority=18,enabled=false)	
		private  void stuckOpp() throws InterruptedException {
			// TODO Auto-generated method stub
		logger = reports.startTest("stuckOpp");
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
		
		WebElement opportunitiesClick = driver.findElement(By.xpath(prop.getProperty("oppclick")));
		opportunitiesClick.click();
		logger.log(LogStatus.PASS, "Pressed opportunities");
		WebElement stuckClick = driver.findElement(By.xpath(prop.getProperty("clickStuck")));
		stuckClick.click();
		logger.log(LogStatus.PASS, "Pressed stuckopportunities");
		List<WebElement> rows = driver.findElements(By.xpath(prop.getProperty("stuckTable")));
		for(WebElement row : rows) {
		List<WebElement> column = row.findElements(By.tagName("th"));
		if(column.isEmpty()) {
			column=row.findElements(By.tagName("td"));
		}
		for(WebElement columns:column) {
		System.out.print(row.getText());
		System.out.print("|");
		}
		System.out.println();
		}
		}
		@Test(priority=19,enabled=false)	
		private  void quaterly() throws InterruptedException {
			// TODO Auto-generated method stub
		logger = reports.startTest("quaterlyReports");
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
	
		WebElement opportunitiesClick = driver.findElement(By.xpath(prop.getProperty("oppclick")));
		opportunitiesClick.click();
		
	String optionalXpath="//select[@id='quarter_q']/option";
		int noOfOption=driver.findElements(By.xpath(optionalXpath)).size();
		
		String optionalXpath2="//select[@id='open']/option";
		int noOfOption2=driver.findElements(By.xpath(optionalXpath2)).size();
		for(int i =1;i<=noOfOption;i++) {
			String optionsXpath="//select[@id='quarter_q']/option["+i+"]";
			System.out.println(optionsXpath);
			WebElement option=driver.findElement(By.xpath(optionsXpath));
			option.click();
			System.out.println("clicked");
			for(int j =1;j<=noOfOption2;j++) {
				String optionsXpath2="//select[@id='open']/option["+j+"]";
				WebElement option2=driver.findElement(By.xpath(optionsXpath2));
				option2.click();
				WebElement report = driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']"));
				report.click();	
				logger.log(LogStatus.PASS,"Report started");
				driver.navigate().back();
				
			}
		} 
		
		}
	
		@Test(priority=20,enabled=false)	
		private  void leads() throws InterruptedException {
			// TODO Auto-generated method stub
		logger = reports.startTest("leads");
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
		logger.log(LogStatus.PASS, "popwindow clicked");
		WebElement leads = driver.findElement(By.xpath(prop.getProperty("leadClick")));
		leads.click();
		logger.log(LogStatus.PASS, "Clicked leads");
		/*WebElement actualAccount = driver.findElement(By.xpath(prop.getProperty("leadHome")));
		String actualUsername = actualAccount.getText();
		System.out.println(actualUsername);
		String expectedUsername = "Home";
		logger.log(LogStatus.PASS,"expected result arrived");
		logger.log(LogStatus.PASS, "Home page opened");
		Assert.assertEquals(actualUsername, expectedUsername);*/
	
		}
		@Test(priority=16,enabled=false)	
		private  void newOpportunities() throws InterruptedException {
			// TODO Auto-generated method stub
		logger = reports.startTest("newOpportunities");
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
		WebElement opportunitiesClick = driver.findElement(By.xpath(prop.getProperty("oppclick")));
		opportunitiesClick.click();
		logger.log(LogStatus.PASS, "Pressed opportunities");
		WebElement newOpport = driver.findElement(By.xpath(prop.getProperty("newOpp")));
		newOpport.click();
		WebElement accountOpp = driver.findElement(By.xpath(prop.getProperty("accOpp")));
		accountOpp.sendKeys("sample2");
		//WebElement addToAccount = driver.findElement(By.xpath(prop.getProperty("addOpp")));
		//addToAccount.click();
		//driver.switchTo().frame("resultsFrame");
		//WebElement frame = driver.findElement(By.xpath(prop.getProperty("frameWeb")));
		//driver.switchTo().frame("frame");
		WebElement accountName = driver.findElement(By.xpath(prop.getProperty("addaccount")));
		accountName.sendKeys("Global Media (Sample)");
		accountName.click();
		//driver.switchTo().defaultContent();
		//*[@id="resultsFrame"]
		
		WebElement date = driver.findElement(By.xpath(prop.getProperty("date")));
		date.click();
	
		WebElement todaydate = driver.findElement(By.xpath(prop.getProperty("todayDate")));
		todaydate.click();
		WebElement stage = driver.findElement(By.xpath(prop.getProperty("stagedetail")));
		Select dropDown = new Select(stage);
		dropDown.selectByIndex(1);
		WebElement oppProbability  = driver.findElement(By.xpath(prop.getProperty("probability")));
		oppProbability.clear();
		oppProbability.sendKeys("30");
		WebElement leadSource = driver.findElement(By.xpath(prop.getProperty("leadSource")));
		Select dropDown1 = new Select(leadSource);
		dropDown1.selectByIndex(1);
		WebElement saveB = driver.findElement(By.xpath(prop.getProperty("saveButton")));
		saveB.click();
		}
		@Test(priority=14,enabled=false)
		private  void createAccountReport() throws InterruptedException {
			// TODO Auto-generated method stub
			logger = reports.startTest("createAccountReport");
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
			WebElement account = driver.findElement(By.xpath(prop.getProperty("accountTab")));
			account.click();
			logger.log(LogStatus.PASS, "Account button clicked");
			WebElement accountLastActivity = driver.findElement(By.xpath(prop.getProperty("lastAct")));
			accountLastActivity.click();
			logger.log(LogStatus.PASS, "Account last Activity button clicked");
			WebElement fromDate = driver.findElement(By.xpath(prop.getProperty("fromD")));
			fromDate.clear();
			fromDate.sendKeys("11/4/2019");
			//WebElement todaDate = driver.findElement(By.xpath(prop.getProperty("toDay")));
			//todaDate.click();
			/*WebElement date = driver.findElement(By.xpath(prop.getProperty("date")));
			date.click();
	
			WebElement todaydate = driver.findElement(By.xpath(prop.getProperty("todayDate")));
			todaydate.click();*/
			WebElement toDate = driver.findElement(By.xpath(prop.getProperty("toDate")));
			toDate.clear();
			toDate.sendKeys("11/4/2019");
			//WebElement toToday = driver.findElement(By.xpath(prop.getProperty("toToday")));
			//toToday.click();
			WebElement saveReport = driver.findElement(By.xpath(prop.getProperty("savReport")));
			saveReport.click();
			WebElement reportName = driver.findElement(By.xpath(prop.getProperty("repName")));
			reportName.sendKeys("sample");
			WebElement reportUniqueName = driver.findElement(By.xpath(prop.getProperty("repUniqueName")));
			reportUniqueName.click();
			WebElement saveRep = driver.findElement(By.xpath(prop.getProperty("saveButton1")));
			saveRep.click();
			logger.log(LogStatus.PASS, "report run and saved");
		}
		@Test(priority=21,enabled=true)
		private  void leadsSelectView() throws InterruptedException {
			// TODO Auto-generated method stub
			logger = reports.startTest("leadsSelectView");
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
			WebElement leads = driver.findElement(By.xpath(prop.getProperty("leadClick")));
			leads.click();
			logger.log(LogStatus.PASS, "Clicked leads");
			WebElement leadDrop = driver.findElement(By.xpath(prop.getProperty("leadDrop1")));
			//leadDrop.click();
			//logger.log(LogStatus.PASS, "Clicked leads");
			Select dropDownLead = new Select(leadDrop);
			//dropDownLead.selectByIndex(1);

			
			List<WebElement> options = dropDownLead.getOptions();
			//List<WebElement> option = dropdown.getOptions();
			List<String> expectedOptions = new ArrayList<>();
			expectedOptions.add("All Open Leads");
			expectedOptions.add("My Leads");
			expectedOptions.add("Recently Viewed Leads");
			expectedOptions.add("Today's Leads");
			
			for(WebElement a : options) {
				//System.out.println(a.getAttribute("value"));
				System.out.println(a.getText());
				if(!expectedOptions.contains(a.getText())) {
					System.out.println("Failed");
				}else {
					System.out.println("Pass");
				}
			}
			
		}
	@Test(priority=2,enabled=false)
		private  void rememberMe() throws InterruptedException {
			// TODO Auto-generated method stub
		logger = reports.startTest("rememberMe");
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
	
		WebElement userMenu = driver.findElement(By.xpath(prop.getProperty("userNameMenu")));
		userMenu.click();
		logger.log(LogStatus.PASS, "Clciked UserNAme");
		WebElement Logout = driver.findElement(By.xpath(prop.getProperty("userMenuLogout")));
		Logout.click();
		
		logger.log(LogStatus.PASS, "Logged out");
			Thread.sleep(5000);
			WebElement userFeild = driver.findElement(By.xpath(prop.getProperty("startingUserName")));
			String actualUsername = userFeild.getAttribute("value");
			System.out.println(actualUsername);
			String expectedUsername = "priyadharshini.dp.1011-r7ah@force.com";
			Assert.assertEquals(actualUsername, expectedUsername);
			logger.log(LogStatus.PASS, "UserNAme Found");
		}
		
		
	
	@Test(priority=3,enabled=false)
		private static void ForgotPassword() throws InterruptedException {
			WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
			login.click();
			
			
			WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
			input.sendKeys("priyadharshini.dp.1011-r7ah@force.com");
			
			WebElement forgotPassword = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]"));
			forgotPassword.click();
			Thread.sleep(5000);
			System.out.println("forgotPassword clicked");
			
			WebElement forgotUsername = driver.findElement(By.xpath("//input[@id='un']"));
			forgotUsername.sendKeys("priyadharshini.dp.1011-r7ah@force.com");
		
			WebElement continue3 = driver.findElement(By.xpath("//input[@id='continue']"));
			continue3.click();
			Thread.sleep(5000);
			WebElement  errormsg1 = driver.findElement(By.xpath("//p[contains(text(),'We’ve sent you an email with a link to finish resetting your password.')]"));
			System.out.println(errormsg1.getText());
			
		}
		@Test(priority=1,enabled=false)
		private static void userNameDrop5() {
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
			WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-menuItems']"));
			List<WebElement> options = userMenu.findElements(By.tagName("a"));
			//options.stream().forEach(i -> System.out.println(i.getAttribute("title")));;
			String[] a = {"My Profile","My Settings","Developer Console (New Window) ","Switch to Lightning Experience","Logout"};
			boolean d= true;
			for(int i=0;i<options.size();i++)
			{
				boolean s= false;
				for(int j=0;j<a.length;j++) {
					System.out.println(options.get(i).getAttribute("title"));
					if(a[j].equals(options.get(i).getAttribute("title"))) {
						s=true;
						break;
					} 
					}
				d=d&&s;
				
				}
			if(d==false) {
				System.out.println("fail");
				}
			else{
				System.out.println("pass");
			}
			
			}
			
	
		
			
			
	
		@Test(priority=4,enabled=false)
		private static void forgotPassword4() {
			WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
			login.click();
			
			
			WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
			input.sendKeys("123");
			
	
			WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
			Password.sendKeys("22131");
			WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
			Login.click();
			WebElement errorMsg = driver.findElement(By.xpath("//div[@id='error']"));
			String actualErrorMsg = errorMsg.getText();
			System.out.println(actualErrorMsg);
			String expectedErrorMsg="Your login attempt has failed. The username or password may be incorrect, or your location or login time may be restricted. Please contact the administrator at your company for help";
			if(actualErrorMsg.equals(expectedErrorMsg)) {
				System.out.println("pass");
				
			}else
			{
				System.out.println("fail");
			}
		}
			
		
		private static void loginPass() {
			// TODO Auto-generated method stub
			WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
			login.click();
			
			
			WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
			input.sendKeys("priyadharshini.dp.1011-r7ah@force.com");
			
			WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
			Password.clear();
			Password.sendKeys("disha@123");
			//Password.sendKeys("disha@123");
			WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
			Login.click();
			System.out.println("login success");
			
			
		}
		@BeforeClass
		public  void setupDriver() throws IOException
		{
			reports = new ExtentReports("C:\\Users\\auhum\\Desktop\\ExtendReport\\Login123.html");
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
		@Test(priority=2,enabled=false)
		public  void loginerror() {
			logger = reports.startTest("Login Error");
			WebElement login = driver.findElement(By.xpath(prop.getProperty("Login")));
			login.click();
			logger.log(LogStatus.PASS, "Pressed Login");
			
			WebElement input = driver.findElement(By.xpath(prop.getProperty("userid")));
			input.sendKeys(prop.getProperty("userNameError"));
			logger.log(LogStatus.PASS, "Input userid");
			WebElement Password = driver.findElement(By.xpath(prop.getProperty("passwordid")));
			Password.clear();
			logger.log(LogStatus.PASS, "Cleared Password");
			//Password.sendKeys("disha@123");
			WebElement Login = driver.findElement(By.xpath(prop.getProperty("Loginpath")));
			Login.click();
			logger.log(LogStatus.PASS, "Pressed Login");
			WebElement  errormsg = driver.findElement(By.xpath(prop.getProperty("errorMessage")));
			String a1 = errormsg.getText();
			String a2 = "Please enter your password.";
			if(a1.equals(a2))
			{
				logger.log(LogStatus.PASS, "Test Case Pass");
			}
			else
			{
				logger.log(LogStatus.FAIL, "Test Case Fail");
			}  
			
		}
		
		@AfterClass
		public  void closing() {
			logger = reports.startTest("Closing Browser");
			logger.log(LogStatus.PASS, "Closing");
			reports.endTest(logger);
			reports.flush();
			
			driver.quit();
		}
	
	}
