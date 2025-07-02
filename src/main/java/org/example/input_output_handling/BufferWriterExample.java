package org.example.input_output_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample
{
    public static void main(String[] args) throws IOException {
        // Example usage of BufferedWriter
        //String filePath = "D:\\advance-java-practice\\core-java-batch-7-30-pm\\src\\main\\java\\org\\example\\input_output_handling\\testfile.txt";
        String filePath = "testfile.txt";
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Ashwin");
        bufferedWriter.newLine();
        bufferedWriter.write("Bhavika");
        bufferedWriter.newLine();
        bufferedWriter.write("Vatsala");
        bufferedWriter.newLine();
        bufferedWriter.write("Lakshya");
        bufferedWriter.close();
        System.out.println("File written successfully.");

    }
}
