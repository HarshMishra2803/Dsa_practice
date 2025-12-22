package Arrays;
import java.util.*;
public class leftrotate2{

    //! bruteforce approach -_-  
    public static void lr2(int arr[], int d ){
        int n= arr.length;
        d=d%n;
        int temp[] = new int[d];
        for(int i = 0 ; i<d ;i++){
            temp[i] = arr[i];
        }
        //shifting
        for(int i = d ; i< n ; i++){
            arr[i-d]=arr[i];
        }
        int j = 0 ;
        for(int i = n-d ; i<n ; i++){
            arr[i] = temp[j];
            j++;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();// input of how much rotation
        lr2(arr,d);
        for ( int k = 0 ; k<arr.length ;k++){
            System.out.print(arr[k]+ " ");
        }
    }
}