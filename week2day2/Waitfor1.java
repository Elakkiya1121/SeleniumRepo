package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Waitfor1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elakkiya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sugumaran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Elakkiya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Training");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning_Java_Selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("elakkiya1121.rak@gmail.com");
		//driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		//Step:1  Locate the dropdown web element
	
	
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select drop2= new Select(Source);
				drop2.selectByVisibleText("Cold Call");
			
		
		
	       // Step:2  Instantiate Select class pass WebElement
	       ;
	       // Step:3  Call select class method to pick the option from dropdown
	        //M1--->drop1.selectByIndex(3);
	        //M2--->drop1.selectByValue("LEAD_EMPLOYEE");
	        //M3
	    
	        //click createButton
	        //driver.findElement(By.name("submitButton")).click();
	        
	        
	        //close the browser
	        //driver.close();
		//Step:2  Instantiate Select class
		//Step:3  Call select class method to pick the option from    dropdown
	}

}
