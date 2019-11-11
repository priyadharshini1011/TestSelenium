package demoSelenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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

public class SalesForce {
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;
	
/*	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		setupDriver();
	
		//TC01_loginErrorMessage();
		//TC02_LoginToSalesForce() ;
		//TC03_CheckRemeberMe();
		//TC4A_ForgotPassword();
		//TC4B_ForgotPassword();
		//TC05_UserMenuDropDown();
		//TC06_MyProfileUserMenu();
		//TC07_MySettingsUserMenu();
		//TC08_DevelopersConsole();
		//TC09_Logout();
		//TC10_CreateAccount();
		//TC11_Createnewview();
		//TC12_Editview();
		//TC13_MergeAccounts();
		//TC14CreateAccountReport();
		//TC15OpportunitiesDropDown();
		//TC16CreateNewOpty();
		//TC17TestOpportunityPipelineReport();
		//TC18StuckOpportunitiesReport();
		//TC19TestQuarterlySummaryReport();
		//TC20leadsTab();
		TC21leadsSelectView();
		//TC22_defaultView();
		//TC23_ListItemTodaysLeads();
		//TC24_newButtonLeadsHome();
		//TC25_CreateNewContact();
		//TC26_CreateContactNewView();
		//TC27_CheckRecentlyCreated();
		//TC28_MyContactsView();
		//TC29_ViewContact();
		
		closing();
	}*/
	@Test(priority=21)
	private static void TC21leadsSelectView() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC21leadsSelectView");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC21leadsSelectView.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement leads = driver.findElement(By.xpath("//*[@id='Lead_Tab']/a"));
		leads.click();
		logger.log(LogStatus.INFO, "Clicked leads");
		WebElement leadDrop = driver.findElement(By.xpath("//*[@id='fcf']"));
	
		Select dropDownLead = new Select(leadDrop);
		List<WebElement> options = dropDownLead.getOptions();

		List<String> expectedOptions = new ArrayList<>();
		expectedOptions.add("All Open Leads");
		expectedOptions.add("My Leads");
		expectedOptions.add("Recently Viewed Leads");
		expectedOptions.add("Today's Leads");
		
