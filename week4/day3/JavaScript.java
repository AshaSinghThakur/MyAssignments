package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript {
	public static void main(String[] args) {
		
	
	ChromeOptions apt= new ChromeOptions();
	
	apt.addArguments("--disable-notifications");
	ChromeDriver driver= new ChromeDriver(apt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.className("slds-icon-waffle")).click();
	
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	//Sales
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	WebElement js = driver.findElement(By.xpath("//span[text()='Opportunities']"));
//	js.click();
	
	//js-syntax
	driver.executeScript("arguments[0].click();", js);
	}
}
