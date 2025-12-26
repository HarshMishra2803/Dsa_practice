package Arrays; // optional, agar folder ka naam Arrays hai tab

class MajorityElement {

    // Function jo majority element return karega
    public static int majorityElement(int[] nums) {
        
        int candidate = 0; // majority ka doubt wala banda
        int count = 0;     // uska support kitna hai

        // pura array traverse karenge
        for(int num : nums){

            // agar support 0 ho gaya -> naye bande ko try karo
            if(count == 0){
                candidate = num;
            }

            // agar current num candidate jaisa hai -> support +1
            if(num == candidate){
                count = count + 1;
            }
            // warna -> support -1
            else{
                count = count - 1;
            }
        }

        // end mein candidate hi majority hota hai
        return candidate;
    }

    // 🚀 yaha se code run hoga
    public static void main(String[] args) {
        
        // sample input array
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        // function call
        int ans = majorityElement(arr);

        // output print
        System.out.println("Majority element hai: " + ans);
    }
}
