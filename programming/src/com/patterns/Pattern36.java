package com.patterns;


//Spiral Square with numbers
public class Pattern36 {

	public static void main(String[] args) {
		int n = 4; // Dimension of the square
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int currentNumber = 11;

        // Create an n x n matrix
        int[][] matrix = new int[n][n];

        // Fill the matrix in a spiral order
        while (currentNumber <= n * n) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = currentNumber++;
            }
            top++;

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = currentNumber++;
            }
            right--;

            // Fill bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = currentNumber++;
            }
            bottom--;

            // Fill left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = currentNumber++;
            }
            left++;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

	}

}
