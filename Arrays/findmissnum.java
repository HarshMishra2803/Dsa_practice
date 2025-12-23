package Arrays;

public class findmissnum {

    public static int missnum(int arr[]) {
        int n = arr.length;

        // check from 0 to n
        for (int i = 0; i <= n; i++) {
            boolean found = false;

            // linear search
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // agar nahi mila
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int res = missnum(arr);
        System.out.println(res);
    }
}
