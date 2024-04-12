package collectionmultiselection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionmultiselection {

	public static void main(String[] args) throws Throwable {
		// get collection of check boxes
		//verify which check box is true and false
		//get each chechbox name stored into value property
		//unchecked checkbox if already checked and checkbox is not checked
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/TESTING/checkbox_1_lyst2257.html");
		Thread.sleep(5000);
		List<WebElement> all_checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("no of checkboxes::"+all_checkboxes.size());
		for (WebElement each : all_checkboxes)
		{
			boolean value = each.isSelected();
			String checkboxname = each.getAttribute("value");
			System.out.println(checkboxname+"==============="+value);
			Thread.sleep(5000);
			each.click();
			
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
