package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
         driver.findElement(By.id("username")).sendKeys("demosalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         System.out.println(driver.getTitle());
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.partialLinkText("Find Leads")).click();
         driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kathija");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("cogni");  
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        driver.close();
	}

}
