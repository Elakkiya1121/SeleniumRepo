package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Launch the chromebrowser
				// Step 2: Load the URL https://en-gb.facebook.com/
				// Step 3: Maximize the window
				// Step 4: Add implicit wait
				// Step 5: Click on Create New Account button
				// Step 6: Enter the first name
				// Step 7: Enter the last name
				// Step 8: Enter the mobile number
				// Step 9: Enter the password
				// Step 10: Handle all the three drop downs
				// Step 11: Select the radio button "Female" 
				          //  ( A normal click will do for this step)
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("kiya");
	driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("elaks");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("elakkiya1121.rak@gmail.com");
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("112233654");
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("elakkiya1121.rak@gmail.com");
	
	WebElement Date = driver.findElement(By.id("day"));
	Select drop1=new Select(Date);
	drop1.selectByVisibleText("13");
	
	WebElement month = driver.findElement(By.id("month"));
	Select drop2=new Select(month);
	drop2.selectByVisibleText("Dec");
	
	WebElement year = driver.findElement(By.id("year"));
	Select drop3=new Select(year);
	drop3.selectByVisibleText("1996");
	
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	}
	
}
