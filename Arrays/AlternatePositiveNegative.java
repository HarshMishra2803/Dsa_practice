package Arrays;
import java.util.*;

public class AlternatePositiveNegative {

    public static int[] alternateNumbers(int[] a) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        int n = a.length;

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                pos.add(a[i]);
            } else {
                neg.add(a[i]);
            }
        }

        // Rearranging alternately
        if (pos.size() > neg.size()) {

            for (int i = 0; i < neg.size(); i++) {
                a[2 * i] = pos.get(i);
                a[2 * i + 1] = neg.get(i);
            }

            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                a[index] = pos.get(i);
                index++;
            }

        } else {

            for (int i = 0; i < pos.size(); i++) {
                a[2 * i] = pos.get(i);
                a[2 * i + 1] = neg.get(i);
            }

            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                a[index] = neg.get(i);
                index++;
            }
        }

        return a;
    }

    // PSVM
    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, -5, 6, 7,11};

        int[] result = alternateNumbers(arr);

        // Print result
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
