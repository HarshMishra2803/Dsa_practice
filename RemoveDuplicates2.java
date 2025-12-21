public class RemoveDuplicates2 {

    // ~ optimal approach
    public static void rd(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }

        }
        System.out.println(i + 1);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        rd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
