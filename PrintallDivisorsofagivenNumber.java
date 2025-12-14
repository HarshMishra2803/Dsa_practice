public class PrintallDivisorsofagivenNumber {
    public static void divv(int n){

    
        for(int i =1 ; i<=n ; i++){
            if(n%i == 0 ){
                System.out.println(i);
            }
            
        }

    }
    public static void main(String[] args) {
        int n = 1;
        divv(n);
    }
}
