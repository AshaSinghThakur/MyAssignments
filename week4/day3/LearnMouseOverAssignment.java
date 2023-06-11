package week4.day3;
/*
 * Mouse over
snapdeal
https://www.snapdeal.com/
beauty,health
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseOverAssignment {
	public static void main(String[] args) {
		
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Beauty, Health & Daily Needs']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(mouseOver).perform();
		System.out.println("Mouseover performed");
		

}
}
