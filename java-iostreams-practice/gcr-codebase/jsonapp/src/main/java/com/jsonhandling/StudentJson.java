package com.jsonhandling;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class StudentJson {
 public static void main(String[] args) {
	try {
		ObjectMapper mapper = new ObjectMapper();
		
		Map<String ,Object> student = new LinkedHashMap<>();
		student.put("name","Mohit");
		student.put("age",21);
		student.put("subject", Arrays.asList("Maths","Java"));
		
		String json = mapper.writeValueAsString(student);
		System.out.println(json);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
