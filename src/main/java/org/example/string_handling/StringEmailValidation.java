package org.example.string_handling;

public class StringEmailValidation
{
    public static void main(String[] args) {

        // email validation:
        // 1. should not be empty,
        // 2. should contain @,
        // 3. should contain .,
        // 4. should not start with .,
        // 5. should not end with .,
        // 6. should not contain consecutive dots

        String email = "ashwin@grrassolutions.in";
        boolean isEmailValid = false;
        boolean isAnchorFound = false;
        boolean isDotFound = false;
        boolean isStartEndDotNotFound = true;
        boolean isConsecutiveDotFound = false; // ..
        // "ram"  r: 0, a: 1, m: 2,  length: 3 -1 : 2
        for(int i =0; i < email.length(); i++)
        {
            if(email.charAt(0) == '.' || email.charAt(email.length() - 1) == '.')
            {
                isStartEndDotNotFound = false;
                break;
            }
            if(email.charAt(i) == '@')
            {
                isAnchorFound = true;
            }
            if (email.charAt(i) == '.')
            {
                isDotFound = true;
                if(i < email.length() - 2 && email.charAt(i+1) == '.')
                {
                    isConsecutiveDotFound = true;
                    break;
                }
            }
        }
        if(isAnchorFound && isDotFound && !isConsecutiveDotFound && email.length() > 0 && isStartEndDotNotFound)
        {
            isEmailValid = true;
        }
        System.out.println("isEmailValid = " + isEmailValid);
    }
}
