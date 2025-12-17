package Basics;
public class pallindrome{
    public static boolean reverse (int n ){

        int original = n ;

        int ans = 0 ; 
        while(n!=0){
            int digit = n%10 ;
            ans = ans *10 + digit ;
            n = n/10;
        }
        return ans == original;
        
    }
    public static void main(String[] args) {
        int n = -121 ; 
        System.out.println(reverse(n));
    
    }
}