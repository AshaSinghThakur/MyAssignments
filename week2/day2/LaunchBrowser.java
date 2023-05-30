package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	//how to launch the browser
	//SafariDriver driver=new SafariDriver();
	ChromeDriver driver=new ChromeDriver();
	//to max Screen
	driver.manage().window().maximize();
	//load the URL 
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//driver.findElement(By.linkText(null))
	//need and wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//close the browser
	driver.close();
	
	
}
}
