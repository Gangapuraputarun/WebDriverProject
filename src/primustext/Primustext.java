package primustext;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primustext {

	public static void main(String[] args) throws Throwable{
		File f = new File("E:\\TESTING\\Automation\\notepad\\primusbank.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw =  new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		String para1 = driver.findElement(By.xpath("//p[contains(text(),\"Primus Bank dates back to 1955 when Primus North C\")]")).getText();
		String para2 = driver.findElement(By.xpath("//p[contains(text(),\"In 1975, the Malta Government purchased 25% of\")]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.quit();

	}

}
