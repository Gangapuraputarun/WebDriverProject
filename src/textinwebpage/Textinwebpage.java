package textinwebpage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textinwebpage {

	public static void main(String[] args)throws Throwable {
		File f = new File("E:\\TESTING\\Automation");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw =  new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		String para1 = driver.findElement(By.xpath("")).getText();
		String para2 = driver.findElement(By.xpath("")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.quit();

	}

}
