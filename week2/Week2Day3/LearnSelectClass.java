package Week2Day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				//step-1 how to launch the browser
						ChromeDriver driver= new ChromeDriver();
						
						//to max screen
						
						driver.manage().window().maximize();
						
						//need add wait
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

						//step-2 load the url
						driver.get("http://leaftaps.com/opentaps/control/main");
						
						driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
						
						driver.findElement(By.id("password")).sendKeys("crmsfa");
						
						driver.findElement(By.className("decorativeSubmit")).click();
						
						driver.findElement(By.linkText("CRM/SFA")).click();
						
						driver.findElement(By.linkText("Leads")).click();
						
						driver.findElement(By.linkText("Create Lead")).click();
						
						
						WebElement ed = driver.findElement(By.id("createLeadForm_companyName"));
						
						ed.sendKeys("TestLeaf");
						Thread.sleep(2000);
						ed.clear();
						ed.sendKeys("TL");
						//select class
						
						WebElement cd = driver.findElement(By.id("createLeadForm_dataSourceId"));
						
						//syntax
						Select op= new Select(cd);
						
						op.selectByIndex(4);
						
						
						
						WebElement cd1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
						
						Select op1= new Select(cd1);
						op1.selectByVisibleText("Car and Driver");
						
						
						Select op2=new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
						op2.selectByIndex(5);
						driver.close();
						
						
		
	}

}
