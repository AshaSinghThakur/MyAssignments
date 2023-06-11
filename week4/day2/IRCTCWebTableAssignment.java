package week4.day2;
/* 
 * Home assignment :

(Web table )
Steps:
1. Navigate to https://erail.in/
2. Clear the text in source and enter "ms" and tab or enter(kteys.enter or tab )
3. Clear the text in destination and enter "co" and tab or enter
4. Uncheck sort on date
5. Store all the train names in a list		
6.print train names
*/

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCWebTableAssignment {
	public static void main(String[] args) {
		

	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://erail.in/");
	//Clear the text in source and enter "ms" and tab or enter(kteys.enter or tab )
	WebElement source = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
	source.clear();
	source.sendKeys("MS",Keys.TAB);
	// Clear the text in destination and enter "co" and tab or enter
	WebElement desti = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
	desti.clear();
	desti.sendKeys("CO",Keys.TAB);
	//Uncheck sort on date
	WebElement unCheck = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
	unCheck.click();
	//Store all the train names in a list	
	//div[@id='divTrainsList']/table//tr/td[2] ( shows 38 results )
	List<WebElement> allTrainNames = driver.findElements(By.xpath("//div[@id='divTrainsList']/table//tr/td[2]"));
	
	//no of rows -//div[@id='divTrainsList']/table//tr (39 )
	List<WebElement> rowCountList = driver.findElements(By.xpath("//div[@id='divTrainsList']/table//tr"));
	int rowCount = rowCountList.size();
	System.out.println("Row Count :"+rowCount);
	//no of column - //div[@id='divTrainsList']/table//tr[2]/td ( actually 24 shows 27 results)
	List<WebElement> colCountList = driver.findElements(By.xpath("//div[@id='divTrainsList']/table//tr[2]/td"));
	int colCount = colCountList.size();
	System.out.println("Column Count : "+colCount);
	System.out.println("Train Names are : ");
	System.out.println("========================================");
	/*
	for (int i = 1; i <=rowCount; i++) {
		String trainNames = driver.findElement(By.xpath("//div[@id='divTrainsList']/table//tr["+i+"]/td[2]")).getText();
		System.out.println(trainNames);
		
		
	}
	*/
	List<WebElement> colCountList1 = driver.findElements(By.xpath("//div[@id='divTrainsList']/table//td[2]/a"));
	System.out.println("Second Xpath Column Count"+colCountList1.size());
	for (int i = 0; i < colCountList1.size(); i++) {
		String trainName = colCountList1.get(i).getText();
		System.out.println("Second Xpath Train Names : "+trainName);
		
	}
	
	//print train names
	
	

}
}
