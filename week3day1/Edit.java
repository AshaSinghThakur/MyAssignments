package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*use with Advance xpath
http://leaftaps.com/opentaps/control/main
			
			* 1	Launch the browser
			* 2	Enter the username
			* 3	Enter the password
			* 4	Click Login
			* 5	Click crm/sfa link
			* 6	Click Leads link
			* 7	Click on Create Lead
            *8 Enter company name
            *9 Enter first name
            *10 Enter last name
            *11click on Create Lead button  
			* 12 Click Edit
			* 13 Change the company name
			* 14 Click Update */
public class Edit {
	public static void main(String[] args) {
		//* 1	Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//* 2	Enter the username ES to YS
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("DemoSalesManager");
		//* 3	Enter the password - GP to GC
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		//* 4	Click Login EC to YC
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		//* 5	Click crm/sfa link - P to C
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//* 6	Click Leads link P to C
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();
		//* 7	Click on Create Lead EC - YC
		driver.findElement(By.xpath("//a[text()='My Leads']/following::a")).click();
		//*8 Enter company name EC - YC
		driver.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("Naveen Comp");
		//*9 Enter first name  EC - YC
		driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("Naveen");
		//*10 Enter last name
		driver.findElement(By.xpath("//input[@ID='createLeadForm_firstName']/following::input")).sendKeys("Thakur");
		//*11click on Create Lead button  
		driver.findElement(By.xpath("//input[@ID='createLeadForm_generalPostalCodeExt']/following::input")).click();
		//* 12 Click Edit YS - ES
		driver.findElement(By.xpath("//a[text()='Delete']/preceding-sibling::a[1]")).click();
		//* 13 Change the company name Edit 
		driver.findElement(By.xpath("//span[text()='Parent Account']/preceding::input[1]")).clear();
		driver.findElement(By.xpath("//span[text()='Parent Account']/preceding::input[1]")).sendKeys("Navasha Comp");
		//* 14 Click Update EC to YC
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']/following::input")).click();
		//clsoe browser
		driver.close();
	}

}
