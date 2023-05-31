package Week2Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCreateXpath {
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver=new ChromeDriver();
	
		// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 // * 2. Enter UserName and Password Using Id Locator
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		 // * 3. Click on Login Button using Class Locator
		 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 
		 // * 4. Click on CRM/SFA Link
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 
		 //* 5. Click on Leads Button
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 // * 6. Click on create Lead Button
		 driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		 // * 7. Enter CompanyName using id Locator
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Chumma Comp");
		 //* 8. Enter FirstName using id Locator
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Chumma");
		 
		 // * 9. Enter LastName using id Locator
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Tha");
		 Thread.sleep(3000);
		 // * 10. Enter your mail-id
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("chummatha@gmail.com");
		 
		 Thread.sleep(3000);
		 //* 11.phone number 
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("1234123412");
		 Thread.sleep(3000);
		 // * 12. Click on create Lead Button Using name Locator
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 driver.close();

}
}

