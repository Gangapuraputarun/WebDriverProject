package llistcollection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listintegercollection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://rediff.com/");
		Thread.sleep(5000);
		List<WebElement> all_Links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+all_Links.size());
		Thread.sleep(5000);
		for (WebElement each : all_Links)
		{
			Thread.sleep(100);
			System.out.println(each.getText());
		
		}
		driver.quit();
		
		

	}

}
