package Arrays;

import java.util.ArrayList;

public class intesection2 {

    static ArrayList<Integer> IntersectionOfArrays(int arr1[] , int arr2[]){

        ArrayList<Integer> ans = new ArrayList<>();
        int i =0 ; int j = 0;
        int n = arr1.length ; int m = arr2.length;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
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
