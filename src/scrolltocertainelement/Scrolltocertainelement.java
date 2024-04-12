package scrolltocertainelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltocertainelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//create object for interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.location='https://www.myntra.com/'");
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		WebElement element =driver.findElement(By.linkText("Men"));
		//scroll to menlink and click
		js.executeScript("document.scrollinToView", element);
		element.click();
		String pagetitle1 = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		Thread.sleep(5000);
		driver.quit();


	}

}
