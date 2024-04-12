package readlinebyline;

import java.io.BufferedReader;
import java.io.FileReader;

public class Readlinebyline {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("E:\\\\TESTING\\\\Automation\\\\notepad.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
		
		

	}

}
