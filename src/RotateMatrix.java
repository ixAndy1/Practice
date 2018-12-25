/*
Write an algorithm to rotate a 2d Array 90 degrees.
 */

import java.util.Arrays;

public class RotateMatrix {
    private static String rotate(int[][] matrix) {
        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                //Left -> Top
                matrix[first][i] = matrix[last - offset][first];

                //Bottom -> Left
                matrix[last - offset][first] = matrix[last][last - offset];

                //Right -> Bottom
                matrix[last][last - offset] = matrix[i][last];

                //Top -> Right
                matrix[i][last] = top;
            }
        }
        return Arrays.deepToString(matrix);

    }

    public static void main(String[] args) {
        int[][] array = new int[][]

                {
                        {0, 1, 1, 1, 0},
                        {2, 0, 5, 0, 4},
                        {2, 6, 0, 8, 4},
                        {2, 0, 7, 0, 4},
                        {0, 3, 3, 3, 0},
                };
        System.out.println(rotate(array));
    }
}




