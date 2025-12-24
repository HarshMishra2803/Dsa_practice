package Arrays;

public class singlee {

    static int ss(int arr[]){
        int xor = 0 ;
        for (int i = 0 ; i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] ={2,2,1,5,5,1,8};
        int res =ss(arr);
        System.out.println(res);
    }
}
