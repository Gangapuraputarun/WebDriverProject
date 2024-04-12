package collectionofitems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eachiteamprint {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println("no of items are ::"+all_items.size());
		Thread.sleep(5000);
		for (WebElement each : all_items) {
			Thread.sleep(100);
			System.out.println(each.getText());
			
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
