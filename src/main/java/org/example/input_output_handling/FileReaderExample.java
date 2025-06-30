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
            while((ch = reader.read()) != -1) {
                System.out.print((char) ch); // Read and print each character
            }
            reader.close(); // Close the FileReader
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
