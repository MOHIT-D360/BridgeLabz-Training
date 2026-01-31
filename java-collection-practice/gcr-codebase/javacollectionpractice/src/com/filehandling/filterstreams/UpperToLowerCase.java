package com.filehandling.filterstreams;
import java.io.*;
public class UpperToLowerCase {
	public static void main(String[] args) {
		String sourceFile = "D:\\Saved\\uppercase.txt";
		String desFile = "D:\\Saved\\lowercase.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(desFile));	
				){
			int ch;
			while((ch = br.read())!= -1) {
				bw.write(Character.toLowerCase((char) ch));
			}
			
			System.out.println("File converted successfully");
		}
		catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
}
