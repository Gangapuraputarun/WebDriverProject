package practiseorangahrmcalennder;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiseorangahrmcalennder {

	public static void main(String[] args) {
		try {
			
		
		String dob ="1998-Oct-10";
		String temp[]=dob.split("-");
		String year = temp[0];
		String month= temp[1];
		String date = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//b[normalize-space()=\"Leave\"]")).click();
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		//slectyear
		new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"))).selectByVisibleText(year);
		new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"))).selectByVisibleText(month);
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) 
		{
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols)
			{
				if(eachcell.getText().equals(date));
				{
					eachcell.click();
				}
				
			}
			
		}
		driver.quit();
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		
		

	}

}
