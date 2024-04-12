package readloginpage;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readloginpage {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("E:\\TESTING\\Automation\\notepad\\login hrm.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			String login[]= str.split("%");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			Thread.sleep(5000);
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);	
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);	
			driver.findElement(By.name("Submit")).click();
			String experted ="dashboard";
			String Actual = driver.getCurrentUrl();
			if (Actual.contains(experted))
			{
				System.out.println("login sucess");
				
				
			} 
			else
			{
				
				System.out.println("login fail");
			}
			driver.quit();
			}
		

	}


}
