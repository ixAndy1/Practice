/*
(1) Reverse a String in-place.
(2) Then, reverse certain words in a character array (also in-place)
 */
public class ReverseString {
    //String
    private static void reverse1(String s) {
        char temp;
        char[] charArray = s.toCharArray();
        int size = charArray.length;

        for (int i = 0; i <= (s.length() / 2); i++) {
            temp = charArray[size - 1 - i]; //Create temporary storage character of last
            charArray[size - 1 - i] = charArray[i]; //Move first to last
            charArray[i] = temp; //Move last to first
        }

    }

    //Character array with specified start/end indices
    private static void reverse2(char[] array, int firstIndex, int lastIndex) {
        char temp;

        for (int i = firstIndex; i < array.length / 2; i++) {
            temp = array[lastIndex - 1 - i];
            array[lastIndex - 1 - i] = array[i];
            array[i] = temp;
        }

    }

   /* public static String reverseWords(char[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == ' ')
            {
                reverse2(array,0,i);
            }
        }
    }*/

    public static void main(String[] args) {
        String example = "This sentence should be reversed";
        reverse1(example);

        char[] test = example.toCharArray();
        reverse2(test, 0, test.length);


    }
}
