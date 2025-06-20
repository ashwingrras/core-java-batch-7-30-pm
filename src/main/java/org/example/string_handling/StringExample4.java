package org.example.string_handling;

public class StringExample4
{
    public static void main(String[] args)
    {
        char[] charArray = {'H', 'e', 'l', 'l', 'o','H'};
        StringBuilder strFromCharArray = new StringBuilder();//String.valueOf(charArray);
        // i want only Hello
        for(int i=0; i < charArray.length; i++)
        {
            strFromCharArray.append(charArray[i]); // new object
        }
        System.out.println("strFromCharArray = " + strFromCharArray);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello"); // no new object
        stringBuilder.append("World"); // no new object
        System.out.println(stringBuilder);
        String value = stringBuilder.toString();
    }
}
