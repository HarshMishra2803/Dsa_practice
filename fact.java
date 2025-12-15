public class fact {
    public static int factorial(int n) {
        if (n == 0 || n==1) {
            return 1;
        }
        // int mul=1; //iterative way
        // for(int i = 1 ; i<=n;i++){
        // mul = mul*i;
        // }
        // return mul;

        // recursive way
        return  n* factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int result = factorial(n);
        System.out.println(result);
    }
}
