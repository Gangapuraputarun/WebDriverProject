package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws Throwable {
		//youtube
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("shiva songs");
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]//yt-icon[@class=\"style-scope ytd-searchbox\"]//div")).click();
		Thread.sleep(5000);
		
		
		

	}

}
