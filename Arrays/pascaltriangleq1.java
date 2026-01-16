package Arrays;

public class pascaltriangleq1 {

    public static int nCr(int n, int r){
        int res = 1;
        int j = n-1;
        int k = r-1;
        
        for(int i =0 ;i<k ;i++){
            res = res*(j-i);
            res = res/(i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5 ; 
        int r = 3;
        int ans = nCr(n,r);
        System.out.println(ans);
    }
    
}
