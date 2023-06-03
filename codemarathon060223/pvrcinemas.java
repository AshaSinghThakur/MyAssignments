package codemarathon060223;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pvrcinemas {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.pvrcinemas.com/");
		//02) Click  on Movie Library
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		//03) Select the City -->chennai
		WebElement d1= driver.findElement(By.xpath("//select[@name='city']"));
		Select dd1=new Select(d1);
		dd1.selectByValue("Chennai");
		//Thread.sleep(3000);
		//04) Select the Genre-->Animation
		WebElement d2=driver.findElement(By.xpath("//select[@name='genre']"));
		Select dd2=new Select(d2);
		dd2.selectByVisibleText("ANIMATION");
		//Thread.sleep(3000);
		//05) Select the Language-->english
		WebElement d3=driver.findElement(By.xpath("//select[@name='lang']"));
		Select dd3=new Select(d3);
		dd3.selectByVisibleText("ENGLISH");
		//06) Click on Apply
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		//07) Click on first resulting animation movie
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		//08) Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		//09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		//Cinema
		WebElement Cinema=driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select Cinemadd=new Select(Cinema);
		Cinemadd.selectByValue("PVR Velachery Chennai");
		Thread.sleep(3000);
		//Calender
		WebElement date = driver.findElement(By.xpath("(//input[contains(@class,'ng-pristine ng-valid')])[3]")); 
		date.click();
		//driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']")).click();
		//choose date 
		//driver.findElement(By.xpath("//span[contains(@class,'day-unit is-today is-selected ')]")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		//preffered show Time
		WebElement timings=driver.findElement(By.xpath("//select[@name='timings']"));
		Select timingsdd=new Select(timings);
		timingsdd.selectByVisibleText("03:00 PM - 06:00 PM");
		//no of tickets
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Asha");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asha@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543213");
		WebElement food=driver.findElement(By.xpath("//select[@name='food']"));
		Select fooddd=new Select(food);
		fooddd.selectByValue("No");
		//other Req
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("nill");
		//10) Click on copy to self 
		WebElement selfCopy = driver.findElement(By.xpath("//span[@class='custom-control-indicator']"));
		driver.executeScript("arguments[0].click()", selfCopy);
		//11) Click on  Send Request
		driver.findElement(By.xpath("//button[@class='btn btn-primary rightFloat']")).click();
		//12) Click cancel 
		Thread.sleep(2000);
		WebElement cancelButton = driver.findElement(By.xpath("//button[text()='CANCEL']"));
		//cancelButton.click();
		driver.executeScript("arguments[0].click()", cancelButton);
		//13) Close the OTP dialog
		WebElement otpPopUp = driver.findElement(By.xpath("//button[@class='swal2-close']"));
		driver.executeScript("arguments[0].click()", otpPopUp);
		//14) Verify the ttile of the page
		System.out.println("Title of the page :"+driver.getTitle());
		//driver.close();
		
	}

}

//Sometimes paw movie does not click and calender does not click 
