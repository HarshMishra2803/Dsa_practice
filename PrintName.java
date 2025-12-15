public class PrintName {

    static void printName(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Work
        System.out.println("Harsh");

        // Recursive call
        printName(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        printName(n);
    }
}
