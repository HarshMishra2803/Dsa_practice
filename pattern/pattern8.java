package pattern;
public class pattern8 {
    public static void main(String[] args) {
        int n = 5 ;

        // part1
        for ( int i = 1 ; i<=5 ; i++){
            for ( int j = 1 ; j<=n-i ; j++){
                System.out.print("_");
            }
            for(int k = 1 ; k<= 2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // part2

        for( int i = 5 ; i>=1 ; i--){
            for ( int j = n-i ; j>=1 ; j--){
                System.out.print("_");
            }
            for(int k = 2*i-1 ; k>=1 ; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
