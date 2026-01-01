package Arrays;

public class leaderinarray {

    public static int[] leadinarr(int arr[]) {
        int n = arr.length;
        if (n == 0) return new int[0];

        int[] temp = new int[n]; // leaders store karne ke liye
        int count = 0;

        // Last element hamesha leader hota hai
        int maxFromRight = arr[n - 1];
        temp[count++] = maxFromRight;

        // Right to left scan
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                temp[count++] = arr[i];
            }
        }

        // leaders right-to-left me stored hain, reverse karna padega
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[count - i - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};

        int[] leaders = leadinarr(arr);

        System.out.print("Leaders in the array: ");
        for (int x : leaders) {
            System.out.print(x + " ");
        }
    }
}
