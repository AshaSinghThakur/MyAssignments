/*http://leaftaps.com/opentaps/control/main
			
			* 1	Launch the browser
			* 2	Enter the username
			* 3	Enter the password
			* 4	Click Login
			* 5	Click crm/sfa link
			* 6	Click Leads link
			* 7	Click on Create Lead
            * 8 Enter company name
            * 9 Enter first name
            * 10 Enter last name
            * 11 click on Create Lead button  
			* 12 Click Edit
			* 13 Change the company name
			* 14 Click Update */
package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignmentEdit {
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



