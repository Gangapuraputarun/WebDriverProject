package browsermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethod {

	public static void main(String[] args) throws InterruptedException {
		//Create instance Object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://facebook.com");
		//suspend tools from execution for 5seconds
		Thread.sleep(6000);
		driver.quit();
		
	}

}
