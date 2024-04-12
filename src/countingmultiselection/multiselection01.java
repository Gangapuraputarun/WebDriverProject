package countingmultiselection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselection01 {

	public static void main(String[] args) throws Throwable {
		//get collection of items which are selected
		//print each item name whih are selected
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/TESTING/Automation/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		for (int i = 0; i <= 9; i++)
		{
			Thread.sleep(1000);
			dropdown.selectByIndex(i);
		}
		List<WebElement> all_selected = dropdown.getAllSelectedOptions();
		System.out.println("no of selected::"+all_selected.size());
		for (WebElement each : all_selected)
		{
			System.out.println(each.getText());
			
			
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
