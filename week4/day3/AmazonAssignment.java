// 8) I observe NoSuchElementFound exception due to dif behaviour in manual & automation esp next to Add to Cart dif behaviour takes place.
package week4.day3;
/*1.Load the URL https://www.amazon.in/
2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Click the first text link of the first image
6. Take a screen shot of the product displayed
7. Click 'Add to Cart' button
8. Get the cart subtotal and verify if it is correct.
9.close the browser */

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonAssignment {public static void main(String[] args) throws IOException, InterruptedException {
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	
	ChromeDriver driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
	driver.findElement(By.id("nav-search-submit-button")).click();
	String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	System.out.println(" The price of the first product is :"+price);
	String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
	System.out.println("The number of customer ratings for the first displayed product is :"+rating);
	WebElement productImage = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]"));
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	//taking snapshot
	Thread.sleep(3000);
	File scr = productImage.getScreenshotAs(OutputType.FILE);
	File dse=new File("./screenshot/img2.png");
	FileUtils.copyFile(scr, dse);
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> childWindow=new ArrayList<String>(windowHandles);
	driver.switchTo().window(childWindow.get(1));
	//Click 'Add to Cart' button
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='submit.add-to-cart']//input")).click();
	Thread.sleep(2000);
	//driver.switchTo().frame(0);
	String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
	System.out.println("Actual Price :"+price+"SubTotal : "+subTotal);
	//String subTotal = driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']//span[@class='a-price-whole']")).getText();
	// Step 8 Get the cart subtotal and verify if it is correct.
	if(price.equals(subTotal))
	{
		System.out.println("Price and SubTitle both are same");
	}
	else
		System.out.println("Price and SubTitle both are not same");
	driver.close();
	
}
}

