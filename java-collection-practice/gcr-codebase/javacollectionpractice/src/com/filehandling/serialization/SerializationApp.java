package com.filehandling.serialization;
import java.io.*;
import java.util.*;

public class SerializationApp {
	public static void main(String[] args) {
		String fileName = "Employees.dat";
		
		List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Rahul", "IT", 50000));
        empList.add(new Employee(2, "Aman", "HR", 40000));
        empList.add(new Employee(3, "Neha", "Finance", 60000));
        
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(fileName))) {

       oos.writeObject(empList);
       System.out.println("Employees serialized successfully");

   } catch (IOException e) {
       System.out.println("Serialization error: " + e.getMessage());
   }


   try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(fileName))) {

       List<Employee> employees =
               (List<Employee>) ois.readObject();

       System.out.println("\nDeserialized Employee Data:");
       for (Employee e : employees) {
           System.out.println(e);
       }

   } catch (IOException | ClassNotFoundException e) {
       System.out.println("Deserialization error: " + e.getMessage());
   }

	}
}
