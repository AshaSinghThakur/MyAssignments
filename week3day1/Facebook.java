package week3day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Parent to child - click on create New account
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		//Grand Parent to Grand Child - click on First Name
		driver.findElement(By.xpath("//div[@id='fullname_field']//input")).sendKeys("asha");
		//EC to YC - Click on Last Name
		driver.findElement(By.xpath("//input[@name='firstname']/following::input")).sendKeys("thakur");
		//ES-YS Enter Mobile Number or email 
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("asha@gmail.com");
		//ES - YS - Click on Reenter Email
		driver.findElement(By.xpath("//div[text()='Re-enter email address']/following-sibling::input")).sendKeys("asha@gmail.com");					
		//EC to YC - Enter New Password
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input[@id='password_step_input']")).sendKeys("Asha@123");
		//DOB - DROPDOWN BOX 
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select daydd=new Select(day);
		daydd.selectByIndex(9);
		//Month DD box
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthdd=new Select(month);
		monthdd.selectByValue("10");
		//Year DD
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yeardd=new Select(year);
		yeardd.selectByVisibleText("2000");
		// Gender 
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		driver.close();
		
		/* WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text = leadID.getText();
		leadID.click();
		// No records to display - 
		*/
	}

}
