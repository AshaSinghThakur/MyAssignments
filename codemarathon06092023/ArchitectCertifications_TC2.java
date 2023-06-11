package codemarathon06092023;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

/*
 * Testcase-2: Architect Certifications
==========================
1. Launch Salesforce application https://login.salesforce.com/
2. Login with Provided Credentials
3. Click on Learn More link in Mobile Publisher
4. Click  On Learning
5. And mouse hover on Learning On Trailhead
6. Click on Salesforce Certifications
7. Choose Your Role as Salesforce Architect
8. Get the Text(Summary) of Salesforce Architect 
9. Get the List of Salesforce Architect Certifications Available
10.Click on Application Architect 
11.Get the List of Certifications available
 */

public class ArchitectCertifications_TC2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		//1. Launch Salesforce application https://login.salesforce.com/
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		////2. Login with Provided Credentials
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		//3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		// windowHandle
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindows=new ArrayList<String>(windowHandles);
		String childTitle = driver.switchTo().window(childWindows.get(1)).getCurrentUrl();
		System.out.println("Url of Current window :"+childTitle);
		//click on Confirm 
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		//4. Click  On Learning
		Shadow op=new Shadow(driver);
		op.findElementByXPath("//span[text()='Learning']").click();
		//5. And mouse hover on Learning On Trailhead
		Actions builder=new Actions(driver);
		Thread.sleep(3000);
		WebElement shadowEle = op.findElementByXPath("//span[text()='Learning on Trailhead']");
		builder.moveToElement(shadowEle).pause(1000).perform();
		//6. Click on Salesforce Certifications
		op.findElementByXPath("//a[text()='Salesforce Certification']").click();
		//7. Choose Your Role as Salesforce Architect
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]"));
		//8. Get the Text(Summary) of Salesforce Architect 
		//9. Get the List of Salesforce Architect Certifications Available
		//10.Click on Application Architect 
		//11.Get the List of Certifications available

	}

}
