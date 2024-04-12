package facebookpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebookpractice {

	public static void main(String[] args) throws Throwable {
		//script to login to primus bank
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.facebook.com/");
				//suspend tool for 5 seconds
				Thread.sleep(5000);
				driver.findElement(By.name("email")).sendKeys("7989972196");
				driver.findElement(By.id("passContainer")).sendKeys("Tharun");
				driver.findElement(By.name("login")).click();
				//suspend tool for 5 seconds
				Thread.sleep(5000);
				driver.quit();

	}

}
