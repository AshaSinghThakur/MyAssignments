package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//need and waits
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.xpath("//div[@id='username_container']//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	
	//parent to child password
	driver.findElement(By.xpath("//form[@id='login_form']/input")).sendKeys("Leaf@1234");
	
	driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).click();

}
}
