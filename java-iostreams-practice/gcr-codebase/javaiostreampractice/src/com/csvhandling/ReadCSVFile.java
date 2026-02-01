package com.csvhandling;
import java.io.*;
import java.util.*;

public class ReadCSVFile {
	public static void main(String[] args) {
		String path = "D:\\trash\\dsa-practice\\java-iostreams-practice\\gcr-codebase\\javaiostreampractice\\src\\com\\csvhandling\\input.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path));
				){
			String line ;
			while((line = br.readLine())!=null) {
				String[] col = line.split(",");
				System.out.println(" " + col[0] + "  "+col[1] + "  "+col[2]+"  "+col[3]);
				
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
