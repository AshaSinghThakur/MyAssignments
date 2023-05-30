package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	//how to launch the browser
	ChromeDriver driver=new ChromeDriver();
	//to max Screen
	driver.manage().window().maximize();
	//need add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//load the URL 
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("Asha@gmail.com");
	driver.close();
	
}
}
