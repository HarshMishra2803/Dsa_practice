package pattern;
public class pattern11 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            // left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // middle spaces
            for (int sp = 1; sp <= 2 * (n - i); sp++) {
                System.out.print(" ");
            }

            // right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
