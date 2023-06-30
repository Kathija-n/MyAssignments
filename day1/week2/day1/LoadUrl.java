package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadUrl {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://dev31913.service-now.com/navpage.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("q+NozS5Qe8!E");
			driver.findElement(By.className("decorativeSubmit")).click();
			System.out.println(driver.getTitle());
			
	}

}
