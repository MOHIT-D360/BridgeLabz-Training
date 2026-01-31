package com.filehandling.largefiles;



import java.io.*;

public class ReadLargeFile {

    public static void main(String[] args) {

        String filePath =
                "D:\\Saved\\application.log";   

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
