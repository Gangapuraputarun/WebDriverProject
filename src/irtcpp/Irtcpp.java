package irtcpp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irtcpp {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//span[@class=\"allcircle circleone\"]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='E-CATERING'])[1]")).click();
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		for (String each : allwins) {
			if(!parent.equals(each));
			{
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
			}
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
