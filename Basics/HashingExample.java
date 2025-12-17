package Basics;
public class HashingExample {
    public static void main(String[] args) {

        // Given array
        int[] arr = {1, 2, 1, 3, 2};

        // Queries
        int[] queries = {1, 3, 4, 2, 10};

        // Step 1: Create hash array (assuming max value <= 10^5)
        int[] hash = new int[100001];

        // Step 2: Pre-computation (frequency count)
        for (int i = 0; i < arr.length; i++) {

            int index = arr[i];          // e.g. 1, 2, 1, 3, 2
            int oldValue = hash[index]; // pehle ka count
            int newValue = oldValue + 1;
            hash[index] = newValue;     // updated count store
        }

        // Step 3: Answer queries
        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            System.out.println("Count of " + q + " = " + hash[q]);
        }
    }
}
 
