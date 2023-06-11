package week4.day1;
/*
 * prompt alert

1.launch browser and load url
2.click on show button
3.pass driver control to alert
4.get text from alert
5.pass value
6.accpect
7.print text
 */
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HandlingLeafGroundAllAlerts {
	public static void main(String[] args) throws InterruptedException {
		//SafariDriver driver=new SafariDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/");
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//SIMPLE ALERT Type 1
		//switch control to alert
		//driver.switchTo().alert().accept(); cant get the text using getText()
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple Alert :"+text);
		alert.accept();
		String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println("Simple Alert Result :"+text2);
		//CONFIRM ALERT Type 2
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//handle alert
		Alert alert2 = driver.switchTo().alert();
		String text4 = alert.getText();
		Thread.sleep(2000);
		alert2.dismiss();
		//result 
		String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println("Confirm Alert Result :"+text3);
		//SWEET ALERT TYPE 3
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		//Alert alert3 = driver.switchTo().alert(); 
		String text5 = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']")).getText();
		System.out.println("Sweet Alert "+text5);
		driver.findElement(By.xpath("//a[contains(@class,'itlebar-close ui-corner-all')]")).click(); 
		//Prompt Alert Type 4
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert4 = driver.switchTo().alert();
		String text6 = alert.getText();
		System.out.println("Prompt Alert message :"+text6);
		alert4.sendKeys("Asha");
		alert4.accept();
		//Result 
		String text7 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("Prompt Alert Result :"+text7);
		//Sweet Model Dialogue Type 5
		driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']//following::span")).click();
		String text8 = driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']")).getText();
		System.out.println("Sweet Model Dialog Alert Result :"+text8);
		driver.findElement(By.xpath("(//a[contains(@class,'titlebar-close ui-corner-all')])[2]")).click();
		//Sweet Alert (Confirmation) Type 6 
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		System.out.println("Sweet Alert (Confirmation) Delete"); 
		String text9 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[4]")).getText();
		System.out.println("Sweet Alert (Confirmation) Delete Alert mes :"+text9);
		driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();
		System.out.println("Sweet Alert (Confirmation) Delete Alert closed");
		//Minimize and Maximize Sweet Alert Type 7
		driver.findElement(By.xpath("//h5[contains(text(),'Minimize and ')]/following::span[2]")).click();
		System.out.println("Minimize and Maximize Sweet Alert clicked");
		String text10 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p)[3]")).getText();
		System.out.println("Min and Max Alert box mes : "+text10);
		//closing alert
		driver.findElement(By.xpath("//span[contains(text(),'Min and Max')]/following::a")).click();
		System.out.println("Min and Max Alert box is closed ");
		driver.close();
		
	}

}
