package org.example.string_handling;

import java.util.Arrays;

public class StringExample2
{
    public static void main(String[] args)
    {
        // input  :"hello world"
        // output :"world hello"
        String value1 = "Hello World";
        System.out.println("indexOf(1) = "+value1.indexOf("World"));
        // output: "World Hello";
        String value2 = "Hello";
        // output: "olleH"
        // [1,2,3,4,5] : [5,4,3,2,1]
        for(int i =value1.length() - 1; i >= 0; i--) {
            System.out.println(value1.charAt(i));
        }
        String[] array = value1.split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        //System.out.println(array[1] +" "+ array[0]);
        String dob_1 = "10-10-1991";
        // dob_1:  10-10-1991
        // dob_2: 4-3-2005
        // dob_3: 14-2-2023
        // dob_4: 4-10-1998
        String dobYear = dob_1.split("-")[2];
        System.out.println("Year of dob_1 = " + dobYear);
        String date, month, year;
        for(int i =0; i < dob_1.length(); i++) {
            System.out.println(value1.charAt(i));
        }

        // find first, middle and last name
        // String fullName = "ashwin kumar"
        // String fullName = "ajay kumar sharma"
        // String fullName = "bhanu pratap singh joshi"
        //String fullName = "paramanand"
    }
}

