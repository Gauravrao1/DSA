public class prime {
        static boolean isprime(int num){
                if (num<=0){ 
                        return false;
                }
                 else{
                  for (int i =2;i<num;i++) {
                        if (num%i==0) {
                           return false;
                                  }
                       }
                 }
                  return true;
                 } 
        public static void main(String[] args) {
          System.out.println( isprime(20));     
        }
}
