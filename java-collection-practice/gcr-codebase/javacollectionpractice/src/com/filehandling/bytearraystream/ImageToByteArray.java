package com.filehandling.bytearraystream;


		import java.io.*;
		import java.nio.file.Files;
		import java.util.Arrays;

		public class ImageToByteArray {

		    public static void main(String[] args) {

		        String originalImage =
		                "D:\\Saved\\original.jpg";
		        String newImage =
		                "D:\\Saved\\copy.jpg";

		        try {
		           
		            FileInputStream fis = new FileInputStream(originalImage);
		            ByteArrayOutputStream baos = new ByteArrayOutputStream();

		            byte[] buffer = new byte[4096];
		            int bytesRead;

		            while ((bytesRead = fis.read(buffer)) != -1) {
		                baos.write(buffer, 0, bytesRead);
		            }

		            byte[] imageBytes = baos.toByteArray();

		            fis.close();
		            baos.close();

		            
		            ByteArrayInputStream bais =
		                    new ByteArrayInputStream(imageBytes);
		            FileOutputStream fos =
		                    new FileOutputStream(newImage);

		            while ((bytesRead = bais.read(buffer)) != -1) {
		                fos.write(buffer, 0, bytesRead);
		            }

		            bais.close();
		            fos.close();

		            // ---------------- VERIFICATION ----------------
		            byte[] originalBytes = Files.readAllBytes(new File(originalImage).toPath());
		            byte[] copiedBytes = Files.readAllBytes(new File(newImage).toPath());

		            if (Arrays.equals(originalBytes, copiedBytes)) {
		                System.out.println("Success: Images are identical");
		            } else {
		                System.out.println("Failure: Images are NOT identical");
		            }

		        } catch (IOException e) {
		            System.out.println("IO Error: " + e.getMessage());
		        }
		    
	}
}
