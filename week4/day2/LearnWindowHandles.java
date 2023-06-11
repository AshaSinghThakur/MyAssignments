package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.leafground.com/window.xhtml");
	String Parent = driver.getTitle();
	System.out.println(Parent);
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	//String Child = driver.getTitle();
	//System.out.println(Child);
	Set<String> ChildWindow = driver.getWindowHandles();
	System.out.println(ChildWindow);
	//size 
	int Windowsize = ChildWindow.size();
	System.out.println(Windowsize);
	//TO get perticular window convert set into List to get access to Get()
	List<String> windows=new ArrayList<String>(ChildWindow);
	//syntax switch control to child window
	driver.switchTo().window(windows.get(1));
	String title = driver.getTitle();
	
	
	

}
}
