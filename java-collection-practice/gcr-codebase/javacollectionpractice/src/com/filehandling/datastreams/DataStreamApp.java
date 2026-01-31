package com.filehandling.datastreams;

import java.io.*;

public class DataStreamApp {

    public static void main(String[] args) {

        String fileName = "student.dat";

        // ----------- WRITE DATA -----------
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeInt(101);                // roll number
            dos.writeUTF("Rahul");            // name
            dos.writeDouble(8.75);            // GPA

            System.out.println("Student data written successfully");

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        // ----------- READ DATA -----------
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data");
            System.out.println( "  ---------------------------  ");
            System.out.println("Roll No : " + rollNo);
            System.out.println("Name    : " + name);
            System.out.println("GPA     : " + gpa);

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}