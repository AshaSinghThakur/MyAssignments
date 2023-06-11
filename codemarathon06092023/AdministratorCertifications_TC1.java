package codemarathon06092023;
/*
 * 1. Launch Salesforce application https://login.salesforce.com/
2. Login with username as "hari.radhakrishnan@qeagle.com" 
    and password as "Leaf@1234"
3. Click on Learn More link in Mobile Publisher
4. Click confirm on Confirm redirect
5. Click Learning 
6. And mouse hover on Learning On Trailhead
7. Clilck on Salesforce Certifications
8. Click on first resulting Ceritificate
9. verify - Administrator Overview page
10.Print the Certifications available for Administrator Certifications (List)
 */

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministratorCertifications_TC1 {
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		
		//Learn More
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> data= new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(data.get(1));
		//Click confirm on Confirm redirect
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//shadow -  Click Learning 
		
		Shadow op=new Shadow(driver);
			op.findElementByXPath("//span[text()='Learning']").click();
			//6. And mouse hover on Learning On Trailhead
			Actions builder=new Actions(driver);
			WebElement shadowEle = op.findElementByXPath("//span[text()='Learning on Trailhead']");
			builder.moveToElement(shadowEle).pause(1000).perform();
			
			//7. Clilck on Salesforce Certifications
			op.findElementByXPath("//a[text()='Salesforce Certification']").click();
			//8. Click on first resulting Ceritificate
			List<WebElement> certificatesDetails = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
			System.out.println("First resulting Ceritificate : "+certificatesDetails.get(0).getText());
			//9. verify - Administrator Overview page
			String text = driver.findElement(By.xpath("(//div[@class='credentials-card_description'])[1]")).getText();
			System.out.println(" Administrator Overview page : \n"+text);
			String title = driver.switchTo().window(data.get(1)).getTitle();
			System.out.println("Title of current Window :"+title);
			//screenshot
			//WebElement login = driver.findElement(By.xpath("(//div[@class='credentials-card_description'])[1]"));
			Thread.sleep(3000);
			File scr = driver.getScreenshotAs(OutputType.FILE);
			File dse=new File("./screenshot/certification1.png");
			FileUtils.copyFile(scr, dse);
			//10.Print the Certifications available for Administrator Certifications (List)
		System.out.println("/n The Certifications available for Administrator Certifications are :");
		int size = certificatesDetails.size();
		for (int i = 0; i < size; i++) {
			System.out.println(certificatesDetails.get(i).getText());
			
		}
	}

}
