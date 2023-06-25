package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "path to chromedrive.exe");
		//webDriverManager.ChromeDriver.setup
		
		// Setup the driver path
		ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
//maximise my browser
driver.manage().window().maximize();
//find the element enterthe user name

driver.findElement(By.id("Username")).sendKeys("demosalesmanager");
//find the element of password
driver.findElement(By.id("Password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativesubmit")).click();
//get the title
System.out.println(driver.getTitle());
driver.findElement(By.partialLinkText("CRM")).click();
//driver.findElement(By.linkText("CRM/SFA")).click();
//clilck lead
	}
}