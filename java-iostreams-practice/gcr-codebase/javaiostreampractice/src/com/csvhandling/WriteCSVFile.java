package com.csvhandling;
import java.util.*;
import java.io.*;


public class WriteCSVFile {
	public static void main(String[] args) {
		String file = "Output.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))
				){
			bw.write("101,Mohit,Ai,55000 \n");
			bw.write("102,Rohit,Ds,45000 \n");
			bw.write("103,Methun,civil,35000 \n");
			bw.write("104,Golu,Computer,65000 \n");
			bw.write("105,Bholu,Networking,55000");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
