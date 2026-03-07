public class BookAllocation {

    public static boolean isPossible(int[] arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;
                pageSum = arr[i];

                if (studentCount > m) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int allocateBooks(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }

        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]); // math function
        }

        int start = max;
        int end = sum;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1; // minimize
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int students = 2;

        int result = allocateBooks(books, books.length, students);
        System.out.println("Minimum maximum pages = " + result);
    }
}