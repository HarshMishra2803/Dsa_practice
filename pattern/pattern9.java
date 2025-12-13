package pattern;
public class pattern9 {
    public static void main(String[] args) {

        //part1
        
        for(int i =1 ; i<=5 ; i++){
            for ( int j = 1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //part2

        for(int i =4 ; i>=1 ; i--){
            for ( int j = i ; j>=1 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
