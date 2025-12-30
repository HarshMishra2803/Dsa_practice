package Arrays;

public class kadensalgo {

    public static int  ka(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        int ansstart = -1;
        int ansend = -1;
        int start =0;
        
        
        for ( int i = 0 ; i<arr.length;i++){
            

            if(sum ==0 ) start = i ;
            sum = sum + arr[i];

            if(sum>max){
                max = sum ;
                ansstart = start;
                ansend = i ;
            }
            if(sum<0){
                sum = 0 ;
            }
            if(max < 0){
                max = 0 ;
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int arr [] = {-2,-3,4,-1,-2,1,5,-3} ;

        int res = ka(arr);
        System.out.println(res);
        
    }
}
