/*
Implement a method to perform basic string compression
using the counts of repeated characters
 */
public class StringCompression {
    private static StringBuilder result = new StringBuilder();

    private static StringBuilder compress(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++; //Automatically count atleast one character

            if (((i + 1) == s.length()) || (s.charAt(i) != s.charAt(i + 1))) {
                result.append(s.charAt(i));
                result.append(count);
                count = 0;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String test = "aaabaaaacccd";

        System.out.println(compress(test));
    }
}
