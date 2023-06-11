package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	//SafariDriver driver=new SafariDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/");
	driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
	driver.findElement(By.xpath("//span[text()='Frame']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[@id='Click']")).click();
	// nested frame 
	//1st frame
	Thread.sleep(2000);
	driver.switchTo().frame(2);
	//2nd frame 
	Thread.sleep(2000);
	driver.switchTo().frame("frame2");
	driver.findElement(By.id("Click")).click();
	
	/* 
	 
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		//parent frame 
		//defaultcontent
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//nested frame
		
		//first frame 
		driver.switchTo().frame(2);
		
		//2nd frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
	 
	 */
	
}
}