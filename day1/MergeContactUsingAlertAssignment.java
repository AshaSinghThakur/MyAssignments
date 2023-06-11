package week4.day1;
/*
 * //Pseudo Code
 * 
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 * 
 * 2. Enter UserName and Password Using Id Locator
 * 
 * 3. Click on Login Button using Class Locator
 * 
 * 4. Click on CRM/SFA Link
 * 
 * 5. Click on contacts Button
 * 	
 * 6. Click on Merge Contacts using Xpath Locator
 * 
 * 7. Click on Widget of From Contact
 * 
 * 8. Click on First Resulting Contact
 * 
 * 9. Click on Widget of To Contact
 * 
 * 10. Click on Second Resulting Contact
 * 
 * 11. Click on Merge button using Xpath Locator
 * 
 * 12. Accept the Alert
 * 
 * 13. Verify the title of the page
 */

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContactUsingAlertAssignment {
	public static void main(String[] args) {
		
	
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	
	ChromeDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	//Click on Merge Contacts using Xpath Locator
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	//7. Click on Widget of From Contact
	driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> childWindow=new ArrayList<String>(windowHandles);
	driver.switchTo().window(childWindow.get(1));
	//* 8. Click on First Resulting Contact
	driver.findElement(By.xpath("//a[@class='linktext']")).click();
	driver.close();
	 
	// * 9. Click on Widget of To Contact
	driver.findElement(By.xpath("//input[@id='partyIdTo']/following::a")).click();
	
	// * 10. Click on Second Resulting Contact
	
	 
	// * 11. Click on Merge button using Xpath Locator
	 
	// * 12. Accept the Alert
	 
	 //* 13. Verify the title of the page

}
}
