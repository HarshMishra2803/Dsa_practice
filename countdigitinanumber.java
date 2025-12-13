
        public class countdigitinanumber {
            public static void main(String[] args) {
        
                int n = 1234544;
                int count = 0;
        
                while (n != 0) {
                    n = n / 10;   // last digit remove
                    count++;
                }
        
                System.out.println(count);
            }
        }
        
        
