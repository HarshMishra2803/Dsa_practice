package Arrays;

import java.util.Arrays;

public class repeatingandmising {

    public static int[] ramn(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[2]; 

        for (int i = 0; i < arr.length - 1; i++) {

    
            if (arr[i] == arr[i + 1]) {
                temp[0] = arr[i];
            }

            if (arr[i + 1] - arr[i] > 1) {
                temp[1] = arr[i] + 1;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 1};
        int[] ans = ramn(arr);

        System.out.println("Repeating: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}
