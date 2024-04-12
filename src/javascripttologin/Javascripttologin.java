package javascripttologin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import webdriverscript.Webdriver;

public class Javascripttologin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
		Thread.sleep(5000);
		js.executeScript("document.query Selector('#txtUsername')).value='Admin'");
		Thread.sleep(5000);
		js.executeScript("document.query Selector('#txtPassword')).value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.query Selector('#btnLogin').click()");
		Thread.sleep(5000);
		String Expercted = "dashboard";
		String Actual = js.executeScript("return document.url").toString();
		if (Actual.contains(Expercted)) {
			System.out.println("login sucess::"+Expercted+"======="+Actual);
			
		} 
		else
		{
			String error = js.executeScript("return document.querryselector('#spanMessage').innerHTML").toString();
			System.out.println(error+"      "+Expercted+"========="+Actual);
			

		}
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
