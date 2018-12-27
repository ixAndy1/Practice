/*
Given two strings, write an algorithm to check if s2 is a rotation
of s1 using only one call to isSubstring
 */
public class StringRotation
{
    private static boolean isRotation(String s1, String s2)
    {
        if (s1.length() == s2.length() && s1.length() > 0)
        {
            String s1s1 = s1 + s1; //waterbottlewaterbottle

            return isSubstring(s1s1,s2);
        }
       return false;
    }

    private static boolean isSubstring(String s1, String s2)
    {
        return s1.lastIndexOf(s2) >= 0;
    }

    public static void main(String[] args)
    {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println(isRotation(s1,s2));

    }
}
