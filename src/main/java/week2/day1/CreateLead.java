package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// Initiate the ChromeBroswer
ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the UserName
WebElement userName = driver.findElementById("username");
		// Enter the Password
userName.sendKeys("DemoSalesManager");
		// Click on Login Button
driver.findElementById("password").sendKeys("crmsfa");
		// Click on crm/sfa button
driver.findElementByClassName("decorativeSubmit").click();
		// Click on Leads
driver.findElementByLinkText("CRM/SFA").click();
		// Click on Create Lead button
driver.findElementByLinkText("Leads").click();
		// Enter Company Names
driver.findElementByLinkText("Create Lead").click();
		// Enter First Name
WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		// Enter Last Name
Select d1=new Select(Source);
		// Click on Create Lead (Submit) button
d1.selectByValue("Employee");
		// Verify the Lead is created by checking the Company or First Name

	}

		// TODO Auto-generated method stub
		
}

