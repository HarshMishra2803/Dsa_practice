public class fact{
    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
    //     int mul=1; //iterative way
    //     for(int i = 1 ; i<=n;i++){
    //         mul = mul*i;
    //     }
    //    return mul;


    // recursive way
    int fact =1 ; 
    fact = fact *(n-1);
    


    }

    public static void main(String[] args) {
        int n = 3;
        int result = factorial(n);
        System.out.println(result);
    }
}
 
