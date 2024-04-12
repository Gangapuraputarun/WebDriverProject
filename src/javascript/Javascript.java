package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("Window.location = 'http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.queryselector('#txtUsername')).value='Admin'");
		Thread.sleep(5000);
		js.executeScript("document.queryselector('#txtPassword')).value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.queryselector('#btnLogin').click()");
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
