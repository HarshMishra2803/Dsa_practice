package Arrays;
public class SetMatrixZeroBruteForce {

    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Step 1: Mark rows & columns using -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }

        // Step 2: Convert -1 to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Mark entire row
    static void markRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    // Mark entire column
    static void markCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }

    // Print matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // PSVM
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nMatrix after Set Zeroes:");
        printMatrix(matrix);
    }
}
