
//Choose close date as as Tomorrow Date
// 8 ) Identify alerts message in DOM , specific to each line of code inside the dom for each specific field error.
package week4day4;
/*
 * 1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Opportunity tab 
5. Click on New button
6. Choose Close date as Tomorrow Date
7. Click on save 
8. Verify the Alert message (Complete this field) displayed for Name and Stage"
 */

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateOppWithoutManFields_Assignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//2. Click on toggle menu button from the left corner
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				//3. Click view All and click Sales from App Launcher
				//view all
				driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
				//click sales
				driver.findElement(By.xpath("//p[text()='Sales']")).click();
				Thread.sleep(2000);
				//4. Click on Opportunity tab 
				WebElement js = driver.findElement(By.xpath("//span[text()='Opportunities']"));		
				//js-syntax
				driver.executeScript("arguments[0].click();", js);
				//5. Click on New button
				driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
				
				//6. Choose close date as as Tomorrow Date
				driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
				driver.findElement(By.xpath("//td[@class='slds-is-today']/following-sibling::td")).click();
				

		//7. Click on save 
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		//8. Verify the Alert message (Complete this field) displayed for Name and Stage"
				//Alert alert = driver.switchTo().alert();
				//String alertText = alert.getText();
				String alertText = driver.findElement(By.xpath("(//div[@class='slds-popover__body'])[2]")).getText();
				System.out.println("Alert Text :"+alertText);
				
				//table[@class='slds-datepicker__month']
				
				
	}
	

}
