/*
Given an array of integers, find a pair that equals a given integer.
 */

import java.util.HashSet;

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[20];

        findPair(array, 15);
    }

    private static boolean findPair(int[] array, int sum)
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++)
        {
            //If the complement of array[i] is in the HashSet
            if (set.contains(sum - array[i]))
            {
                return true;
            }
            else
            {
                set.add(array[i]);
            }
        }
      return false;
    }
}
