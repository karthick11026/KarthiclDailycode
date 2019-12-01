package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement elesource = driver.findElementById("txtStationFrom");
		elesource.clear();
		elesource.sendKeys("MAS",Keys.TAB);
		
		WebElement eledestination= driver.findElementById("txtStationTo");
		eledestination.clear();
		eledestination.sendKeys("SBC",Keys.TAB);
		Thread.sleep(3000);
		driver.findElementById("chkSelectDateonly").click();
		
		WebElement eletable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeadler']");
		List<WebElement> elerow = driver.findElements(By.tagName("tr"));
		for (int i=0; i<elerow.size(); i++) {
		List<WebElement> elecol = elerow.get(i).findElements(By.tagName("td"));
		System.out.println(elecol.get(1));
	}

}
