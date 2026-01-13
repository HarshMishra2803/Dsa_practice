package Arrays;

import java.util.ArrayList;

public class arrodd {

    public static int[] alternatiepsoneg(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n = arr.length;

        // separate -ve and +ve

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        // rearranging alternately the postive and negative number

        // for postive first
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;

            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;

            }

        } else {

            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;

            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 3, -4, 5, 4, -2, 9, -8 };
        alternatiepsoneg(arr);
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");


        }


    }
}
