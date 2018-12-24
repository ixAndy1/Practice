/*
Implement a method to perform basic string compression
using the counts of repeated characters
 */
public class StringCompression {
    private static StringBuilder result = new StringBuilder();

    private static StringBuilder compress(String s) {

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result.append(s.charAt(i));
                result.append(count);
                count = 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String test = "aaa";

        System.out.println(compress(test));
    }
}
