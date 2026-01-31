package com.filehandling.bufferedstream;
import java.io.*;

public class BufferStreamApp {

    public static void main(String[] args) {

        String srcFile =
                "D:\\trash\\dsa-practice\\java-collection-practice\\gcr-codebase\\javacollectionpractice\\src\\com\\filehandling\\bufferedstream\\100mb-examplefile-com.txt";

        String desFiles =
                "D:\\trash\\dsa-practice\\java-collection-practice\\gcr-codebase\\javacollectionpractice\\src\\com\\filehandling\\bufferedstream\\output.txt";

        String desBufferFiles =
                "D:\\trash\\dsa-practice\\java-collection-practice\\gcr-codebase\\javacollectionpractice\\src\\com\\filehandling\\bufferedstream\\outputbuffer.txt";

        // ---------------- UNBUFFERED ----------------
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(desFiles)) {

            byte[] buffer = new byte[4096]; // 4KB
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered Time : " + (endTime - startTime) + " ns");

        // ---------------- BUFFERED ----------------
        long startBufferTimer = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desBufferFiles))) {

            byte[] buffer2 = new byte[4096]; // 4KB
            int bytesBufferReader;

            while ((bytesBufferReader = bis.read(buffer2)) != -1) {
                bos.write(buffer2, 0, bytesBufferReader);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        long endBufferTimer = System.nanoTime();
        System.out.println("Buffered Time : " + (endBufferTimer - startBufferTimer) + " ns");
    }
}
