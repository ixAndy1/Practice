import java.util.Enumeration;
import java.util.Hashtable;

/*
Given a string, write a function to check if it is a
permutation of a palindrome.
 */
public class PalindromePermutation {
    private static boolean check_Palindrome_Permutation(String s) {
        Hashtable<Character, Integer> hashTable = new Hashtable<>();

        //Put everything into a hashtable
        for (int i = 0; i < s.length(); i++) {
            if (!hashTable.containsKey(s.charAt(i))) {
                //Add the character into the hashTable
                hashTable.put(s.charAt(i), 1);
            } else {
                //Update the count of that character in the hashtable
                hashTable.put(s.charAt(i), hashTable.get(s.charAt(i)) + 1);
            }
        }

        //Shows character & count
        int oddCounter = 0;
        Enumeration keyList = hashTable.keys();

        while (keyList.hasMoreElements())
        {

            char key = (Character) keyList.nextElement(); //Keys
            int value = hashTable.get(key); //Corresponding values

            System.out.println((key + " " + value));

            if (((value % 2) == 1) && (key != ' ')) //Odd counter, excluding space
            {
                oddCounter++;
                if (oddCounter > 1) {
                    return false; //If there is more than one single character
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "taco cat";
        System.out.println(check_Palindrome_Permutation(sentence));
    }
}
