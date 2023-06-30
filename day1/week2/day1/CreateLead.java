package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
         driver.findElement(By.id("username")).sendKeys("demosalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         System.out.println(driver.getTitle());
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
 		 driver.findElement(By.partialLinkText("Create")).click();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kathija");
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Zayn");
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ziya");
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as a Network Analyst");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kathijazayn212@gmail.com");
         driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7092475523");
         driver.findElement(By.className("smallSubmit")).click();
         System.out.println(driver.getTitle());
         
	}

}
