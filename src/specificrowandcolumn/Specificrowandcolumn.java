package specificrowandcolumn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificrowandcolumn {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//print specfic row cell data
		String tabletext1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[21]/td[1]")).getText();
		String tabletext2 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[21]/td[2]")).getText();

		System.out.println(tabletext1+"============="+tabletext2);
		driver.quit();
	}

}
