package testinfile;

import java.io.*;

public class Testinfile {

	public static void main(String[] args)throws Throwable {
		File f = new File("E:\\TESTING\\Automation\\notepad");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i love navya");
		bw.newLine();
		bw.write("i love too tarun");
		bw.newLine();
		bw.flush();
		bw.close();
		

	}

}
