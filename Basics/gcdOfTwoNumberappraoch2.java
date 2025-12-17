package Basics;
public class gcdOfTwoNumberappraoch2 {

    public static int gcd(int N1, int N2) {
        while (N2 != 0) {
            int rem = N1 % N2;
            N1 = N2;
            N2 = rem;
        }
        return N1;
    }

    public static void main(String[] args) {
        int N1 = 9;
        int N2 = 12;

        int result = gcd(N1, N2);
        System.out.println(result);
    }
}
