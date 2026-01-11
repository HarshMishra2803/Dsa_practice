package rev;
public class rev1 {

    public static void maxsubsumbrute(int arr[],int key){

        int len = 0 ;

        for(int i = 0 ; i< arr.length; i++){
            int sum = 0;
            for(int j = i ; j<arr.length ;j++){

                sum = sum+arr[j];

                if(sum == key){
                    len = Math.max(len, j-i+1);
                }

            }
        }
        System.out.println(len);

    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int key = 15;
        maxsubsumbrute(arr, key);

    }
}
