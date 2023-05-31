package Week2Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDeleteXpath {
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
		 //7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//9	Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234123412");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//11	Capture lead ID of First Resulting lead
		String Leadid=driver.findElement(By.xpath("//a[text()='17056']")).getText();
		System.out.println("LeadID :"+Leadid);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='17056']")).click();
		//13	Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//14	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Leadid);
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String deleteMessage=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(deleteMessage);
		//18	Close the browser (Do not log out)
		driver.close();
}
}

