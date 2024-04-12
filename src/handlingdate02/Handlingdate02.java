package handlingdate02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import webdriverscript.Webdriver;

public class Handlingdate02 {

	public static void main(String[] args) throws Throwable {
		String dob = "1995-Dec-14";
		String temp[]=dob.split("-");
		String year =temp[0];
		String month =temp[1];
		String date =temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//b[normalize-space()=\"Leave\"]")).click();
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		Thread.sleep(5000);
		//select year from claender
		new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"))).selectByVisibleText(year);
		new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"))).selectByVisibleText(month);
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows=webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) 
		{
			cols=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols)
			{
				if(eachcell.getText().equals(date)) {
					Thread.sleep(5000);
					eachcell.click();
					
				}
				
			}
			
		}
		
		
		

	}

}
