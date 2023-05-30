package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		// To max screen
		driver.manage().window().maximize();
		//load the URL
		driver.get("https://login.salesforce.com/");
		//pass values 
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		//click on login
		driver.findElement(By.id("Login")).click();
		//browser close
		driver.close();
	}

}
