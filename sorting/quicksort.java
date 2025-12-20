package sorting;
public class quicksort {

    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksortt(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // last element - pivot hoga hamara
        int pidx = partition(arr, si, ei);

        quicksortt(arr, si, pidx - 1); // left side
        quicksortt(arr, pidx + 1, ei); // left side

    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1; /// jaga bananana ha bhiiiiiiii

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return  i ;

    }

    public static void main(String[] args) {
        int arr[] = { 2,1};
        quicksortt(arr, 0, arr.length - 1);
        printarr(arr);

    }
}
