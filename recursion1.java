public class recursion1 {

    public  static void rec1(int n){ //print 1 to n 

        if(n==0){
            return;
        }
        rec1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 9 ; 
        rec1(n);
    }
}
