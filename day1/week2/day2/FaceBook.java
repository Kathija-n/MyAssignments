package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.partialLinkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kathija");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ziya");
        driver.findElement(By.name("reg_email__")).sendKeys("8608119899");
        driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Zara@1809"); 
        WebElement day = driver.findElement(By.name("birthday_day"));
        Select drop1=new Select(day);
        drop1.selectByIndex(1);
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select drop2= new Select(month);
        drop2.selectByVisibleText("Dec");
        WebElement year = driver.findElement(By.id("year"));
        Select drop3= new Select(year);
        drop3.selectByValue("1995");
        driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
        
	}

}
