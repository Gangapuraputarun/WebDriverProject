package registertoopencart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registertoopencart {

	public static void main(String[] args) throws Throwable {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//a[@class=\"btn btn-black navbar-btn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("tarunavya");
		driver.findElement(By.name("firstname")).sendKeys("tarun");
		driver.findElement(By.name("lastname")).sendKeys("avya");
		driver.findElement(By.name("email")).sendKeys("tarunavya@gamil.com");
		driver.findElement(By.name("country_id")).sendKeys("navya");
		driver.findElement(By.name("password")).sendKeys("tarunavya@");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-lg hidden-xs\"]")).click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
