package Arrays;

public class longsubaarya2poi {
    public static int longsubarr(int arr [] , long k){

        int left = 0  ;
        int right = 0 ;
        long sum = arr[0];
        int maxlen = 0 ;
        int n = arr.length;

        while ( right < n ){
            while(left<=right && sum > k){
                sum = sum - arr[left];
                left++;
            }
            if(sum == k ){
                maxlen = Math.max(maxlen,right-left +1);
            }
            right++;
            if(right < n) sum = sum + arr[right];
        }
        return maxlen;

    }
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,1,1,1,1,3,3} ;
        long k = 6 ;
        int res =longsubarr(arr, k);
        System.out.println(res);
    }

}
