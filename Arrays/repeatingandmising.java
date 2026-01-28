package Arrays;

import java.util.Arrays;

public class repeatingandmising {

    public static int[] ramn(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[2]; 

        for (int i = 0; i < arr.length - 1; i++) {

    
            if (arr[i] == arr[i + 1]) {
                temp[0] = arr[i];
            }

            if (arr[i + 1] - arr[i] > 1) {
                temp[1] = arr[i] + 1;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 1};
        int[] ans = ramn(arr);

        System.out.println("Repeating: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}






// package Arrays;

// public class RepeatingAndMissing {

//     // Function to find repeating and missing number
//     // return format: [repeating, missing]
//     public static int[] findRepeatingAndMissing(int[] arr) {

//         int n = arr.length;

//         // Step 1: Frequency array (index 1 to n)
//         int[] frequency = new int[n + 1];

//         // Step 2: Count frequency of each number
//         for (int i = 0; i < n; i++) {
//             int value = arr[i];
//             frequency[value]++;
//         }

//         int repeating = -1;
//         int missing = -1;

//         // Step 3: Identify repeating and missing
//         for (int i = 1; i <= n; i++) {
//             if (frequency[i] == 2) {
//                 repeating = i;
//             }
//             if (frequency[i] == 0) {
//                 missing = i;
//             }
//         }

//         // Step 4: Return result
//         return new int[]{repeating, missing};
//     }

//     public static void main(String[] args) {

//         int[] arr = {3, 5, 4, 1, 1};

//         int[] result = findRepeatingAndMissing(arr);

//         System.out.println("Repeating number: " + result[0]);
//         System.out.println("Missing number: " + result[1]);
//     }
// }



//
