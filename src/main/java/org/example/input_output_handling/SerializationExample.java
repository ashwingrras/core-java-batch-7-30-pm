package org.example.input_output_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample
{


    public static void main(String[] args)
    {
        {
            try
            {
                //serialization
                /*
                Student student1 = new Student(101,"lakshya",20);
                Student student2 = new Student(102,"bhavika",21);
                Student student3 = new Student(103,"vatsala",22);
                FileOutputStream fos = new FileOutputStream("students.txt");

                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(student1);
                oos.writeObject(student2);
                oos.writeObject(student3);

                oos.flush();
                oos.close();
                fos.close();
                System.out.println("Serialization success");
                */
                //DeSerialization
                FileInputStream fis = new FileInputStream("students.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                while(true)
                {
                    try
                    {
                        Student studentRead1 = (Student) ois.readObject();
                        if(null != studentRead1 && null != studentRead1.name)
                        {
                            System.out.println("deserialize student : "+studentRead1.name);
                            System.out.println("deserialize age : "+studentRead1.age);
                            System.out.println("deserialize id : "+studentRead1.id);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        //e.printStackTrace();
                        break;
                    }
                }
                ois.close();
                System.out.println("DeSerialization success");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

