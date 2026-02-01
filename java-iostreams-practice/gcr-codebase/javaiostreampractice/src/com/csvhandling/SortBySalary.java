package com.csvhandling;
import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + ", " + name + ", " + department + ", " + salary;
    }
}

public class SortBySalary {
    public static void main(String[] args) {

        String filePath = "employees.csv";
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] col = line.split(",");

                int id = Integer.parseInt(col[0]);
                String name = col[1];
                String department = col[2];
                int salary = Integer.parseInt(col[3]);

                list.add(new Employee(id, name, department, salary));
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        // Sort by salary descending
        Collections.sort(list, (e1, e2) -> e2.salary - e1.salary);

        System.out.println("Top 5 Highest Paid Employees:");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }
}
