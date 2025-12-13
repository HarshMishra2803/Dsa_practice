package pattern;
public class pattern7 {
    public static void main(String[] args) {
        int n= 6;
        for ( int i =1 ; i<=n ;i++){
            for(int sp =1 ; sp<=i-1 ;sp++){
                System.out.print("-");
            }
            for (int j = 1; j <= (2 * n - i-(i-1)); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
