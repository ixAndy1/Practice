//Implement an algorithm to determine if a String has all unique characters.
// With & Without implementing additional data structures

public class IsUnique {
    private static boolean check_Unique(String s)
    {
        boolean flag = true;

        for (int i = 1; i < s.length(); i++) {
            flag = s.lastIndexOf(s.charAt(i), (i - 1)) < 0;
            }

        return flag;
    }

    public static void main(String[] args) {
        String sequence = "abcd";
        System.out.println(check_Unique(sequence));
    }

}






