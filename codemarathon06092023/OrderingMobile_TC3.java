// 60 - get more heads up on 61,62 line
//65 - using shadow obj to find an element when it is nt present showdow , still it does not throw an error
package codemarathon06092023;
/*
 * Instance URL:https://dev70206.service-now.com
Username: admin
Password: g=Sl+bJvA99D

1. Launch ServiceNow application
2. Login with valid credentials username as admin and password 
3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
4. Click on  mobiles
5. Select Apple iphone6s
6. Update color field to gold and storage field to 128GB
7. Select  Order now option
8. Verify order is placed and copy the request number"
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile_TC3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//1. Launch ServiceNow application
		driver.get("https://dev70206.service-now.com");
		//2. Login with valid credentials username as admin and password
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("g=Sl+bJvA99D");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		//3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		
		//div[@class='sn-polaris-tab can-animate polaris-enabled']
		Shadow s1=new Shadow(driver);
		s1.setImplicitWait(30);
		WebElement f1 = s1.findElementByXPath("//div[@id='all']");
		f1.click();
		//s1.findElement(By.xpath("//div[text()='All']")).click();
		s1.setImplicitWait(10);
	//	WebElement f2 = s1.findElementByXPath("//div[@id='filter']");
		//f2.sendKeys("Service catalog",Keys.ENTER);
		//f2.sendKeys("Service");
		WebElement f2 = s1.findElementByXPath("//span[text()='Service Catalog']");
		f2.click();	
		//js-syntax - Here ElementNotInteractableException came so using JavaScript code
		driver.executeScript("arguments[0].click();", f2);
		//Need to explore this statement to get more clarity
		WebElement f3 = s1.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(f3);
		//----Interesting line of code ---
		//using shadow obj to find an element when it is nt present showdow , still it does not throw an error
		s1.findElementByXPath("//h2[contains(text(),'Mobiles')]").click();
		driver.findElement(By.xpath("//a[@class='service_catalog']")).click();
		WebElement color = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select colordd=new Select(color);
		colordd.selectByVisibleText("Gold");
		Thread.sleep(2000);
		WebElement storage = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		Select storagedd=new Select(storage);
		storagedd.selectByVisibleText("128");
		//Select  Order now option
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		// I see a frame here - Thank you, your request has been submitted
		String text = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println("Message after clicking on Order Now is : "+text);
		//8. Verify order is placed and copy the request number"
		String text2 = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']")).getText();
		System.out.println("Request Number :"+text2);
	

	}

}
