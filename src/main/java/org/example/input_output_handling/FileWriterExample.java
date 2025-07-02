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
            writer.write("Ashwin , 76.5");
            writer.write("\n");
            writer.write("Bhavika, 97");
            writer.append("\n");
            writer.append("Vatsala, 97");
            writer.append("\n");
            writer.append("Lakshya, 97");
            //writer.close();
            //writer.flush();
            writer.close();
            //System.out.println("File written successfully.");
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
