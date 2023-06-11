package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		// It's a dynamic table - In a dynamic we need to retrieve the data 
		
		driver.close();
		
	}

}
