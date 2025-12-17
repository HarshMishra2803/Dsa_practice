package Basics;
public class sumofN {
    public static int rec3(int n) {
        if (n == 0) {
            return 0;
        }

        int sum = rec3(n - 1);
        sum = sum + n;
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = rec3(n);
        System.out.println(result);
    }
}
