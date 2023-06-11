package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		WebElement sd = driver.findElement(By.xpath("//a[text()='Amazon Science']"));
		
		Actions builder= new Actions(driver);
		
		builder.scrollToElement(sd).perform();
		Thread.sleep(2000);
		sd.click();

	}

}
