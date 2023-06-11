package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable_MyPractice {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		//getting first column value in dynamic table
		String text = driver.findElement(By.xpath("//tr[@class='ui-widget-content ui-datatable-even ui-datatable-selectable']/td")).getText();
		System.out.println("Frist Column Value : "+text);
		//Trying to access first column using parent to child relationship in the table 
		String r1c1 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//td")).getText();
		System.out.println("R1 , C1 data :"+r1c1);
		//getting first row values in dynamic table tr returns 10 rows . by dafault it takes 1 row if did not mention
		String r1 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//tr")).getText();
		System.out.println("First Row Data : "+r1);
		// To get values from 10 R , 1 C  - tr returns 10 rows if we did not mention row index 
		// to get first col td[1]
		// To print 10 R , 1 C - use list to hold as its 10 webelements data .
		//below statement holds only 1 row as we mentioned as findelement
		String r1to10C1findelement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//tr/td[1]")).getText();
		System.out.println(r1to10C1findelement);
		//lets try to print with findelements above req 
		//Row Count
		List<WebElement> r1to10C1 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//tr/td[1]"));
		int rowNum=r1to10C1.size();
		System.out.println("Row Count: "+rowNum);
		// Col Count
		List<WebElement> r1C1to6 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//tr[1]/td"));
		int colNum = r1C1to6.size();
		System.out.println("Column Count:"+colNum);
		System.out.println("10 R , 1 C values are : ");
		System.out.println("-------------------------------------");
		// R1to10, C1
				for (int i = 1; i <=rowNum; i++) {
					int j=1;
			String r1to10C1Data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//tr["+i+"]/td[1]")).getText();
			System.out.println(r1to10C1Data);
			
		}
		//10 R , 6 C - 10 * 6 =60
				System.out.println("/n10 R , 6 C values are : ");
				System.out.println("-------------------------------------");
		List<WebElement> r1to10C1to6 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//tr/td"));
		for (int i = 1; i <=rowNum ; i++) {
			for (int j = 1; j <=colNum ; j++) {
				String r1to10C1to6Data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//tr["+i+"]/td["+j+"]")).getText();	
				System.out.println(r1to10C1to6Data);
				
			}
			
		}
		driver.close();
}
}
