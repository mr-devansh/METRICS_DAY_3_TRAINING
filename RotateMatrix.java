import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Read the size of the matrix
            int N = scanner.nextInt();

            // Create the matrix and read its elements
            int[][] mat = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    mat[i][j] = scanner.nextInt();
                }
            }

            // Perform in-place rotation of the matrix
            rotateMatrix(mat);

            // Print the rotated matrix
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }

    private static void rotateMatrix(int[][] matrix) {
        int N = matrix.length;

        // Iterate through the layers
        for (int layer = 0; layer < N / 2; layer++) {
            int first = layer;
            int last = N - 1 - layer;

            // Perform a four-way swap for each element in the layer
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }
}
