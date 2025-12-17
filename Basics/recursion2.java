package Basics;
public class recursion2 {

    public static void rec2(int n){ // print n t0 1 
        if(n==0){
            return;
        }
        System.out.println(n);
        rec2(n-1);
    }
    public static void main(String[] args) {
        
        int n =  5;
        rec2(n);
    }
}
