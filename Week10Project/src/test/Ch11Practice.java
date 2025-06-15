package test;

import java.io.*;
import java.util.Scanner;

public class Ch11Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writetoAFile();
		readFromFile();
	}
	
	public static void readFromFile() throws IOException {
		File file = new File("StudentInfo.txt");
		Scanner readFile = new Scanner(file);
		String str;
		String[] strArr;
		while(readFile.hasNext()) {
			str = readFile.nextLine();
			strArr = str.split(" ");
			System.out.println(strArr[1]);
		}
		readFile.close();
		
	}
	
	public static void writetoAFile() throws IOException {
		FileWriter fw = new FileWriter("StudentInfo.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		Student stud1 = new Student("Emily",45111);
		pw.println(stud1.toString());
		Student stud2 = new Student("Sarah",11111);
		pw.println(stud2.toString());
//		pw.print("SamAA");
//		pw.print(" 343434");
//		pw.println();
//		pw.println("DavidAA 4545");
//		pw.println("TimAA 7878");
		System.out.println("writing is done");
		pw.close();
	}

}






