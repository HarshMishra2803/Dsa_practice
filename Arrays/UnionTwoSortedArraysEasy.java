package Arrays;
import java.util.*;

public class UnionTwoSortedArraysEasy {

    // FUNCTION banaya jo do sorted arrays ka union return karega
    static ArrayList<Integer> unionOfArrays(int arr1[], int arr2[]) {

        int i = 0, j = 0;  // pointers for arr1 and arr2
        ArrayList<Integer> union = new ArrayList<>();  // union store karne ke liye list

        // dono arrays ke elements compare karte hue loop
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                // dono equal hai, ek baar add karo
                add(union, arr1[i]);
                i++;  // dono pointers aage
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                // arr1 ka element chhota hai → use add karo
                add(union, arr1[i]);
                i++;
            }
            else {
                // arr2 ka element chhota hai → use add karo
                add(union, arr2[j]);
                j++;
            }
        }

        // agar arr1 me bache elements ho → add kar do
        while (i < arr1.length) {
            add(union, arr1[i]);
            i++;
        }

        // agar arr2 me bache elements ho → add kar do
        while (j < arr2.length) {
            add(union, arr2[j]);
            j++;
        }

        return union;  // final union list return kar do
    }

    // HELPER FUNCTION → duplicate avoid karne ke liye
    static void add(ArrayList<Integer> list, int val) {
        // list empty hai ya last element val se different hai → add karo
        if (list.size() == 0 || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 5, 6, 7};

        // function call karke union le lo
        ArrayList<Integer> result = unionOfArrays(arr1, arr2);

        // result print karo
        System.out.println(result);
    }
}
