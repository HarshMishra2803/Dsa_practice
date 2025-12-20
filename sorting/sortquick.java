package sorting;
public class sortquick {
    static int partiton(int arr[],int si , int ei){
        int pivot = arr[si];
        int count = 0 ;
        for(int i = si+1 ; i<=ei ; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        //place pivot at right place
        int pivotidx = si + count ;
        //swap 
        int temp = arr[pivotidx];
        arr[pivotidx] = arr[si];
        arr[si] = temp;
        //left and right wale part ko sort karge abb
        int i = si;
        int j = ei;
        while(i<pivotidx && j>pivotidx){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotidx && j>pivotidx){
                //swap
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                i++;
                j--;
            }
        }
        return pivotidx;
    }
    static void qs(int arr[], int si, int ei) {
        //base case
        if (si >= ei) {
            return;
        }
        int p = partiton(arr, si, ei);
        // left part ko sort karega
        qs(arr, si, p - 1);
        // right part ko sort kargea
        qs(arr, p + 1, ei);
    }
    public static void main(String[] args) {
        int arr[] = { 3,6,9,5,2 };
        qs(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}