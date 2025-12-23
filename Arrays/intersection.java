package Arrays;
import java.util.*;

public class intersection {

    static ArrayList<Integer>IntersectionOfArrays(int arr1[],int arr2[]){

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> ans = new ArrayList<>();

        int[] vis = new int[m];

        for ( int i = 0 ; i< arr1.length ; i++){
            for(int j = 0 ; j< arr2.length ; j++){

                if (arr1[i] == arr2[j] && vis[j] == 0) {
                    ans.add(arr1[i]);   // intersection me add
                    vis[j] = 1;         // mark visited
                    break;              // next arr1 element par jao
                }
                if(arr2[j]> arr1[i]) break;
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 5, 6, 7};

        // function call karke union le lo
        ArrayList<Integer> result = IntersectionOfArrays(arr1, arr2);

        // result print karo
        System.out.println(result);
    }
    
}
