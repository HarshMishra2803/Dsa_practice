package rev;

import java.util.HashMap;
import java.util.Map;

public class rev2 {
    static int longestsubarray(int [] arr , long k){

        Map <Long,Integer> preSumMap = new HashMap<>();

        long sum = 0 ;
        int maxlen = 0 ;

        for(int i = 0 ; i< arr.length ; i++){
            sum = sum+arr[i];

            if(sum == k ){
                maxlen = Math.max(maxlen, i+1);
            }
            // case 2: agar (sum - k) pehle exist karta ho
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxlen = Math.max(maxlen, len);
            }

            // prefix sum ko sirf first time store karo
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }

        }
        return maxlen;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        long k = 3;

        int ans =     longestsubarray(arr,k);
        System.out.println("Longest Subarray Length = " + ans);

    }
}
