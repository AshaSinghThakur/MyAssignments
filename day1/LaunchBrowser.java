package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	//how to launch the browser
	//SafariDriver driver=new SafariDriver();
	//System.setProperty("webdriver.chrome.driver","")
	//WebDriver driver1=new ChromeDriver();
	ChromeDriver driver=new ChromeDriver();
	//ChromeOptions option=new ChromeOptions();
    //option.addArguments("--remote-allow-origins=*");
	//ChromeDriver driver1=new ChromeDriver(option);
	//ChromeDriver driver = new ChromeDriver();
	//to max Screen
	driver.manage().window().maximize();
	//load the URL 
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//driver.findElement(By.linkText(null))
	//need and wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//close the browser
	driver.close();
	
	
}
}
