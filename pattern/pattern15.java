package pattern;
public class pattern15 {

    public static void main(String[] args) {
        int n = 3 ;
        char ch ='A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
    
}
