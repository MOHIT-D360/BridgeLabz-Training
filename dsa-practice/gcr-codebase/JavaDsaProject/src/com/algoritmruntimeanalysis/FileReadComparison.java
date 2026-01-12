package com.algoritmruntimeanalysis;

import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        String filePath = "largefile.txt"; 

        // ---------- FileReader ----------
        long startFR = System.nanoTime();
        FileReader fr = new FileReader(filePath);
        while (fr.read() != -1) {
           
        }
        fr.close();
        long endFR = System.nanoTime();

       
        long startISR = System.nanoTime();
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath));
        while (isr.read() != -1) {
            // reading via byte stream
        }
        isr.close();
        long endISR = System.nanoTime();

        System.out.println("FileReader Time        : " +
                (endFR - startFR) / 1000000.0 + " ms");

        System.out.println("InputStreamReader Time : " +
                (endISR - startISR) / 1000000.0 + " ms");
    }
}
