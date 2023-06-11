package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {
public static void main(String[] args) {
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	
	ChromeDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	WebElement rc = driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"));
	
	Actions builder= new Actions(driver);
	
	//builder.contextClick(driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"))).perform();
	builder.contextClick(rc).perform();
}
}
