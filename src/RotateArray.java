public class RotateArray
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5};

        rotateArray(array, 2);
    }

    //Rotates right
    private static void rotateArray(int[] array, int x)
    {
        int[] rotatedArray = new int[array.length];

        for(int i = 0; i <= array.length-1; i++)
        {
            rotatedArray[(i + x) % array.length ] = array[i];
        }

        for (int i = 0; i < rotatedArray.length; i++)
        {
            System.out.println(rotatedArray[i]);
        }
    }
}
