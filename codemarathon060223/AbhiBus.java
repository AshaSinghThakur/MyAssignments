package codemarathon060223;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {
	public static void main(String[] args) throws InterruptedException {
		

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// click on Bus 
	driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
	
	//Type "Chennai" in the FROM text box
	driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	driver.findElement(By.xpath("//input[@id='destination_id']/following-sibling::input")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	//click calender 
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	// choose date as 3
	driver.findElement(By.xpath("//a[text()='3']")).click();
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	Thread.sleep(5000);
	String BusName=driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding'][1]")).getText();
	System.out.println("the name of the first resulting bus ("+BusName);
	//Choose SLEEPER in the left menu from Bus Type
	driver.findElement(By.xpath("//li[@id='bustypeSLEEPER']/input")).click();
	String seatcount=driver.findElement(By.xpath("//p[@class='noseats AvailSts ng-binding']")).getText();
	System.out.println("the first resulting bus seat count : "+seatcount);
	driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
	// Choose any one Available seat
	driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
	System.out.println("Seats Selected details : "+driver.findElement(By.xpath("//span[@id='seatnos']")).getText());
	System.out.println("Total fare :" +driver.findElement(By.xpath("//span[@id='ticketfare']")).getText());
	//Select Boarding Point
	WebElement cd=driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
	Select dd=new Select(cd);
	dd.selectByIndex(2);
	//Select Dropping Point
	WebElement cd1=driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
	Select dd1=new Select(cd1);
	dd1.selectByIndex(1);
	String title=driver.getTitle();
	System.out.println("Title of the page : "+title);
	driver.close();
	

}
}

