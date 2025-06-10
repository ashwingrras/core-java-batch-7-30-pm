package org.example.string_handling;

/*
    Data Types:
    1. Primitive Data Types
        - int, float, double, char, boolean, byte, short, long
    2. Non-Primitive/Reference Data Types
        - String, Arrays, Classes, Interfaces, Enums, etc.
    3. Special Data Types
        - null, void, var (from Java 10 onwards)
    3. Wrapper Classes
        - Integer, Float, Double, Character, Boolean, Byte, Short, Long


 */
public class StringExample1
{
    public static void main(String[] args) {

        int a = 10; // actual value store
        System.out.println("a = " + a);
        int[] arr = {1, 2, 3, 4, 5, 6}; // reference type, actual value is stored in heap memory
        System.out.println("arr = "+arr);
        arr[3] = 7;
        char ch = '6';
        System.out.println("ch = " + ch);
        char[] arr2 = {'H', 'e', 'l', 'l', 'o', }; // char array, reference type
        // "ddd" : String
        // 'd'   : char
        String[] strings = {"Hello", "World", "Java", "2", "h"}; // String array, reference type
        System.out.println("strings reference = " + strings);
        System.out.println("strings value = " + strings[0]);
        //Object[] objects = {"Hello", 1, 2.5, 'c', true}; // Object array, reference type


        // in java string is immutable, once created it cannot be changed
        // First Way
        String name = "vatsla"; // reference type, String is a non-primitive data type
        // name : @113321
        System.out.println("name = " + name);
        name = "bhavika";
        // name : @113322
        System.out.println("name after change = " + name);
        int[] values = new int[5];
        //StringExample1 stringExample1 = new StringExample1();
        // Second Way
        String city = new String("Delhi");
        System.out.println("city = " + city);
        int no_1 = 10;
        //int no_2 = new int[1];

        int no_11 = 10;
        int no_22 = 10;
        System.out.println(" compare no_11 and no_22 using == operator ");
        System.out.println(no_11 == no_22);

        String str1 = "Hello"; // ref: @1121
        String str2 = "Hello"; // ref: @1121
        String str3 = "HEllo"; // ref: @1122
        System.out.println(" compare str1 and str2 using == operator ");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        String str4 = new String("Hello"); // ref: @1123
        System.out.println(str1 == str4);
        System.out.println(str2 == str4);

        // String immutable
        String address = "jaipur"; // new object / ref, @1121
        System.out.println("address = " + address);
        address = "delhi"; // new object / ref. @1122
        System.out.println("address = " + address);

        String fullName = "ashwin";
        System.out.println("fullName = " + fullName);
        fullName = fullName.concat(" kumar"); // string modification is not allowed, it will create a new object
        System.out.println("fullName = " + fullName);

        String country = "india";
        System.out.println("country = " + country);
        country = country.toUpperCase();
        System.out.println("country = " + country);

    }
}
