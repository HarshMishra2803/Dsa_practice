package Arrays;

public class maxconsecutiveones {

    static int mcone(int arr [] ){
        int counter = 0 ;
        int maxi = 0 ;
        for ( int i = 0 ; i<arr.length ;i++){

            if(arr[i]==1){
                counter++;
            }
            else{
                counter = 0 ;
            }

            maxi=Math.max(maxi, counter);
        }
        return maxi;

    }


    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,1,1,1,1} ;
        int ones = mcone(arr);
        System.out.println("max consecutive one is "+ones);
    }
}
