package html;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		//store table
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement> rows,cols;
		//get row collection from webpage
		rows=webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(5000);
		//get cell collection rows in table
		for (WebElement eachrow : rows)
		{
			////get cell collection each rows
			cols=eachrow.findElements(By.tagName("td"));
			//literate .cell
			for (WebElement eachcell : cols)
			{
				Thread.sleep(5000);
				System.out.println(eachcell.getText());
				}
			System.out.println("#####################################################################");

		}
		Thread.sleep(5000);
		driver.quit();
	

	}

}
