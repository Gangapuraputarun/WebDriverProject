package conditionalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethodsfacebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		boolean is_enable = firstname.isEnabled();
		System.out.println(is_enable);
		WebElement email_address = driver.findElement(By.name("reg_email_confirmation__"));
		boolean is_diplayed = email_address.isDisplayed();
		System.out.println(is_diplayed);
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@id='u_7_4_Jf'])[1]"));
		boolean is_select = radiobutton.isSelected();
		System.out.println(is_select);
		driver.quit();

	}

}
