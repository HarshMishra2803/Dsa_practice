public class FibonacciRecursive {

    static int fib(int n) {
        // base case
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
