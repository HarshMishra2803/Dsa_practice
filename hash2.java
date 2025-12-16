public class hash2 {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};

        int hash[] = new int[100];

        for(int i =0 ;i< arr.length ; i++){
            int index = arr[i];
            int oldvalue = hash[index];
            int newvalue  = oldvalue+1;
            hash[index] = newvalue;

        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " -> " + hash[i]);
            }
        }
    }
}
