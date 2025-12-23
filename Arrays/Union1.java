package Arrays;

import java.util.*;

public class Union1 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3,4,5,6,7,8,9,10};
        int arr2[] = {2,3,4,4,5,11,12};

        // TreeSet -> unique + sorted
        Set<Integer> unionSet = new TreeSet<>();

        // add elements of first array
        for (int i = 0; i < arr1.length; i++) {
            unionSet.add(arr1[i]);
        }

        // add elements of second array
        for (int i = 0; i < arr2.length; i++) {
            unionSet.add(arr2[i]);
        }

        // print union
        System.out.println("Union of two sorted arrays:");
        System.out.println(unionSet);
    }
}
