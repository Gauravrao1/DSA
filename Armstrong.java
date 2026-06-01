public class Armstrong {
        static boolean isAmstrongnumber(int num){
                int sum =0;
                int original =num;
                while (num!=0) {
                int digit =num%10;
                int cubeofDigit =digit*digit*digit;
                sum =sum+cubeofDigit;
                num =num/10; 
            }
            if (sum==original){
                return true;
            }else{
                return false;
            }    
            }
               public static void main(String[] args) {
               System.out.println(isAmstrongnumber(153));
        }
}
