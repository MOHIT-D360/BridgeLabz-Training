package com.jsonhandling;
import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class PrintJsonKeysValues {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNode = mapper.readTree(new File("data.json"));
			
			printJson(rootNode,"");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printJson(JsonNode node,String indent) {
		 if (node.isObject()) {
	            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();

	            while (fields.hasNext()) {
	                Map.Entry<String, JsonNode> entry = fields.next();
	                System.out.println(indent + entry.getKey() + " :");

	                printJson(entry.getValue(), indent + "  ");
	            }

	        } else if (node.isArray()) {
	            for (JsonNode item : node) {
	                printJson(item, indent + "  ");
	            }

	        } else {
	            System.out.println(indent + node.asText());
	        }
	}
}
