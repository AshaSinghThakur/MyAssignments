package week4.day2;
/*
Launch browser and load url
https://login.salesforce.com/
  username  hari.radhakrishnan@qeagle.com
  password: Leaf@1234
   login button
   more learn click
   handle Window
   get title of child Window
   close child Window
   get title of parent window 
   close
   */


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleSalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childwindows=new ArrayList<String>(windowHandles);
		int  windowSize = childwindows.size();
		System.out.println(" No of Windows present are : "+windowSize);
		String title = driver.switchTo().window(childwindows.get(1)).getCurrentUrl();
		System.out.println("Current URL of the child window is as follows : \n"+title);
		driver.close();
		String title2 = driver.switchTo().window(childwindows.get(0)).getTitle();
		System.out.println("Title of the parent window : "+title2);
		driver.close();
		
		

	}

}
