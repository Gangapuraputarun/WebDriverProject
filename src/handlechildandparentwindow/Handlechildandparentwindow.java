package handlechildandparentwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlechildandparentwindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//parent id 
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Create new account")).click();
		//click three links
		driver.findElement(By.xpath("(//a[@id='terms-link'])[1]")).click();
		driver.findElement(By.xpath("(//a[@id='privacy-link'])[1]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		//get collection of all windows
		Set<String> allwins =driver.getWindowHandles();
		System.out.println(allwins);
		for (String each: allwins) {
			//if parent id not equals toeach
			if(!parent.equals(each)) {
				//switch toeach child window and get title and close
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
