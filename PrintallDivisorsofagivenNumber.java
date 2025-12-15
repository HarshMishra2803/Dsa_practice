// public class PrintallDivisorsofagivenNumber {

//     public static void divv(int n) {

//         int[] divisors = new int[n]; // maximum n divisors ho sakte hain
//         int index = 0;

//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 divisors[index] = i; // store divisor
//                 index++;
//             }
//         }

//         // print divisors
//         for (int i = 0; i < index; i++) {
//             System.out.print(divisors[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int n = 12;
//         divv(n);
//     }
// }
public class PrintallDivisorsofagivenNumber {

    public static void divv(int n) {

        int[] divisors = new int[2 * (int) Math.sqrt(n)];
        int index = 0;

        for (int i = 1;  i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                divisors[index] = i;
                index++;

                if (i != n / i) { // avoid duplicate for perfect square
                    divisors[index] = n / i;
                    index++;// paired divisor
                }
            }
        }

        // print all divisors
        for (int i = 0; i < index; i++) {
            System.out.print(divisors[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 36;
        divv(n);
    }
}
