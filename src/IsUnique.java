//Implement an algorithm to determine if a String has all unique characters.
// With & Without implementing additional data structures

public class IsUnique {

    //Data-Structure Implementation

    private static boolean DSI_Unique(String s)
    {
        boolean[] answerSet = new boolean[256]; //256 ASCII Characters

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i); //Value = ASCII representation (numerical)

            if (answerSet[value]) //If ASCII numerical representation (character) is already in the array
            {
                return false;
            }

            answerSet[value] = true; //If not contained, enters character's ASCII code into the array
        }
        return true;
    }

    //Non Data Structure Implementation

    private static boolean NDSI_Unique(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) < i) //If the character at i occurs anytime before s.charAt(i), return false
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String sequence = "abcd";
        System.out.println(DSI_Unique(sequence));
        System.out.println(NDSI_Unique(sequence));
    }

}






