package org.example.input_output_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintStreamExample
{
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(System.out, true);
        PrintWriter printWriter = new PrintWriter(System.out, true);
        //FileWriter fileWriter = new FileWriter("printstream.txt", true);
        printStream.println("Hello, this is a PrintStream example.");
        printWriter.println("Hello, this is a PrintWriter example.");
        PrintWriter fileWriter = new PrintWriter(new FileWriter("printstream.txt"));
        fileWriter.println("This is written using PrintWriter to a file.");
        fileWriter.flush();
        fileWriter.close();
    }
}
