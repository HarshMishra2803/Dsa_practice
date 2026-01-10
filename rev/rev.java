package rev;

import java.util.ArrayList;

public class rev {

    public static ArrayList<Integer> unionofarray(int arr1[], int arr2[]) {

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                add(union, arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                add(union, arr1[i]);
                i++;
            } else {
                add(union, arr2[j]);
                j++;
            }
        }

        // 👉 Ye loops while ke baahar hone chahiyeee
        while (i < arr1.length) {
            add(union, arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            add(union, arr2[j]);
            j++;
        }

        return union;
    }

    static void add(ArrayList<Integer> list, int val) {
        if (list.size() == 0 || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };

        ArrayList<Integer> res = unionofarray(arr1, arr2);
        System.out.println(res);
    }
}
