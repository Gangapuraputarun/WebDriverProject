package scrolltoptobottom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltoptobottom {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//create object for interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://www.myntra.com/'");
		Thread.sleep(5000);
		//scroll top to bottom
		js.executeScript("windows.scrollTo(0,document.body.scrollheight)");
		Thread.sleep(5000);
		//scroll bottom to  top 
		js.executeScript("windows.scrollTo(document.body.scrollheight,0)");
		Thread.sleep(5000);
		//scroll certain pixel vertically
		js.executeScript("windows.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.quit();
		
		
		
			

	}

}
