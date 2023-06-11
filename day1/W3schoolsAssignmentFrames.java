package week4.day1;
/*
 * a)Launch the browser
b)Load the url https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
c)Check the frame present if yes Handle the frame
d)Click Try It Button
e)Click OK/Cancel in the alert
f)Confirm the action is performed correctly by verifying the text
Hint!!
Switch to the frame
Then click Try It with xpath
Then perform accept / dismiss
Get the text using id Verify the text based on the action 
*/
 
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolsAssignmentFrames {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//c)Check the frame present if yes Handle the frame
		//d)Click Try It Button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message is :"+text);
		//e)Click OK/Cancel in the alert
		//Thread.sleep(3000);
		alert.accept();
		//Thread.sleep(2000);
		//f)Confirm the action is performed correctly by verifying the text
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text2);
		
		//Hint!!
		//Switch to the frame
		//Then click Try It with xpath
		//Then perform accept / dismiss
		//Get the text using id Verify the text based on the action
		driver.close();
		
	}

}
