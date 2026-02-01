package com.jsonhandling;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class CsvToJson {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("students.csv"));
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String,String>>jsonList = new ArrayList<>();
			
			String headerLine = br.readLine();
			String[] headers = headerLine.split(",");
			
			String line;
			while((line = br.readLine())!= null) {
				String [] values = line.split(",");
				
				Map<String,String> jsonObj = new LinkedHashMap<>();
				for(int i=0;i<headers.length;i++) {
					jsonObj.put(headers[i], values[i]);
				}
				jsonList.add(jsonObj);
			}
			br.close();
			mapper.writeValue(new File("mohita.json"),jsonList);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
}
