package launchurl_url_title_url_domain;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchurl_url_title_url_domain {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//create object for interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://www.tatacliq.com/'");
		Thread.sleep(5000);
		String pagetitle= js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String url2 =js.executeScript("return document.URL").toString();
		System.out.println(url2);
		System.out.println(url2.length());
		//print domain name and length of domain
		String domain= js.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		driver.quit();
		

	}

}
