package com.csvhandling;
import java.util.*;
import java.io.*;

public class CountRowCSV {
	public static void main(String[] args) {
		String filepath = "Output.txt";
		int count =0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))
				){
			String line;
			while((line = br.readLine())!=null) {
				count++;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Number of rows :"+count);
		}
		
	}
}
