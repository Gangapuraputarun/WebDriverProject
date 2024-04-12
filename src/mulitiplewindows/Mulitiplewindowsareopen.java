package mulitiplewindows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mulitiplewindowsareopen {

	public static void main(String[] args) throws Throwable   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@id='terms-link'])[1]")).click();
		driver.findElement(By.xpath("(//a[@id='privacy-link'])[1]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		//store all windows into array list
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(brw.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("gangapuraputarun");
		driver.findElement(By.name("pass")).sendKeys("645445tsdtyfydf");
		driver.findElement(By.xpath("(//input[@id='u_0_0_eQ'])[1]"));
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
