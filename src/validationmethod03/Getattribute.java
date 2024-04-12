package validationmethod03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		Thread.sleep(6000);
		String gmailtext=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailtext);
		//print gmail url
		String url=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(url);
		driver.quit();
		

	}

}
