package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeSnapshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com/");
	WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
	Thread.sleep(3000);
	File scr = login.getScreenshotAs(OutputType.FILE);
	File dse=new File("./snaps/img2.png");
	FileUtils.copyFile(scr, dse);


}
}

