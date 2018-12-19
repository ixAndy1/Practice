/*
Write a method to replace all spaces in a string with '%20'
 */

public class URLify {
    //String method
    private static String URLify_this(String s) {
        s = s.replaceAll(" ", "%20");
        return s;
    }

    public static void main(String[] args) {
        String s = "My name is Andrew";
        System.out.println(URLify_this(s));
    }
}
