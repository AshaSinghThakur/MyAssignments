package week3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//step-2 load the url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	String title=driver.getTitle();
	System.out.println(":Title :"+title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL :"+currentUrl);
	String text = driver.findElement(By.id("viewLead")).getText();
}
}
