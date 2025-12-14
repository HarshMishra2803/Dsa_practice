public class Armstrongnum {
    public static int Armstrongnumm(int n) {
        int original = n;
        int count = 0;
        while (original > 0) {
            original = original / 10;
            count++;
        }
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, count);
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 153;
        int result = Armstrongnumm(n);
        if (result == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
