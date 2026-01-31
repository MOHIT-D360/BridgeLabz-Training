package com.filehandling.readandwritetextfile;
import java.io.*;
import java.util.*;
public class ReadAndWrite {
	public static void main(String [] args) {
		String sourceFile = "D:\\trash\\dsa-practice\\java-collection-practice\\gcr-codebase\\javacollectionpractice\\src\\com\\filehandling\\readandwritetextfile\\input.txt";
		String destinationFile = "D:\\trash\\dsa-practice\\java-collection-practice\\gcr-codebase\\javacollectionpractice\\src\\com\\filehandling\\readandwritetextfile\\output.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destinationFile);
			int data ;
			while((data = fis.read())!=-1) {
				fos.write(data);
			}
			System.out.println("File copied");
		}
		catch (IOException e ) {
			System.out.println(e);
		}
	}
}
