package validationmethod02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitlewithActualwithtitle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(6000);
		String Expected="Google";
		String Actual=driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual))
		{
		System.out.println("Title is matching"+Expected+"       "+Actual);	
		} 
		else
		{
			System.out.println("Title is not matching"+Expected+"       "+Actual);	

		}
		driver.quit();
	
	}

}
