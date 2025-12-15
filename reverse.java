public class reverse{

    public static void reverse(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        // swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // recursive call
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        reverse(arr, 0, arr.length - 1);

        // print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
