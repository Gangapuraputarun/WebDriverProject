package deselectfromselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselection01 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///E:/TESTING/Automation/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		//select 0 t0 8items
		for (int i = 0; i <=8; i++) {
			Thread.sleep(3000);
			//select one by one
		dropdown.selectByIndex(i);
			
		}
		//deselect from selection
		dropdown.deselectByVisibleText("Yellow");
		Thread.sleep(3000);
		dropdown.deselectByIndex(0);
		Thread.sleep(3000);
		dropdown.deselectAll();
		driver.quit();


	}

}
