public class selectionsort{
    public static void ss(int arr[]){

        for(int i =0 ; i<arr.length-1 ;i++){
            int curridx = i ;
            for (int j = i+1 ; j<arr.length ; j++){
                if(arr[curridx]>arr[j]){
                    curridx = j ;
                }

                int temp = arr[curridx];
                arr[curridx]=arr[i];
                arr[i]=temp;

            }
        }

    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        ss(arr);

        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+"_");

        }
    }
}