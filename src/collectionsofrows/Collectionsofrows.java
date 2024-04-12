package collectionsofrows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionsofrows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into Webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get collection of rows in web webtales
		List<WebElement>rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println(row);
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			
			System.out.println("row no."+i+"      "+"column size::"+cols.size());
			
			
		}
		driver.quit();

	}

}