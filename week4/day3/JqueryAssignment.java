package week4.day3;
/*
 * Assignment Based on Action Class
================================

https://jqueryui.com/draggable
https://jqueryui.com/droppable
https://jqueryui.com/resizable
https://jqueryui.com/selectable
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JqueryAssignment {
	public static void main(String[] args)  {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1) DRAGGABLE
		driver.get("https://jqueryui.com/draggable");
		// It has View Frame Source while inspecting , so need to handle frame first
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(draggable, 120, 50).perform();
		driver.switchTo().defaultContent();
		//2)DROPPABLE
		//driver.get("https://jqueryui.com/droppable");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(0);
		WebElement droppable = driver.findElement(By.xpath("//div[@id='draggable']"));
		builder.dragAndDropBy(droppable, 100, 100).perform();
		driver.switchTo().defaultContent();
	
		//3) Resizable -https://jqueryui.com/resizable
				driver.findElement(By.xpath("//a[text()='Resizable']")).click();
	
				//driver.get("https://jqueryui.com/resizable");
				driver.switchTo().frame(0);
				
				WebElement reSizable = driver.findElement(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
				
				//builder.dragAndDropBy(reSizable,100,100).perform();
				//builder.clickAndHold(reSizable).moveByOffset(100,110).release(reSizable).perform();
				builder.clickAndHold(reSizable).pause(2000).moveByOffset(100, 110).release(reSizable).perform();
				driver.switchTo().defaultContent();
				
		//4 ) SELECTABLE https://jqueryui.com/selectable
				driver.findElement(By.xpath("//a[text()='Selectable']")).click();
				//driver.get("https://jqueryui.com/selectable");
				driver.switchTo().frame(0);
				WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
				WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
				WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
				//builder.clickAndHold(Item1).clickAndHold(Item2).clickAndHold(Item3).perform();
				builder.keyDown(Keys.CONTROL).click(Item3).click(Item2).click(Item1).keyUp(Keys.CONTROL).perform();
				driver.switchTo().defaultContent();
		
		
}
}
