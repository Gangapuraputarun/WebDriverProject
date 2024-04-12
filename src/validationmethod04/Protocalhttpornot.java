package validationmethod04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Protocalhttpornot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(6000);
		String Expected="https://";
		String Actual=driver.getCurrentUrl();
		if (Actual.startsWith(Expected))
		{
			System.out.println("url is secured::"+Expected+"        "+Actual);
			
		} 
		else 
		{
			System.out.println("url is Local::"+Expected+"        "+Actual);
 
		}
		driver.quit();
	}

}
