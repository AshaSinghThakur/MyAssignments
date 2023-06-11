package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWebTableTeafGround {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		//ctrl+2-l
		String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody//td")).getText();
		
		System.out.println(data);
		
		//fetch data from 1st row 
		
		String rowdata= driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).getText();
		
		System.out.println(rowdata);
		
		//count size table as rows
		
		List<WebElement> rownum = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
		
		int rowsize = rownum.size();
		System.out.println("numbers of rows :"+rowsize);
		
		//store columns count
		
		List<WebElement> colnum= driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		
		int colsize = colnum.size();
		System.out.println("columns :"+colsize);
		//10*6=60
		//need print all datas inside table
		
		for (int i = 1; i <=rowsize; i++) {
			
			for (int j = 1; j <=colsize; j++) {
				
				String alldata = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				System.out.println(alldata);
				
				
			}
			
		}
		driver.close();
	}
}
