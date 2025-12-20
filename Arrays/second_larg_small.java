package Arrays;

public class second_larg_small {

    //!optimal approach

    public static void sls(int arr[]) {

        if (arr.length < 2) {
            System.out.println("Second largest not possible");
            return;
        }
    
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
    
        for (int i = 1; i < arr.length; i++) {
    
            if (arr[i] > largest) {
                secondlargest = largest;   // pehle largest ko shift
                largest = arr[i];
            } 
            else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
    
            }
        }
    
        System.out.println("largest is: " + largest +
                           " second largest is: " + secondlargest);
    }
    

    




    //!Better appraoch

    // public static void sls(int arr[]){
    //     //largest

    //     int largest = Integer.MIN_VALUE; //-infinity
    //     int secondlargest = Integer.MIN_VALUE;

    //     for(int i = 0 ; i< arr.length ; i++){
    //         if(largest<arr[i]){
    //             largest = arr[i];

    //         }
    //         if(arr[i]>secondlargest && arr[i]!=largest){
    //             secondlargest=arr[i];
    //         }
            
    //     }
    //     System.out.println("largest is "+largest);
    //     System.out.println("second largest is "+secondlargest);

    // }


    /* //!brute force approach 

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sls(int arr[]) {

        if (arr.length < 2) {
            System.out.println("Second largest not possible");
            return;
        }
    
        sort(arr);
    
        int largest = arr[arr.length - 1];
    
        for (int j = arr.length - 2; j >= 0; j--) {
            if (arr[j] != largest) {
                System.out.println("second largest element is " + arr[j]);
                return;
            }
        }
    
        System.out.println("Second largest not found");
    }
    */

    public static void main(String[] args) {
        int arr[] = { 2,5,3};
        // sort(arr);
        // for(int i =0 ;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
        sls(arr);
    }

}
