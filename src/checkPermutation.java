/* Given two strings, write a method to decide if one
is a permutation of the other
 */


public class checkPermutation {
    private static boolean check_Permutation(String s1, String s2) {
        if (s1.length() != s2.length()) //If sentences are different lengths, automatically return false
        {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char character = s1.charAt(i);

            if (s2.indexOf(character) < 0) //If s2 does not contain s1[i]
            {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        //True
        String s1 = "abcd";
        String s2 = "dbca";

        //False 
        String s3 = "abcdef";
        String s4 = "fegcba";

        System.out.println(check_Permutation(s1, s2));
        System.out.println(check_Permutation(s3, s4));

    }
}
