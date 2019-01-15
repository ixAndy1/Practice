import java.util.Arrays;

public class addOne
{
    public static void main(String[] args)
    {
        int[] arrayOne = {1,3,2,4};
        int[] arrayTwo = {1,9,9};
        int[] arrayThree = {9,9,9};

        addOne(arrayOne);
        addOne(arrayTwo);
        addOne(arrayThree);
    }

    private static void addOne(int[] array)
    {
        int carry = 1; //Initial addition
        int sum = 0;
        int[] result = new int[array.length]; //Same size array

        for (int i = array.length - 1; i >= 0; i--) // *
        {
            sum = array[i] + carry;

            if (sum == 10)
            {
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            result[i] = sum % 10;
        }
        if (carry == 1)
        {
            result = new int[array.length + 1];
            result[0] = 1;
        }
        System.out.println(Arrays.toString(result));
    }
}
