package com.jsonhandling;
import com.fasterxml.jackson.databind.*;
import java.io.File;
public class FilterByAge {
	public static void main(String[] args) {
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			JsonNode rootNode = mapper.readTree(new File("student.json"));
			
			for(JsonNode node : rootNode) {
				int age = node.path("age").asInt();
				if(age>25) {
					System.out.println( mapper.writerWithDefaultPrettyPrinter()
                            .writeValueAsString(node));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
