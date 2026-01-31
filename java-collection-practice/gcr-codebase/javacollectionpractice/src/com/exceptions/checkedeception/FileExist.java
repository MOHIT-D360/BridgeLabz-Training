package com.exceptions.checkedeception;
import java.io.*;

import java.io.IOException;

public class FileExist {
	public static void main(String[] args) {
		String filePath = "D//Saved//notexits.txt";
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage() + " File not found");
		}
	}
}
