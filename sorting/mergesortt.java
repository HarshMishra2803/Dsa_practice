package sorting;
public class mergesortt {

    public static void merge(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;
        int len1 = mid - s + 1;
        int len2 = e - mid;

        int first[] = new int[len1];
        int second[] = new int[len2];

        int k = s;

        for (int i = 0; i < len1; i++) {
            first[i] = arr[k++];
        }
        int k2 = mid + 1;
        for (int i = 0; i < len2; i++) {
            second[i] = arr[k2++];
        }

        // merge two sorted array

        int index1 = 0;
        int index2 = 0;

        int mainindexarray = s;

        while (index1 < len1 && index2 < len2) {
            if (first[index1] < second[index2]) {
                arr[mainindexarray++] = first[index1++];
            } else {
                arr[mainindexarray++] = second[index2++];

            }
        }

        while (index1 < len1) {
            arr[mainindexarray++] = first[index1++];
        }
        while (index2 < len2) {
            arr[mainindexarray++] = second[index2++];
        }

    }

    public static void ms(int arr[], int s, int e) {

        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;
        // left side
        ms(arr, s, mid);
        // rigth side
        ms(arr, mid + 1, e);
        // merge
        merge(arr, s, e);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 9 };
        ms(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}