package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("https://dev31913.service-now.com/navpage.do");

driver.manage().window().maximize();
driver.findElement(By.id("user_name")).sendKeys("admin");
driver.findElement(By.id("user_password")).sendKeys("q+NozS5Qe8!E");
driver.findElement(By.id("sysverb_login")).click();

System.out.println(driver.getTitle());
	}

}
