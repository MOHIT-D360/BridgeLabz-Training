package com.filehandling.pipedstream;

import java.io.*;

public class PipedStreamApp {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedInputStream pis = new PipedInputStream();
            PipedOutputStream pos = new PipedOutputStream();

            // Connect the streams
            pis.connect(pos);

            // Create threads
            Thread writerThread = new Thread(new Writer(pos));
            Thread readerThread = new Thread(new Reader(pis));

            // Start threads
            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            System.out.println("Pipe connection error: " + e.getMessage());
        }
    }
}

// ---------------- Writer Thread ----------------
class Writer implements Runnable {

    private PipedOutputStream pos;

    Writer(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread";

            pos.write(message.getBytes());
            pos.close();

        } catch (IOException e) {
            System.out.println("Writer error: " + e.getMessage());
        }
    }
}

// ---------------- Reader Thread ----------------
class Reader implements Runnable {

    private PipedInputStream pis;

    Reader(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();

        } catch (IOException e) {
            System.out.println("Reader error: " + e.getMessage());
        }
    }
}
