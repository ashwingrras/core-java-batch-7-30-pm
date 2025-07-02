package org.example.input_output_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample
{
    public static void main(String[] args) throws IOException {
        // Example usage of BufferedReader
        //String filePath = "D:\\advance-java-practice\\core-java-batch-7-30-pm\\src\\main\\java\\org\\example\\input_output_handling\\testfile.txt";
        String filePath = "testfile.txt";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //System.out.println(bufferedReader.readLine());
        String line;
        int loopCount = 0;
        while ((line = bufferedReader.readLine()) != null) // till EOF
        {
            System.out.println(line); // Print each line read from the file
            loopCount++;
        }
        System.out.println("Total lines read: " + loopCount);

    }
}
