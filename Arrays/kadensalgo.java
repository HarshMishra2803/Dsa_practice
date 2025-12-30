package Arrays;

public class kadensalgo {

    public static int ka(int arr[]) {
        int max = arr[0];
        int sum = 0;
        int ansStart = 0, ansEnd = 0, start = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            // Reset when sum goes negative
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        System.out.println("Subarray Start Index: " + ansStart);
        System.out.println("Subarray End Index: " + ansEnd);
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int res = ka(arr);
        System.out.println("Maximum Subarray Sum = " + res);
    }
}
