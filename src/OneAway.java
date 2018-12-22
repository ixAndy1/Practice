/*
There are three types of edits that can be performed in strings:
(1) insert a character, (2) remove a character (3) replace a character.
Given two strings, write a function to check if they are one (or zero) edits away.
 */

import java.util.Arrays;

public class OneAway {
    private static boolean check_One_Away(String s1, String s2) {

        if (s1.equalsIgnoreCase(s2)) //If equal (ignoring case differences)
        {
            System.out.println("Strings are equal (ignoring case differences)");
            return true;

        } else if (Math.abs(s1.length() - s2.length()) > 1) //If difference in length > 1
        {
            System.out.println("More than one away");
            return false;
        }

        int whichMethod = s1.length() - s2.length();

        switch (whichMethod)
        {
            case 0: // (3) Character replacement
            {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        s1 = s1.replace(s1.charAt(i), s2.charAt(i));
                    }
                }
                System.out.println("String one: " + s1);
                System.out.println("String two: " + s2);
                System.out.println("Case 0");
                return true;
            }
            case 1: // (2) Character Removal
            {
                char[] array = new char[s1.length()];
                for (int i = 0; i < s2.length(); i++) {
                    if (s1.charAt(i) == s2.charAt(i)) {
                        array[i] = s1.charAt(i);
                    } else {
                        array[i] = s2.charAt(i);
                    }
                }
                System.out.println("String one: " + Arrays.toString(array)); //Works, different format
                System.out.println("String two: " + s2);
                System.out.println("Case 1");
                return true;
            }

            case -1: // (1) Character Insertion
            {

                char[] charArray = new char[s2.length()]; //Empty array

                for (int i = 0; i < charArray.length - 1; i++) {
                    charArray[i] = s1.charAt(i); //Fill empty array
                }

                for (int i = 0; i < s2.length(); i++) {
                    if (charArray[i] == s2.charAt(i)) {
                        charArray[i] = s1.charAt(i);
                        System.out.println("No");

                    } else {
                        charArray[i] = s2.charAt(i);
                        System.out.println("Hit");
                    }

                }


                System.out.println("String one: " + Arrays.toString(charArray));
                System.out.println("String two: " + s2);
                System.out.println("Case -1");
                return true;
            }

        }
        return true; //Unused
    }

    public static void main(String[] args) {
        String one = "pak";
        String two = "pake";

        System.out.println("Original one: " + one);
        System.out.println("Original two: " + two);

        System.out.println(check_One_Away(one, two));
    }
}
