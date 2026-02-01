package com.csvhandling;

import java.lang.String.*;
import java.util.*;
import java.io.*;

public class FilterRecords {
	public static void main(String[] args) {
		String filepath = "input.txt";
		int count =0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))
				){
			String line;
			while((line = br.readLine())!=null) {
				String [] col = line.split(",");
				if((Integer.parseInt(col[3].trim())>80)) {
					System.out.println(line);
				}
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		
	}
}
