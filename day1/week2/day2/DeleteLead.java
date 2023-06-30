package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
         driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7092475523");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
         Thread.sleep(3000);  
         String LeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();	 
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        driver.findElement(By.partialLinkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID); 
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        System.out.println(driver.getTitle());
        driver.close();
	}

}
