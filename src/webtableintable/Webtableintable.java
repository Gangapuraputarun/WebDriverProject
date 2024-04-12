package webtableintable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableintable {

	public static void main(String[] args) throws Throwable {
		String dob = "December/14/1995";
		String temp[]=dob.split("/");
		String date = temp[1];
		String month = temp[0];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calyear.equals(year))
		{
			//click prvious button
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			}
		//month
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month))
		{
			//click prvious button
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			WebElement webtable = driver.findElement(By.className("hasDatepicker"));
			List<WebElement> rows,cols;
			rows = webtable.findElements(By.tagName("tr"));
			for (WebElement eachrow : rows)
			{
				cols =eachrow.findElements(By.tagName("td"));
				for (WebElement eachcell : cols)
				{
					if(eachcell.getText().equals(date));
					Thread.sleep(5000);
					eachcell.click();
					}
				}
				
			}
			
		
		
	
		
		
	}

}
