package handleframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handleframes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//get collection of frames in webpages
		List<WebElement> frames = driver.findElements(By.tagName("iframes"));
		System.out.println(frames.size());
		//switch to frames
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		driver.switchTo().defaultContent();
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
