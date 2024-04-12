package validationmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class UrlwithLength {

	public static void main(String[] args) throws Throwable {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		//print title of page and length of title
		String pagetitle =driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of url
		String strurl=driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.quit();
		

	}

}
