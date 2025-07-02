package org.example.input_output_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample
{
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("testfile.txt");
            //System.out.println( reader.read());
            //System.out.println((char) reader.read()); // Read the first character
            int ch;
            int loopCount = 0; // Initialize a counter for characters read
            while((ch = reader.read()) != -1) {
                System.out.print((char) ch); // Read and print each character
                loopCount++;
            }
            System.out.println("\nTotal characters read: " + loopCount); // Print the total count of characters read
            reader.close(); // Close the FileReader
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
