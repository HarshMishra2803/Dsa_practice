package Arrays;

public class smallestnum {

    static void sn(int arr[]){

        int min = Integer.MAX_VALUE;
        for(int i = 0 ;i<arr.length;i++){

            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("smallest number is :"+min);
        

    }

    public static void main(String[] args) {
        int arr[] = {4,5,4,1} ;
        sn(arr);
    }
}