		for(WebElement a : options) {
			
			System.out.println(a.getText());
			if(!expectedOptions.contains(a.getText())) {
				System.out.println("Failed");
			}else {
				System.out.println("Pass");
			}
		}
		logger.log(LogStatus.PASS, "Leads dropdoen listed");	
		
	}
	@Test(priority = 20)
	private static void TC20leadsTab() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC20leadsTab");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC20leadsTab.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement leads = driver.findElement(By.xpath("//*[@id='Lead_Tab']/a"));
		leads.click();
		logger.log(LogStatus.PASS, "Clicked leads");
	}
	@Test(priority=19)
	private static void TC19TestQuarterlySummaryReport() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC19TestQuarterlySummaryReport");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC19TestQuarterlySummaryReport.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement opportunitiesClick = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
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
		logger.log(LogStatus.PASS, "Report ran successfully ");
	}
	@Test(priority=18)
	private static void TC18StuckOpportunitiesReport() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC18StuckOpportunitiesReport");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC18StuckOpportunitiesReport.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement opportunitiesClick = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunitiesClick.click();
		logger.log(LogStatus.INFO, "Pressed opportunities");
		WebElement stuckClick = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		stuckClick.click();
		logger.log(LogStatus.PASS, "Pressed stuckopportunities");
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='fchArea']/table/tbody/tr"));
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
		logger.log(LogStatus.PASS, "stuckopportunities report");
	}
	@Test(priority=17)
	private static void TC17TestOpportunityPipelineReport() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC17TestOpportunityPipelineReport");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC17TestOpportunityPipelineReport.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement opportunitiesClick = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunitiesClick.click();
		logger.log(LogStatus.PASS, "Pressed opportunities");	
		WebElement pipelineClick = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
		pipelineClick.click();
		logger.log(LogStatus.PASS, "pipeline clicked");	
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='fchArea']/table/tbody/tr"));
		
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
	@Test(priority=16)
	private static void TC16CreateNewOpty() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC16CreateNewOpty");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC16CreateNewOpty.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement opportunitiesClick = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		opportunitiesClick.click();
		logger.log(LogStatus.PASS, "Pressed opportunities");
		WebElement newOpport = driver.findElement(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
		newOpport.click();
		logger.log(LogStatus.INFO, "started to create new opp");
		WebElement accountOpp = driver.findElement(By.xpath("//*[@id='opp3']"));
		accountOpp.sendKeys(recData[1][4]);
		WebElement accountName = driver.findElement(By.xpath("//*[@id='opp4']"));
		accountName.sendKeys(recData[1][5]);
		accountName.click();
		logger.log(LogStatus.INFO, "giveen new name");
		WebElement date = driver.findElement(By.xpath("//*[@id='opp9']"));
		date.click();
	
		WebElement todaydate = driver.findElement(By.xpath("//*[@id='datePicker']/div[2]/div/a"));
		todaydate.click();
		logger.log(LogStatus.INFO, "todays date is clicked");
		WebElement stage = driver.findElement(By.xpath("//*[@id='opp11']"));
		Select dropDown = new Select(stage);
		dropDown.selectByIndex(1);
		WebElement oppProbability  = driver.findElement(By.xpath("//input[@id='opp12']"));
		oppProbability.clear();
		oppProbability.sendKeys(recData[1][6]);
		WebElement leadSource = driver.findElement(By.xpath("//*[@id='opp6']"));
		Select dropDown1 = new Select(leadSource);
		dropDown1.selectByIndex(1);
		WebElement saveB = driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]"));
		saveB.click();
		logger.log(LogStatus.PASS, "Created new Opportunities");
		
	}
	@Test(priority=15)
	private static void TC15OpportunitiesDropDown() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC15OpportunitiesDropDown");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC15OpportunitiesDropDown.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement firstTab = driver.findElement(By.xpath("//*[@id='Opportunity_Tab']/a"));
		firstTab.click();
		logger.log(LogStatus.INFO, "opportunities tab clicked");
		WebElement allOpportunities = driver.findElement(By.xpath("//select[@id='fcf']"));
		 Select select = new Select(allOpportunities); 
	     List<WebElement> options = select.getOptions(); 
	      for(WebElement item:options) 
	      { 
	      
	           System.out.println("Dropdown values are "+ item.getText());          
	         }
	      logger.log(LogStatus.PASS, "opportunities drop down listed ");
	}
	@Test(priority=24)
	private static void TC14CreateAccountReport() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC14CreateAccountReport");

		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC14CreateAccountReport.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		
		WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		logger.log(LogStatus.PASS, "Account button clicked");
		WebElement accountLastActivity = driver.findElement(By.xpath("//*[@id='toolsContent']/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
		accountLastActivity.click();
		logger.log(LogStatus.PASS, "Account last Activity button clicked");
		WebElement fromDate = driver.findElement(By.xpath("//*[@id='ext-comp-1042']"));
		fromDate.clear();
		fromDate.sendKeys("11/4/2019");
		//WebElement todaDate = driver.findElement(By.xpath(prop.getProperty("toDay")));
		//todaDate.click();
		/*WebElement date = driver.findElement(By.xpath(prop.getProperty("date")));
		date.click();

		//WebElement todaydate = driver.findElement(By.xpath(prop.getProperty("todayDate")));
		todaydate.click();*/
		WebElement toDate = driver.findElement(By.xpath("//*[@id='ext-comp-1045']"));
		toDate.clear();
		toDate.sendKeys("11/4/2019");
		///WebElement From_date = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		//From_date.click();
		//WebElement From_Today_Date = driver.findElement(By.xpath("//table[@id='ext-comp-1112']//em"));
		//From_Today_Date.click();
		

		// To_date = driver.findElement(By.xpath("//img[@id='ext-gen154']"));
		//To_date.click();
		//WebElement To_Today_Date = driver.findElement(By.xpath("//table[@id='ext-comp-1114']//em"));
		//To_Today_Date.click();
		logger.log(LogStatus.INFO, "dates selected");
		//WebElement toToday = driver.findElement(By.xpath(prop.getProperty("toToday")));
		//toToday.click();
		WebElement saveReport = driver.findElement(By.xpath("//*[@id='ext-gen49']"));
		saveReport.click();
		logger.log(LogStatus.INFO, "saving the report");
		WebElement reportName = driver.findElement(By.xpath("//*[@id='saveReportDlg_reportNameField']"));
		reportName.sendKeys(recData[1][4]);
		WebElement reportUniqueName = driver.findElement(By.xpath("//*[@id='saveReportDlg_DeveloperName']"));
		reportUniqueName.click();
		WebElement saveRep = driver.findElement(By.xpath("//*[@id='ext-gen268'][contains(text(),'Save and Run Report')]"));
		saveRep.click();
		logger.log(LogStatus.PASS, "report run and saved");
	} 

	public static String[][] getDataInput(String filepath,String filename, String Sheetname)
			throws IOException
			{
			//Get the Xl path
			File xlfile = new File(filepath+"/"+filename);
			//access to the Xl path
			FileInputStream xlaccess = new FileInputStream(xlfile);
			//access to workbook
			HSSFWorkbook Wb = new HSSFWorkbook(xlaccess);
			//Access the sheet
			HSSFSheet sheet = Wb.getSheet(Sheetname);
			int rowCount = sheet.getLastRowNum();
			int columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println(rowCount);
			System.out.println(columnCount);
			String [][] readData = new String [rowCount+1][columnCount];
			for(int i=0;i<=rowCount;i++)
			{
				for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
				{
					//System.out.println("row:"+i);
					//System.out.println("coulmn"+j);
					//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
					//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				readData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			
				}
			//System.out.println();

			}
			return readData;
			}
	@Test(priority=1)
private static void TC01_loginErrorMessage() throws Exception {
		
		logger = reports.startTest("Login Error");
		String [][] recData = getDataInput("C:/Users/auhum/Desktop/salesForcexcel","loginerror.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.PASS, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.PASS, "Input userid");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		logger.log(LogStatus.PASS, "Cleared Password");
		//Password.sendKeys("disha@123");
		WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
		Login.click();
		logger.log(LogStatus.PASS, "Pressed Login");
		WebElement  errormsg = driver.findElement(By.xpath("//div[@id='error']"));
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
	@Test(priority=29)
	private static void TC29_ViewContact() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC29_ViewContact");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC29_ViewContact.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement contacts = driver.findElement(By.xpath("//*[@id='Contact_Tab']"));
		contacts.click();
		logger.log(LogStatus.INFO, "contacts tab clicked");
		WebElement  table = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr"));

		
		WebElement  row = table.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]")); // find header in the row
		String rowtext = row.getText();
		System.out.println("Third row of table : "+rowtext);
		WebElement  column = row.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));		
		column.click();	
		Thread.sleep(5000);
			
}
	


	@Test(priority=28)
	private static void TC28_MyContactsView() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC28_MyContactsView");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC28_MyContactsView.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement contacts = driver.findElement(By.xpath("//*[@id='Contact_Tab']"));
		contacts.click();
		logger.log(LogStatus.INFO, "contacts tab clicked");
		WebElement contactsDropDowwn = driver.findElement(By.xpath("//select[@id='fcf']"));
		//contactsDropDowwn.click();
		
		Select dropDown = new Select(contactsDropDowwn);
		dropDown.selectByVisibleText("My Contacts");
		WebElement contactsGo = driver.findElement(By.xpath("//*[@id='filter_element']/div/span/span[1]/input"));
		contactsGo.click();
		logger.log(LogStatus.PASS, "MyContact Selected ");
	}


	@Test(priority=27)
	private static void TC27_CheckRecentlyCreated() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC27_CheckRecentlyCreated");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC27_CheckRecentlyCreated.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement contacts = driver.findElement(By.xpath("//*[@id='Contact_Tab']"));
		contacts.click();
		logger.log(LogStatus.INFO, "contact clicked");
		WebElement contactsDropDown = driver.findElement(By.xpath("//*[@id=\"hotlist_mode\"]"));
		Select option = new Select(contactsDropDown);
		option.selectByIndex(0);
		logger.log(LogStatus.PASS, "Reently created contact is displayed");
		Thread.sleep(5000);
		
	}


	@Test(priority=13)
	private static void TC13_MergeAccounts() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC13_MergeAccounts");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC13_MergeAccounts.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		logger.log(LogStatus.INFO, "account tab selected");
		WebElement clickMerge = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		clickMerge.click();
		logger.log(LogStatus.INFO, "selecting the account to bemerged");
		WebElement textType = driver.findElement(By.xpath("//input[@id='srch']"));
		textType.sendKeys(recData[1][4]);
		logger.log(LogStatus.INFO, "account name enetered");
		WebElement findAcc = driver.findElement(By.xpath("//div[@class='pbWizardBody']//input[@name='srchbutton' ]"));
		findAcc.click();
		WebElement nextClick = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']"));
		nextClick.click();
		logger.log(LogStatus.INFO,"next step is clicked ");
		WebElement mergeClick = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		mergeClick.click();
		Alert SwitchALert = driver.switchTo().alert();
		
		System.out.println(SwitchALert.getText());
		SwitchALert.accept();
		logger.log(LogStatus.INFO, "alert closed ");
	}

	@Test(priority=12)

	private static void TC12_Editview() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC12_Editview");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC12_Editview.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		Thread.sleep(5000);
		WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select optionView = new Select(view);
		optionView.selectByVisibleText("apple");
		System.out.println("selected");	
		logger.log(LogStatus.INFO, "account name selected from view option ");
		Thread.sleep(5000);
		WebElement editOption = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		editOption.click();
		System.out.println("edit clicked");
		WebElement editviewname = driver.findElement(By.xpath("//input[@id='fname']"));
		editviewname.clear();
		editviewname.sendKeys(recData[1][4]);
		System.out.println("changed");
		WebElement editOperator = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select editOption1 = new Select(editOperator);
		editOption1.selectByVisibleText("Account Name");
		logger.log(LogStatus.INFO, "selcted from drop down ");
		WebElement operatorEdit = driver.findElement(By.xpath("//select[@id='fop1']"));
		Select operatorEdit1 = new Select(operatorEdit);
		operatorEdit1.selectByVisibleText("contains");
		logger.log(LogStatus.INFO, "selected contains");
		WebElement value = driver.findElement(By.xpath("//input[@id='fval1']"));
		value.sendKeys(recData[1][5]);
		System.out.println("given value a");
		WebElement AvailableField = driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
		Select AvailableField1 = new Select(AvailableField);
		AvailableField1.selectByVisibleText("Last Activity");
		logger.log(LogStatus.INFO, "Last Activity clicked");
		WebElement addField = driver.findElement(By.xpath("//*[@class='rightArrowIcon']"));
		addField.click();
		System.out.println("add clicked");
		WebElement saveEdited = driver.findElement(By.xpath("//input[@class='btn primary']"));
		saveEdited.click();
		logger.log(LogStatus.PASS, "saved the edit view ");
		
	}


	@Test(priority=11)
	private static void TC11_Createnewview() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC11_Createnewview");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC11_Createnewview.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		logger.log(LogStatus.INFO, "clicked account tab");
		WebElement createNew = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNew.click();
		
		logger.log(LogStatus.INFO, "clicked create new view");
		WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
		ViewName.sendKeys(recData[1][4]);
		logger.log(LogStatus.INFO, "entered view name");
		WebElement UniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		
		UniqueName.click();
		logger.log(LogStatus.INFO, "unique name clicked");
		WebElement saveView = driver.findElement(By.xpath("//input[@name='save']"));
		saveView.click();
		logger.log(LogStatus.PASS, "created new view");
	}


	@Test(priority=26)
	private static void TC26_CreateContactNewView() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC26_CreateNewView");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC26_CreateNewView.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
		WebElement contacts = driver.findElement(By.xpath("//*[@id='Contact_Tab']"));
		contacts.click();
		logger.log(LogStatus.INFO, "contact clicked");
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNewView.click();
		logger.log(LogStatus.INFO, "createNewView clicked");
		WebElement viewNAme = driver.findElement(By.xpath("//input[@id='fname']"));
		viewNAme.sendKeys(recData[1][4]);
		logger.log(LogStatus.INFO, "viewNAme entered");
		WebElement viewUniqueNAme = driver.findElement(By.xpath("//input[@id='devname']"));
		viewUniqueNAme.click();
		logger.log(LogStatus.INFO, "viewUniqueNAme clicked");
		WebElement saveView = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		saveView.click();
		logger.log(LogStatus.PASS, "New View Created");
		
	}
	


	@Test(priority=25)
	private static void TC25_CreateNewContact() throws IOException {

				logger = reports.startTest("TC25_CreateNewContact");
				String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC25_CreateNewContact.xls","Sheet1");
				WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
				login.click();
				logger.log(LogStatus.INFO, "Pressed Login");
				
				WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
				input.sendKeys(recData[1][2]);
				logger.log(LogStatus.INFO, "Pressed Login and entered details");
				WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
				Password.clear();
				Password.sendKeys(recData[1][3]);
				
				logger.log(LogStatus.INFO, "Password clicked and entered ");
				WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
				loginSub.click();
				logger.log(LogStatus.INFO, "login clicked");
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				logger.log(LogStatus.INFO, "closepopup window ");
				WebElement contacts = driver.findElement(By.xpath("//*[@id='Contact_Tab']"));
				contacts.click();
				logger.log(LogStatus.INFO, "contact clicked");
				WebElement newContacts = driver.findElement(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
				newContacts.click();
				logger.log(LogStatus.INFO, "newContacts clicked");
				WebElement lastNameContacts = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
				lastNameContacts.sendKeys(recData[1][4]);
				logger.log(LogStatus.INFO, "lastname entered");
				WebElement accountNameContacts = driver.findElement(By.xpath("//input[@id='con4']"));
				accountNameContacts.sendKeys(recData[1][5]);
				logger.log(LogStatus.INFO, "account name  entered");
				WebElement saveContacts = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
				saveContacts.click();
				logger.log(LogStatus.PASS, "contact created");
				
	}


	@Test(priority=24)
	private static void TC24_newButtonLeadsHome() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC24_newButtonLeadsHome");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC24_newButtonLeadsHome.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		WebElement leads = driver.findElement(By.xpath("//*[@id='Lead_Tab']/a"));
		leads.click();
		logger.log(LogStatus.INFO, "Clicked leads");
		WebElement newLeads = driver.findElement(By.xpath("//input[@name='new']"));
		newLeads.click();
		logger.log(LogStatus.INFO, "creating new lead");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		lastName.sendKeys(recData[1][4]);
		logger.log(LogStatus.INFO, "entered last name");
		WebElement companyName = driver.findElement(By.xpath("//input[@id='lea3']"));
		companyName.sendKeys(recData[1][5]);
		logger.log(LogStatus.INFO, "entered company name ");
		WebElement saveLead = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		saveLead.click();
		logger.log(LogStatus.PASS, "new lead created");
		
	}


	@Test(priority=23)
	private static void TC23_ListItemTodaysLeads() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC23_ListItemTodaysLeads");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC23_ListItemTodaysLeads.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		WebElement leads = driver.findElement(By.xpath("//*[@id='Lead_Tab']/a"));
		leads.click();
		logger.log(LogStatus.INFO, "Clicked leads");
		WebElement leadDrop = driver.findElement(By.xpath("//*[@id='fcf']"));
		Select dropDownLead = new Select(leadDrop);
		dropDownLead.selectByIndex(3);
		logger.log(LogStatus.INFO, "DropDown Selected");
		Thread.sleep(5000);
		WebElement goLead = driver.findElement(By.xpath("//*[@id='filter_element']/div/span/span[1]/input"));
		goLead.click();
		logger.log(LogStatus.PASS, "TestCase Passed");
		WebElement leadTitle = driver.findElement(By.xpath("//*[@id='is:islv:inlineSchedulerListView:enhancedList_listSelect']"));
	
		Boolean leadPage = leadTitle.isDisplayed();
		if (leadPage == true) {
			System.out.println("lead page is displayed");
			}
	}


	@Test(priority=22)
	private static void TC22_defaultView() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC22_defaultView");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC22_defaultView.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		WebElement leads = driver.findElement(By.xpath("//*[@id='Lead_Tab']/a"));
		leads.click();
		logger.log(LogStatus.INFO, "Clicked leads");
		WebElement leadDrop = driver.findElement(By.xpath("//*[@id='fcf']"));
		//leadDrop.click();
		//logger.log(LogStatus.PASS, "Clicked leads");
		Select dropDownLead = new Select(leadDrop);
		dropDownLead.selectByIndex(3);
		Thread.sleep(5000);
		 WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
			userMenu.click();
			logger.log(LogStatus.INFO, "Clciked UserNAme");
			
			WebElement Logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			Logout.click();
			
			logger.log(LogStatus.INFO, "Logged out");
			WebElement input1 = driver.findElement(By.xpath("//input[@id='username']"));
			input1.sendKeys(recData[1][2]);
			logger.log(LogStatus.INFO, "Pressed Login and entered details");
			WebElement Password1 = driver.findElement(By.xpath("//input[@type='password']"));
			Password1.clear();
			Password1.sendKeys(recData[1][3]);
			
			logger.log(LogStatus.INFO, "Password clicked and entered ");
			WebElement loginSub1 = driver.findElement(By.xpath("//input[@name='Login']"));
			loginSub1.click();
			logger.log(LogStatus.INFO, "login clicked");
		//	WebElement closePopUpWindow1 = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			//closePopUpWindow1.click();
		//	logger.log(LogStatus.INFO, "closepopup window ");

		
			
			WebElement leads1 = driver.findElement(By.xpath("//*[@id='Lead_Tab']/a"));
			leads1.click();
			logger.log(LogStatus.INFO, "Clicked leads");
			WebElement leadDrop1 = driver.findElement(By.xpath("//*[@id='fcf']"));
			//leadDrop.click();
			//logger.log(LogStatus.PASS, "Clicked leads");
			Select dropDownLead1 = new Select(leadDrop1);
			dropDownLead1.selectByIndex(3);
			WebElement goLead = driver.findElement(By.xpath("//*[@id='filter_element']/div/span/span[1]/input"));
			goLead.click();
			logger.log(LogStatus.PASS, "TestCase Passed");

	}


	@Test(priority=10)
	private static void TC10_CreateAccount() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC10_CreateAccount");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC10_CreateAccount.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		WebElement new1 = driver.findElement(By.xpath("//input[@name='new']"));
		new1.click();
		Thread.sleep(5000);
		System.out.println("clicked");
		WebElement accountName = driver.findElement(By.xpath("//form[@id='editPage']/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]"));
		accountName.sendKeys(recData[1][4]);
		WebElement saveAccount = driver.findElement(By.xpath("//input[@class='btn']"));
		saveAccount.click();
		WebElement actualAccount = driver.findElement(By.xpath("//*[@id=\"contactHeaderRow\"]/div[2]/h2"));
		String actualUsername = actualAccount.getText();
		System.out.println(actualUsername);
		String expectedUsername = "acc3";
		if(actualUsername.equals(expectedUsername)) {
			System.out.println("pass");}
		else {
				System.out.println("fail");
		}
		//Assert.assertEquals(actualUsername, expectedUsername);
		logger.log(LogStatus.PASS, "UserNAme Found");
	}
	@Test(priority=9)
	private static void TC09_Logout() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC09_Logout");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC09_Logout.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		 WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		logger.log(LogStatus.INFO, "Clciked UserNAme");
		
		WebElement Logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Logout.click();
		
		logger.log(LogStatus.PASS, "Logged out");
		Thread.sleep(5000);
	}
	@Test(priority=8)
	private static void TC08_DevelopersConsole() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC08_DevelopersConsole");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC08_DevelopersConsole.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		 WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		logger.log(LogStatus.INFO, "Clciked UserNAme");
		
		WebElement developConsole = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
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
		logger.log(LogStatus.INFO, "Switched to primary window");
		
		
	}
	@Test(priority=7)
	private static void TC07_MySettingsUserMenu() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC07_MySettingsUserMenu");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC07_MySettingsUserMenu.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		 WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		logger.log(LogStatus.INFO, "Clciked UserNAme");
		
		WebElement mySetting = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink']"));
		mySetting.click();
		logger.log(LogStatus.PASS, "Mysetting Clicked");
		Thread.sleep(5000);
		WebElement emailSetup = driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		emailSetup.click();
		logger.log(LogStatus.PASS, "email setup Clicked");
		WebElement myEmail = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		myEmail.click();
		logger.log(LogStatus.PASS, "email Clicked");
		WebElement emailSignature = driver.findElement(By.xpath("//textarea[@id='signature']"));
		emailSignature.sendKeys(recData[1][4]);
		
		Thread.sleep(7000);
		logger.log(LogStatus.PASS, "text Enetered ");
		
		WebElement save = driver.findElement(By.xpath("//input[@class='btn primary']"));
		save.click();
		logger.log(LogStatus.PASS, "save  Clciked ");
		WebElement msgText = driver.findElement(By.xpath("//div[@class='messageText']"));
		System.out.println(msgText.getText());
		logger.log(LogStatus.PASS, "text received");
		//Alert SwitchALert = driver.switchTo().alert();
		//System.out.println(SwitchALert.getText());
		Thread.sleep(5000);
		WebElement reminder = driver.findElement(By.xpath("//*[@id=\"CalendarAndReminders\"]/a"));
		reminder.click();
		WebElement actReminder = driver.findElement(By.xpath("//*[@id=\"Reminders_font\"]"));
		actReminder.click();
		WebElement openactReminder = driver.findElement(By.xpath("//*[@id=\"testbtn\"]"));
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
	@Test(priority=6)
	private static void TC06_MyProfileUserMenu() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC06_MyProfileUserMenu");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC06_MyProfileUserMenu.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");

		 WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		logger.log(LogStatus.INFO, "Clciked UserNAme");
		
	WebElement profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		profile.click();
		logger.log(LogStatus.INFO, "Clciked profileNAme");
		WebElement editProfile = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		editProfile.click();
		logger.log(LogStatus.INFO, "Clciked EditProfile");
		Thread.sleep(10000);
		logger.log(LogStatus.INFO, "10 sec wait");
	
		driver.switchTo().frame("contactInfoContentId");
		logger.log(LogStatus.INFO, "inside frame");
		
		Thread.sleep(5000);
		
		WebElement aboutClick = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		aboutClick.click();
		logger.log(LogStatus.INFO, "inside frame");
		WebElement lastName = driver.findElement(By.xpath("//input[@id ='lastName']"));
		lastName.clear();
		lastName.sendKeys(recData[1][4]);
		WebElement saveAll = driver.findElement(By.xpath("//input[@type='button']"));
		saveAll.click();
		logger.log(LogStatus.PASS, "edited lastname");
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		logger.log(LogStatus.INFO, "switched to default");
	
		WebElement post = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		post.click();
		logger.log(LogStatus.INFO, "clicked post");
		Thread.sleep(5000);
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(iframe1);
		logger.log(LogStatus.INFO, "switched to iframe");
		WebElement writePost = driver.findElement(By.xpath("//body[text()='Share an update, @mention someone...']"));
		writePost.sendKeys(recData[1][5]);
		driver.switchTo().defaultContent();
		logger.log(LogStatus.INFO, "text entered and switched");
		WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		share.click();
		logger.log(LogStatus.PASS, "posted");
		
		Thread.sleep(5000);
		WebElement file = driver.findElement(By.xpath("//*[@id=\"publisherAttachContentPost\"]/span[1]"));
		file.click();
		logger.log(LogStatus.INFO, "file option clicked");
		WebElement uploadFile = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		uploadFile.click();
		logger.log(LogStatus.INFO, "upload file");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		chooseFile.sendKeys(recData[1][6]);
		WebElement share1 = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		share1.click();
		logger.log(LogStatus.PASS, "file choosed and posted");
	
		Thread.sleep(5000);
		Thread.sleep(5000);
		
		
		//Thread.sleep(5000);
		WebElement addPhoto = driver.findElement(By.xpath("//a[@id='uploadLink']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(addPhoto).click().perform();
		logger.log(LogStatus.INFO, "click image upload done");
		driver.switchTo().frame("uploadPhotoContentId");
		WebElement choosePhoto = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		choosePhoto.sendKeys(recData[1][7]);
		WebElement save = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		save.click();
		logger.log(LogStatus.INFO, "image selected");
	
		WebElement saveCrop = driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
		saveCrop.click();
		driver.switchTo().defaultContent();	
		logger.log(LogStatus.PASS, "image posted");
		
		

		
	}
	@Test(priority=5)
	private static void TC05_UserMenuDropDown() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC05_UserMenuDropDown");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC05_UserMenuDropDown.xls","Sheet1");

		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.INFO, "login clicked");
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.INFO, "closepopup window ");
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
	
		
		
		
	@Test(priority=4)
	private static void TC4B_ForgotPassword() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC4B_ForgotPassword");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC4B_ForgotPassword.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Pressed Login and entered details");

		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "Password clicked and entered ");
		WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
		Login.click();
		logger.log(LogStatus.INFO, "login clicked");
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
		logger.log(LogStatus.PASS, "testcase passed");
	}
		
	@Test(priority=4)
	private static void TC4A_ForgotPassword() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC4A_ForgotPassword");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC4A_ForgotPassword.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.INFO, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "entered username");
		WebElement forgotPassword = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]"));
		forgotPassword.click();
		Thread.sleep(5000);
		System.out.println("forgotPassword clicked");
		logger.log(LogStatus.INFO, "forgotPassword clicked");
		WebElement forgotUsername = driver.findElement(By.xpath("//input[@id='un']"));
		forgotUsername.sendKeys(recData[1][2]);
		logger.log(LogStatus.INFO, "entered username");
		WebElement continue3 = driver.findElement(By.xpath("//input[@id='continue']"));
		continue3.click();
		Thread.sleep(5000);
		WebElement  errormsg1 = driver.findElement(By.xpath("//p[contains(text(),'We’ve sent you an email with a link to finish resetting your password.')]"));
		System.out.println(errormsg1.getText());
		logger.log(LogStatus.PASS, "Got Error Message");
	}
	@Test(priority=3)
	private static void TC03_CheckRemeberMe() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("rememberMe");
		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC03_CheckRemeberMe.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.PASS, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.PASS, "entered username");
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		logger.log(LogStatus.PASS, "entered password");
		
		WebElement rememberMe = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		rememberMe.click();
		logger.log(LogStatus.PASS, "remember me");
		
		WebElement loginSub = driver.findElement(By.xpath("//input[@name='Login']"));
		loginSub.click();
		logger.log(LogStatus.PASS, "Logged in");
		
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		logger.log(LogStatus.PASS, "Closed the popup");
	
		WebElement userMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		userMenu.click();
		logger.log(LogStatus.PASS, "Clciked UserNAme");
		WebElement Logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Logout.click();
		
		logger.log(LogStatus.PASS, "Logged out");
			Thread.sleep(5000);
			WebElement userFeild = driver.findElement(By.xpath("//input[@value='priyadharshini.dp.1011-r7ah@force.com']"));
			String actualUsername = userFeild.getAttribute("value");
			System.out.println(actualUsername);
			String expectedUsername = "priyadharshini.dp.1011-r7ah@force.com";
			Assert.assertEquals(actualUsername, expectedUsername);
			logger.log(LogStatus.PASS, "UserNAme Found");
		}
		
	@Test(priority=2)
	private static void TC02_LoginToSalesForce() throws IOException {
		// TODO Auto-generated method stub
		logger = reports.startTest("TC02_LoginToSalesForce");

		String [][] recData = getDataInput("C:\\Users\\auhum\\Desktop\\SalesForceFinal","TC02_LoginToSalesForce.xls","Sheet1");
		WebElement login = driver.findElement(By.xpath("//a[@class = 'dropdown-toggle disabled'][contains(text(),'Login')]"));
		login.click();
		logger.log(LogStatus.PASS, "Pressed Login");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='username']"));
		input.sendKeys(recData[1][2]);
		logger.log(LogStatus.PASS, "Input userid");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(recData[1][3]);
		logger.log(LogStatus.PASS, "Cleared Password");
	
		WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
		Login.click();
		
		logger.log(LogStatus.PASS, "login success ");
		
	}
	@BeforeClass
	private static void setupDriver() {
		// TODO Auto-generated method stub
		reports = new ExtentReports("C:\\Users\\auhum\\Desktop\\ExtendReport\\Login123.html");
		logger = reports.startTest("SalesForce");
		
		System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		logger.log(LogStatus.PASS, "got the URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	@AfterClass
	private static  void closing() {
		logger = reports.startTest("Closing Browser");
		logger.log(LogStatus.PASS, "Closing");
		reports.endTest(logger);
		reports.flush();
		
		driver.quit();
	}
	}


