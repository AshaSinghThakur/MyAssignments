package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://login.salesforce.com/");
	WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
	Thread.sleep(3000);
	File scr = login.getScreenshotAs(OutputType.FILE);
	File dse=new File("./screenshot/img2.png");
	FileUtils.copyFile(scr, dse);


}
}

