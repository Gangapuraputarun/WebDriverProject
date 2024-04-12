package selectitems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectitemsinlistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		Select daylistbox = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		Boolean value = daylistbox.isMultiple();
		System.out.println(value);
		daylistbox.selectByIndex(30);
		Thread.sleep(5000);
		monthlistbox.selectByVisibleText("Dec");
		Thread.sleep(5000);
		yearlistbox.selectByVisibleText("1995");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
