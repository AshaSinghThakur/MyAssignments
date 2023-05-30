/*Pseudo Code
* 
* 1. Launch URL "http://leaftaps.com/opentaps/control/login"
* 
* 2. Enter UserName and Password Using Id Locator
* 
* 3. Click on Login Button using Class Locator
* 
* 4. Click on CRM/SFA Link
* 
* 5. Click on Leads Button
* 
* 6. Click on create Lead Button
* 
* 7. Enter CompanyName using id Locator
* 
* 8. Enter FirstName using id Locator
* 
* 9. Enter LastName using id Locator

* 10. Enter your mail-id

* 11.phone number 

* 12. Click on create Lead Button Using name Locator */
package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignmentCreate {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//launch the browser
	driver.get("http://leaftaps.com/opentaps/control/login");
	//maximize screen
	driver.manage().window().maximize();
	// add wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Enter UserName and Password Using Id Locator
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click on Login Button using Class Locator
	driver.findElement(By.className("decorativeSubmit")).click();
	// Click on CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	//Click on Leads Button
	driver.findElement(By.linkText("Leads")).click();
	//click on create lead 
	driver.findElement(By.linkText("Create Lead")).click();
	//*8 Enter company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Asha Comp");
    //*9 Enter first name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Asha");
    //*10 Enter last name
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
	//*11click on Create Lead button  
	driver.findElement(By.name("submitButton")).click();
	//* 12 Click Edit
	driver.findElement(By.linkText("Edit")).click();
	//* 13 Change the company name 
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Asha Company");
	//* 14 Click Update
	driver.findElement(By.name("submitButton")).click();
	//Driver close
	driver.close();
	
}
}
