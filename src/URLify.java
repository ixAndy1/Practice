/*
Write a method to replace all spaces in a string with '%20'
 */


public class URLify {
    //String method
    private static String URLify_this(String s) {
        s = s.replaceAll(" ", "%20");
        return s;
    }

    //Character array method
    private static String replaceSpace(char[] chars, int len) {
        if (chars == null) {
            return "";
        }

        int spaceCount = 0;
        int index = 0;

        for (int i = 0; i < len; i++) //Count number of spaces
        {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }

        index = len + (spaceCount * 3);

        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[index] = '0';
                chars[index - 1] = '2';
                chars[index - 2] = '%';
                index -= 3;
            } else {
                chars[index] = chars[i];
                index--;
            }

        }
        return new String(chars).trim();
    }

    public static void main(String[] args) {
        String s = "My name is Andrew                ";
        char[] charArray = s.toCharArray();

        System.out.println(replaceSpace(charArray, 17));


    }
}
