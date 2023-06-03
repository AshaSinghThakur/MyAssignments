package week3day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJIO {
	public static void main(String[] args) throws InterruptedException {


		//1. Launch the URL https://www.ajio.com/
		//2. In the search box, type as "bags" and press enter
		//3. To the left  of the screen under " Gender" click the "Men"
		//4. Under "Category" click "Fashion Bags"
		//5. Print the count of the items Found. 
		//6. Get the list of brand of the products displayed in the page and print the list.
		//7. Get the list of names of the bags and print it

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'genderfilter facet-linkname-Men')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,' facet-linkname-Men - Fashion Bags')]")).click();
		Thread.sleep(2000);
		String result = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The count of the items Found are : "+result);

		List<WebElement> brandlist = driver.findElements(By.xpath("//div[@class='brand']"));
		int size1 = brandlist.size();
		System.out.println("The list of brand of the products displayed in the page are "+size1+" as listed below");	
		for (int i = 0; i < size1; i++) {
			String text1 = brandlist.get(i).getText();
			System.out.println(text1);

		}
		List<WebElement> nameslist = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int size2 = nameslist.size();
		System.out.println("The list of names of the bags "+size2+" as listed below");	
		for (int i = 0; i < size2; i++) {
			String text2 = nameslist.get(i).getText();
			System.out.println(text2);
	}
	
	}
}


