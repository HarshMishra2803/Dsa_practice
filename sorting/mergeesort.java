package sorting;
public class mergeesort {

    static void merge(int arr[], int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left half
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // right half
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy temp to original array
        for (int idx = 0; idx < temp.length; idx++) {
            arr[si + idx] = temp[idx];
        }
    }

    static void ms(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        ms(arr, si, mid);
        ms(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 5, 2, 1};
        ms(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
