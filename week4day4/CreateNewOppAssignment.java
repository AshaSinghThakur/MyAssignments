package week4day4;
//7 make sure wrote code for calender 
//9)Need to write code for how to get text wat it means 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/*
 * Asssignment1:Create New Opportunity
"Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Opportunity tab ( Used Java Script code as element not identified as written in Java script , so used converted Java code )
5. Click on New button
6. Enter Opportunity name as 'Salesforce Automation by Your Name,Get the text and Store it 
7. Choose close date as Today ( In DOM see today's date or tommorow date have unique attribute values to refer to identify future date by using following siblings)
after clicking on the calender ,dates window goes off bcz of mouse movement for that use freeze code in console and click enter then try to identify then may be hidden 
code of tagnames with dates search them to locate and write xpath
8. Select 'Stage' as Need Analysis
9. click Save and VerifyOppurtunity Name"
 */
public class CreateNewOppAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//2. Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//3. Click view All and click Sales from App Launcher
		//view all
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		//click sales
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		//4. Click on Opportunity tab 
		WebElement js = driver.findElement(By.xpath("//span[text()='Opportunities']"));		
		//js-syntax
		driver.executeScript("arguments[0].click();", js);
		//driver.findElement(By.xpath("//span[text()='Opportunities']")).click();
		//driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]")).click();
		//5. Click on New button
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		//6. Enter Opportunity name as 'Salesforce Automation by Your Name,Get the text and Store it
		WebElement scrolDownOpp = driver.findElement(By.xpath("//input[@name='Name']"));
		Actions builder=new Actions(driver);
		builder.scrollToElement(scrolDownOpp).perform();
		scrolDownOpp.sendKeys("Salesforce Automation by your Name");
		//7. Choose close date as Today
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		//need to select date related xpath
		driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
		
		
		//8. Select 'Stage' as Need Analysis
		WebElement clickStage = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]"));
		//builder.scrollToElement(clickStage).perform();
		clickStage.click();
		Thread.sleep(5000);
		WebElement selectStage = driver.findElement(By.xpath("//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left']/lightning-base-combobox-item[4]"));
		//builder.moveToElement(selectStage).perform();
		//builder.scrollToElement(selectStage).perform();
		selectStage.click();
		//9. click Save and VerifyOppurtunity Name"
		//save
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		//verify
		String verifyOppName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("Verified Opp Name is : "+verifyOppName);
		
	}

}
