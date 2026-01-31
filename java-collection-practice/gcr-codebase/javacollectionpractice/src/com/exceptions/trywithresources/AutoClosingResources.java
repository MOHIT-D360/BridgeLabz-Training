package com.exceptions.trywithresources;
import java.io.*;

public class AutoClosingResources {
	public static void main(String[] args) {
		String filePath = "D:\\Saved\\info.txt";
		
		try ( BufferedReader br = new BufferedReader(new FileReader(filePath));
				){
			String line ;
			line = br.readLine();
			System.out.println(line); // first line
		}
		catch(IOException e) {
			System.out.println("Error reading file");
		}
		
	}
}
