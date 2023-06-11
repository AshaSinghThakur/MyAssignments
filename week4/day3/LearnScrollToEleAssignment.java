package week4.day3;
/*LearnScrollToElement
https://www.ajio.com/
Ajio-
track your order
*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollToEleAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		WebElement scrollDown = driver.findElement(By.linkText("Track Your Order"));
		Actions builder=new Actions(driver);
		Thread.sleep(3000);
		builder.scrollToElement(scrollDown).perform();
		scrollDown.click();
		System.out.println("Track Your Order is clicked");
		//driver.close();
		
	

}
}

