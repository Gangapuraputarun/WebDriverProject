package opencartjavascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opencartjavascript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("(//span[normalize-space()='My Account'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#input-firstname')).value=tfdftfe");
		js.executeScript("document.getelementById(input-lastname).value = 'avyjewgvt'");
		js.executeScript("document.queryselector(#input-email).value = 'taru@gmail.com'");
		js.executeScript("document.queryselector(#input-password).value = 'tar3030'");
		js.executeScript("window.ScrollToBy(0,400)");
		Thread.sleep(5000);
		js.executeScript("document.queryselector(#input-newsletter-yes).click()");
		Thread.sleep(5000);
		js.executeScript("document.queryselector(input[value=\"1\"][name=\"agree\"]).click()");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
