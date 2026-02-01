package com.csvhandling;

import java.io.*;

public class SearchEmployee {
    public static void main(String[] args) {

        String filePath = "employees.csv";
        String searchName = "Ankit"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // header skip

            while ((line = br.readLine()) != null) {

                String[] col = line.split(",");

                String name = col[1];

                if (name.equalsIgnoreCase(searchName)) {
                    String department = col[2];
                    String salary = col[3];

                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
