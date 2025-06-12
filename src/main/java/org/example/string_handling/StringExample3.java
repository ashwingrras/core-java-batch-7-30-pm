package org.example.string_handling;

/*
            String Methods:
            1. length() - returns the length of the string
            2. charAt(int index) - returns the character at the specified index
            3. indexOf(String str) - returns the index of the first occurrence of the specified string
            4. split(String regex) - splits the string into an array of strings based on the specified regex
            5. substring(int beginIndex, int endIndex) - returns the substring from the specified beginIndex to endIndex
            6. toUpperCase() - converts the string to uppercase
            7. toLowerCase() - converts the string to lowercase
            8. trim() - removes leading and trailing whitespace from the string
            9. replace(String oldChar, String newChar) - replaces all occurrences of oldChar with newChar
            10. concat(String str) - concatenates the specified string to the end of the current string
            11. equals(Object obj) - compares the current string with the specified object for equality
            12. equalsIgnoreCase(String str) - compares the current string with the specified string, ignoring case considerations
            13. startsWith(String prefix) - checks if the current string starts with the specified prefix
            14. endsWith(String suffix) - checks if the current string ends with the specified suffix
            15. contains(CharSequence sequence) - checks if the current string contains the specified sequence of characters
            16. isEmpty() - checks if the current string is empty
            17. valueOf(Object obj) - returns the string representation of the specified object
            18. compareTo(String anotherString) - compares the current string with another string lexicographically
            19. compareToIgnoreCase(String str) - compares the current string with the specified string, ignoring case considerations
            20. valueOf(char[] data) - returns the string representation of the specified character array
            21. isBlank() - checks if the current string is blank (contains only whitespace characters)

         */
public class StringExample3
{
    public static void main(String[] args) {

        /*
        "hamburger".substring(4, 8) returns "urge"
        "smiles".substring(1, 5) returns "mile"
         */
        String fullAddress = "jaipur,rajasthan,india";
        System.out.println(fullAddress.substring(0, 6));
        System.out.println(fullAddress.substring(7, 16));
        System.out.println(fullAddress.substring(17, 22));
        System.out.println(fullAddress.substring(7, 10));
        String fullName = "java full stack developer";
        //stack: 10 - 15
        System.out.println(fullName.substring(10, 15));

        // Product name:   bill :   15 ; 12...
        // colgate white tooth paste
        // lux soap
        String productName = "colgate white tooth paste";
        if(productName.length() > 15)
        {
            productName = productName.substring(0,12) + "...";
        }
        System.out.println("Product Name: " + productName);

        String str1 = "Hello";
        System.out.println(str1.replace('l', 'z')); // "Hezzo"
        System.out.println(str1.replace("Hello", "Hi")); //

        String str2 = "gopalpura, jaipur, rajasthan";
        String str3 = "malviyanagar, jodhupur, rajasthan";
        String str4 = "vtroad, ajmer, rajasthan";
        String str5 = "vashi, mumbai, maharastra";
        String str6 = "copar kheran, mumbai, maharastra";
        System.out.println(str2.contains("rajasthan"));
        System.out.println(str2.contains("maharastra"));

        String userName = "              ashwin          kumar                ";
        System.out.println(userName.length());
        System.out.println(userName.trim().length());

        char[] values = {'a','b','c','d','e','a','b','g'};
        // "abcdeg"

    }
}
