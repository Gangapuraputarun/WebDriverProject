package handlealertinprimusbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handlealertinprimusbank {
	WebDriver driver;

	//public static void main(String[] args) throws Throwable {
	BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//img)[5]")).click();
		driver.findElement(By.xpath("(//img)[11]]")).click();
		Thread.sleep(5000);
	}
	@Test
	public void switchtoo() {
		String alerttext1 = driver.switchTo().alert().getText();
		System.out.println(alerttext1);
		Thread.sleep(5000);
		//clicl cancel
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img)[11]]")).click();
		Thread.sleep(5000);
		//click ok
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String alerttext2 = driver.switchTo().alert().getText();
		System.out.println(alerttext2);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	}

}
