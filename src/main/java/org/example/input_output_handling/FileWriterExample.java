package org.example.input_output_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample
{
    public static void main(String[] args) {
        // Example usage of FileWriter
        //String filePath = "D:\\advance-java-practice\\core-java-batch-7-30-pm\\src\\main\\java\\org\\example\\input_output_handling\\testfile.txt";
        String filePath = "testfile.txt";
        String content = "this is a test file for writing using FileWriter in Java.";
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath, true); // 'true' for append mode
            writer.write("Ashwin");
            writer.write("\n");
            writer.write("Bhavika");
            writer.append("\n");
            writer.append("Vatsala");
            writer.append("\n");
            writer.append("Lakshya");
            //writer.close();
            //writer.flush();
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
