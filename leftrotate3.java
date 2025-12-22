import java.util.Scanner;

public class leftrotate3 {

    

    static void reverse(int nums[],int start , int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++;
            end--;
        }
    }

    static void ls3(int nums[],int d ){
        int n = nums.length;
        d = d%n;
        reverse(nums, 0, d-1 );
        reverse(nums, d, n-1);
        reverse(nums, 0, n-1);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7} ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the no of rotation you want:");
        int d = sc.nextInt();
        ls3(nums,d);
        for(int i =0 ; i<nums.length ; i++){
            System.out.print(nums[i]+" "); // for printing the array

        }
    }
}
