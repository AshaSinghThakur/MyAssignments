package week4.day1;
/*a)Launch the browser
b)Load the url https://www.irctc.co.in/nget/train-search
c)Enter MS in ‘From’ textbox
d)Enter Cape in ‘To’ textbox
e)Click search button 
f)Click refresh button
g)Click WL and Click BookNow button
e)Click No button in the alert */

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SweetAlert {
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		//driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']")).sendKeys("MS");
		//Enter MS in ‘From’ textbox
		driver.findElement(By.xpath("//input[contains(@class,'state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]")).sendKeys("MS");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
		//d)Enter Cape in ‘To’ textbox
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/input")).sendKeys("Cape");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
		//select calender
		//driver.findElement(By.xpath("//input[contains(@class,'ui-state-default ui-corner-all ng-star-inserted')]")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted']")).click();
		Thread.sleep(1000);
		//Search
		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
		//Click refresh button
		driver.findElement(By.xpath("//div[@class='col-xs-12 link']")).click();
		//WL
		driver.findElement(By.xpath("//div[@class='WL col-xs-12']")).click();
		//Book
		driver.findElement(By.xpath("(//button[text()=' Book Now '])[1]")).click();
		//Alert alert = driver.switchTo().alert();
		String text2 = driver.findElement(By.xpath("//span[@class='ui-confirmdialog-message ng-tns-c56-15']")).getText();
		System.out.println("Alert Message is : "+text2);
		//click on No'
	    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-clickable'])[2]")).click();
	    System.out.println("Alert box No button clicked ");
	    
		driver.close();

		
	}

}
