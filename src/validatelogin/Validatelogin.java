package validatelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatelogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement objuser=driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
		objuser.clear();
		objuser.sendKeys("Admin");
		String UsernameText=objuser.getAttribute("value");
		WebElement objpass=driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
		objpass.clear();
		objpass.sendKeys("Qedge123!@#");
		String passwordtext=objpass.getAttribute("value");
		System.out.println(UsernameText+"      "+passwordtext);
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		Thread.sleep(5000);
		String Expected="dashboard";
		String Actual=driver.getCurrentUrl();
		if (Actual.contains(Expected))
		{
			System.out.println("username and Password are valid::"+ Expected +"     "+Actual);
			
		} else 
		{
			String error_message=driver.findElement(By.xpath("//span[@id=\"spanMessage\"]")).getText();
			System.out.println("error_message"+Expected+"     "+Actual);
			

		}
		Thread.sleep(5000);
		driver.quit();

	}

}
