/*
Write a method to replace all spaces in a string with '%20'
Use a character array to perform the operation in place
 */

public class URLify {
    static private String URL_this(String s) {
        char[] content = s.toCharArray();
    }

    public static void main(String[] args) {
        String s = "My name is Andrew";
        System.out.println(URL_this(s));
    }
}
