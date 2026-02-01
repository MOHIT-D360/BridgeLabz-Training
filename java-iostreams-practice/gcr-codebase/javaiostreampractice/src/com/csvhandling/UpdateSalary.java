package com.csvhandling;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) {

        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // write header
            bw.write(br.readLine());
            bw.newLine();

            while ((line = br.readLine()) != null) {

                String[] col = line.split(",");

                String department = col[2];
                double salary = Double.parseDouble(col[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10); // 10% increase
                }

                bw.write(col[0] + "," + col[1] + "," + col[2] + "," + (int) salary);
                bw.newLine();
            }

            System.out.println("Updated file created successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
