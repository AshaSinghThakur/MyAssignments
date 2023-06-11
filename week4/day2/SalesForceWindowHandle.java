package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*Launch browser and load url
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
public class SalesForceWindowHandle {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//get all the parent window related data
		String Parent = driver.getTitle();
		System.out.println("Parent Window Name :"+Parent);
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Title of the Parent Window"+Parent);
		//navigate xpath link to child 
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		// now we have more windows use getwindowhandles
		Set<String> childWindow = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(childWindow);
		// get size of windows
		int windowSize = childWindow.size();
		System.out.println("windowSize is :"+windowSize);
		
		
		
		
		
		driver.close();
		

}
}

