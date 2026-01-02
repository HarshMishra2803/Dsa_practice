package Arrays;
import java.util.*;

public class Solution {

    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0) return 0;

        int longest = 1;
        HashSet<Integer> set = new HashSet<>();

        // insert all elements
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // check for sequence start
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;

                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) { // psvm
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSuccessiveElements(a));
    }
}
