package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
         driver.findElement(By.id("username")).sendKeys("demosalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         System.out.println(driver.getTitle());
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Contacts")).click();
         
 		 driver.findElement(By.partialLinkText("Create")).click();
         driver.findElement(By.id("firstNameField")).sendKeys("Kathija");
         driver.findElement(By.id("lastNameField")).sendKeys("Ziya");
         driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("8608119899");
         driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kathijazayn212@gmail.com");
         driver.findElement(By.className("smallSubmit")).click();
         String firstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
         System.out.println(firstName);
         System.out.println(driver.getTitle());
         driver.close();
	}
	 
}
