package pattern;
public class pattern10 {
    public static void main(String[] args) {
        
        int n = 5 ; 
        for ( int i = 1 ; i<=n ; i++){

            int val ;
            if(i%2==1){
                val = 1 ;  //odd row
            }
            else{
                val = 0  ; //even row
            }

            for(int j = 1 ;j<=i ; j++){
                System.out.print(val);
                val = 1 -val ; 
            }
            System.out.println();
        }
    }
}
