package facebookradiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookradiobutton {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		WebElement checkbox = driver.findElement(By.xpath("(//input[@id='u_5_5_pa'])[1]"));
		boolean value = checkbox.isSelected();
		System.out.println(value);
		if (value) {
			checkbox.click();
			
		} else 
		{
			checkbox.click();

		}
		Thread.sleep(5000);
		driver.quit();

	}

}
