package Arrays;

import java.util.ArrayList;

public class leadersinarrr { // leaders in arr
    public static ArrayList<Integer> linarr(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static int[] leadersinarr(int arr[]){
        int n = arr.length;

        if(n==0) return new int[0];
        int temp [] = new int[n];

        int count = 0 ;

        int maxfromright = arr[n-1];
        temp[count++] = maxfromright; 

        // right to left scna karega yaha pae hama

        for(int i = n-2 ;i>=0 ;i--){
            if(arr[i]>maxfromright){
                maxfromright = arr[i];
                temp[count++] = arr[i];
            }
        }

        int result[] = new int[count];
        for(int i = 0 ;i<count ;i++){
            result[i] = temp[count-i-1];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> res = linarr(arr);
        System.out.println(res);
    }
}
