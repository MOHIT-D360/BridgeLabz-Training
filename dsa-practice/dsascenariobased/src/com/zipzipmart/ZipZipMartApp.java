package com.zipzipmart;

public class ZipZipMartApp {
	public static void main(String [] args) {
		
		Sale[] s = new Sale[5];
		s[0] = new Sale( 3,2025,6,2300);
		s[1] = new Sale( 1,2025,5,5400);
		s[2] = new Sale( 1,2024,4,2300);
		s[3] = new Sale( 3,2025,3,3300);
		s[4] = new Sale( 3,2025,2,1200);
		
		Sort sort = new Sort(s);
		
		for(int i=0;i<s.length;i++) {
			s[i].show();
			
			System.out.println("--------------");
		}
	}
	
	
}
