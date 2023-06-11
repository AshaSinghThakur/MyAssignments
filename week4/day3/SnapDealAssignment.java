package week4.day3;

//verify the all applied filters ( product above it shows Price and color verify that with <a tags has values inside Div
//Check if the items displayed are sorted correctly - Thinking of compare first two results price comparision 

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/*1. Launch https://www.snapdeal.com/
2. Go to Mens Fashion
3. Go to Sports Shoes
4. Get the count of the sports shoes
5. Click Training shoes
6. Sort by Low to High
7. Check if the items displayed are sorted correctly
8.Select the price range (500-1200) a
9.Filter with color yellow 
10 verify the all applied filters 
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
s of the bags and print it

*/
public class SnapDealAssignment {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		//Go to Mens Fashion
		WebElement mensFashion = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']//span[2]"));
		Actions builder=new Actions(driver);
		builder.clickAndHold(mensFashion).pause(1000).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		//Go to Sports Shoes
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		//Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		// Sort by Low to High
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		//Check if the items displayed are sorted correctly
		String lowPrice1 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
		String lowPrice2 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
		System.out.println(lowPrice1+ " "+lowPrice2);
		//Select the price range (500-1200)
		WebElement minPriceRange = driver.findElement(By.xpath("//input[@name='fromVal']"));
		Thread.sleep(3000);
		minPriceRange.clear();
		minPriceRange.sendKeys("500");
		WebElement maxPriceRange = driver.findElement(By.xpath("//input[@name='toVal']"));
		maxPriceRange.clear();
		maxPriceRange.sendKeys("1200");
		//Filter with color multicolor
		driver.findElement(By.xpath("//a[contains(text(),'Multi Color')]/parent::label")).click();
		//verify the all applied filters ( Do i need to try all available sizes and brands ?
		
		//11. Mouse Hover on first resulting Training shoes
		WebElement firstResult = driver.findElement(By.xpath("//p[@class='product-title']"));
		builder.clickAndHold(firstResult).pause(2000).perform();
		
		//12. click QuickView button
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		//13. Print the cost and the discount percentage
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String disPercentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Cost :"+cost+"\n"+"Discount Percentage :"+disPercentage);
		//14. Take the snapshot of the shoes.
		WebElement prodDetail = driver.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		Thread.sleep(3000);
		File scr = prodDetail.getScreenshotAs(OutputType.FILE);
		File dse=new File("./screenshot/img1.png");
		FileUtils.copyFile(scr, dse);
		System.out.println("Closing the browser");
	
		driver.close();
	}
}
