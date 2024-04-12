package itempresentinlistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Itempresentinlistbox {

	public static void main(String[] args) throws Throwable {
		String items_present="baby";
		boolean items_Exist=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each : all_items) {
			String Actual_items= each.getText();
			Thread.sleep(1000);
			System.out.println(Actual_items);
		if(Actual_items.equalsIgnoreCase(items_present))
		{
			items_Exist=true;
			break;
		}
			
		}
		if (items_Exist) {
		System.out.println(items_present+"     "+"items Exist in list box");
		
		} 
		else
		{
			System.out.println(items_present+"     "+"items does not Exist in list box");

		}
		Thread.sleep(5000);
		driver.quit();
			
		
	}

}
