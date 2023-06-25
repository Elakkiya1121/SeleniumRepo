package week2.day1;



	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateLead {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elakkiya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sugumaran");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Elakkiya");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Training");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning_Java_Selenium");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("elakkiya1121.rak@gmail.com");
			driver.findElement(By.name("submitButton")).click();
			System.out.println(driver.getTitle());
			
		}

	}
