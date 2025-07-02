package org.example.input_output_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo
{
    public static void main(String[] args) {
        PrintWriter pw = null;
        FileReader fr = null;
        try {
            String filePath = "printwriter.txt";
            pw = new PrintWriter(new FileWriter(filePath));
            fr =new FileReader(filePath);

            pw.println("this is the example of print writer");
            pw.println(49);
            pw.printf("my age is %d", 25);
            pw.write("end of file");
            pw.close();
            System.out.println("File written successfully");
            int c;
            while ((c=fr.read())!=-1) {
                System.out.print((char)c);
            }


        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }

    }
}
