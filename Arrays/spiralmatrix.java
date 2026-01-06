package Arrays;
import java.util.*;

public class spiralmatrix {

    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ left → right (top row)
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            // 2️⃣ top → bottom (right column)
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            // 3️⃣ right → left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }

            // 4️⃣ bottom → top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

    // 🔹 PSVM
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = spiralOrder(mat);
        System.out.println(result);
    }
}
