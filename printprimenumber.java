public class printprimenumber {

   static boolean isprime(int var0) {
      if (var0 <= 0) {
         return false; 
      } else {
         for(int var1 = 2; var1 < var0; ++var1) {
            if (var0 % var1 == 0) {
               return false;  
            }
         }

         return tru e;
      }
   }
   static int printprimenumber(int n){
        for(int num=2;num<=n;num++){
                boolean isprime =isprime(num);
                if(isprime==true){
                   System.out.println(num);
              }
        }return n;
   }
   public static void main(String[] var0) {
      System.out.println(printprimenumber(100));
   }


}
