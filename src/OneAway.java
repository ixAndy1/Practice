/*
There are three types of edits that can be performed in strings:
(1) insert a character, (2) remove a character (3) replace a character.
Given two strings, write a function to check if they are one (or zero) edits away.
 */

public class OneAway {
    private static boolean check_One_Away(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) //If equal (ignoring case differences)
        {
            return true;
        }

        if (Math.abs(s1.length() - s2.length()) > 1) //If difference in length > 1
        {
            return false;
        }

        if (s1.length() == s2.length()) // (3) Character Replacement
        {
            int difference = 0;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    difference++;
                }

                if (difference > 1) {
                    return false;
                }
            }
        }

        
    }
}
