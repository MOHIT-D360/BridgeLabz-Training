package com.jsonhandling.iplcensor;
import java.io.*;
public class CsvProcessor {
	public static void processCsv(String input,String output) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(input));
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		
		String header = br.readLine();
		bw.write(header);
		bw.newLine();
		
		String line;
		while((line = br.readLine())!= null) {
			String[] col = line.split(",");
			
			col[1] = CensorUtil.maskTeam(col[1]);
			col[2] = CensorUtil.maskTeam(col[2]);
			col[5] = CensorUtil.maskTeam(col[5]);
			col[6] = CensorUtil.redactPlayer();
			
			bw.write(String.join(",", col));
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}
}
