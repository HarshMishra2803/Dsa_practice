package sorting;
public class BubbleSortRecursive {

    public static void bubbleSort(int[] arr, int n) {
        // base case
        if (n == 1) return;

        // one pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // recursive call for remaining array
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubbleSort(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
