package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		
//DeleteLead
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),\"Leads\")]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Asha Org");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Asha");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("T");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("asha@gmail.com");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("4532145545");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	driver.close();
	}	
	
	

}
