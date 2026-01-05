package Arrays;
public class SetMatrixZeroesoptimal {

    public static int[][] zeroMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int col0 = 1;

        // Step 1: Mark first row & column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0;   // mark row

                    if (j != 0) {
                        matrix[0][j] = 0; // mark column
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Traverse from (1,1) and set zeroes
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }

        return matrix;
    }

    // PSVM
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        zeroMatrix(matrix);

        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
