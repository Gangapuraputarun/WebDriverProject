package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P01 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		Select element = new Select(driver.findElement(By.id("year")));
		List<WebElement> allitems = element.getOptions();
		System.out.println("no of items are::"+allitems.size());
		for (WebElement each : allitems) {
			System.out.println(each.getText());
			
		}
		Select element01 = new Select(driver.findElement(By.id("day")));
		List<WebElement> allitems01 = element01.getOptions();
		System.out.println("no of items are::"+allitems01.size());
		for (WebElement each : allitems01) {
			System.out.println(each.getText());
			
		}
		Select element02 = new Select(driver.findElement(By.id("month")));
		List<WebElement> allitems02 = element02.getOptions();
		System.out.println("no of items are::"+allitems02.size());
		for (WebElement each : allitems02) {
			System.out.println(each.getText());
		}
		driver.quit();
	}
	}




