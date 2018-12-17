//Implement an algorithm to determine if a String has all unique characters.
// With & Without implementing additional data structures

public class IsUnique {
    boolean check_Unique(String s)
    {
        for (int i = 1; i < s.length(); i++)
        {
            if (s.lastIndexOf(s.charAt(i), (i - 1)) < 0) {
                return false;
            }
        }
        return true;
    }

}






