package codemarathon060223;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		//04) Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//span[contains(text(),'for mens')]")).click();
		
		//05) Print the total number of results (like 50000)
		String no=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		  
		System.out.println("The total number of results : "+no);
				//1-48 of over 50,000 results for "bags for boys"
		String result=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println(no+" "+result);
		//06) Select the first 2 brands in the left menu
		Thread.sleep(3000);
		WebElement brand1 = driver.findElement(By.xpath("(//div[contains(@class,'checkbox-fancy s-navigation-checkbox')])[3]//input"));
		driver.executeScript("arguments[0].click()", brand1);
		Thread.sleep(3000);
		WebElement brand2 = driver.findElement(By.xpath("(//div[contains(@class,'checkbox-fancy s-navigation-checkbox')])[4]//input"));
		driver.executeScript("arguments[0].click()", brand2);
		WebElement cd = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select dd=new Select(cd);
		dd.selectByVisibleText("Newest Arrivals");
		////div[contains(text(),'checkbox-fancy s-navigation-checkbox')]
		//(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[4]
		////div[contains(@class,'checkbox-fancy s-navigation-checkbox')]
		//(like American Tourister, Generic)
		//07) Choose New Arrivals (Sort)
		/*WebElement ele=driver.findElement(By.xpath("a-button-text a-declarative"));
		Select dd=new Select(ele);
		List<WebElement> options=dd.getOptions();
		int size=options.size();
		for (int i = 0; i < size; i++) {
			if(i==3)
			{
				options.get(i).click();
			}
			
		}*/
		//08) Print the first resulting bag info (name, discounted price)
		String baginfoname=driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-base a')]")).getText();
		System.out.println("Bag Info Name  :"+baginfoname);
		String baginfoprice=driver.findElement(By.xpath("//a[contains(@class,'s-no-hover s-underline-text s-underline-link-text')]")).getText();
		System.out.println("Bag Info Price : "+baginfoprice);
		//09) Get the page title and close the browser(driver.close())
		driver.getTitle();
		//driver.close();
		driver.close();
	}

}
