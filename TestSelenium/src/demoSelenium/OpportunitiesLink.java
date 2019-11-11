package demoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpportunitiesLink extends CssSelector {
	@Test(priority=6,enabled=false)
	public void opportunitiesClick() {
		

	WebElement firstTab = driver.findElement(By.xpath("//*[@id='Opportunity_Tab']/a"));
	firstTab.click();

	WebElement allOpportunities = driver.findElement(By.xpath("//select[@id='fcf']"));
	 Select select = new Select(allOpportunities); 
     List<WebElement> options = select.getOptions(); 
      for(WebElement item:options) 
      { 
      
           System.out.println("Dropdown values are "+ item.getText());          
         }
	
	
	//allOpportunities.click();
	//List<WebElement> options = allOpportunities.findElements(By.tagName("option"));
	
	//options.stream().forEach(i -> System.out.println(i.getAttribute("title")));;
	//String[] a = {"My Profile","My Settings","Developer Console (New Window) ","Switch to Lightning Experience","Logout"};
	/*boolean d= true;
	for(int i=0;i<options.size();i++)
	{
		boolean s= false;
		for(int j=0;j<a.length;j++) {
			System.out.println(options.get(i).);
			if(a[j].equals(options.getText) {
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
	*/
	}
}
