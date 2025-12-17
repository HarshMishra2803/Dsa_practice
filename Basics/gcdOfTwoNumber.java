package Basics;
public class gcdOfTwoNumber {

    // bruteforce approach
    public static int gcd(int N1, int N2) {
        int gcd = 1;
        int min = Math.min(N1, N2);

        for (int i = 1; i <= min; i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int N1 = 12;
        int N2 = 24;

        int result = gcd(N1, N2);   // function ka result store karo
        System.out.println(result); // print karo
    }
}
