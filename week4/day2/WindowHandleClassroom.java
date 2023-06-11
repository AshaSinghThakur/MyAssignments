package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/*
 * Load https://irctc.co.in
 * click on Flights link
 * Get the title ( flight window - Air Ticket )
 * Close the First tab ( Train ticket booking ) alone
 */

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleClassroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		/* Single window Code
		 * String windowHandle = driver.getWindowHandle();
		System.out.println("Address of Flights Window is :"+windowHandle);
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println("Title of the Window : "+title);
		driver.close();
		*/
		//multiple window code
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Address of the windows by SET "+windowHandles);
		// Get the title of the Flight window Air ticket
		// 1) mouse is in IRCTC window need to switch to Flight window, 
		// 2) To get window Title need to have access to get() in List so convert Set ( Unique) to List and access 
		List<String> childWindows=new ArrayList<String>(windowHandles);
		//Set and List holds the memory location of windows which are same 
		System.out.println("Address of the windows by List "+childWindows);
		String title = driver.switchTo().window(childWindows.get(1)).getTitle();
		System.out.println("Title of the flight Window :"+title);
		//Close the first tab ( Train ticket booking ) alone 
		driver.switchTo().window(childWindows.get(0)).close();
		System.out.println("Train ticket booking window closed");
		

	}

}
