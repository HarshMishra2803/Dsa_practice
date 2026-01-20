package Arrays;

public class pascaltriangleq1 {




    public static int nCr(int n, int r){

        int res = 1 ;

        for(int i = 0 ;i< r ;i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;

    } // pascal triangle !


    public static void main(String[] args) {
        int n = 5 ; 
        int r = 3;

        
        int ans = nCr(n-1,r-1);
        System.out.println(ans);
    }
    
}
