package eachrowcelldata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eachrowcelldata {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//getrows collection from web table
		rows =webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(5000);
		//literate all rows
		for (WebElement eachrow : rows)
		{
			//get each row cell collection
			cols = eachrow.findElements(By.tagName("td"));
			//literate .cell
			for (WebElement eachcell : cols)
			{
				Thread.sleep(1000);
				//print each cell data
				System.out.println(eachcell.getText());
				
				
				
			}
			System.out.println("=====================");
			
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
