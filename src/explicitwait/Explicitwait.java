package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriverscript.Webdriver;

public class Explicitwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//create object wait class
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait untilelementis calcate
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		driver.findElement(By.linkText("Create new account")).click();
		//wait until element in table
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("tarun");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("avya");
		

	}

}
