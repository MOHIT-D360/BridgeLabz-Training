package com.jsonhandling;
import java.io.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadSpecificFields {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			JsonNode rootNode = mapper.readTree(new File("student.json"));
			
			String name  = rootNode.path("name").asText();
			String email = rootNode.path("email").asText();
			
			System.out.println("Name :"+ name);
			System.out.println("Email :"+ email);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
