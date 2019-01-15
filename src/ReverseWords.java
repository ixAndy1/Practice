
// Java Program to reverse a String
// without using inbuilt String function

public class ReverseWords
{

    // Method to reverse words of a String
    static String reverseWords(String str)
    {
        // Split the string
        String[] temp = str.split("\\s");
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++)
        {
            if (i == temp.length - 1) //If last element
            {
                result = temp[i] + result; // Moves the first word to the last
            }
            else
                {
                result = " " + temp[i] + result; //Adds a space, prints in reverse order
            }
        }
        return result;
    }

    // Driver methods to test above method
    public static void main(String[] args)
    {
        String s1 = "Welcome to geeksforgeeks";
        System.out.println(reverseWords(s1));

        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));
    }
}

