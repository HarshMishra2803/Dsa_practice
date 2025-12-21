package Arrays;

public class secondsmallest {

    public static void ss(int arr[]){

        int smallest = arr[0];
        int secsmallest = Integer.MAX_VALUE;

        for(int i = 1 ; i<arr.length;i++){
            if(arr[i]<smallest){
                secsmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secsmallest && arr[i]>smallest){
                secsmallest = arr[i];

            }
        }
        System.out.println("smallest number is "+smallest+ " "+"second smallest number is"+" "+ secsmallest+" ");

    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4};
        ss(arr);
    }
}
